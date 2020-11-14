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
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("직업: " + job);
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
		System.out.println("치료를 시작합니다.");
	}
}

class Gamer extends Person {
	Gamer(String name, int age, String job) {
		super(name, age, job);
	}
}
