package operator;

// 연산자 : 값을 연산하여 새로운 값을 얻는 기호
// 1. 산술 연산자
// 2. 대입 연산자
// 3. 증감 연산자
// 4. 비교 연산자
// 5. 논리 연산자
// 6. 조건 연산자

public class Ex01 {
	public static void main(String[] args) {
		// 산술연산자 : 사칙연산을 수행하는 기호
		
		int num1 = 11, num2 = 2;
		
		System.out.println("num1 + num2 = " + (num1 + num2));
		System.out.println("num1 - num2 = " + (num1 - num2));
		System.out.println("num1 * num2 = " + (num1 * num2));
		System.out.println("num1 / num2 = " + (num1 / num2));
		
		// 나누기 기호는 2가지 
		// / : 나눈 몫
		// % : 나눈 나머지
		
		System.out.println("num1 % num2 = " + (num1 % num2));
		
		System.out.println("1. 배수 구분 ");
		
		System.out.println("10 % 2 = " + (10 % 2));
		System.out.println("11 % 2 = " + (11 % 2) + "\n");
		
		
		System.out.println("2. 정수 자리 추출");
		
		
		System.out.println("123 % 10 = " + (123 % 10));
		System.out.println("123 / 10 = " + (123 / 10));
		
		System.out.println("1234 % 100 = " + (1234 % 100));
		System.out.println("1234 / 100 = " + (1234 / 100));
		
		
		
		System.out.println("3. 범위 지정");
		// n % 100 => 0 ~ 99 
		// 즉, 나머지는 나누는 '제수 - 1' 만큼이 도출
		
		System.out.println(Math.random());	// random() : [0.0, 1.0) 난수를 반환
		
		int random_value = (int)(Math.random() * 100); // 0 ~ 99
		int random_value2 = (int)(Math.random() * 100) % 45 + 1; // 1 ~ 45
	
		System.out.println("랜덤수 : " + random_value);
		System.out.println("랜덤수 : " + random_value2);
		
		System.out.println((int)(Math.random() * 100) % 46 + 17); // 17 ~ 62
		
	}
}
