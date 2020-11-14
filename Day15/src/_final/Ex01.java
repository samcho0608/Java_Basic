package _final;

// 3 types of usages:
// 1. on a variable
// 2. on a method
// 3. on a class

public class Ex01 {

	public static void main(String[] args) {
		int num = 10; // literal 상수
		
		final int fnum = 10; // 지정 상수
		
		System.out.println("num = " + num);
		System.out.println("fnum = " + fnum);

		num = 20;
//		fnum = 20;
//		bc this is final, a new value cannot be assigned
		
		final int fnum2;
		fnum2 = 2;
		System.out.println("fnum = " + fnum2); // if not initialized, a value can be assigned ONCE
		
//		cannot use any operation that changes the value of the final variable
//		e.g. fnum2++; fnum2 += 2;
	}

}
