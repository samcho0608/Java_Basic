package superClass;

public class Doctor extends Person {

	public Doctor(String name, int age) {
		super(name, age);
	}
	
	public void showInfo() {
		System.out.println("�̸�: " + name);
		System.out.println("����: " + age);
		
		// If inherited in the same package,
		// protected is meaningless
		// ��> can be access via default access
	}

}
