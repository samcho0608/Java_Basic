package _protected;
import subClass.Student;
import superClass.*;

public class Ex01 {

	public static void main(String[] args) {
		Student s1 = new Student("ȫ�浿", 15, 92);
		s1.showInfo();

//		s1.name = "��浿";	protected�� �ܺο��� ���� �Ұ�
//							child class�� ���� ����
		
		Doctor d1 = new Doctor("��浿", 31);
		d1.showInfo();
	}

}
