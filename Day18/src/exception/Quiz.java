package exception;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		
		// 10���� ������ �Է� �޾Ƽ� �հ踦 ���
		// ��> ��, ���⼭ ������ �ƴ� ���� �Է�������
		// ��> ���α׷��� ������ �ʰ� ��� ����ǵ���
		Scanner sc = new Scanner(System.in);
		
		int num,sum = 0, i = sum;
		while(i < 10) {
			try {
				System.out.print("������ �Է� : ");
				num = sc.nextInt();
				
				// the codes below won't run if exception thrown
				sum += num;
				i++;
			}
			catch(Exception e){
				e.printStackTrace();
				System.err.println("������ �Է����ּ���.");
				sc.nextLine();							// gotta empty the buffer after an erroneous input
			}

		}
		
		System.out.println("�հ� : " + sum);
		
		sc.close();
	}

}