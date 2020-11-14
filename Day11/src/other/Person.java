package other;

public class Person {
	private String name;
	private int age;
	private double height;
	
	public String getName() {
		return name;
	}
	
	public Person(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = Math.round(height * 100) / 100.0;
	}
	
	public void showInfo() {
		System.out.println("�̸�: " + name);
		System.out.println("����: " + age);
		System.out.println("����: " + height);
	}

}
