package api;

import java.util.Random;

public class Ex04 {

	public static void main(String[] args) {
		Random ran = new Random();
		
		for(int i = 0; i < 5; i++) {
			System.out.print(ran.nextInt(10) + " ");
		}

		System.out.println();
		
		for(int i = 0; i < 10; i++) {
			System.out.print(ran.nextInt(10) + 1 + " ");
		}
	}

}
