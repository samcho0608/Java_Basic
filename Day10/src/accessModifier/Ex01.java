package accessModifier;

// ���� ���� ������: ���� ������ �����ϴ� Ű����
// ��� ����, �޼��带 Ŭ���� �ܺο� �����ϴ� ������ ����

// private: Ŭ���� ���ο����� ���� ���� 
// default: ���� ��Ű�� ���α����� ���� ���� 
// protected: ��ӹ��� Ŭ�������� ������ ���� ����
// public: ��� ��ġ������ ���� ����

// private < default < protected < public

import other.Person;

public class Ex01 {

	public static void main(String[] args) {
		Person p1 = new Person("ȫ�浿", 16, 168.2);

		p1.showInfo();
	}

}
