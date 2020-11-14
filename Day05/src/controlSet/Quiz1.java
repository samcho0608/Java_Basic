package controlSet;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		1. 두 정수를 받아서 큰 수를 출력(단, 같으면 같다고 출력)
		
		int n1, n2;
		System.out.print("비교할 두 정수: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		if(n1 > n2)
			System.out.println(n1);
		else if(n1 < n2)
			System.out.println(n2);
		else
			System.out.println("같음");
		
//		2. 정수를 입력받아서 5의 배수이면 출력
		
		int multOfFive;
		System.out.print("5의 배수인지 감별할 정수: ");
		multOfFive = sc.nextInt();
		if(multOfFive % 5 == 0)
			System.out.println("5의 배수임");
		else
			System.out.println("5의 배수가 아님");
		
		
//		3. 세 정수를 입력 받아서 가장 큰 수를 출력
		
		int n3;
		System.out.print("비교할 세 정수: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		int max = n1;
		
		if(max < n2)
			max = n2;
		if(max < n3)
			max = n3;
	
//		My Answer:
		
//		if(n1 > n2)
//			System.out.println((n1 > n3) ? n1 : n3);
//		else
//			System.out.println((n2 > n3) ? n2 : n3);
//		
		// lets try to think broadly
		// totally forgot abt the two separate
		// if statements
		
//		4. 절대값 출력
		int absVal;
		System.out.print("절대값을 구할 정수: ");
		absVal = sc.nextInt();
		if(absVal < 0)
			absVal *= -1;
		System.out.println(absVal);

		sc.close();
	}

}
