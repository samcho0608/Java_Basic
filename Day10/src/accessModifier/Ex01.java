package accessModifier;

// 접근 제어 지시자: 정보 은닉을 구현하는 키워드
// 멤버 변수, 메서드를 클래스 외부에 공개하는 범위를 지정

// private: 클래스 내부에서만 접근 가능 
// default: 같은 패키지 내부까지만 접근 가능 
// protected: 상속받은 클래스에서 까지만 접근 가능
// public: 어느 위치에서나 접근 가능

// private < default < protected < public

import other.Person;

public class Ex01 {

	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 16, 168.2);

		p1.showInfo();
	}

}
