package _while;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		// while�� �̿��� ��Ư�� Ƚ�� �ݺ�
		Scanner sc = new Scanner(System.in);
		int n1;
		
		while(true) {	// ������ �׻� ���̵ȴ� => ���� �ݺ�
			
			System.out.print("���� �Է�(0 �Է½� ����) : ");
			n1 = sc.nextInt();
			
			if (n1 == 0) {
				break;
			}
			
			System.out.println("n = " + n1 + "\n");
		}
		
		sc.close();
	}
}
