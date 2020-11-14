package casting;

public class Ex02 {

	public static void main(String[] args) {
		
		// Explicit Casting
		System.out.println("10 / 3 = " + (10/3));
		System.out.println("10 / 3.0 = " + (10/3.0));
		
		int num1 = 10;
		int num2 = 3;
		System.out.println("num1 / num2 = " + (num1 / num2));
		System.out.println("num1 / num2 = " + (num1 / (double)num2));
		
	}

}
