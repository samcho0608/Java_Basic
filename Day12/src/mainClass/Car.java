package mainClass;

public class Car {
	String model;
	int speed;
	
	Car(String model, int speed){
		this.model = model;
		this.speed = speed;
	}
	
	void showInfo() {
		System.out.println("��: " + model);
		System.out.println("�ӵ�: " + speed);
	}
	
	public static void main(String[] args) {
		Car car = new Car("���", 110);
		car.showInfo();
	}
}
