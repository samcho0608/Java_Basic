package exception;

public class Ex03 {

	public static void printArr(int[] arr) {
		for(int a : arr)
			System.out.print(a + " ");
		System.out.println();
		
		throw new ArrayIndexOutOfBoundsException("배열 예외"); // to intentionally cause / create an Exception
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {10, 20, 30, 40, 50};
		
		// If Exception is taken care of within the method, the catch keyword within the method takes care of the Exception
		// If not, the Exception is thrown to wherever the method has been called
		try {
			printArr(arr);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("무슨 예외인고?");
			System.out.println(e.getMessage());
		}
	}

}
