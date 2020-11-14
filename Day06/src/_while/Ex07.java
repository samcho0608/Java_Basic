package _while;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) throws InterruptedException{
		Scanner sc = new Scanner(System.in);
		
		String m1 = "스파클링", m2 = "콜라", m3 = "환타", m4 = "커피";
		int p1 = 1900, p2 = 1200, p3 = 1100, p4 = 700;
		
		System.out.print("금액 투입 : ");
		int money = sc.nextInt();
		
	
here:		while (true) {
		
			System.out.println("============= 메뉴 =============");
			System.out.println("\t1." + m1 + " : " + p1 + "원");
			System.out.println("\t2." + m2 + " : " + p2 + "원");
			System.out.println("\t3." + m3 + " : " + p3 + "원");
			System.out.println("\t4." + m4 + " : " + p4 + "원");
			System.out.println("\t0.종료");
			System.out.println("\t현재 잔액 : " + money);
			System.out.print("\t>>> ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				if (money > p1) {
					money -= p1;
					System.out.println(m1 + "를 뽑았습니다~~");
				}
				else {
					System.out.println("응~ 잔액 부족");
				}
				
				Thread.sleep(2000);
				break;
			case 2:
				if (money > p2) {
					money -= p2;
					System.out.println(m2 + "를 뽑았습니다~~");
				}
				else {
					System.out.println("응~ 잔액 부족");
				}
				
				Thread.sleep(2000);
				break;
			case 3:
				if (money > p3) {
					money -= p3;
					System.out.println(m3 + "를 뽑았습니다~~");
				}
				else {
					System.out.println("응~ 잔액 부족");
				}
				
				Thread.sleep(2000);
				break;
			case 4:
				if (money > p4) {
					money -= p4;
					System.out.println(m4 + "를 뽑았습니다~~");
				}
				else {
					System.out.println("응~ 잔액 부족");
				}
				
				Thread.sleep(2000);
				break;
			case 0:
				System.out.println("프로그램을 종료 합니다~~");
				break here;
			default :
				System.out.println("없는 번호입니다~~~");
			}
			
			for(int i = 0; i < 50; i++) {
				System.out.println();
			}
		}
		
		sc.close();
	}
}
