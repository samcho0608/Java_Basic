package _abstract;

class Dog extends Animal {

	Dog(String name, int age, String type) {
		super(name, age, type);
	}
	
	@Override
	void eat() {
		System.out.println("»À´Ù±Í¸¦ ¾Ã´Â´Ù.");
	}
	
	void attack() {
		System.out.println("¹°¾î¶â´Â´Ù.");
	}
}

class Hamster extends Animal {
	Hamster(String name, int age, String type) {
		super(name, age, type);
	}
	
	@Override
	void eat() {
		System.out.println("ÇØ¹Ù¶ó±â¾¾¸¦ ¸Ô´Â´Ù, ¿È‡œ‡œ");
	}
}

class Rabbit extends Animal {
	Rabbit(String name, int age, String type) {
		super(name, age, type);
	}
	
	
	@Override
	void eat() {
		System.out.println("´ç±ÙÀ» ¸Ô´Â´Ù.");
	}
}


public class Ex02 {

	public static void main(String[] args) {
		Cat cat = new Cat("°í¾çÀÌ", 1, "¸ÕÄ¡Å²");
		Dog dog = new Dog("°­¾ÆÁö", 2, "Ä¡¿Í¿Í");
		Hamster ham = new Hamster("ÇÜ½ºÅÍ", 4, "ÇÜÅä¸®");
		Rabbit rab = new Rabbit("Åä³¢", 6, "¼³Ä¡·ù");
		
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
