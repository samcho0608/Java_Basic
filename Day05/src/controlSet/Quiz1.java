package controlSet;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		1. �� ������ �޾Ƽ� ū ���� ���(��, ������ ���ٰ� ���)
		
		int n1, n2;
		System.out.print("���� �� ����: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		if(n1 > n2)
			System.out.println(n1);
		else if(n1 < n2)
			System.out.println(n2);
		else
			System.out.println("����");
		
//		2. ������ �Է¹޾Ƽ� 5�� ����̸� ���
		
		int multOfFive;
		System.out.print("5�� ������� ������ ����: ");
		multOfFive = sc.nextInt();
		if(multOfFive % 5 == 0)
			System.out.println("5�� �����");
		else
			System.out.println("5�� ����� �ƴ�");
		
		
//		3. �� ������ �Է� �޾Ƽ� ���� ū ���� ���
		
		int n3;
		System.out.print("���� �� ����: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		int max = n1;
		
		if(max < n2)
			max = n2;
		if(max < n3)
			max = n3;
	
//		My Answer:
		
//		if(n1 > n2)
//			System.out.println((n1 > n3) ? n1 : n3);
//		else
//			System.out.println((n2 > n3) ? n2 : n3);
//		
		// lets try to think broadly
		// totally forgot abt the two separate
		// if statements
		
//		4. ���밪 ���
		int absVal;
		System.out.print("���밪�� ���� ����: ");
		absVal = sc.nextInt();
		if(absVal < 0)
			absVal *= -1;
		System.out.println(absVal);

		sc.close();
	}

}
