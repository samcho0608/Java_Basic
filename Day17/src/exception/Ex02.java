package exception;

import java.util.*;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		try{
			System.out.print("���� �Է�: ");
			arr[1] = sc.nextInt();
			
			arr[5] = 10;
		}
		catch(InputMismatchException e) {
			System.err.println("���� �߻�. ������ �Է� ����");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("�迭 ���� �ʰ�: " + e.getMessage());
		}
		catch(Exception e) {
			System.err.println("����ġ ���� ���� �߻�: " + e.getMessage());
		}
		
		sc.close();
	}

}
