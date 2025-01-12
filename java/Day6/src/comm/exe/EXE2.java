package comm.exe;

import java.util.HashMap;
import java.util.Map;

public class EXE2 {

	public static Map<Character,Integer> countChars(char[] arr) {
		Map<Character, Integer> m = new HashMap<>();
		for(int i = 0; i< arr.length; i++) {		
			if(m.containsKey(arr[i])) {
				m.put(arr[i], m.get(arr[i]) + 1);
			}else {
				m.put(arr[i], 1);
			}
		}
		
		return m;
		
	}

	public static void main(String[] args) {
		char arr[] = { 'a', 'b', 'a', 'b', 'b', 'c', 'c', 'c', 'd', 'a', 'd' };

		System.out.println(countChars(arr));
	}
}
