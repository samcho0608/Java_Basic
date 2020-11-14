package casting;

// Types of Casting:
// 1. Automatic Casting(Implicit Casting): casting done automatically for operations
// 2. Forced Casting(Explicit Casting): casting that must be done intentionally
//										by directly writing the data type

public class Ex01 {

	public static void main(String[] args) {
		// 1. Automatic Casting: To allow the interaction of different data types
		// Without it, operations of different data types does not work
		// ex) 10 + 10.1 cannot be done originally
		
		System.out.println(10 + 10.1);
		// The line above works thanks to implicit casting
		// ex) 10 + 10.1 = 20.1
		//		integer + rational = rational
		// casts into a "bigger" type either conceptually or spatially
		// priority: 1. Concept
		//			 2. Size

		// ERRONEOUS
		System.out.println("10 + 5 = " + 10 + 5);
		// CORRECTION
		System.out.println("10 + 5 = " + (10 + 5));
		
		String result_1 = "10" + "5";
		String result_2 = "10" + 5;
		String result_3 = 10 + 5 + "";
		
		System.out.println(result_1);
		System.out.println(result_2);
		System.out.println(result_3);
		
		// System.out.println("10 - 5 = " + 10 - 5);
		// The line above is erroneous bc there is a subtraction
		// after implicit casting into String type
	}

}
