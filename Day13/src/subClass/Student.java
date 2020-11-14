package subClass;

import superClass.Person;

public class Student extends Person {
	private int score;
	
	public Student(String name, int age, int score){
		super(name, age);
		this.score = score;
	}
	
	public void showInfo() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("점수: " + score);
		
		// if inherited from a diff package
		// cannot be access with default
		// ㄴ> can only be accessed with protected
	}
}
