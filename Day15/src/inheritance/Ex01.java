package inheritance;

//��� IS-A ����:
//�л��� ����̴� -> ��
//����� �л��̴� -> ����

class Person{
	String name;
	int age;
	
	Person(){
		name = "�͸�";
		age = 0;
	}
	
	void showInfo() {
		System.out.println("�̸�: " + name);
		System.out.println("����: " + age);
	}
	
}

class Student extends Person{ // �л� is ��� => ��
	int score;
	
	Student(){
		score = 0;
	}
	
	void showInfo() {
		super.showInfo();
		System.out.println("����: " + score);
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Student s1 = new Student();
		
		s1.showInfo();
	}
}
