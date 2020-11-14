package object;

// Object class: all classes created in java inherits Object

// class Car extends Object{
class Car{ // Object is implicitly inherited all the time
	String name;
	int speed;
	
	Car(String name, int speed){
		this.name = name;
		this.speed = speed;
	}
	
	@Override
	public String toString() {
		return name + ", " + speed;
	}

	@Override
	public boolean equals(Object obj) {
		Car ref = (Car)obj;
		if(this.name.equals(ref.name))
			return true;
		else
			return false;
	}

	
}

public class Ex01 {
	public static void main(String[] args) {
		Car car = new Car("K5", 100);
		Car car2 = new Car("K5", 100);
		
		System.out.println(car);
		System.out.println(car2);
		// object.Car@15db9742
		// ��Ű��.Ŭ����@�ؽ��ڵ�
		
		// �� ������ ��ü�� ������� �����, �ּҸ� ��
		if(car == car2) {System.out.println("same");}
		else {System.out.println("different");}
		
		if(car.equals(car2)) {System.out.println("same");}
		else {System.out.println("different");}
	}
}
