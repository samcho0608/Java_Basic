package _while;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) throws InterruptedException{
		Scanner sc = new Scanner(System.in);
		
		String m1 = "����Ŭ��", m2 = "�ݶ�", m3 = "ȯŸ", m4 = "Ŀ��";
		int p1 = 1900, p2 = 1200, p3 = 1100, p4 = 700;
		
		System.out.print("�ݾ� ���� : ");
		int money = sc.nextInt();
		
	
here:		while (true) {
		
			System.out.println("============= �޴� =============");
			System.out.println("\t1." + m1 + " : " + p1 + "��");
			System.out.println("\t2." + m2 + " : " + p2 + "��");
			System.out.println("\t3." + m3 + " : " + p3 + "��");
			System.out.println("\t4." + m4 + " : " + p4 + "��");
			System.out.println("\t0.����");
			System.out.println("\t���� �ܾ� : " + money);
			System.out.print("\t>>> ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				if (money > p1) {
					money -= p1;
					System.out.println(m1 + "�� �̾ҽ��ϴ�~~");
				}
				else {
					System.out.println("��~ �ܾ� ����");
				}
				
				Thread.sleep(2000);
				break;
			case 2:
				if (money > p2) {
					money -= p2;
					System.out.println(m2 + "�� �̾ҽ��ϴ�~~");
				}
				else {
					System.out.println("��~ �ܾ� ����");
				}
				
				Thread.sleep(2000);
				break;
			case 3:
				if (money > p3) {
					money -= p3;
					System.out.println(m3 + "�� �̾ҽ��ϴ�~~");
				}
				else {
					System.out.println("��~ �ܾ� ����");
				}
				
				Thread.sleep(2000);
				break;
			case 4:
				if (money > p4) {
					money -= p4;
					System.out.println(m4 + "�� �̾ҽ��ϴ�~~");
				}
				else {
					System.out.println("��~ �ܾ� ����");
				}
				
				Thread.sleep(2000);
				break;
			case 0:
				System.out.println("���α׷��� ���� �մϴ�~~");
				break here;
			default :
				System.out.println("���� ��ȣ�Դϴ�~~~");
			}
			
			for(int i = 0; i < 50; i++) {
				System.out.println();
			}
		}
		
		sc.close();
	}
}
