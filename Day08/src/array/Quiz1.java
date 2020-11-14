package array;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] name = new String[3];
		int[] score = new int[3];
		double[] height = new double[3];
		
		int menu;
		
		loop:
		while(true) {
			System.out.println("== 학생 관리 ==");
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 목록");
			System.out.println("3. 학생 정보");
			System.out.println("4. 종료");
			System.out.println(">>> ");
			
			menu = sc.nextInt();
			
			control:
			switch(menu) {
			case 1:
				
				for(int i = 0; i < name.length; i++) {
					if(name[i] == null) {
						System.out.print("이름: ");
						name[i] = sc.next();
						System.out.print("점수: ");
						score[i] = sc.nextInt();
						System.out.print("신장: ");
						height[i] = sc.nextDouble();
						break control;
					}
				}
				
				System.out.println("인원 꽌 참!!");
				break;
			
			case 2: 
				for(int i = 0; i < name.length; i++) {
					if(name[i] == null) {
						System.out.println("출력 완료!");
						break;
					}
					else
						System.out.println(i + 1 + ".\t이름:" + name[i]);
					
					System.out.println();
				}
				break;
				
			case 3:
				for(int i = 0; i < name.length; i++) {
					if(name[i] == null) {
						System.out.println("출력 완료!");
						break;
					}
					else {
						System.out.println(i + 1 + ".\t이름:" + name[i]);
						System.out.println("\t점수: " + score[i]);
						System.out.println("\t신장: " + height[i]);
					}
					System.out.println();
					
				}
				
				break;
			case 4:
				System.out.println("종료!");
				break loop;
			default:
				System.out.println("없는 번호");
			}
		}
		
		sc.close();
	}

}
