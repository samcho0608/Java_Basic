package variable;

public class Ex02 {

	public static void main(String[] args) {
		
		// 자료형
		// 1. 기본
		// 2. 참조
		
		// 기본:
		// boolean	:	1 bit
		// byte		:	1 byte, integer
		// char		:	2 byte, bc UNICODE
		// short	:	2 byte
		// int		:	4 byte
		// long		:	8 byte
		// float	:	4 byte
		// double	:	8 byte
		
		// 참조
		// array, matrix, class, and String
		
		
		String name = "홍길동";
		int age = 16;
		double height = 178.2;
		char gender = '남';
		
		System.out.printf("이름: %s\n", name);
		System.out.printf("나이: %d\n", age);
		System.out.printf("신장: %.1f\n", height);
		System.out.printf("성별: %c\n", gender);
	}

}
