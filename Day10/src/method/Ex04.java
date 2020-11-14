package method;

public class Ex04 {

	public static void main(String[] args) {
		// 기본 자료형		Wrapper
		// boolean		Boolean
		// byte 		Byte
		// char			Character
		// short		Short
		// int			Integer
		// long			Long
		// float		Float
		// double		Double

		
		// 기본 -> wrapper (boxing)
		// wrapper -> 기본 (unboxing)
		
		int num1 = 10;
		Integer num2 = 20;
		
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		
		Integer result;
		result = num1;
		
		num1 = result;

		String str1 = "10", str2 = "20";
		
		System.out.println(str1 + str2);
		
		int n1 , n2;
		n1 = Integer.parseInt(str1);
		n2 = Integer.parseInt(str2);
		
		System.out.println(n1+n2);
		
		
		str1 = Integer.toString(n1);
		str2 = Integer.toString(n2);
		
		System.out.println(str1 + str2);
		
		// The significance of the Wrapper Class
		// 1. Casting between basic data type and String is easier
		// 2. To make it so that basic data type should be treated as an instance(object)
		// e.g. generic function
		
	}

}
