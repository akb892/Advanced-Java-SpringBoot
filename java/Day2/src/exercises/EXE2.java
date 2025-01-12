package exercises;

public class EXE2 {
	public static void main(String[] args) {
		byte a  = 120;
		short b = 90;
		int c = 80;
		long d = 70l;
		float e = 9f;
		double f = 9.5;
		boolean g = true;
		char h = 'a';
		
		a = (byte)b;
		b = a;
		b = (short)c;
		c = b;
		d = c;
		c = (int)d;
		h = (char)a;
		a = (byte)h;
		h = (char)c;
		c = h;
		e = c;
		c = (int)e;
		f = c;
		c = (int)f;
		e = (float)f;
		f = e;
		
	}
}
