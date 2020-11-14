package _while;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		// while을 이용한 불특정 횟수 반복
		Scanner sc = new Scanner(System.in);
		int n1;
		
		while(true) {	// 조건이 항상 참이된다 => 무한 반복
			
			System.out.print("정수 입력(0 입력시 종료) : ");
			n1 = sc.nextInt();
			
			if (n1 == 0) {
				break;
			}
			
			System.out.println("n = " + n1 + "\n");
		}
		
		sc.close();
	}
}
