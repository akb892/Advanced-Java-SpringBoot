package capg.lab2;

//import java.lang.reflect.Array;
import java.util.Arrays;

public class EXE4 {
	
	public static int[] modifyArray(int arr[]) {
		
		int n = arr.length;
		System.out.println(n);
		int k = 0,a = 0;
		int res[] = new int[n];
		Arrays.sort(arr);
		System.out.println("The sorted array = " + Arrays.toString(arr));
		for(int i = 0; i < n-1; i++) {
			if(arr[i] == a) {
				continue;
			}
			else if(arr[i] == arr[i+1]) {
				res[k++] = arr[i];
				a = arr[i];
			}
			else {
				res[k++] = arr[i];
			}
		}
		int res2[] = new int[k];
		for(int i = 0;i < k; i++) {
			res2[i] = res[i];
		}
		int start = 0;
		int end = res2.length -1;
		while(start < end) {
			a = res[start];
			res2[start] = res2[end];
			res2[end] = a;
			start++;
			end--;
		}
		return res2;
	}
	
	public static void main(String[] args) {
		int arr[] = {10,10,20,5,5,7};
		int res[] = modifyArray(arr);
		System.out.println(Arrays.toString(res));
	}
}
