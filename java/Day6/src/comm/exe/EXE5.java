package comm.exe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EXE5 {
	
	public static int getSecondSmallest (int[] arr) {
		List<Integer> li = new ArrayList<>();
		
		for(int s : arr) {
			li.add(s);
		}
		
		Collections.sort(li);
		
		return li.get(1);
	}
	
	public static void main(String[] args) {
		int arr[] = {24,45,11,88,23,15};
		
		System.out.println(getSecondSmallest(arr));
	}
}
