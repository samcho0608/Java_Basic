package _switch;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, op;
		
		System.out.print("1��° ���� �Է� : ");
		n1 = sc.nextInt();
		
		System.out.print("2��° ���� �Է� : ");
		n2 = sc.nextInt();
		
		System.out.println("1. ����");
		System.out.println("2. ����");
		System.out.println("3. ����");
		System.out.println("4. ������");
		System.out.print(">>> ");
		op = sc.nextInt();
		
		
		switch(op) {
		case 1:
			System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
			break;
		case 2:
			System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
			break;
		case 3:
			System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
			break;
		case 4:
			System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
			break;
		default :	
			System.out.println("���� ��ȣ�Դϴ�~");
		}
		
		sc.close();
	}
}
