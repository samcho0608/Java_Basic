package io;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1, n2;

		System.out.print("Input two integers: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		System.out.println("n1 = " + n1 + " n2 = " + n2);
		
		sc.close();
	}

}
