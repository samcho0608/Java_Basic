import java.util.Scanner;

public class practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
//		1. 정수와 그 수만큼의 배수
		int multiple;
		System.out.print("배수를 찾을 정수: ");
		multiple = sc.nextInt();
		
		for(int i = 1; i <= multiple; i++)
			System.out.println(multiple * i);
		
//		2. 정수부터 1까지 역순
		int descending;
		System.out.print("역순 출력용 정수: ");
		descending = sc.nextInt();
		
		while(descending > 0)
			System.out.println(descending--);
		
//		3. 세 자리 정수 거꾸로 출력
		int reverse;
		System.out.print("거꾸로 출력할 세 자리 정수: ");
		reverse = sc.nextInt();
		
		do {
			System.out.print(reverse%10);
			reverse /= 10;
		}while(reverse > 0);
		
		sc.close();
	}
	
}
