package array;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] name = new String[3];
		int[] score = new int[3];
		double[] height = new double[3];
		
		int menu;
		
		loop:
		while(true) {
			System.out.println("== �л� ���� ==");
			System.out.println("1. �л� �߰�");
			System.out.println("2. �л� ���");
			System.out.println("3. �л� ����");
			System.out.println("4. ����");
			System.out.println(">>> ");
			
			menu = sc.nextInt();
			
			control:
			switch(menu) {
			case 1:
				
				for(int i = 0; i < name.length; i++) {
					if(name[i] == null) {
						System.out.print("�̸�: ");
						name[i] = sc.next();
						System.out.print("����: ");
						score[i] = sc.nextInt();
						System.out.print("����: ");
						height[i] = sc.nextDouble();
						break control;
					}
				}
				
				System.out.println("�ο� �� ��!!");
				break;
			
			case 2: 
				for(int i = 0; i < name.length; i++) {
					if(name[i] == null) {
						System.out.println("��� �Ϸ�!");
						break;
					}
					else
						System.out.println(i + 1 + ".\t�̸�:" + name[i]);
					
					System.out.println();
				}
				break;
				
			case 3:
				for(int i = 0; i < name.length; i++) {
					if(name[i] == null) {
						System.out.println("��� �Ϸ�!");
						break;
					}
					else {
						System.out.println(i + 1 + ".\t�̸�:" + name[i]);
						System.out.println("\t����: " + score[i]);
						System.out.println("\t����: " + height[i]);
					}
					System.out.println();
					
				}
				
				break;
			case 4:
				System.out.println("����!");
				break loop;
			default:
				System.out.println("���� ��ȣ");
			}
		}
		
		sc.close();
	}

}
