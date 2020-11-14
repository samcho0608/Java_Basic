package inheritance;

// HAS-A 관계는 상속보다 멤버 변수로 포함(contain)하는 구조로 많이 구현

class Phone2 {
	Camera cam = new Camera();	// 멤버 변수로 카메라를 가짐
	
	void sendMessage() {
		if (cam != null) {
			cam.takePhoto();
			System.out.println("사진 전송");			
		}
		else
			System.out.println("카메라가 없습니다.");
	}
	
	void breakCam() {
		System.out.println("꽝!! 폰 바이바이 ㅠㅠ");
		cam = null;
	}
}

public class Ex03 {

	public static void main(String[] args) {
		Phone2 iphone = new Phone2();
		iphone.sendMessage();

		iphone.breakCam();
		
		iphone.sendMessage();
	}

}
