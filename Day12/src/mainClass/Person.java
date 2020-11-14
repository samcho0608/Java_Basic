package mainClass;

public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void showInfo() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
	}
	
	public static void main(String[] args) {
		System.out.println(args[0]);
		System.out.println("Person의 메인");
		
		for(int i = 0; i< args.length; i++)
			System.out.println(args[i]);
	}
}
