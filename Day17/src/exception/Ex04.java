package exception;

public class Ex04 {

	public static void count() throws InterruptedException { // throws EXCEPCTION to pass the responsibility to whoever called this method
		for(int i = 1; i < 10; i++) {
			System.out.println(i + "ÃÊ~");
			Thread.sleep(1000);
		}
	}
	
	public static void main(String[] args) {	

		try {
			count();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
