package _switch;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, op;
		
		System.out.print("1¹øÂ° Á¤¼ö ÀÔ·Â : ");
		n1 = sc.nextInt();
		
		System.out.print("2¹øÂ° Á¤¼ö ÀÔ·Â : ");
		n2 = sc.nextInt();
		
		System.out.println("1. µ¡¼À");
		System.out.println("2. »¬¼À");
		System.out.println("3. °ö¼À");
		System.out.println("4. ³ª´°¼À");
		System.out.print(">>> ");
		op = sc.nextInt();
		
		
		switch(op) {
		case 1:
			System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
			break;
		case 2:
			System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
			break;
		case 3:
			System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
			break;
		case 4:
			System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
			break;
		default :	
			System.out.println("¾ø´Â ¹øÈ£ÀÔ´Ï´Ù~");
		}
		
		sc.close();
	}
}
