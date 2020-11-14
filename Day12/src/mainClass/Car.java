package mainClass;

public class Car {
	String model;
	int speed;
	
	Car(String model, int speed){
		this.model = model;
		this.speed = speed;
	}
	
	void showInfo() {
		System.out.println("¸ðµ¨: " + model);
		System.out.println("¼Óµµ: " + speed);
	}
	
	public static void main(String[] args) {
		Car car = new Car("¸ð´×", 110);
		car.showInfo();
	}
}
