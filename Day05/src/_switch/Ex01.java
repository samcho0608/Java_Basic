package _switch;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int menu;
		
		System.out.println("�޴� �Է�: ");
		
		menu = sc.nextInt();
		String output = "";
		
		switch(menu) {
		case 1: 
			output = "1�� �޴�";
			break;
		case 2: 
			output = "2�� �޴�";
			break;
		case 3: 
			output = "3�� �޴�";
			break;
		case 4: 
			output = "4�� �޴�";
			break;
		default:
			output = "���� ��ȣ";
		}
		System.out.println(output);

		sc.close();
	}

}
