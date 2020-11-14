package _while;

public class Ex05 {
	public static void main(String[] args) {
		// while : 조건식 -> 종속문장
		// do ~ while : 종속문장 -> 조건식
		
		int n = 10;
		
		while(n > 20) {
			System.out.println("출력 안됨~~~");
			n--;
		}
		
		System.out.println("while 다음~~\n");
		
		do {
			System.out.println("출력 됨~~");
			n--;
		} while(n > 20);
		
		System.out.println("do ~ while 다음~~");
	}
}
