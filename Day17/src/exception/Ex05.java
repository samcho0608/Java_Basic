package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		File path = new File("C:\\Windows\\System32\\drivers\\etc\\hosts");
		
		Scanner sc = new Scanner(path);
		
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
			Thread.sleep(500);
		}

		sc.close();
	}

}
