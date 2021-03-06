package _interface;

// interface : the only form t hat allows multi-inheritance in java
// ��> a type of abstract class
// ��> uses the "implements" keyword to inherit

// In java, a child class can have only one parent class

interface Jumpable{
	void jump(); // atomatically attains the public abstract character
}

abstract class Animal{
	String name;
	Animal(String name) { this.name = name; }
	
	abstract void speak();
	abstract void eat();
}

class Cat extends Animal implements Jumpable{
	
	Cat(String name){
		super(name);
	}
	
	@Override
	void speak() {
		System.out.println("�Ŀ�");
	}
	
	@Override
	void eat() {
		System.out.println("�� �� �����");
	}

	@Override
	public void jump() {
		System.out.println("���� ����");
	}
}

class Pig extends Animal{	// doesn't inherit jumpable
	Pig(String name){ super(name); }
	
	@Override
	void speak() { System.out.println("�ܲ�"); }
	
	@Override
	void eat() { System.out.println("�ƹ��ų� ��");}
}

public class Ex01 {
	public static void main(String[] args) {
		Cat cat = new Cat("������");
		Pig pig = new Pig("����");
		
		if ( pig instanceof Jumpable ) {
			System.out.println("����~");
		}
		
		else {
			System.out.println("�Ұ���~");
		}
		
//		Jumpable jp = new Jumpable();
//		can't create an instance bc it's a type of abstract class
		
		Jumpable jp = cat;
		
		jp.jump();
	}
}
