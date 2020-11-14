package nestedClass;

public class Person {
	String name;
	int age;
	
	String lungs = "��";
	
	Heart heart = new Heart();
	private class Heart {
		void run() {
			System.out.println(lungs + "�� ������ �����մϴ�.");
		}
	}
	
	public static void main(String[] args) {
		Person p1 = new Person();
		Heart heart = p1.new Heart(); // even if both the inner class and main method are within the same class
								  // Heart still requires an instance of Person to be initialized.
		
		p1.heart.run();
		heart.run();
	}
}
