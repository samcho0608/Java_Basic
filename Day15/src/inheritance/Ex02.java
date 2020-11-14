package inheritance;

//상속 HAS-A 관계
//휴대폰은 카메라를 가진다 (O)
//카메라는 휴대폰을 가진다(X)

//하위 has 상위: 참
//상위 has 하위: 거짓

class Camera{
	void takePhoto() {
		System.out.println("사진을 찍습니다.");
		for(int i = 3; i >= 1; i--) {
			System.out.println(i);
			try {
			Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("찰칵!");
	}
}

class Phone extends Camera {
	String model;
	
	Phone(String model) {this.model = model;}
	
	void sendMessage(Phone target) {
		takePhoto();
		System.out.println(model + " : " + target.model + "에 사진을 전송합니다.");
		target.getMessage(this);
	}
	
	void getMessage(Phone target) {
		System.out.println(model + " : " + target.model + "에게서 메시지를 받음");
	}
}

public class Ex02 {

	public static void main(String[] args) {
		Camera cam = new Camera();
		cam.takePhoto();
		
		Phone galaxy = new Phone("갤럭시");
		Phone iphone = new Phone("아이폰");
		
		galaxy.sendMessage(iphone);

	}

}
