package controlSet;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// nested if can be represented with logical operators up to a certain point
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.print("���� �Է�: ");
		num = sc.nextInt();
		
		if(num % 2 == 0 && num % 3 == 0) {
			System.out.println(num + "��(��) ¦���̸� 3�� ���");
		}
		else {
			System.out.println(num + "��(��) ¦���� �ƴϰų� 3�� ����� �ƴϰų� Ȥ�� �� �� �ƴϴ�.");
		}
		
		sc.close();

	}

}
