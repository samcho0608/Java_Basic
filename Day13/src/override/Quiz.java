package override;

class Car{
	String model;
	int speed;
	int sits;
	
	Car(String model, int speed, int sits){
		this.model = model;
		this.speed = speed;
		this.sits = sits;
	}
	
	void showInfo() {
		System.out.println("모델 명: " + model);
		System.out.println("속도: " + speed);
		System.out.println("좌석: " + sits);
	}
	
	void run() { System.out.println("자동차가 달립니다."); }
	void accel() { speed += 10; }
	void _break() { speed -= 10; }
}

class Taxi extends Car{
	
	Taxi(String model, int speed, int sits){
		super(model, speed, sits);
	}
	
	void run() { System.out.println(model + "가 달립니다."); }
	void accel() { speed += 20; }
	void _break() { speed -= 20; } 
}

class Bus extends Car{

	Bus(String model, int speed, int sits) {
		super(model, speed, sits);
	}
	
	void run() { System.out.println(model + "가 달립니다."); }
	void accel() { speed += 12; }
	void _break() { speed -= 12; }
	
}

class Truck extends Car{

	Truck(String model, int speed, int sits) {
		super(model, speed, sits);
	}
	
	void run() { System.out.println(model + "이 달립니다."); }
	void accel() { speed += 17; }
	void _break() { speed -= 17; }
	
}

public class Quiz {

	public static void main(String[] args) {
		// 1. 상속받은 클래스의 생성자를 작성한다
		Taxi tx = new Taxi("카카오 택시", 50, 5);
		Bus bs = new Bus("마을 버스", 20 , 15);
		Truck tr = new Truck("포터블", 30, 3);

		tx.run();
		bs.run();
		tr.run();
		
		tx.accel(); // 20
		tx.showInfo();
		
		bs.accel(); // 12
		bs.showInfo();
		
		tr.accel();	// 17
		tr.showInfo();

		tx._break(); // 20
		tx.showInfo();
		
		bs._break(); // 12
		bs.showInfo();
		
		tr._break();	// 17
		tr.showInfo();
	}

}
