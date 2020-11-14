package inheritance;

//��� HAS-A ����
//�޴����� ī�޶� ������ (O)
//ī�޶�� �޴����� ������(X)

//���� has ����: ��
//���� has ����: ����

class Camera{
	void takePhoto() {
		System.out.println("������ ����ϴ�.");
		for(int i = 3; i >= 1; i--) {
			System.out.println(i);
			try {
			Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("��Ĭ!");
	}
}

class Phone extends Camera {
	String model;
	
	Phone(String model) {this.model = model;}
	
	void sendMessage(Phone target) {
		takePhoto();
		System.out.println(model + " : " + target.model + "�� ������ �����մϴ�.");
		target.getMessage(this);
	}
	
	void getMessage(Phone target) {
		System.out.println(model + " : " + target.model + "���Լ� �޽����� ����");
	}
}

public class Ex02 {

	public static void main(String[] args) {
		Camera cam = new Camera();
		cam.takePhoto();
		
		Phone galaxy = new Phone("������");
		Phone iphone = new Phone("������");
		
		galaxy.sendMessage(iphone);

	}

}
