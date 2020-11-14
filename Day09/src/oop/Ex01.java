package oop;

class Car{
	String model;
	int speed;

	void run() {
			System.out.println("자동차가 달립니다.");
		}
}

public class Ex01 {

	public static void main(String[] args) {
		// oop: object oriented programming
		
		// object: every concept in reality
		// class: object represented with programming
		// instance: the condition when class is actually loaded on memory
		
		// class -> class -> instance
		
		Car c1 = new Car();
		
		// the space allocated for a class stands independently
		// that means, c1's model, c2's model variables' values are stored separately
		
	}

}
