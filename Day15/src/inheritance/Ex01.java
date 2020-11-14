package inheritance;

//상속 IS-A 관계:
//학생은 사람이다 -> 참
//사람은 학생이다 -> 거짓

class Person{
	String name;
	int age;
	
	Person(){
		name = "익명";
		age = 0;
	}
	
	void showInfo() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
	}
	
}

class Student extends Person{ // 학생 is 사람 => 참
	int score;
	
	Student(){
		score = 0;
	}
	
	void showInfo() {
		super.showInfo();
		System.out.println("점수: " + score);
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Student s1 = new Student();
		
		s1.showInfo();
	}
}
