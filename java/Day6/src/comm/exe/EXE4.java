package comm.exe;


import java.util.HashMap;

import java.util.Set;
import java.util.TreeSet;

public class EXE4 {
	public static HashMap<Integer, String> getStudents(HashMap<Integer, Integer> m){
		
		Set<Integer> s = new TreeSet<>(m.keySet());
		HashMap<Integer, String> d = new HashMap<>();
		
		for(Integer a : s) {
			if(m.get(a) > 90) {
				d.put(a, "Gold");
			}
			else if(m.get(a) >= 80 && m.get(a) <= 90) {
				d.put(a, "Silver");
			}
			else if(m.get(a) >=70 &&  m.get(a) < 80) {
				d.put(a, "Bronze");
			}
		}
		
		return d;
	}
	
	public static void main(String[] args) {
		HashMap<Integer, Integer> m = new HashMap<>();
		
		m.put(395, 91);
		m.put(397, 90);
		m.put(399, 79);
		
		System.out.println(getStudents(m));
	}
}
