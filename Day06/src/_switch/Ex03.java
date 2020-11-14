package _switch;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int kor, eng, mat, sum;
		double avg;
		
		System.out.print("국 영 수 점수를 입력 : ");
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		
		sc.nextLine();
		
		sum = kor + eng + mat;
		avg = sum / 3.0;
		
		System.out.println("평균 : " + avg);	// 82.6667
		
		int score = (int)avg / 10;	// 8
		
		switch(score) {
		case 10: case 9:
			System.out.println("A등급");
			break;
		case 8:
			System.out.println("B등급");
			break;
		case 7:
			System.out.println("C등급");
			break;
		case 6:
			System.out.println("D등급");
			break;
		default:
			System.out.println("F등급");
		}
		
		sc.close();
		
	}
}
