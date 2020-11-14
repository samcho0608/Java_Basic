package loop2;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int star;
		
		System.out.print("찍을 별 줄 수: ");
		star = sc.nextInt();	
		
		for(int i = 0; i < star; i++) {
			for(int j = 0; j < star; j++) {
				if(i == 0 || i == 4 || j == 0 || j == 4)
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}
		
		for(int i = 0; i < star; i++) {
			for(int j = 0; j < star; j++) {
				if(i == star/2 || j == star/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		for(int i = 0; i < star; i++) {
			for(int j = 0; j < star; j++) {
				if(i == j || i + j == star - 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
