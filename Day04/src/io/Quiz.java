package io;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1.
		// 이름, 나이, 주소, 성별('남', '여'), 신장
		// 저장할 변수

		String name;
		int age;
		String address;
		char gender;
		double height;
				
		// 2. 각 변수를 위해 입력 구문 밎 입력된 값 저장
		System.out.print("이름을 입력하세요: ");
		name = sc.nextLine();

		System.out.print("나이를 입력하세요: ");
		age = sc.nextInt();
		
		sc.nextLine();

		System.out.print("주소를 입력하세요: ");
		address = sc.nextLine();

		System.out.print("성별을 입력하세요: ");
		gender = sc.next().charAt(0);

		System.out.print("신장을 입력하세요: ");
		height = sc.nextDouble();
		
		
		// 3. 각각의 값을 차례대로 출력
		System.out.println(String.format("\n이름: %s\n나이: %d세\n주소: %s\n성별: %c\n신장: %.1fcm\n",
				name, age, address, gender, height));
		
		
		// 삼항 연산자
		// 1. 3의 배수
		int multOfThree;
		
		System.out.print("3의 배수인지 체크하고픈 수 입력: ");
		multOfThree = sc.nextInt();
		
		System.out.println((multOfThree % 3 == 0) ? "3의 배수입니다." : "3의 배수가 아닙니다.");
		
		// 2. 부등식
		int n1, n2;
		System.out.print("비교하고픈 두 수를 입력하세요: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		System.out.println((n1 > n2) ? n1 : n2);
		
		// 3. 절대값
		int absVal;
		System.out.print("절대값을 알고싶은 수를 입력하세요: ");
		absVal = sc.nextInt();
		System.out.println((absVal < 0) ? -absVal : absVal);
		
		
		sc.close();
		
		// scanner cannot be reused once it is closed
		// aka you can only use one scanner per program
		// if you want to read another input source,
		// simply reinitialize it instead of closing it

		
	}

}
