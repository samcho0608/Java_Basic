package method;

public class Ex02 {
	public static double circle(int r) {
		return r * r * Math.PI;
	}
	
	public static double circle(double r) {
		return r * r * Math.PI;
	}
	
	public static void main(String[] args) {
		// Overloading
		
		int ir = 3;
		double dr = 5.5;
		
		System.out.println(circle(ir));
		System.out.println(circle(dr));
	}

}
