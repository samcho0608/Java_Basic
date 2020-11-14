package last;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Control stuCon = new Control();
		
		int menu;
		
		do {
			System.out.println("=== �л� ���� ===");
			System.out.println("1. �л� �߰�");
			System.out.println("2. �л� ���");
			System.out.println("3. �л� �˻�");
			System.out.println("4. �л� ����");
			System.out.println("5. ����");
			System.out.println("6. �ҷ�����");
			System.out.println("0. ���α׷� ����");
			System.out.print(">>>");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1: // add
				stuCon.add();
				break;
			case 2:	// list
				stuCon.list();
				break;
			case 3:	// search
				System.out.print("�̸�: ");
				stuCon.search(sc.next());
				break;
			case 4:	// remove
				System.out.print("�̸�: ");
				System.out.println((stuCon.remove(sc.next())) ? "���� �Ϸ�!\n" : "�ش� �л��� �������� �ʽ��ϴ�!\n");
				break;
			case 5:
				stuCon.save();
				break;
			case 6:
				stuCon.load();
				break;
			case 0:
				System.out.println("���α׷� ����!");
				break;
			default:
				System.out.println("���� ��ȣ�Դϴ�.");
			}
		}while(menu != 0);
		
		sc.close();
	}

}