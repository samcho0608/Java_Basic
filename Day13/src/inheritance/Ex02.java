package inheritance;

class Police extends Person{ // Person은 Ex01에 있는 기본 클래스
	String rank;
	
	Police(){
		super();	// calls the parent class' constructor
					// but you can't just use Person("익명",0)
					// the default constructor is implicitly called
					// if not specified
		System.out.println("자식 기본 생성자");
	}
	
	Police(String name, int age, String rank){
		super(name, age); // 부모의 멤버는 떠넘기고
		this.rank = rank; // 자기 멤버는 직접 초기화
		
		System.out.println("자식 다른 생성자 호출");
	}
	
	// 자식 클래스의 생성자는 무조건 부모 클래스의 생성자를 먼저 호출한다
	// 하지만, 자식 생성자는 내부에서 부모 생성자를 지정해서 호출하지 않으면
	// 부모의 기본 생성자를 호출한다.
	
	void showPol() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("계급 : " + rank);
	}
}

public class Ex02 {

	public static void main(String[] args) {
		Police p1 = new Police();
		Police p2 = new Police("홍길동", 21, "경감");
		
		p1.showPol();
		p2.showPol();
	}

}
