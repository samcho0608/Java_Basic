package controlSet;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// nested if can be represented with logical operators up to a certain point
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.print("정수 입력: ");
		num = sc.nextInt();
		
		if(num % 2 == 0 && num % 3 == 0) {
			System.out.println(num + "은(는) 짝수이며 3의 배수");
		}
		else {
			System.out.println(num + "은(는) 짝수가 아니거나 3의 배수가 아니거나 혹은 둘 다 아니다.");
		}
		
		sc.close();

	}

}
