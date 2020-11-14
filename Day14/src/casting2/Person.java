package casting2;

public class Person {
	private String name, job;
	private int age;
	
	Person(String name, int age, String job){
		this.name = name;
		this.age = age;
		this.job = job;
	}
	
	void showInfo() {
		System.out.println("�̸�: " + name);
		System.out.println("����: " + age);
		System.out.println("����: " + job);
	}
	
	String getName() {
		return name;
	}
}

class Student extends Person {
	Student(String name, int age, String job) {
		super(name, age, job);
	}
}

class Police extends Person {
	Police(String name, int age, String job) {
		super(name, age, job);
	}
}

class Musician extends Person {
	Musician(String name, int age, String job) {
		super(name, age, job);
	}
}

class Doctor extends Person {
	Doctor(String name, int age, String job) {
		super(name, age, job);
	}
	
	void cure() {
		System.out.println("ġ�Ḧ �����մϴ�.");
	}
}

class Gamer extends Person {
	Gamer(String name, int age, String job) {
		super(name, age, job);
	}
}
