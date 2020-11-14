package io;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String word;
		byte by;
		short sh;
		int num;
		double pi;
		float fl;
		
		System.out.print("Input a string: ");
		word = sc.next();
		System.out.println("Input string: " + word);
		
		System.out.print("Input a byte: ");
		by = sc.nextByte();
		System.out.println("Input byte: " + by);
		
		System.out.print("Input a short: ");
		sh = sc.nextShort();
		System.out.println("Input string: " + sh);
		
		System.out.print("Input an integer: ");
		num = sc.nextInt();
		System.out.println("Input integer: " + num);
		
		System.out.print("Input a double: ");
		pi = sc.nextDouble();
		System.out.println("Input double: " + pi);
		
		System.out.print("Input a float: ");
		fl = sc.nextFloat();
		System.out.println("Input float: " + fl);
		
		System.out.println(fl + pi);
		
		sc.close();
		
	}

}
