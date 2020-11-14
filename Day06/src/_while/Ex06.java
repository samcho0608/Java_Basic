package _while;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		do {
			try {
				System.out.print("양수 입력 : ");
				n = sc.nextInt();
			}
			catch(InputMismatchException e) {
				System.err.println("에이 잘못넣었네~~");
				n = -1;	
				sc.nextLine();
			}
			
		} while(n < 0);
		
		/*
		while (n < 0) {
			System.out.print("양수 입력 : ");
			n = sc.nextInt();
		}
		*/
		
		System.out.println("입력 받은 양수 : " + n);
		sc.close();
		
	}
}
