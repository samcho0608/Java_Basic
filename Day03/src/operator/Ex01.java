package operator;

// ������ : ���� �����Ͽ� ���ο� ���� ��� ��ȣ
// 1. ��� ������
// 2. ���� ������
// 3. ���� ������
// 4. �� ������
// 5. �� ������
// 6. ���� ������

public class Ex01 {
	public static void main(String[] args) {
		// ��������� : ��Ģ������ �����ϴ� ��ȣ
		
		int num1 = 11, num2 = 2;
		
		System.out.println("num1 + num2 = " + (num1 + num2));
		System.out.println("num1 - num2 = " + (num1 - num2));
		System.out.println("num1 * num2 = " + (num1 * num2));
		System.out.println("num1 / num2 = " + (num1 / num2));
		
		// ������ ��ȣ�� 2���� 
		// / : ���� ��
		// % : ���� ������
		
		System.out.println("num1 % num2 = " + (num1 % num2));
		
		System.out.println("1. ��� ���� ");
		
		System.out.println("10 % 2 = " + (10 % 2));
		System.out.println("11 % 2 = " + (11 % 2) + "\n");
		
		
		System.out.println("2. ���� �ڸ� ����");
		
		
		System.out.println("123 % 10 = " + (123 % 10));
		System.out.println("123 / 10 = " + (123 / 10));
		
		System.out.println("1234 % 100 = " + (1234 % 100));
		System.out.println("1234 / 100 = " + (1234 / 100));
		
		
		
		System.out.println("3. ���� ����");
		// n % 100 => 0 ~ 99 
		// ��, �������� ������ '���� - 1' ��ŭ�� ����
		
		System.out.println(Math.random());	// random() : [0.0, 1.0) ������ ��ȯ
		
		int random_value = (int)(Math.random() * 100); // 0 ~ 99
		int random_value2 = (int)(Math.random() * 100) % 45 + 1; // 1 ~ 45
	
		System.out.println("������ : " + random_value);
		System.out.println("������ : " + random_value2);
		
		System.out.println((int)(Math.random() * 100) % 46 + 17); // 17 ~ 62
		
	}
}
