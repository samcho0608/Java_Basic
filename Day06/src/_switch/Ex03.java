package _switch;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int kor, eng, mat, sum;
		double avg;
		
		System.out.print("�� �� �� ������ �Է� : ");
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		
		sc.nextLine();
		
		sum = kor + eng + mat;
		avg = sum / 3.0;
		
		System.out.println("��� : " + avg);	// 82.6667
		
		int score = (int)avg / 10;	// 8
		
		switch(score) {
		case 10: case 9:
			System.out.println("A���");
			break;
		case 8:
			System.out.println("B���");
			break;
		case 7:
			System.out.println("C���");
			break;
		case 6:
			System.out.println("D���");
			break;
		default:
			System.out.println("F���");
		}
		
		sc.close();
		
	}
}
