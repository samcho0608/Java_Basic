package controlSet;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// nested if statements
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.print("정수 입력: ");
		num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println(num + "은(는) 짝수");
			
			if(num%3==0)
				System.out.println(num + "은(는) 짝수이면서 3의 배수이다.");
			else
				System.out.println(num + "은(는) 짝수이지만 3의 배수는 아니다.");
				
		}
		else
			System.out.println(num + "은(는) 홀수");
		
		sc.close();
			
	}

}
