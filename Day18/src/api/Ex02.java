package api;

public class Ex02 {

	public static void main(String[] args) {
		// Wrapper Class
		
		Integer ite = 10;
		int it = 10;
		
		String str = ite.toString();
		
//		Casting to a class can only be done if they are in a inheritance relationship
//		String str1 = (String)it;
//		String str2 = (String)ite;
		
		String str2 = ((Integer)it).toString();	// Literal -> wrap (= boxing)
		
		System.out.println("ite = " + ite);
		System.out.println("it = " + it);
		System.out.println("str = " + str);
		System.out.println("ite + it = " + (ite + it));
		System.out.println("ite + str = " + (ite + str));
	}

}
