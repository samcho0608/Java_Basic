package classBasic;

// Ŭ������ ���� ���: �Ӽ� + ��� + ��������
// ������� ���� ���: ���� + �Լ� + ���� ���� ������

class Person{
	// �Ӽ�: member variable
	String m_name;
	int m_age;
	double m_height;
	
	// ���: ��� �Լ�(method)
	void showInfo() {
		System.out.println("�̸�: " + m_name);
		System.out.println("����: " + m_age);
		System.out.println("����: " + m_height);
		
		// class uses "this" to distinguish the instances
		
	}
}	// now can be used as a type of data

public class Ex01 {
	public static void main(String[] args) {
		Person p1; // Person ���� �ڷ���
		
		p1 = new Person(); // create an instance space with the keyword "new"
		p1.m_name = "ȫ�浿";
		p1.m_age = 16;
		p1.m_height = 172.5;
		
		System.out.println(p1.m_name);
		System.out.println(p1.m_age);
		System.out.println(p1.m_height);
		System.out.println();
		
		p1.showInfo();
		System.out.println();
		
		Person p2 = new Person();
		p2.m_name = "��浿";
		p2.m_age = 15;
		p2.m_height = 179.7;
		
		p2.showInfo();
	}
}
