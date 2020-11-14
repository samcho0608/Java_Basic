package io;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String word;
		char ch;
		
		System.out.print("Input a string: ");
		word = sc.next();
		System.out.println("word = " + word);
		
		System.out.println("First char in word: " + word.charAt(0));
		System.out.println("Second char in word: " + word.charAt(1));
	
		System.out.print("Input a char: ");
		ch = sc.next().charAt(0);
		System.out.println(ch);
		
		sc.close();
	}

}
