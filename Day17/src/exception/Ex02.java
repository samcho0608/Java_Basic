package exception;

import java.util.*;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		try{
			System.out.print("정수 입력: ");
			arr[1] = sc.nextInt();
			
			arr[5] = 10;
		}
		catch(InputMismatchException e) {
			System.err.println("예외 발생. 정수만 입력 가능");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("배열 범위 초과: " + e.getMessage());
		}
		catch(Exception e) {
			System.err.println("예상치 못한 예외 발생: " + e.getMessage());
		}
		
		sc.close();
	}

}
