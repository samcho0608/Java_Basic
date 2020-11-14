package polymorphism;

class Figure{
	void Draw() {
		System.out.println("도형을 그립니다.");
	}
}

class Triangle extends Figure{
	
	void test() {
		System.out.println("하위 클래스 메서드");
	}
	
	void Draw() {
		System.out.println("삼각형을 그립니다.");
	}
}

class Square extends Figure{
	void Draw() {
		System.out.println("사각형을 그립니다.");
	}
}

class Circle extends Figure{
	void Draw() {
		System.out.println("원을 그립니다.");
	}
}

public class Ex01 {

	public static void main(String[] args) {
		Figure[] figs = new Figure[] {
				new Triangle(),
				new Square(),
				new Circle()
		};
		
		Figure test = new Triangle();
		
		test.Draw();
		System.out.println();
//		test.test();
//		the upcasted instance can only the functions
//		of class it has been upcasted to
		
		for(int i = 0; i < figs.length; i++) {
			figs[i].Draw();
		}
	}

}
