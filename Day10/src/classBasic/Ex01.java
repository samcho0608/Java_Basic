package classBasic;

// 클래스의 구성 요소: 속성 + 기능 + 정보은닉
// 구성요소 구현 방법: 변수 + 함수 + 접근 제어 지시자

class Person{
	// 속성: member variable
	String m_name;
	int m_age;
	double m_height;
	
	// 기능: 멤버 함수(method)
	void showInfo() {
		System.out.println("이름: " + m_name);
		System.out.println("나이: " + m_age);
		System.out.println("신장: " + m_height);
		
		// class uses "this" to distinguish the instances
		
	}
}	// now can be used as a type of data

public class Ex01 {
	public static void main(String[] args) {
		Person p1; // Person 참조 자료형
		
		p1 = new Person(); // create an instance space with the keyword "new"
		p1.m_name = "홍길동";
		p1.m_age = 16;
		p1.m_height = 172.5;
		
		System.out.println(p1.m_name);
		System.out.println(p1.m_age);
		System.out.println(p1.m_height);
		System.out.println();
		
		p1.showInfo();
		System.out.println();
		
		Person p2 = new Person();
		p2.m_name = "김길동";
		p2.m_age = 15;
		p2.m_height = 179.7;
		
		p2.showInfo();
	}
}
