package exception;

// ����:
// ��> 1. Error: Systematic Error(Hardware / syntax error)
// ��> 2. Exception: Error of the programmer -> can be prevented by the programmer

// Exception Control: Proactively preventing possible exceptions from occurring.

public class Ex01 {

	public static void main(String[] args) {
		try {	// try: keyword used to cover the part of the code that may cause an exception
			System.out.println(4/0);
			
			System.out.println("����� ������ �ǳ���?");
		}
//		catch(ArithmeticException error) {		// specific
////			error.printStackTrace(); default error message
//			System.err.println(error.getMessage());
//			System.err.println("0���� ������ �ȵſ�");
//		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println(e.getMessage());
//		}
		catch(Exception e) {					// for all errors
			e.printStackTrace();
			System.err.println(e.getMessage());
		}

	}

}