package collection;

import java.util.ArrayList;

class Person{
	String name;
	int age;
	
	Person(){}
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + "(" + age+ "세)";
	}
	
	void run() {
		System.out.println(name + "(이)가 달립니다~");
	}
}

public class Ex02 {

	public static void main(String[] args) {
		// All collections are written in generic form
		// using generic, only that specific data type will be added to collection
		// but there will be no need for casting
		
		// generic cannot be basic data types
		// thus use the wrapper classes
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		arr.add(10);
//		arr.add(10.0); erroneous bc only integers can be added
		
		Person p1 = new Person();
		Person p2 = new Person("홍길동", 15);
		
		ArrayList<Person> members_1 = new ArrayList<Person>();
		ArrayList members_2 = new ArrayList();
		
		members_1.add(p2);
		members_1.add(p1);
		
		System.out.println(members_1);
		
		members_1.get(0).run();
		members_1.get(1).run();
		
		members_2.add(p2);
		members_2.add(p1);

		System.out.println(members_2);
		
		((Person)members_2.get(0)).run();
		((Person)members_2.get(1)).run();
	}

}
