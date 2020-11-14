package _while;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		// for문을 이용한 불특정 횟수 반복
		Scanner sc = new Scanner(System.in);
		int n1;
		
		for(;;) {	// 초기값, 조건식, 증감식을 모두 비우면 => 무한 반복
			System.out.print("정수 입력 (0입력시 종료) : ");
			n1 = sc.nextInt();
			
			if (n1 == 0) 	{
				sc.close();
				break;
			}
		
			System.out.println("n1 = " + n1);
		}
		
	}
}
