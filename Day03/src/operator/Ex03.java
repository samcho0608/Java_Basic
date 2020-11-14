package operator;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 20, num2 = 20;
		
		// In Java, you can use complex operator(e.g. +=) within a function command
		System.out.println(num1 + " " + num2);
		System.out.println(num1 += num2);
		System.out.println(num1 + " " + num2);
		
		int n1 = 10, n2 = 20, n3 = 30;
		
		n1 += n2 += n3;
		System.out.println(n1 + " " + n2 + " " + n3);
	}

}
