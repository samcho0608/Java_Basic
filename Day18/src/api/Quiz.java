package api;

import java.util.Random;
import java.util.Scanner;

class Lotto{
	// rule 1 : 1~45
	// rule 2 : no repeated number
	// rule 3 : the result announced in an increasing order
	// rule 4 : 6 numbers
	private int num[] = new int[6];
	Random ran = new Random();
	
	int[] getNum() {
		return num;
	}
	
	void run(int count) {
		for(int i = 0; i < count; i++) {
			System.out.print(String.format("%3d번째 로또 : ", i + 1));
			
			raffle();
			
			sort();							// do a selection sort using the sort function
			
			System.out.println(this);
		}
		
	}
	
	void raffle() {
		int n;		
		OUTER:
		for(int i = 0; i < num.length;) {
			n = ran.nextInt(45) + 1;
			for(int j = 0; j <= i; j++)	// if repeated, re-choose a random integer
				if(num[j] == n) continue OUTER;
			num[i++] = n;
		}
	}
	
	void sort() {
		int temp;
		for(int i = 0; i < num.length - 1; i++) {
			for(int j = i + 1; j < num.length; j++) {
				if(num[j] < num[i]) {
					temp = num[j];
					num[j] = num[i];
					num[i] = temp;
				}
			}
				
		}
	}



	@Override
	public boolean equals(Object obj) {
		int[] targetArray = ((Lotto)obj).getNum();
		for(int i = 0; i < num.length; i++)
			if(num[i] != targetArray[i])
				return false;
		return true;
	}
	
	@Override
	public String toString() {
		String strVal = "";
		for(int i : num)
			strVal = strVal + i + " ";
		
		return strVal;
	}
	
	
}

public class Quiz {

	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		int input;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇장의 로또를 사시겠습니까? ");
		input = sc.nextInt();
		lotto.run(input);
		sc.close();
	}

}
