package loop;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		5. Check if the input value is a prime number
		
		int primeCheck;
		
		System.out.print("�Ҽ� ������ �ϰ� ���� ����: ");
		primeCheck = sc.nextInt();
		boolean isPrime = true;
		for(int i = 2; i < primeCheck; i++)
			if(primeCheck % i == 0) // i is a factor and is neither 1 nor the number itself
			{
				isPrime = false;
				break;
			}
		
		System.out.println(isPrime ? primeCheck + "��(��) �Ҽ���." : primeCheck + "��(��) �Ҽ��� �ƴ�.");
		
		sc.close();
	}

}
