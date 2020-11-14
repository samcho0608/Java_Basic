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
		System.out.println("�� ��: " + model);
		System.out.println("�ӵ�: " + speed);
		System.out.println("�¼�: " + sits);
	}
	
	void run() { System.out.println("�ڵ����� �޸��ϴ�."); }
	void accel() { speed += 10; }
	void _break() { speed -= 10; }
}

class Taxi extends Car{
	
	Taxi(String model, int speed, int sits){
		super(model, speed, sits);
	}
	
	void run() { System.out.println(model + "�� �޸��ϴ�."); }
	void accel() { speed += 20; }
	void _break() { speed -= 20; } 
}

class Bus extends Car{

	Bus(String model, int speed, int sits) {
		super(model, speed, sits);
	}
	
	void run() { System.out.println(model + "�� �޸��ϴ�."); }
	void accel() { speed += 12; }
	void _break() { speed -= 12; }
	
}

class Truck extends Car{

	Truck(String model, int speed, int sits) {
		super(model, speed, sits);
	}
	
	void run() { System.out.println(model + "�� �޸��ϴ�."); }
	void accel() { speed += 17; }
	void _break() { speed -= 17; }
	
}

public class Quiz {

	public static void main(String[] args) {
		// 1. ��ӹ��� Ŭ������ �����ڸ� �ۼ��Ѵ�
		Taxi tx = new Taxi("īī�� �ý�", 50, 5);
		Bus bs = new Bus("���� ����", 20 , 15);
		Truck tr = new Truck("���ͺ�", 30, 3);

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
