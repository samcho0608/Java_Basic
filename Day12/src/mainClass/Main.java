package mainClass;

public class Main {
	public static void main(String[] args) {
		System.out.println("main�� �ִ� Ŭ����");
		System.out.println("�ڹٵ� ���α׷��� �����ϱ� ���ؼ� main�� �ʿ�");
		
		Person p1 = new Person("ȫ�浿", 15);
		p1.showInfo();
		
		String[] test = new String[] { "hello", "Java" };
		
		p1.main(test);
	}
}
