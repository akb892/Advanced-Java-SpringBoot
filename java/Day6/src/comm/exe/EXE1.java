package comm.exe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EXE1 {
	public static List<Integer> getValues(Map<String, Integer> m) {
		
		List<Integer> li = new ArrayList<Integer>(m.values());
		Collections.sort(li);
		
		return li;
		
	}
	
	
	public static void main(String[] args) {
		HashMap<String, Integer> m = new HashMap<>();
		
		m.put("Aryan", 2002);
		m.put("Utkarsh", 2001);
		m.put("Shikhar", 2000);
		
		System.out.println(getValues(m));
	}
}
