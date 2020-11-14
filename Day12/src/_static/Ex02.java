package _static;

public class Ex02 {

	public static void main(String[] args) {
		// 정적 멤버는 인스턴스가 없어도 사용 가능
		Person.setEyes(2);
		System.out.println("사람 눈: " + Person.getEyes());
		Person.func();

		Person p1 = new Person("홍길동");
		Person p2 = new Person("고길동");
		
		p1.showInfo();
		p2.showInfo();
	}

}
