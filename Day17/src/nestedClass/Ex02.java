package nestedClass;

import nestedClass.Outer2.Inner2;

class Outer2{
	private int out = 10;	// non-static so only initialized when an instance is created
	private static int sout = 10;	// static so doesn't require an instance to be created first to use
	
	void showOut() {
		System.out.println("==== �ܺ� ������ �޼��� ====");
		System.out.println("�ܺ� ������ ��� : " + out);
		System.out.println("�ܺ� ���� ���: " + sout);
		
//		System.out.println("���� ���: " + in); inner class variable not accessible
	}
	
	static void showOut_s() {
		System.out.println("==== �ܺ� ������ �޼��� ====");
//		System.out.println("�ܺ� ������ ��� : " + out); Error: using non-static variable
		System.out.println("�ܺ� ���� ���: " + sout);
		
//		System.out.println("���� ���: " + in); inner class variable not accessible
		System.out.println("���� ���: " + Inner2.in2); // if the inner class variable is static it can be used.
	}
	
	static class Inner2{
		private int in = 20;
		static int in2 = 20;
		
		void showIn() {
//			System.out.println("���� ������ ��� : " + out);  doens't work bc there is a non-static variable used
			System.out.println("���� ������ ��� : " + sout);
			
//			showOut(); non-static method cannot be called
			showOut_s(); // static method can be called
		}
	}
	
	Inner2 in = new Inner2();
	
	
}

public class Ex02 {

	public static void main(String[] args) {
		Outer2 out = new Outer2();
		
		Outer2.showOut_s();	// outer static method
		out.showOut();		// outer non-static method
		
		Outer2.Inner2 in  = new Outer2.Inner2();	// how to initialize static inner class
												// Static inner class doesn't need a help from outer class instance
												// to be initialized.
		in.showIn();
		
//		Outer.Inner in1 = Outer2.new Inner(); // doesn't work bc it's not static, gotta get a help from an outer class instance
		
		Inner2 in2 = new Inner2();	// once the outer class is imported can be used without even calling the outer class

	}

}