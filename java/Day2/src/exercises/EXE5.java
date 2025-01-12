package exercises;


public class EXE5 {

	public static void main(String[] args) {
		int[][] arr = new int[4][4];
		int n = 0;
		for(int i = 0; i<=3; i++) {
			for(int j = 0; j<=3 ; j++) {
				arr[i][j] = n+1;
				n +=1;
			}
		}
		for(int i= 0; i<=3;i++) {
			for(int j = 0; j <= 3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
