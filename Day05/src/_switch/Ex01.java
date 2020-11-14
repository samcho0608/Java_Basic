package _switch;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int menu;
		
		System.out.println("메뉴 입력: ");
		
		menu = sc.nextInt();
		String output = "";
		
		switch(menu) {
		case 1: 
			output = "1번 메뉴";
			break;
		case 2: 
			output = "2번 메뉴";
			break;
		case 3: 
			output = "3번 메뉴";
			break;
		case 4: 
			output = "4번 메뉴";
			break;
		default:
			output = "없는 번호";
		}
		System.out.println(output);

		sc.close();
	}

}
