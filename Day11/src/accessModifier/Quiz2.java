package accessModifier;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TV tv = new TV();
		int menu;
		
		do {
			tv.showTV();
			System.out.println("������������������������������������������");
			System.out.println("�� ������������            ��");
			System.out.println("�� �� ON ��            ��");
			System.out.println("�� ������������            ��");
			System.out.println("��   CH         VL   ��");
			System.out.println("�� ������������     ������������ ��");
			System.out.println("�� �� UP ��     �� UP �� ��");
			System.out.println("�� ������������     ������������ ��");
			System.out.println("�� ������������     ������������ ��");
			System.out.println("�� �� DN ��     �� DN �� ��");
			System.out.println("�� ������������     ������������ ��");
			System.out.println("��                   ��");
			System.out.println("��                   ��");
			System.out.println("��                   ��");
			System.out.println("������������������������������������������");
			System.out.println("1. ON");
			System.out.println("2. CH UP");
			System.out.println("3. CH DN");
			System.out.println("4. VL UP");
			System.out.println("5. VL DN");
			System.out.println("6. CH SLCT");
			System.out.println("7. MUTE");
			System.out.println("0. SHUT DOWN");
			System.out.print(">>");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				tv.OnOff();
				break;
			case 2:
				tv.upCh();
				break;
			case 3:
				tv.downCh();
				break;
			case 4:
				tv.upVl();
				break;
			case 5:
				tv.downVl();
				break;
			case 6:
				int ch;
				System.out.print("��û�� ä��: ");
				ch = sc.nextInt();
				tv.selectCh(ch);
				break;
			case 7:
				tv.mute();
				break;
			case 0:
				System.out.println("���α׷� ����");
				break;
			default:
				System.out.println("���� �޴��Դϴ�.");
				break;
			}
			if(menu != 0)
				for(int i = 0; i < 20; i++)
					System.out.println();
		}while(menu != 0);
		
		sc.close();
	}

}
