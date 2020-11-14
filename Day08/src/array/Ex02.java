package array;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] name = new String[3];
		int[] score = new int[3];
		double[] height = new double[3];
		
		
		for(int i = 0; i < 3; i++) {
			name[i] = sc.next();
			score[i] = sc.nextInt();
			height[i] = sc.nextDouble();
		}
		
		System.out.println("===== 학생 정보 =====");
		System.out.println("이름\t점수\t신장");
		System.out.println("=================");
		for(int i = 0; i < 3; i++) {
			System.out.print(name[i] + "\t");
			System.out.print(score[i] + "\t");
			System.out.print(height[i] + "\t");
			System.out.println();
		}
		
		sc.close();
	}
}
