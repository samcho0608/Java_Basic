package classBasic;

class Car{
	private String model;
	private int speed;
	
	Car(){
		model = "없음";
		speed = 0;
	}
	
	Car(String mod, int sp){
		model = mod;
		speed = sp;
	}
	
	void Accell(){
		speed += 10;
	}

	void Break() {
		speed -= 10;
	}
	
	void showInfo() {
		System.out.println("모델명: " + model);
		System.out.println("속도: " + speed);
	}
}


public class Ex03 {

	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car("K5", 120);
		
		car1.showInfo();
		car2.showInfo();

		car2.Accell();
		car2.showInfo();
		
		car2.Break();
		car2.showInfo();
		
	}

}
