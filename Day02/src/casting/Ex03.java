package casting;

public class Ex03 {

	public static void main(String[] args) {
		// Various methods of variable declaration
		
		// 1. Declaration and assignment = Initialization
		int num1 = 10;
		
		// 2. Declaration = creating empty variable
		int num2;
		 
		num2 = num1 + 20;
		
		System.out.println(num2);
		
		// 3. Declaration of multiple variables
		int num3, num4;
		
		num3 = num4 = 40;
		
		System.out.printf("num3 = %d, num4 = %d\n", num3, num4);

		//3-1.
		int num5, num6 = 60; // only initializes num6
		
		// printf originates from C
		// Java prefers String.format() for formatting
		
		num5 = 50;
		System.out.printf("num5 = %d, num6 = %d\n", num5, num6);
		
		System.out.println(String.format("�̸� : %s, ���� : %d","ȫ�浿", 15));
		
		String str2 = "�̸� : %s, ���� : %d";
		
		System.out.println(String.format(str2, "��浿", 22));
	}

}
