package object;

public class Ex03 {
	public static void main(String[] args) {
		String str1 = "apple";
		String str2 = "apple";
		String str3 = new String("apple");
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		
		
		System.out.println(str1.equals(str3));
		
		// instance comparison should always done with equals
		// the == operator checks if the two variables point at the same address
		// not if they have the same values.
	}
}
