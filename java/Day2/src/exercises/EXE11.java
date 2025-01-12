package exercises;

public class EXE11 {
	public static void main(String[] args) {
		ComplexNumbers c1 = new ComplexNumbers(3.5,2.5);
		ComplexNumbers c2 = new ComplexNumbers(4.5,7.5);
		
		ComplexNumbers res = new ComplexNumbers(0,0);
		
		res = ComplexNumbers.add(c1,c2);
		
		res.showc();
	}

}


 class ComplexNumbers {
	double real;
	double imag;
	
	
	public ComplexNumbers(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}
	
	public static ComplexNumbers add(ComplexNumbers n1, ComplexNumbers n2) {
		ComplexNumbers res = new ComplexNumbers(0,0);
		res.real = n1.real + n2.real;
		res.imag = n1.imag + n2.imag;
		
		return res;
	}
	
	
	public  void showc () {
		System.out.println(real +"+" + imag+"i");
	}
}