package mainClass;

public class Main {
	public static void main(String[] args) {
		System.out.println("main이 있는 클래스");
		System.out.println("자바도 프로그램을 실행하기 위해서 main이 필요");
		
		Person p1 = new Person("홍길동", 15);
		p1.showInfo();
		
		String[] test = new String[] { "hello", "Java" };
		
		p1.main(test);
	}
}
