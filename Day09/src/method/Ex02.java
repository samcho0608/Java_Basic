package method;

public class Ex02 {

	public static void hello(int n) {
		for(int i = 1; i <= n; i++) {
			System.out.println("Hello Java");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		hello(5);
	}

}
