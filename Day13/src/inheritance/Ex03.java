package inheritance;

class Animal{
	private String name;
	private String bark;
	
	Animal(String name, String bark){
		this.name = name;
		this.bark = bark;
	}
	
	void showInfo() {
		System.out.println("개체명 : " + name);
		System.out.println("울음 소리: " + bark);
	}
	
	
}

class Cat extends Animal{
	Cat(String name, String bark){
		super(name, bark);
	}
	
	void claw() {
		System.out.println("고양이가 벽을 긁는다.");
	}
}

class Dog extends Animal{
	Dog(String name, String bark){
		super(name, bark);
	}
	
	void bite() {
		System.out.println("강아지가 뼈를 물어뜯는다.");
	}
	
}

public class Ex03 {

	public static void main(String[] args) {
		Cat cat = new Cat("고양이", "야옹야옹");
		Dog dog = new Dog("강아지",  "멍멍");
		
		
		cat.showInfo();
		dog.showInfo();
		
		cat.claw();
		dog.bite();
		
		
	}

}
