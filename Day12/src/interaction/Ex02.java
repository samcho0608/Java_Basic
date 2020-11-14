package interaction;

class Child{
	private String name;
	private Ball ball;
	
	Child(String name) {
		this.name = name;
	}
	
	void showInfo() {
		System.out.println("이름 : " + name);
		System.out.print("공 : ");
		if(ball != null)
			System.out.println("공이 있음");
		else
			System.out.println("공이 없음");
	}
	
	void takeBall(Ball target) {
		ball = target;
		System.out.println(name + "(이)가 공을 주웠다!");
	}
	
	void throwBall(Child c) {
		System.out.println(name + "가 "+ c.name + "에게 공을 던짐");
		if(ball != null) {
			c.ball = ball;
			ball = null;			
		}
		else
			System.out.println(name + "(은)는 공이 없어요");
	}
}

class Ball{} // 껍데기

public class Ex02 {

	public static void main(String[] args) {
		Ball baseball = new Ball();
		
		Child minsu = new Child("민수");
		Child bumsu = new Child("범수");
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
