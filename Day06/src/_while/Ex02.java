package _while;

public class Ex02 {
	public static void main(String[] args) throws InterruptedException {
		// for�� �̿��� Ư��Ƚ�� �ݺ�
		
		int i;
		
		//      1     2      3        4
		// for(�ʱⰪ; ���ǽ�; ������) { ���� ����; }
		for (i = 1; i <= 100; i++) {
			System.out.println(i + "ȸ�� : Hello Java");
			Thread.sleep(200);	// CPU ���α׷� ó���� 1/1000�� ������ �����ִ� �Լ�
		}
		
		// ���� ���� : 1 -> 2 -> 4 -> 3 -> 2 -> 4 -> 3....
		
		System.out.println("�ݺ� �� i = " + i);
		
		// �������� : �ش� ���������� ��밡���� ����
		// ��> �ش� ������ ������ ������� ������, �� ���������� ��� ����
		// ��> for������ ������ ������ for���� ������ ��� �Ұ���
		
	} 
}
