package loop;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("1. 정수 입력: ");
		n = sc.nextInt();
		 
		for(int i = 1; i<= n; i++) {
			System.out.print(n * i + " ");
		}
		
		System.out.println();
		
		int j = 1;
		
		while(j <= n) {
			System.out.println(n * j++ + " ");
		}
		
		
		
//		2. 정수부터 1까지 역순
		int descending;
		System.out.print("역순 출력용 정수: ");
		descending = sc.nextInt();
		
		while(descending > 0)
			System.out.println(descending--);
		
//		3. 세 자리 정수 거꾸로 출력
		int reverse;
		System.out.print("거꾸로 출력할 세 자리 정수: ");
		reverse = sc.nextInt();
		
		do {
			System.out.print(reverse%10);
			reverse /= 10;
		}while(reverse > 0);
		
		sc.close();
	}
}
