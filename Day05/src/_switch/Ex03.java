package _switch;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String menu;
		
		System.out.println("==================");
		System.out.println("\t1. Â¥Àå");
		System.out.println("\t1. Â«»Í");
		System.out.println("\t1. ººÀ½¹ä");
		System.out.println("\t1. ÅÁ¼öÀ°");
		System.out.println("\t>>> ");
		menu = sc.next();
		
		
		String output;
		switch(menu) {
		case "Â¥Àå": case "1":
			output = "Â¥Àå ÁÖ¹®";
		case "Â«»Í": case "2":
			output = "Â«»Í ÁÖ¹®";
		case "ººÀ½¹ä": case "3":
			output = "ººÀ½¹ä ÁÖ¹®";
		case "ÅÁ¼öÀ°": case "4":
			output = "ÅÁ¼öÀ° ÁÖ¹®";
		default:
			output = "¾ø´Â ¸Ş´º";
		}
		System.out.println(output);
		
		sc.close();
	}

}
