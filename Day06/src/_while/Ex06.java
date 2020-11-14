package _while;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		do {
			try {
				System.out.print("��� �Է� : ");
				n = sc.nextInt();
			}
			catch(InputMismatchException e) {
				System.err.println("���� �߸��־���~~");
				n = -1;	
				sc.nextLine();
			}
			
		} while(n < 0);
		
		/*
		while (n < 0) {
			System.out.print("��� �Է� : ");
			n = sc.nextInt();
		}
		*/
		
		System.out.println("�Է� ���� ��� : " + n);
		sc.close();
		
	}
}
