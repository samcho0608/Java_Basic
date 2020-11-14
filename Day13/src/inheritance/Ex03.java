package inheritance;

class Animal{
	private String name;
	private String bark;
	
	Animal(String name, String bark){
		this.name = name;
		this.bark = bark;
	}
	
	void showInfo() {
		System.out.println("��ü�� : " + name);
		System.out.println("���� �Ҹ�: " + bark);
	}
	
	
}

class Cat extends Animal{
	Cat(String name, String bark){
		super(name, bark);
	}
	
	void claw() {
		System.out.println("����̰� ���� �ܴ´�.");
	}
}

class Dog extends Animal{
	Dog(String name, String bark){
		super(name, bark);
	}
	
	void bite() {
		System.out.println("�������� ���� �����´�.");
	}
	
}

public class Ex03 {

	public static void main(String[] args) {
		Cat cat = new Cat("�����", "�߿˾߿�");
		Dog dog = new Dog("������",  "�۸�");
		
		
		cat.showInfo();
		dog.showInfo();
		
		cat.claw();
		dog.bite();
		
		
	}

}
