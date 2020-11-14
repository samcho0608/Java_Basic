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
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("신장: " + height);	
	}
}
