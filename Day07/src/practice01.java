import java.util.Scanner;

public class practice01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int num;
		System.out.print("���>\n���� ���� �� ��: ");
		num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= i; j++)
				System.out.print('*');
			System.out.println();
		}
			
		// 2. ������
		System.out.print("���>\n���� ���� �� ��: ");
		num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		// 3. �¿� ���� ����
		
		System.out.print("���>\n���� ���� �� ��: ");
		num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num - i - 1; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// �Ƕ�̵�
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num - 1 - i; j++) {
				System.out.print(" ");
			}
			
			for(int j = 0; j <= i * 2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		// 4. ������
		
		int gugudan;
		System.out.print("���� �Է�(1: ���, 0: ����) : ");
		gugudan = sc.nextInt();
		
		sc.close();
		
		if(gugudan == 0) return;
		
		if(gugudan == 1) {
			
			System.out.println("\n\t������ ��ü ���\n");
			
			
			int start = 2, limit = 5, j = start;
			
			for(int i = 1; i <= 9; i++) {
				for(; j <= limit; j++) {
					System.out.print(j + " x " + i + ((i * j < 10) ? " =  " : " = ") + i * j + "\t");
				}
				System.out.println();
				
				// 5�ܱ��� �����ٸ�
				if(j == 6 && i == 9) {
					System.out.println();
					i = 0;		// ���ϴ� �� �ʱ�ȭ
					limit = 9;	// ���� 9�ܱ���
					start = 6;	// �������� 6
				}
				else
					j = start;
			}
		}
		
		else {

			for(int i = 1; i <= 9; i++)
				System.out.println(gugudan + " x " + i + ((i * gugudan < 10) ? " =  " : " = ") + i * gugudan);
		}
		
		

	}

}
