package controlSet;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		1. ������
		
		int kor, mat, eng;
		System.out.print("������ ����: ");
		kor = sc.nextInt();
		mat = sc.nextInt();
		eng = sc.nextInt();
		
		int sum = kor + mat + eng;
		double avg = sum / 3.0;
		avg = Math.round(avg * 100) / 100.0;
		
		System.out.println("��� : " + avg + "��");
		
		
		char letter;
		if(avg > 90)		letter = 'A';
		else if(avg > 80)	letter = 'B';
		else if(avg > 70)	letter = 'C';
		else if(avg > 60)	letter = 'D';
		else				letter = 'F';
		
		System.out.println(letter + "���");
		
//		2. USB
		
		int usbNum;
		System.out.print("������ USB ����: ");
		usbNum = sc.nextInt();
		
		
		int total = 0;
		if(usbNum < 0)	System.out.println("�������� ���� ��");
		else if(usbNum < 10)			total = (int)(usbNum * 5000);
		else if(usbNum < 100)	total = (int)(usbNum * 5000 * 0.9);
		else					total = (int)(usbNum * 5000 * (1 - 0.12));
		System.out.println("�� ���ž�: " + total + "��");
		
//		3. Bus
		
		int stationNum;
		System.out.print("���� ������ ��: ");
		stationNum = sc.nextInt();
		String output;
		
		if(stationNum < 0)
			output = "�������� ���� ��";
		else if(stationNum < 10)
			output = String.format("������ ��: %d\n�� �ҿ� �ð��� %d�� �Դϴ�.", 
					stationNum, stationNum * 2);
		else {
			total = stationNum * 4;
			int hours = total / 60, min = total % 60;
			
			if(total < 60)
				output = String.format("������ ��: %d\n�� �ҿ� �ð��� %d�� �Դϴ�.", 
						stationNum, min);
			else if(min == 0)
				output = String.format("������ ��: %d\n�� �ҿ� �ð��� %d�ð� �Դϴ�.", 
						stationNum, hours);
			else
				output = String.format("������ ��: %d\n�� �ҿ� �ð��� %d�ð� %d�� �Դϴ�.", 
						stationNum, hours, min);	
		}
		
		System.out.println(output);
		
		sc.close();
	}

}
