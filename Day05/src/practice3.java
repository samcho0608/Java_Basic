import java.util.Scanner;

public class practice3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		1. ����ġ
		
		int n1;
		System.out.print("�� �� ����ġ�� �����ðڽ��ϱ�?(1,2,3): ");
		n1 = sc.nextInt();
		String output;
		switch(n1) {
		case 1:
			output = "����ON";
			break;
		case 2:
			output = "����OFF";
			break;
		case 3:
			output = "���� ����";
			break;
		default:
			output = "���� �޴� ��ȣ";
		}
		
		System.out.println(output);
		
//		2. ��Ģ���� ����
		
		int n2,operator;
		System.out.print("ù��° ���� �Է�: ");
		n1 = sc.nextInt();
		System.out.print("�ι�° ���� �Է�: ");
		n2 = sc.nextInt();
		
		System.out.print("\n1:����\n2:����\n3:����\n4:������\n>>>");
		operator = sc.nextInt();
		
		switch(operator) {
		case 1:
			output = String.format("%d + %d = %d", n1, n2, n1 + n2);
			break;
		case 2:
			output = String.format("%d - %d = %d", n1, n2, n1 - n2);
			break;
		case 3:
			output = String.format("%d * %d = %d", n1, n2, n1 * n2);
			break;
		case 4:
			output = String.format("%d / %d = %d", n1, n2, n1 / n2);
			break;
		default:
			output = "Erroneous Operator Input";
		}
		
		System.out.println(output);
		
//		3. Letter Grade
		
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
		switch((int)avg/10) {
		case 10: case 9:
			letter = 'A';
			break;
		case 8:
			letter = 'B';
			break;
		case 7:
			letter = 'C';
			break;
		case 6:
			letter = 'D';
			break;
		default:
			letter = 'F';
		}
		
		System.out.println(letter + "���");
		
		sc.close();
	}

}
