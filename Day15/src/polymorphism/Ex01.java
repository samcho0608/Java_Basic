package polymorphism;

class Figure{
	void Draw() {
		System.out.println("������ �׸��ϴ�.");
	}
}

class Triangle extends Figure{
	
	void test() {
		System.out.println("���� Ŭ���� �޼���");
	}
	
	void Draw() {
		System.out.println("�ﰢ���� �׸��ϴ�.");
	}
}

class Square extends Figure{
	void Draw() {
		System.out.println("�簢���� �׸��ϴ�.");
	}
}

class Circle extends Figure{
	void Draw() {
		System.out.println("���� �׸��ϴ�.");
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
