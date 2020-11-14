package inheritance;

class Police extends Person{ // Person�� Ex01�� �ִ� �⺻ Ŭ����
	String rank;
	
	Police(){
		super();	// calls the parent class' constructor
					// but you can't just use Person("�͸�",0)
					// the default constructor is implicitly called
					// if not specified
		System.out.println("�ڽ� �⺻ ������");
	}
	
	Police(String name, int age, String rank){
		super(name, age); // �θ��� ����� ���ѱ��
		this.rank = rank; // �ڱ� ����� ���� �ʱ�ȭ
		
		System.out.println("�ڽ� �ٸ� ������ ȣ��");
	}
	
	// �ڽ� Ŭ������ �����ڴ� ������ �θ� Ŭ������ �����ڸ� ���� ȣ���Ѵ�
	// ������, �ڽ� �����ڴ� ���ο��� �θ� �����ڸ� �����ؼ� ȣ������ ������
	// �θ��� �⺻ �����ڸ� ȣ���Ѵ�.
	
	void showPol() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("��� : " + rank);
	}
}

public class Ex02 {

	public static void main(String[] args) {
		Police p1 = new Police();
		Police p2 = new Police("ȫ�浿", 21, "�氨");
		
		p1.showPol();
		p2.showPol();
	}

}
