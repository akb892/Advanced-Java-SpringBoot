package comm.exe;

import java.util.HashMap;
import java.util.Map;

public class EXE3 {
	public static Map<Integer, Integer> getSquares(int[] arr) {
		Map<Integer, Integer> m = new HashMap<>();
		
		for(Integer a : arr) {
			m.put(a, (int)Math.pow(a, 2));
		}
		
		return m;
	}
	
	
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9 ,10};
		
		System.out.println(getSquares(arr));
	}
}
