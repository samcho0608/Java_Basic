package controlSet;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// nested if statements
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.print("���� �Է�: ");
		num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println(num + "��(��) ¦��");
			
			if(num%3==0)
				System.out.println(num + "��(��) ¦���̸鼭 3�� ����̴�.");
			else
				System.out.println(num + "��(��) ¦�������� 3�� ����� �ƴϴ�.");
				
		}
		else
			System.out.println(num + "��(��) Ȧ��");
		
		sc.close();
			
	}

}
