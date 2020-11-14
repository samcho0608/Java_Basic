import java.util.Scanner;

public class practice2 {

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
		for(int i = 1; i <= 1000; i++)
			if(i % 3 != 0 || i % 5 == 0)
				sum += i;
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
		
		
//		5. Check if the input value is a prime number
		
		int primeCheck;
		
		System.out.print("소수 감별을 하고 싶은 정수: ");
		primeCheck = sc.nextInt();
		boolean isPrime = true;
		for(int i = 1; i <= primeCheck; i++)
			if(primeCheck % i == 0 && !(i == 1 || i == primeCheck)) // i is a factor and is neither 1 nor the number itself
			{
				isPrime = false;
				break;
			}
		
		System.out.println(isPrime ? primeCheck + "은(는) 소수임." : primeCheck + "은(는) 소수가 아님.");
		
		
//		6. Factorial
		
		int factorialVal;
		System.out.print("팩토리얼을 하고픈 정수 입력: ");
		int factorial = factorialVal = sc.nextInt();
		while(factorialVal > 1) {
			factorial *= --factorialVal;
		}
		System.out.println(factorial);
		
		
//		7. Bank Acc question:
//			Deposit doubles the amt from the prev day
//			1st day 1 won, 2nd day 2 won, ...
//			how much over a month?
		
		int deposit = 0, amt = 1;
		for(int i = 0; i < 30; i++) {
			deposit += amt;
			amt *= 2;
		}
		System.out.println("한달 동안 저축된 금액은: " + deposit);
		
		
		
		
		
		
		
		sc.close();
	}

}
