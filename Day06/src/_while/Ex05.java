package _while;

public class Ex05 {
	public static void main(String[] args) {
		// while : ���ǽ� -> ���ӹ���
		// do ~ while : ���ӹ��� -> ���ǽ�
		
		int n = 10;
		
		while(n > 20) {
			System.out.println("��� �ȵ�~~~");
			n--;
		}
		
		System.out.println("while ����~~\n");
		
		do {
			System.out.println("��� ��~~");
			n--;
		} while(n > 20);
		
		System.out.println("do ~ while ����~~");
	}
}
