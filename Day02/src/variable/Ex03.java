package variable;

public class Ex03 {

	public static void main(String[] args) {
		boolean bo1 = 1 < 2;
		boolean bo2 = 2 < 1;
		boolean bo3 = 10 >= 10;
		boolean bo4 = 10 < 10;
		
		System.out.printf("bo1 = %b\n", bo1);
		System.out.printf("bo2 = %b\n", bo2);
		System.out.printf("bo3 = %b\n", bo3);
		System.out.printf("bo4 = %b\n", bo4);
		
		System.out.println("10 > 10 ÀÇ °á°ú: " + (10 > 10));
	}

}
