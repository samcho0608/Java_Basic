package casting;


public class Quiz1 {

	public static void main(String[] args) {
		// 1. 아무 이름과 나이를 변수에 저장해서 출력
		String name = "류해인";
		int age = 20;
		
		System.out.println(String.format("이름 : %s, 나이 : %d", name, age));
		
		// 2. 이름, 국영수 세 과목 점수를 변수에 저장 후
		// 이름, 합계, 평균을 출력
		// (단, 국영수 점수는 정수로 저장할 것)
		
		String name2 = "황시온";
		
		// all in one line
		int Korean = 90, English = 96, _Math = 89, sum = Korean + English + _Math;
		double avg = sum / 3.0;
		
		System.out.println(String.format("이름 : %s, 합계 : %d점, 평균 : %.2f점", 
				name2, sum, avg));
		
		System.out.println("평균 : " + Math.round(avg * 100) / 100.0);
		
		// Math class is also under java.lang like System
		// meaning it is imported by default
	}

}
