package loop;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
//		1. sum of 1 ~ 1000
		
		int sum = 0;
		for(int i = 1; i <= 1000; i++)
			sum += i;
		System.out.println(sum);
		
//		2. 1. but excluding all multiples of 3
		
		sum = 0;
		for(int i = 1; i <= 1000; i++) {
			if(i % 3 == 0) continue;
			sum += i;
		}
		System.out.println(sum);
		
//		3. 2. but include all multiples of 5

		sum = 0;
		for(int i = 1; i <= 1000; i++) {
			if(i % 3 == 0 && i % 5 != 0) continue;
			sum += i;
		}
		System.out.println(sum);
		
		
//		4. Find all factors of the input value and the number of them
		
		Scanner sc = new Scanner(System.in);
		
		int factoringVal;
		System.out.print("약수를 찾고 싶은 정수: ");
		factoringVal = sc.nextInt();
		int numberOfFactors = 0;
		
		System.out.print("약수: ");
		for(int i = 1; i <= factoringVal; i++) {
			if(factoringVal % i == 0) {
				System.out.print(i + " ");
				numberOfFactors++;
			}
		}
		System.out.println("\n약수의 개수: " +numberOfFactors);
		
		sc.close();
	}

}
