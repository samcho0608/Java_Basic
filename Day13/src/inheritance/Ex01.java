package inheritance;

// 상속을 해주는 클래스 : 부모, 기반, 슈퍼, 상위
// 상속을 받는 클래스 : 자식, 파생, 서프, 하위

class Person{	// 기본 클래스(부모)
	String name;
	int age;
	
	Person(){
		System.out.println("부모의 기본 생성자 호출됨!");
	}
	
	Person(String name, int age){
		System.out.println("부모의 다른 생성자 호출됨!");		
		this.name = name;
		this.age = age;
	}
	
	void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
}

class Student extends Person{	// 상속받은 클래스(자식)
	int year;
	int _class;
	
	void showStu() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("학년 : " + year);
		System.out.println("반 : " + _class);		
	}
}
// 하위 클래스일수록 기능이 더 많다

public class Ex01 {

	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 15);
		p1.showInfo();
		
		Student s1 = new Student();
		s1.name = "김길동";
		s1._class = 4;
		s1.age = 15;
		s1.year = 2;
		s1.showInfo(); // 자식은 부모의 기능을 모두 사용가능
		s1.showStu(); // 자식은 본인 것도 사용가능
		
//		p1.showStu(); // 부모는 자식의 기능을 사용 불가능
	}

}
