package other;

public class Person {
	String name;
	int age;
	double height;
	
	public Person(String name, int age, double height){
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	public void showInfo() {
		System.out.println("�̸�: " + name);
		System.out.println("����: " + age);
		System.out.println("����: " + height);	
	}
}
