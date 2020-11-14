package _interface;

interface Fly {
	void flying();
}

abstract class Human{
	String name;
	int age;
	
	abstract void sleep();
}

// the two above cannot create an instance

public class Ex03 {
	
	public static void main(String[] args) {
		// interface or abstract class can create an instance
		// via the use of anonymous class
		// anonymous class: can be used only once
		// ¤¤> class for a specific instance and for a specific event
		Human man = new Human() {
			void sleep() {
				System.out.println("ÄðÄð");
			}
		};
		
		Fly fly = new Fly() {
			
			@Override
			public void flying() {
				// TODO Auto-generated method stub
				
			}
		};
		
	}

}
