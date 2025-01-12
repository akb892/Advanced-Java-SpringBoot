package searchAlgo;

public class BinarySearch {
	public static void main(String[] args) {
		
		int arr[] = { -22,-15,1,7,20,35,55};
		
		System.out.println(iterativeSearch(arr, -15));
		
	}
	
	public static int iterativeSearch(int[] input, int value) {
		int start = 0;
		int end = input.length;
		
		while(start<end) {
			int midpoint = (start+end)/2;
			
			if(input[midpoint] == value) {
				return midpoint;
			}
			
			else if(input[midpoint] < value) {
				start = midpoint+1;
			}
			else {
				end = midpoint;
			}
		}
		return -1;
	}
}
