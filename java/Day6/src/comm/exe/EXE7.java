package comm.exe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EXE7 {
	public static int[] getSorted(int[] arr) {
		List<Integer> li = new ArrayList<>();
		
		for(int n : arr) {
			String str = Integer.toString(n);
			String revstr = new StringBuilder(str).reverse().toString();
			int revn = Integer.parseInt(revstr);
			li.add(revn);
		}
		
		Collections.sort(li);
		int sortarr[] =  new int[li.size()];
		
		for(int i = 0; i < li.size(); i++ ) {
			sortarr[i] = li.get(i);
		}
		
		return sortarr;
	}
	
	
	public static void main(String[] args) {
		int arr[] = {21, 34, 55, 89, 123, 19, 10, 5};
		
		System.out.println((Arrays.toString(getSorted(arr))));
	}
}
