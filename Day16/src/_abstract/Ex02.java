package _abstract;

class Dog extends Animal {

	Dog(String name, int age, String type) {
		super(name, age, type);
	}
	
	@Override
	void eat() {
		System.out.println("���ٱ͸� �ô´�.");
	}
	
	void attack() {
		System.out.println("�����´�.");
	}
}

class Hamster extends Animal {
	Hamster(String name, int age, String type) {
		super(name, age, type);
	}
	
	@Override
	void eat() {
		System.out.println("�عٶ�⾾�� �Դ´�, �ȇ���");
	}
}

class Rabbit extends Animal {
	Rabbit(String name, int age, String type) {
		super(name, age, type);
	}
	
	
	@Override
	void eat() {
		System.out.println("����� �Դ´�.");
	}
}


public class Ex02 {

	public static void main(String[] args) {
		Cat cat = new Cat("������", 1, "��ġŲ");
		Dog dog = new Dog("������", 2, "ġ�Ϳ�");
		Hamster ham = new Hamster("�ܽ���", 4, "���丮");
		Rabbit rab = new Rabbit("�䳢", 6, "��ġ��");
		
		Animal[] members = new Animal[] {
				cat, dog, ham, rab
		};
		
		for(Animal a : members) {
			a.eat();
		}
		// overriden class' methods can be called
		// when upcasted, too
		
		((Dog)members[1]).attack();
		// the lower class specific class cannot be called
		// when upcasted, so downcast first
		
	}

}