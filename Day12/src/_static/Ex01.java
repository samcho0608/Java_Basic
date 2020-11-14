package _static;

class Person{
	private String name; // �ν��Ͻ� ����: �ش� Ŭ������ ������ �ν��Ͻ����� ������ ����
	private static int eyes = 2; // Ŭ���� ����: Ŭ������ �ش�Ǵ� ��� �ν��Ͻ��� �����ϴ� ����
	
	Person(String name) {
		this.name = name;
	}
	
	void showInfo() {
		System.out.println("�̸�: " + name + "(�H: " + eyes + "��)");
	}
	
	static void setEyes(int eyes) {
		Person.eyes = eyes;
	}
	
	static int getEyes() {
		return eyes;
	}
	
	static void func() { // ���� ��� �Լ� = ���� �޼��� = Ŭ���� �޼���
		System.out.println("static method");
		System.out.println("static method can only access static variable: " + eyes);
//		System.out.println("static method cannot access non-static variables: " + name); // �̷��� ����
	}
}

public class Ex01 {

	public static void main(String[] args) {
		Person p1 = new Person("ȫ�浿");
		Person p2 = new Person("ȫ��ȣ");
		Person p3 = new Person("��浿");
		
		p1.showInfo();
		p2.showInfo();
		p3.showInfo();
		
		System.out.println(Person.getEyes());
//		p1.eyes = 3;
//		Person.eyes = 3; // this is the static way of changing static variables
		Person.setEyes(10);
		
		p1.showInfo();
		p2.showInfo();
		p3.showInfo();
	}

}
