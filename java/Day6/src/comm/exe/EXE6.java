package comm.exe;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EXE6 {
	
	public static List<Integer> votersList(Map<Integer, LocalDate> m) {
		List<Integer> li = new ArrayList<>();
		Set<Integer> s = new HashSet<>(m.keySet());
		LocalDate now = LocalDate.now();
		for(int a : s) {
			
			Period p = Period.between(m.get(a), now);
			if(p.getYears() >= 18) {
				li.add(a);
			}
		}
		
		return li;
	}
	
	public static void main(String[] args) {
		Map<Integer, LocalDate> m = new HashMap<>();
		
		m.put(1001, LocalDate.of(2002, 06, 06));
		m.put(1002, LocalDate.of(2003, 06, 26));
		m.put(1003, LocalDate.of(2012, 07, 02));
		m.put(1004, LocalDate.of(1974, 03, 11));
		
		System.out.println(votersList(m));
	}

}
