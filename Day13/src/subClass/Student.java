package subClass;

import superClass.Person;

public class Student extends Person {
	private int score;
	
	public Student(String name, int age, int score){
		super(name, age);
		this.score = score;
	}
	
	public void showInfo() {
		System.out.println("�̸�: " + name);
		System.out.println("����: " + age);
		System.out.println("����: " + score);
		
		// if inherited from a diff package
		// cannot be access with default
		// ��> can only be accessed with protected
	}
}
