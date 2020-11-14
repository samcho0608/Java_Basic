package operator;

public class Ex08 {

	public static void main(String[] args) {
		// Conditional Operator
		// aka Ternary Operator
		
		int n1 = 10, n2 = 20;
		
		boolean result = n1 > n2;
		
		int n3 = (result) ? n1 : n2;
		
		System.out.println(n3);

		
		int n4 = (n1 > n2) ? n1+n2 : n3 + n2;
		System.out.println(n4);
		
		System.out.println((n1 % 2 == 0) ? "¦" : "Ȧ");
	}

}
