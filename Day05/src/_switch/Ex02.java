package _switch;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.print("정수 입력(1~10): ");
		num = sc.nextInt();
		
		switch(num) {
		case 1:	case 3: case 5: case 7: case 9:
			System.out.println(num + "은(는) 홀수");
			break;
			
		case 2:	case 4:	case 6:	case 8:	case 10:
			System.out.println(num + "은(는) 짝수");
			break;
			
		default:
			System.out.println("없는 번호");
		}

		sc.close();
	}

}
