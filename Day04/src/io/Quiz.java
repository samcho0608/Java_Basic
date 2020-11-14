package io;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1.
		// �̸�, ����, �ּ�, ����('��', '��'), ����
		// ������ ����

		String name;
		int age;
		String address;
		char gender;
		double height;
				
		// 2. �� ������ ���� �Է� ���� �G �Էµ� �� ����
		System.out.print("�̸��� �Է��ϼ���: ");
		name = sc.nextLine();

		System.out.print("���̸� �Է��ϼ���: ");
		age = sc.nextInt();
		
		sc.nextLine();

		System.out.print("�ּҸ� �Է��ϼ���: ");
		address = sc.nextLine();

		System.out.print("������ �Է��ϼ���: ");
		gender = sc.next().charAt(0);

		System.out.print("������ �Է��ϼ���: ");
		height = sc.nextDouble();
		
		
		// 3. ������ ���� ���ʴ�� ���
		System.out.println(String.format("\n�̸�: %s\n����: %d��\n�ּ�: %s\n����: %c\n����: %.1fcm\n",
				name, age, address, gender, height));
		
		
		// ���� ������
		// 1. 3�� ���
		int multOfThree;
		
		System.out.print("3�� ������� üũ�ϰ��� �� �Է�: ");
		multOfThree = sc.nextInt();
		
		System.out.println((multOfThree % 3 == 0) ? "3�� ����Դϴ�." : "3�� ����� �ƴմϴ�.");
		
		// 2. �ε��
		int n1, n2;
		System.out.print("���ϰ��� �� ���� �Է��ϼ���: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		System.out.println((n1 > n2) ? n1 : n2);
		
		// 3. ���밪
		int absVal;
		System.out.print("���밪�� �˰���� ���� �Է��ϼ���: ");
		absVal = sc.nextInt();
		System.out.println((absVal < 0) ? -absVal : absVal);
		
		
		sc.close();
		
		// scanner cannot be reused once it is closed
		// aka you can only use one scanner per program
		// if you want to read another input source,
		// simply reinitialize it instead of closing it

		
	}

}
