package casting;

class Car{
//	void takeOn(Student target) {	only takes Student class as an argument
	void takeOn(Person target) {
		System.out.println(target.name + "(��)�� ž��");
		
		if (target instanceof Student)	// if can be casted into Student
			((Student)target).study();	// run this line
	}
}

public class Ex02 {

	public static void main(String[] args) {
		Person p1 = new Person("ȫ�浿", 15);
		Student s2 = new Student("��浿", 17, 80);
		Police po = new Police();
		
		Car car = new Car();
		
		car.takeOn(s2);
		car.takeOn(p1);
//		car.takeOn(po);
//		Police didn't inherit Person, therefore cannot be used as an argument to takeOn
	}

}
