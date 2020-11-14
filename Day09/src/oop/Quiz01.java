package oop;

import java.util.Scanner;

public class Quiz01 {
	public static double circle(double r) {
		return Math.PI * r * r;
	}
	
	public static void printArr(int[] arr) {
		for(int i: arr)
			System.out.print(i + " ");
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double r;
		
		System.out.print("1. ������ �Է�: ");
		r = sc.nextDouble();
		System.out.println("����: " + circle(r));
		
		
//		2. 1���� �迭�� ��� ����ϴ� �Լ�
		int[] arr = new int[] {10,20,30,40,50};
		
		printArr(arr);

		sc.close();
	}

}
