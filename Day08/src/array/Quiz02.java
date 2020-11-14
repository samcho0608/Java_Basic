package array;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		int[] score = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < score.length; i++) {
			System.out.print("점수 입력: ");
			score[i] = sc.nextInt();
		}
		
		for(int i = 0; i < score.length; i++) {
			System.out.print(score[i] + " ");
		}
		
		System.out.println();
		
		
		int total = score[0];
		for(int i = 1; i < score.length; i++) {
			total += score[i];
		}
		System.out.println("평균: " + total/(double)score.length);
		
		int max, min;
		max = min = score[0];
		for(int i = 1; i < score.length; i++) {
			if(score[i] > max)
				max = score[i];
			if(score[i] < min)
				min = score[i];
		}
		System.out.println("최대: " + max + "\n최소: " + min);
		
		int replace;
		for(int i = 0; i < score.length; i++){
			for(int j = i; j < score.length; j++) {
				if(score[i] > score[j]) {
					replace = score[i];
					score[i] = score[j];
					score[j] = replace;
				}
			}
		}
		
		for(int i = 0; i < score.length; i++)
			System.out.print(score[i] + " ");
		
		
		sc.close();

	}

}
