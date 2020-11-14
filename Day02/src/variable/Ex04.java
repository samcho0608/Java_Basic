package variable;

public class Ex04 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		byte b = 127;
		System.out.println(b);
		
		b += 1;
		System.out.println(b);
		
		// In Java, one cannot simply assign a value exceeding
		// the range of the data type
		// ex) b = 128; doesn't work
		
		b = (byte) 128; // results in -128 due to overflow
		
		// must type cast floating point values
		// because by default rational values are
		// considered double in Java
		
		// literal constant:
		// 	value temporarily saved in memory to be assigned to the variable
		
		// default constant types
		// integer: int
		// rational: double
		
		char a = 0x12;
		System.out.println(a);
		float pi = 3.14f;
		double pi2 = 3.14;
		
		// if the literal constant exceeds the range of int
		// use the long literal constant(~l, e.g. 128l)
		// Doesn't work:
		// 	int it = 200000000000;
		long lg = 200000000000l;
		
		// the suffices l and f are case-insensitive
	}

}
