package _static;

import java.util.Scanner;

public class Ex03 {
	String name;

	// non-static method
	public int total(int n) {
		int sum = 0;
		
		for(int i = 1; i <= n; i++)
			sum += i;
		
		return sum;
	}
	
	// static method
	public static int summary(int n) {
		int sum = 0;
		for(int i = 0; i <= n; i++)
			sum+= i;
		
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, total = 0;
		System.out.print("1 ~ n 까지의 합계: ");
		n = sc.nextInt();
		
		total = summary(n);
		System.out.println(total);
		
		Ex03 e = new Ex03();
		total = e.total(n);
		
		System.out.println(total);
		
		// when you use the instance method only once
		// you don't need a referential variable
		
		new Ex03().total(n);
		
		sc.close();
		
	}

}
