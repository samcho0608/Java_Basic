package loop;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("1. ���� �Է�: ");
		n = sc.nextInt();
		 
		for(int i = 1; i<= n; i++) {
			System.out.print(n * i + " ");
		}
		
		System.out.println();
		
		int j = 1;
		
		while(j <= n) {
			System.out.println(n * j++ + " ");
		}
		
		
		
//		2. �������� 1���� ����
		int descending;
		System.out.print("���� ��¿� ����: ");
		descending = sc.nextInt();
		
		while(descending > 0)
			System.out.println(descending--);
		
//		3. �� �ڸ� ���� �Ųٷ� ���
		int reverse;
		System.out.print("�Ųٷ� ����� �� �ڸ� ����: ");
		reverse = sc.nextInt();
		
		do {
			System.out.print(reverse%10);
			reverse /= 10;
		}while(reverse > 0);
		
		sc.close();
	}
}
