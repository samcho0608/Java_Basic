package _while;

// �ݺ��� : ��/������ ���� �ڵ带 �ݺ�
// while : �ַ� ��Ư�� Ƚ�� �ݺ��� ���� ��� 
// do while : while�� �޸� ������ �ڿ��� �˻��Ѵ�
// for : �ַ� Ư�� Ƚ�� �ݺ��� ���� ���

public class Ex01 {
	public static void main(String[] args) {
		// while�� �̿��� Ư��Ƚ�� �ݺ�
		
		int i = 1;			// �ݺ��� �ʱⰪ
		
		while(i <= 10) {	// while(���ǽ�) { ���� ����; }
							// while�� ���ǽ��� ���̸� ���ӹ��� ����, �����̸� ���� ��������
							// ��, ���ǽ��� ���� ���� ��� �ݺ��Ѵ� 
			System.out.println(i + "ȸ�� : Hello Java");
			i++;			// �ݺ��� ������
		}
		// while���� '�ʱⰪ ���� ���ǽı��� ������ ��ŭ ����'�ϸ� �ݺ��ض�
		
		System.out.println("�ݺ� �� i = " + i);
	}
}
