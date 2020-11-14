import java.util.Scanner;

public class practice01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int num;
		System.out.print("출력>\n찍을 별의 줄 수: ");
		num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= i; j++)
				System.out.print('*');
			System.out.println();
		}
			
		// 2. 역직각
		System.out.print("출력>\n찍을 별의 줄 수: ");
		num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		// 3. 좌우 반전 직각
		
		System.out.print("출력>\n찍을 별의 줄 수: ");
		num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num - i - 1; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 피라미드
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num - 1 - i; j++) {
				System.out.print(" ");
			}
			
			for(int j = 0; j <= i * 2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		// 4. 구구단
		
		int gugudan;
		System.out.print("단을 입력(1: 모두, 0: 종료) : ");
		gugudan = sc.nextInt();
		
		sc.close();
		
		if(gugudan == 0) return;
		
		if(gugudan == 1) {
			
			System.out.println("\n\t구구단 전체 출력\n");
			
			
			int start = 2, limit = 5, j = start;
			
			for(int i = 1; i <= 9; i++) {
				for(; j <= limit; j++) {
					System.out.print(j + " x " + i + ((i * j < 10) ? " =  " : " = ") + i * j + "\t");
				}
				System.out.println();
				
				// 5단까지 끝났다면
				if(j == 6 && i == 9) {
					System.out.println();
					i = 0;		// 곱하는 수 초기화
					limit = 9;	// 이제 9단까지
					start = 6;	// 시작점은 6
				}
				else
					j = start;
			}
		}
		
		else {

			for(int i = 1; i <= 9; i++)
				System.out.println(gugudan + " x " + i + ((i * gugudan < 10) ? " =  " : " = ") + i * gugudan);
		}
		
		

	}

}
