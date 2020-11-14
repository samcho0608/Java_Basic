package operator;

public class Ex04 {

	public static void main(String[] args) {
			int num = 10;
			num++;
			
			System.out.println("num = " + num);
			
			num--;
			System.out.println("num = " + num);
			
			int n1 = 30, n2 = ++n1, n3;
			
			System.out.println("n1 = " + n1);
			System.out.println("n2 = " + n2);
			
			n1 = 10;
			
			n3 = n1++;
			System.out.println("n1 = " + n1);
			System.out.println("n3 = " + n3);
			
			n1 = 10;
			
			// a: 20
			// b: 3
			// c: 3
			// d: 10
	}

}
