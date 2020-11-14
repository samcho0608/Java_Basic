package _while;

// 반복문 : 참/거짓에 따라서 코드를 반복
// while : 주로 불특정 횟수 반복에 많이 사용 
// do while : while과 달리 조건을 뒤에서 검사한다
// for : 주로 특정 횟수 반복에 많이 사용

public class Ex01 {
	public static void main(String[] args) {
		// while을 이용한 특정횟수 반복
		
		int i = 1;			// 반복의 초기값
		
		while(i <= 10) {	// while(조건식) { 종속 문장; }
							// while은 조건식이 참이면 종속문장 실행, 거짓이면 다음 문장으로
							// 즉, 조건식이 참인 동안 계속 반복한다 
			System.out.println(i + "회차 : Hello Java");
			i++;			// 반복의 증감식
		}
		// while문은 '초기값 부터 조건식까지 증감식 만큼 증가'하며 반복해라
		
		System.out.println("반복 후 i = " + i);
	}
}
