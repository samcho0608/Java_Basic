package accessModifier;

class People{
	private String name;
	private int age;
	private double height;
	
	String getName() {return name;}
	
	int getAge() {
		return age;
	}
	
	double getHeight() {
		return height;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	void setAge(int age) {
		this.age = age;
	}
	
	void setHeight(double height) {
		this.height = height;
	}
}

public class Ex03 {

	public static void main(String[] args) {
		People p1 = new People();
		p1.setName("홍길동");
		p1.setAge(15);
		p1.setHeight(176.5);
		
		System.out.println("이름: " + p1.getName());
		System.out.println("나이: " + p1.getAge());
		System.out.println("신장: " + p1.getHeight());

	}

}
