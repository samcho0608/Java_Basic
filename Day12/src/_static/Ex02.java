package _static;

public class Ex02 {

	public static void main(String[] args) {
		// ���� ����� �ν��Ͻ��� ��� ��� ����
		Person.setEyes(2);
		System.out.println("��� ��: " + Person.getEyes());
		Person.func();

		Person p1 = new Person("ȫ�浿");
		Person p2 = new Person("��浿");
		
		p1.showInfo();
		p2.showInfo();
	}

}
