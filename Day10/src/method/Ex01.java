package method;

import java.util.Scanner;

public class Ex01 {
	public static boolean prime(int n) {
		if(n == 1) return false;
		for(int i = 2; i < n; i++)
			if(n % i == 0)
				return false;
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num, count = 0;
		System.out.print("정수 입력: ");
		num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			if(prime(i)) {
				System.out.print(String.format("%3d ", i));
				count++;
			}
			if(i % 10 == 0)
				System.out.println();
		}
		
		System.out.println("소수의 총 개수: " + count);
		
		sc.close();
	}

}
