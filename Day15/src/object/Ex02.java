package object;

class Point{
	int x, y;

	Point(int x, int y){
		this.x = x;
		this.y = y;
	}

//	@Override
//	public String toString() {
//		return "(" + x + ", " + y + ")";
//	}
	
	@Override
	public boolean equals(Object obj) {
		Point ref = (Point)obj;
		
		return x == ref.x && y == ref.y;
	}
	
	@Override
	public int hashCode() {
		int result = 0;
		result += x;
		result += y;
		
		return result;
	}
}

public class Ex02 {
	public static void main(String[] args) {
		Point p1 = new Point(1,5);
		Point p2 = new Point(2,3);
		
		System.out.println("p1 coordinate: " + p1);
		System.out.println("p2 coordinate: " + p2);
		
		Point p3 = p1; // now points to the same address as p1
		Point p4 = new Point(1,5); // create same data as p1
		System.out.println("p4 coordinate: " + p4);
		
		if (p1 == p3)
			System.out.println("points at the same object");
		else
			System.out.println("points at a different object");
		
		if (p1 == p4)
			System.out.println("points at the same object");
		else
			System.out.println("points at a different object");
		
		if(p1.equals(p4))
			System.out.println("equal data");
		else
			System.out.println("diff data");
		
	}
}
