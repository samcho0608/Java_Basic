package loop;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		7. Bank Acc question:
//		Deposit doubles the amt from the prev day
//		1st day 1 won, 2nd day 2 won, ...
//		how much over a month?
	
		int deposit = 0, amt = 1;
		for(int i = 0; i < 30; i++) {
			deposit += amt;
			amt *= 2;
		}
		System.out.println("한달 동안 저축된 금액은: " + deposit);
		sc.close();

		
	}

}
