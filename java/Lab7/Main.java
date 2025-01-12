import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

enum ActionEnum {
    appliedFilter,
    feature1Button,
    feature2Button,
    feature3Button,
    proceedButton
}

interface IAnalytics {
    public void registerAction(ActionEnum action);
    public int getNumberOfActionRegisteredButNotSentToAnalyticsStore();
    public int getTotalNumberOfLoggedActions();
    public List<ActionEnum> getMostFrequentlyUsedActions();
}

interface IAnalyticsStore {
    public void storeActions(Queue<ActionEnum> q);
    public Queue<ActionEnum> getAllStoredActions();
}

class Analytics implements IAnalytics {
    private IAnalyticsStore analyticsStore;
    private int K;
    private Queue<ActionEnum> queue;  // Registered actions that haven't been sent to the store yet.
    private List<ActionEnum> allActions;  // List to store all registered actions.

    public Analytics(IAnalyticsStore analyticsStore, int K) {
        this.analyticsStore = analyticsStore;
        this.K = K;
        this.queue = new LinkedList<>();
        this.allActions = new ArrayList<>();
    }

    @Override
    public void registerAction(ActionEnum action) {
        // Add the action to the list of all registered actions.
        allActions.add(action);

        // Add the action to the current queue.
        queue.add(action);
        
        // If the queue size reaches K, store the actions and clear the queue.
        if (queue.size() == K) {
            analyticsStore.storeActions(new LinkedList<>(queue));
            queue.clear();  // Clear the queue after storing the actions.
        }
    }

    @Override
    public int getNumberOfActionRegisteredButNotSentToAnalyticsStore() {
        // Return the size of the queue (actions not yet sent to the analytics store).
        return queue.size();
    }

    @Override
    public int getTotalNumberOfLoggedActions() {
        // The total number of logged actions is the sum of all actions in the system
        // (both stored actions and those in the queue).
        int totalLoggedActions = allActions.size();
        totalLoggedActions += analyticsStore.getAllStoredActions().size();
        return totalLoggedActions;
    }

    @Override
    public List<ActionEnum> getMostFrequentlyUsedActions() {
        // Create a map to store the frequency of each action.
        Map<ActionEnum, Integer> frequencyMap = new HashMap<>();
        for (ActionEnum action : allActions) {
            frequencyMap.put(action, frequencyMap.getOrDefault(action, 0) + 1);
        }
        
        // Sort the actions first by frequency (descending), then alphabetically.
        List<Map.Entry<ActionEnum, Integer>> sortedActions = new ArrayList<>(frequencyMap.entrySet());
        sortedActions.sort((entry1, entry2) -> {
            int frequencyComparison = entry2.getValue().compareTo(entry1.getValue());
            if (frequencyComparison != 0) {
                return frequencyComparison;
            }
            return entry1.getKey().toString().compareTo(entry2.getKey().toString());
        });
        
        // Collect the actions in the sorted order.
        List<ActionEnum> sortedActionList = new ArrayList<>();
        for (Map.Entry<ActionEnum, Integer> entry : sortedActions) {
            sortedActionList.add(entry.getKey());
        }
        
        return sortedActionList;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        
        String inp[] = br.readLine().split(" ");
        int totalNumberOfRequests = Integer.parseInt(inp[0]),
            K = Integer.parseInt(inp[1]);
        
        IAnalyticsStore analyticsStore = new AnalyticsStore();
        IAnalytics analytics = new Analytics(analyticsStore, K);

        for (int queryNumber = 1; queryNumber <= totalNumberOfRequests; queryNumber++) {
            inp = br.readLine().split(" ");
            switch (inp[0]) {
                case "registerAction":
                    ActionEnum actionEnum = ActionEnum.valueOf(inp[1]);
                    analytics.registerAction(actionEnum);
                    break;
                case "getTotalNumberOfLoggedActions":
                    int totalNumberOfLoggedEvents = analytics.getTotalNumberOfLoggedActions();
                    out.println(totalNumberOfLoggedEvents);
                    break;
                case "getNumberOfActionRegisteredButNotSentToAnalyticsStore":
                    int x = analytics.getNumberOfActionRegisteredButNotSentToAnalyticsStore();
                    out.println(x);
                    break;
                case "getMostFrequentlyUsedActions":
                    List<ActionEnum> li = analytics.getMostFrequentlyUsedActions();
                    for (ActionEnum a : li) {
                        out.print(a + " ");
                    }
                    out.print("\n");
                    break;
            }
        }
        
        Queue<ActionEnum> q = analyticsStore.getAllStoredActions();
        for (ActionEnum a : q) {
            out.print(a.toString() + " ");
        }
        out.print("\n");

        out.flush();
        out.close();
    }
}

class AnalyticsStore implements IAnalyticsStore {
    private Queue<ActionEnum> storedEventEnums = new LinkedList<>();

    @Override
    public void storeActions(Queue<ActionEnum> q) {
        while (!q.isEmpty()) {
            storedEventEnums.add(q.poll());
        }
    }

    @Override
    public Queue<ActionEnum> getAllStoredActions() {
        Queue<ActionEnum> clonedActionEnums = new LinkedList<>(storedEventEnums);
        return clonedActionEnums;
    }
}
