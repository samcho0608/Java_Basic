package casting;


public class Quiz1 {

	public static void main(String[] args) {
		// 1. �ƹ� �̸��� ���̸� ������ �����ؼ� ���
		String name = "������";
		int age = 20;
		
		System.out.println(String.format("�̸� : %s, ���� : %d", name, age));
		
		// 2. �̸�, ������ �� ���� ������ ������ ���� ��
		// �̸�, �հ�, ����� ���
		// (��, ������ ������ ������ ������ ��)
		
		String name2 = "Ȳ�ÿ�";
		
		// all in one line
		int Korean = 90, English = 96, _Math = 89, sum = Korean + English + _Math;
		double avg = sum / 3.0;
		
		System.out.println(String.format("�̸� : %s, �հ� : %d��, ��� : %.2f��", 
				name2, sum, avg));
		
		System.out.println("��� : " + Math.round(avg * 100) / 100.0);
		
		// Math class is also under java.lang like System
		// meaning it is imported by default
	}

}
