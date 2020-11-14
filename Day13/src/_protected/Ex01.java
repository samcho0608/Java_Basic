package _protected;
import subClass.Student;
import superClass.*;

public class Ex01 {

	public static void main(String[] args) {
		Student s1 = new Student("홍길동", 15, 92);
		s1.showInfo();

//		s1.name = "김길동";	protected는 외부에서 접근 불가
//							child class만 접근 가능
		
		Doctor d1 = new Doctor("김길동", 31);
		d1.showInfo();
	}

}
