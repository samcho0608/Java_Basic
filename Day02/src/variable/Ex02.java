package variable;

public class Ex02 {

	public static void main(String[] args) {
		
		// �ڷ���
		// 1. �⺻
		// 2. ����
		
		// �⺻:
		// boolean	:	1 bit
		// byte		:	1 byte, integer
		// char		:	2 byte, bc UNICODE
		// short	:	2 byte
		// int		:	4 byte
		// long		:	8 byte
		// float	:	4 byte
		// double	:	8 byte
		
		// ����
		// array, matrix, class, and String
		
		
		String name = "ȫ�浿";
		int age = 16;
		double height = 178.2;
		char gender = '��';
		
		System.out.printf("�̸�: %s\n", name);
		System.out.printf("����: %d\n", age);
		System.out.printf("����: %.1f\n", height);
		System.out.printf("����: %c\n", gender);
	}

}
