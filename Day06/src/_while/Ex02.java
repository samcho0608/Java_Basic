package _while;

public class Ex02 {
	public static void main(String[] args) throws InterruptedException {
		// for를 이용한 특정횟수 반복
		
		int i;
		
		//      1     2      3        4
		// for(초기값; 조건식; 증감식) { 종속 문장; }
		for (i = 1; i <= 100; i++) {
			System.out.println(i + "회차 : Hello Java");
			Thread.sleep(200);	// CPU 프로그램 처리를 1/1000초 단위로 멈춰주는 함수
		}
		
		// 실행 순서 : 1 -> 2 -> 4 -> 3 -> 2 -> 4 -> 3....
		
		System.out.println("반복 후 i = " + i);
		
		// 지역변수 : 해당 지역에서만 사용가능한 변수
		// ㄴ> 해당 지역이 끝나면 사라지기 때문에, 그 공간에서만 사용 가능
		// ㄴ> for문에서 선언한 변수는 for문이 지나면 사용 불가능
		
	} 
}
