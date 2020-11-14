package interaction;

class Child{
	private String name;
	private Ball ball;
	
	Child(String name) {
		this.name = name;
	}
	
	void showInfo() {
		System.out.println("�̸� : " + name);
		System.out.print("�� : ");
		if(ball != null)
			System.out.println("���� ����");
		else
			System.out.println("���� ����");
	}
	
	void takeBall(Ball target) {
		ball = target;
		System.out.println(name + "(��)�� ���� �ֿ���!");
	}
	
	void throwBall(Child c) {
		System.out.println(name + "�� "+ c.name + "���� ���� ����");
		if(ball != null) {
			c.ball = ball;
			ball = null;			
		}
		else
			System.out.println(name + "(��)�� ���� �����");
	}
}

class Ball{} // ������

public class Ex02 {

	public static void main(String[] args) {
		Ball baseball = new Ball();
		
		Child minsu = new Child("�μ�");
		Child bumsu = new Child("����");
		minsu.showInfo();
		bumsu.showInfo();
		
		minsu.takeBall(baseball);
		
		minsu.showInfo();
		bumsu.showInfo();
		
		minsu.throwBall(bumsu);
		
		minsu.showInfo();
		bumsu.showInfo();

		minsu.throwBall(bumsu);
		
		minsu.showInfo();
		bumsu.showInfo();
	}

}
