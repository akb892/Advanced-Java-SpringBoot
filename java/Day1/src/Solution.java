import java.io.*;
import java.util.*;

public class Solution {

	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        
	        List<List<Integer>> li = new ArrayList<>();
	        for(int i = 0; i< n; i++) {
	            int d = sc.nextInt();
	            List<Integer> li1 = new ArrayList<>();
	            for(int j = 0; j< d; j++) {
	                li1.add(sc.nextInt());
	            }
	            li.add(li1);
	        }
	        
	        for(int i = 0;  i< li.size(); i++) {
	        	for(int j = 0; j< li.get(i).size(); j++) {
	        		System.out.print(li.get(i).get(j) + " ");
	        	}
	        	System.out.println();
	        }
	        
	        //	        int q = sc.nextInt();
//	        for(int i = 0;i<q;i++) {
//	            
//	                int x = sc.nextInt();
//	                int y = sc.nextInt();
//	                try {
//	                    System.out.println(li.get(x).get(y)); 
//	                }
//	                catch(Exception e) {
//	                    System.out.println("Error!");
//	                }
//	        }
//	        
	        sc.close();
	        
	    }
}