package io;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, n3;
		
		System.out.print("Input two integers: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		sc.nextLine();
//		To avoid Buffer Overflow, we empty the buffer using nextLine()
		
		System.out.print("Input the last one: ");
		n3 = sc.nextInt();

		System.out.println(String.format("n1 = %d, n2 = %d, n3 = %d", n1, n2, n3));
		
		sc.close();
	}

}
