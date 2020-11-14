package override;

class Person{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void showInfo() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
	}
}

class Student extends Person {
	private int score;

	public Student(String name, int age, int score) {
		super(name, age);
		this.score = score;
	}
	
	void showInfo() {
		super.showInfo();
		System.out.println("점수: " + score);
	}
}

public class Ex01 {

	public static void main(String[] args) {
		Student s1 = new Student("홍길동", 16, 88);
		s1.showInfo();

	}

}
