package _switch;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.print("���� �Է�(1~10): ");
		num = sc.nextInt();
		
		switch(num) {
		case 1:	case 3: case 5: case 7: case 9:
			System.out.println(num + "��(��) Ȧ��");
			break;
			
		case 2:	case 4:	case 6:	case 8:	case 10:
			System.out.println(num + "��(��) ¦��");
			break;
			
		default:
			System.out.println("���� ��ȣ");
		}

		sc.close();
	}

}
