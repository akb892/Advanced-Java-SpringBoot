package exercises;

public class EXE9 {


	public int add(int a, int b) {
		System.out.println(deats.b);
		return a + b;

	}

	public static void main(String[] args) {
		deats obj = new deats();// The constructor EXE9.deats() is undefined
		obj.a = 6; // The final field EXE9.deats.a cannot be assigned

	}
}

 class deats {
	final double a = 5.7587438;
	static int b = 6;

	public deats(int b) {
		System.out.println("Paramterized constructor");
	}
}
