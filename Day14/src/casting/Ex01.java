package casting;

class Person{
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void showInfo() {
		System.out.println("�̸�: " + name);
		System.out.println("����: " + age + "\n");
	}
}

class Student extends Person{
	int score;
	
	Student(String name, int age, int score){
		super(name, age);      
		this.score = score;
	}
	
	void study() { System.out.println("������!"); }
	
	void showInfo() {
		System.out.println("�̸�: " + name);
		System.out.println("����: " + age);
		System.out.println("����: " + score + "\n");
	}
}

class Police{}

public class Ex01 {

	public static void main(String[] args) {
		Person p1 = new Person("ȫ�浿", 15);
		Student s1 = new Student("��浿", 16, 70);
		
		Person s2 = new Student("�̱浿", 17, 80);
		
		s1.study();
		s1.showInfo();
		
//		s2.study();
		s2.showInfo();
		
		// parent function can point to the space of child class
		// Additional functions(only in child class) cannot be used in such case
		// but the overridden functions are used as the overridden version
		// this is call up-casting
		
		// the other way around where you cast higher type to lower type
		// is called down-casting
		((Student)s2).study();
		
		// higher class can point to lower class
		// however the other way doesn't work
		
//		Student p2 = new Person("��浿", 19);
		
		System.out.println(s1 instanceof Person);
		System.out.println(p1 instanceof Student);
		
		Police po = new Police();
		
//		System.out.println(po instanceof Person);
//		if the class of the instance is not in an
//		inheritance relationship with the class argument
//		the instanceof operator doesn't even work
	}

}
