import java.util.Scanner;

public class practice3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		1. 스위치
		
		int n1;
		System.out.print("몇 번 스위치를 누르시겠습니까?(1,2,3): ");
		n1 = sc.nextInt();
		String output;
		switch(n1) {
		case 1:
			output = "전등ON";
			break;
		case 2:
			output = "전등OFF";
			break;
		case 3:
			output = "전등 고장";
			break;
		default:
			output = "없는 메뉴 번호";
		}
		
		System.out.println(output);
		
//		2. 사칙연산 계산기
		
		int n2,operator;
		System.out.print("첫번째 정수 입력: ");
		n1 = sc.nextInt();
		System.out.print("두번째 정수 입력: ");
		n2 = sc.nextInt();
		
		System.out.print("\n1:덧셈\n2:뺄셈\n3:곱셈\n4:나눗셈\n>>>");
		operator = sc.nextInt();
		
		switch(operator) {
		case 1:
			output = String.format("%d + %d = %d", n1, n2, n1 + n2);
			break;
		case 2:
			output = String.format("%d - %d = %d", n1, n2, n1 - n2);
			break;
		case 3:
			output = String.format("%d * %d = %d", n1, n2, n1 * n2);
			break;
		case 4:
			output = String.format("%d / %d = %d", n1, n2, n1 / n2);
			break;
		default:
			output = "Erroneous Operator Input";
		}
		
		System.out.println(output);
		
//		3. Letter Grade
		
		int kor, mat, eng;
		System.out.print("국영수 점수: ");
		kor = sc.nextInt();
		mat = sc.nextInt();
		eng = sc.nextInt();
		
		int sum = kor + mat + eng;
		double avg = sum / 3.0;
		avg = Math.round(avg * 100) / 100.0;
		
		System.out.println("평균 : " + avg + "점");
		
		
		char letter;
		switch((int)avg/10) {
		case 10: case 9:
			letter = 'A';
			break;
		case 8:
			letter = 'B';
			break;
		case 7:
			letter = 'C';
			break;
		case 6:
			letter = 'D';
			break;
		default:
			letter = 'F';
		}
		
		System.out.println(letter + "등급");
		
		sc.close();
	}

}
