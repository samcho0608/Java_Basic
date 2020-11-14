package _final;

class Person{
	String name;
	
	Person(String name) {this.name = name;}
	
	final void showInfo() {	// disables overriding
		System.out.println("이름: " + name);
	}
}

final class Student extends Person {
	int score;
	
	Student(String name, int score){
		super(name);
		this.score = score;
	}
	
//	once declared final, method cannot be overridden
//	
//	void showInfo() {
//		System.out.println("이름: " + name);
//		System.out.println("점수: " + score);
//	}
}

// once declared final, class cannot be inherited
//
//class MiddleSchooler extends Student{
//	
//}

public class Ex02 {

	public static void main(String[] args) {
		Student s1 = new Student("홍길동", 17);
		
		s1.showInfo();
	}

}
