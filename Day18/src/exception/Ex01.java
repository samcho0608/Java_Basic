package exception;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		try {
			System.out.print("정수 입력: ");
			num = sc.nextInt();
			
			System.out.println("입력 받은 값: " + num);
		}
		catch(Exception e) {
			e.printStackTrace();
			return;
		}
		
		finally {	// code that runs even if the exception occurs 			
			System.out.println("Scanner 자원 해제~");
			sc.close();
		}	// usually written when there's a stream/connection to DB that must be closed at the end of the program.
	}

}
