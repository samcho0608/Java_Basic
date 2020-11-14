package _switch;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int menu;
		
		System.out.print("몇 번 스위치를 누르시겠습니까? (1, 2, 3) ");
		menu = sc.nextInt();
		
		switch(menu) {
		case 1:
			System.out.println("전등 ON");
			break;
		case 2:
			System.out.println("전등 OFF");
			break;
		case 3:
			System.out.println("전등 고장");
			break;
		default :
			System.out.println("없는 메뉴 번호");
		}
		
		sc.close();
	}
}
