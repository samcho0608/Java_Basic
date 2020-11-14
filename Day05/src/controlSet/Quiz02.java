package controlSet;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		1. 국영수
		
		int kor, mat, eng;
		System.out.print("국영수 점수: ");
		kor = sc.nextInt();
		mat = sc.nextInt();
		eng = sc.nextInt();
		
		int sum = kor + mat + eng;
		double avg = sum / 3.0;
		avg = Math.round(avg * 100) / 100.0;
		
		System.out.println("평균 : " + avg + "점");
		
		
		char letter;
		if(avg > 90)		letter = 'A';
		else if(avg > 80)	letter = 'B';
		else if(avg > 70)	letter = 'C';
		else if(avg > 60)	letter = 'D';
		else				letter = 'F';
		
		System.out.println(letter + "등급");
		
//		2. USB
		
		int usbNum;
		System.out.print("구매할 USB 개수: ");
		usbNum = sc.nextInt();
		
		
		int total = 0;
		if(usbNum < 0)	System.out.println("적절하지 않은 값");
		else if(usbNum < 10)			total = (int)(usbNum * 5000);
		else if(usbNum < 100)	total = (int)(usbNum * 5000 * 0.9);
		else					total = (int)(usbNum * 5000 * (1 - 0.12));
		System.out.println("총 구매액: " + total + "원");
		
//		3. Bus
		
		int stationNum;
		System.out.print("버스 정거장 수: ");
		stationNum = sc.nextInt();
		String output;
		
		if(stationNum < 0)
			output = "적절하지 않은 값";
		else if(stationNum < 10)
			output = String.format("정거장 수: %d\n총 소요 시간은 %d분 입니다.", 
					stationNum, stationNum * 2);
		else {
			total = stationNum * 4;
			int hours = total / 60, min = total % 60;
			
			if(total < 60)
				output = String.format("정거장 수: %d\n총 소요 시간은 %d분 입니다.", 
						stationNum, min);
			else if(min == 0)
				output = String.format("정거장 수: %d\n총 소요 시간은 %d시간 입니다.", 
						stationNum, hours);
			else
				output = String.format("정거장 수: %d\n총 소요 시간은 %d시간 %d분 입니다.", 
						stationNum, hours, min);	
		}
		
		System.out.println(output);
		
		sc.close();
	}

}
