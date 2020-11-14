package _static;

class Person{
	private String name; // 인스턴스 변수: 해당 클래스로 생성된 인스턴스마다 가지는 변수
	private static int eyes = 2; // 클래스 변수: 클래스에 해당되는 모든 인스턴스가 공유하는 변수
	
	Person(String name) {
		this.name = name;
	}
	
	void showInfo() {
		System.out.println("이름: " + name + "(뉸: " + eyes + "개)");
	}
	
	static void setEyes(int eyes) {
		Person.eyes = eyes;
	}
	
	static int getEyes() {
		return eyes;
	}
	
	static void func() { // 정적 멤버 함수 = 정적 메서드 = 클래스 메서드
		System.out.println("static method");
		System.out.println("static method can only access static variable: " + eyes);
//		System.out.println("static method cannot access non-static variables: " + name); // 이러면 에러
	}
}

public class Ex01 {

	public static void main(String[] args) {
		Person p1 = new Person("홍길동");
		Person p2 = new Person("홍진호");
		Person p3 = new Person("김길동");
		
		p1.showInfo();
		p2.showInfo();
		p3.showInfo();
		
		System.out.println(Person.getEyes());
//		p1.eyes = 3;
//		Person.eyes = 3; // this is the static way of changing static variables
		Person.setEyes(10);
		
		p1.showInfo();
		p2.showInfo();
		p3.showInfo();
	}

}
