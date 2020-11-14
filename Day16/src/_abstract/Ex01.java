package _abstract;

abstract class Animal {
	String name;
	int age;
	String type;
	
	Animal(String name, int age, String type) {
		this.name = name;
		this.age = age;
		this.type = type;
	}
	
	@Override
	public String toString() {
		return name + "(" + age + ", "+ type + ")";
	}
	
	abstract void eat();
	final void sleep() { System.out.println("Sleep"); }
}

class Cat extends Animal {
	Cat(String name, int age, String type){
		super(name, age, type);
	}
	
	@Override
	void eat() {
		System.out.println("�򸣸� �Դ´�.");
	}
}

public class Ex01 {

	public static void main(String[] args) {
//		Animal a = new Animal("����", 1, "����");
//		��> one cannot create an instance of an abstract class

		Cat cat = new Cat("������", 2, "�丣�þ�");
		cat.eat();
		cat.sleep();
		
		System.out.println(cat);
	}

}