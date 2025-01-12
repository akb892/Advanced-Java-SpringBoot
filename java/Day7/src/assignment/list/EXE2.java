package assignment.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EXE2 {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		for(int i = 1; i<=10; i++) {
			li.add(i);
		}
		
		for(Integer i : li) {
			if(i % 2 !=0) {
				System.out.println(i);
			}
		}
		
		Collections.sort(li);
		System.out.println(li.get(0));
		for(Integer i : li) {
			if(i == li.get(0)) {
				System.out.println(i);
			}
		}
		Collections.reverse(li);
		System.out.println(li);
		for(int i = li.size() -1 ; i>=0; i--) {
			System.out.print(li.get(i) + " ");
		}
		
	}
}
