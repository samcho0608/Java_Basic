package _while;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		// for���� �̿��� ��Ư�� Ƚ�� �ݺ�
		Scanner sc = new Scanner(System.in);
		int n1;
		
		for(;;) {	// �ʱⰪ, ���ǽ�, �������� ��� ���� => ���� �ݺ�
			System.out.print("���� �Է� (0�Է½� ����) : ");
			n1 = sc.nextInt();
			
			if (n1 == 0) 	{
				sc.close();
				break;
			}
		
			System.out.println("n1 = " + n1);
		}
		
	}
}
