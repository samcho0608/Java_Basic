package io;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str1, str2;
		
		System.out.print("1. Input a string: ");
//		str1 = sc.next();
//		next() utilizes blank space to distinguish data

		str1 = sc.nextLine();
//		nextLine() utilizes only \n to distinguish data

		System.out.print("2. Input a string: ");
		str2 = sc.next();
		
		
		
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);
		
		sc.close();

	}

}
