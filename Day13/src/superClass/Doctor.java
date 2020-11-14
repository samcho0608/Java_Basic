package superClass;

public class Doctor extends Person {

	public Doctor(String name, int age) {
		super(name, age);
	}
	
	public void showInfo() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		
		// If inherited in the same package,
		// protected is meaningless
		// ㄴ> can be access via default access
	}

}
