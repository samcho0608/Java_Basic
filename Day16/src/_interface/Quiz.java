package _interface;

interface Giveable{}

class Person implements Giveable{
	String name;
	
	Person(String name){
		this.name = name;
	}
	
	void give(Giveable target){
		if( target instanceof Person)
			System.out.println(name + "(이)가 " + ((Person)target).name + "에게 과자를 건네주다.");
		else if( target instanceof Dog)
			System.out.println(name + "(이)가  " + ((Dog)target).name + "에게 먹이를 던져주다.");
	}
}

class Dog implements Giveable{
	String name;
	
	Dog(String name){
		this.name = name;
	}
}

public class Quiz {

	public static void main(String[] args) {
		Person p1 = new Person("홍길동");
		Person p2 = new Person("김길동");
		
		Dog dog = new Dog("강아지");
		
		p1.give(p2);	// 홍길동이 김길동에게 먹을걸 주다
		
		// 오버로딩이 아닌 인터페이스를 하나 생성하여
		// 아래 코드가 실행되도록 하여라.
		
		p1.give(dog);
		
	}

}
