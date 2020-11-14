package inheritance;

// ����� ���ִ� Ŭ���� : �θ�, ���, ����, ����
// ����� �޴� Ŭ���� : �ڽ�, �Ļ�, ����, ����

class Person{	// �⺻ Ŭ����(�θ�)
	String name;
	int age;
	
	Person(){
		System.out.println("�θ��� �⺻ ������ ȣ���!");
	}
	
	Person(String name, int age){
		System.out.println("�θ��� �ٸ� ������ ȣ���!");		
		this.name = name;
		this.age = age;
	}
	
	void showInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
	}
}

class Student extends Person{	// ��ӹ��� Ŭ����(�ڽ�)
	int year;
	int _class;
	
	void showStu() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("�г� : " + year);
		System.out.println("�� : " + _class);		
	}
}
// ���� Ŭ�����ϼ��� ����� �� ����

public class Ex01 {

	public static void main(String[] args) {
		Person p1 = new Person("ȫ�浿", 15);
		p1.showInfo();
		
		Student s1 = new Student();
		s1.name = "��浿";
		s1._class = 4;
		s1.age = 15;
		s1.year = 2;
		s1.showInfo(); // �ڽ��� �θ��� ����� ��� ��밡��
		s1.showStu(); // �ڽ��� ���� �͵� ��밡��
		
//		p1.showStu(); // �θ�� �ڽ��� ����� ��� �Ұ���
	}

}
