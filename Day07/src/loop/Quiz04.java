package loop;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		6. Factorial
		
		int factorialVal;
		System.out.print("팩토리얼을 하고픈 정수 입력: ");
		int factorial = factorialVal = sc.nextInt();
		
		System.out.print("5! = ");
		while(factorialVal > 2) {
			System.out.print(factorialVal + " * ");
			factorial *= --factorialVal;
		}
		System.out.println(factorialVal + " * 1 = " + factorial);
		
		sc.close();
	}
}
