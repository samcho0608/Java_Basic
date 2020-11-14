package inheritance;

// HAS-A ����� ��Ӻ��� ��� ������ ����(contain)�ϴ� ������ ���� ����

class Phone2 {
	Camera cam = new Camera();	// ��� ������ ī�޶� ����
	
	void sendMessage() {
		if (cam != null) {
			cam.takePhoto();
			System.out.println("���� ����");			
		}
		else
			System.out.println("ī�޶� �����ϴ�.");
	}
	
	void breakCam() {
		System.out.println("��!! �� ���̹��� �Ф�");
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
