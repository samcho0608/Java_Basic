package method;

public class Ex03 {
	
	public static int adder(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}

	public static void main(String[] args) {
		int n1, n2, n3;
		
		n1 = adder(10, 20);
		n2 = adder(5,7);
		n3 = adder(2,9);
		System.out.println(n1 + " " + n2 + " " + n3);

	}

}
