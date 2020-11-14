package accessModifier;

import other.Person;

class Car {
	private String model;
	private int speed;
	private int age;
	private Person member = null;
	
	Car(String model, int speed, int age){
		this.model = model;
		this.speed = speed;
		this.age = age;
	}
	
	void showInfo() {
		System.out.println("¸ðµ¨: " + model);
		System.out.println("¼Óµµ: " + speed);
		System.out.println("¿¬½Ä: " + age);
		if(member != null)
			System.out.println("Å¾½ÂÀÚ: " + member.getName());
	}
	
	void takeOn(Person target) {
		member = target;
		System.out.println(member.getName() + "ÀÌ Å¾½ÂÇÕ´Ï´Ù.");
	}
}

// access modifier
// 1. placed right b4 0the data type
// 2. private < default < protected < public

public class Ex01 {

	public static void main(String[] args) {
		Person p1;
		p1 = new Person("È«±æµ¿", 15, 172.345);
		
		p1.showInfo();
		
		Car c1 = new Car("K5", 120, 3);
//		c1.model = "¸ð´×";
		
		c1.showInfo();
		c1.takeOn(p1);
		c1.showInfo();
		
		
	}

}
