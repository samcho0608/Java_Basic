import java.util.Scanner;

public class practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
//		1. ������ �� ����ŭ�� ���
		int multiple;
		System.out.print("����� ã�� ����: ");
		multiple = sc.nextInt();
		
		for(int i = 1; i <= multiple; i++)
			System.out.println(multiple * i);
		
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
