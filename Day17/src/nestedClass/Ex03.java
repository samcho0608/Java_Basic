package nestedClass;

class Local{
	private int out = 10;
	
	void showRun() {		
		class Inner3{	// class like a local variable, once out of the scope it is no longer usable.
			private int in = 20;
			
			void inFunc() {
				System.out.println("=== ���� ���� Ŭ���� ===");
				System.out.println("�ܺ� ��� : " + out);
				System.out.println("���� ��� : " + in);
			}
			
		}
		
		Inner3 in = new Inner3();
		in.inFunc();

		in.in = 10; // even though we're outside of class definition
					// we can still access the private member of the class

		in.in = 200;
		out = 300;
		in.inFunc();
	}
}

public class Ex03 {

	public static void main(String[] args) {
		Local lo = new Local();
		lo.showRun();

	}

}