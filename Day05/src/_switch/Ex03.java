package _switch;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String menu;
		
		System.out.println("==================");
		System.out.println("\t1. ¥��");
		System.out.println("\t1. «��");
		System.out.println("\t1. ������");
		System.out.println("\t1. ������");
		System.out.println("\t>>> ");
		menu = sc.next();
		
		
		String output;
		switch(menu) {
		case "¥��": case "1":
			output = "¥�� �ֹ�";
		case "«��": case "2":
			output = "«�� �ֹ�";
		case "������": case "3":
			output = "������ �ֹ�";
		case "������": case "4":
			output = "������ �ֹ�";
		default:
			output = "���� �޴�";
		}
		System.out.println(output);
		
		sc.close();
	}

}
