package io;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		String str;
		
		System.out.print("1. Input an integer: ");
		num = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("2. Input a string: ");
		str = sc.nextLine();
//		str = sc.next();
		
//		nextLine() doesn't ignore the blank space in the beginning
//		while next() does.
//		
//		To avoid the issue of lacking input request,
//		we use extra nextLine() to empty the buffer, as shown in line 16.
		
		System.out.println("str = " + str + ", num = " + num);
		
		sc.close();

	}

}
