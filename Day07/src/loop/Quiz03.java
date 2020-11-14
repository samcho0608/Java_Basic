package loop;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		5. Check if the input value is a prime number
		
		int primeCheck;
		
		System.out.print("소수 감별을 하고 싶은 정수: ");
		primeCheck = sc.nextInt();
		boolean isPrime = true;
		for(int i = 2; i < primeCheck; i++)
			if(primeCheck % i == 0) // i is a factor and is neither 1 nor the number itself
			{
				isPrime = false;
				break;
			}
		
		System.out.println(isPrime ? primeCheck + "은(는) 소수임." : primeCheck + "은(는) 소수가 아님.");
		
		sc.close();
	}

}
