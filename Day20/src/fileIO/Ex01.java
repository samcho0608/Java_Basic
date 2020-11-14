package fileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// File Output: writing data onto file
		// File Input: reading data from file
		
		// Input
		
		String path = "H:\\KG����Ƽ��ũ\\�ڹ�\\JAVA �ǽ�\\Day20\\fileIO.txt";
		File file = new File(path);
		
		try {
			Scanner sc = new Scanner(file);
			
			while(sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
			
			sc.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("������ ã�� �� �����ϴ�.");
		}
		catch(IOException e) {
			System.out.println("����� ���� �Դϴ�.");
		}
//		finally {
//			sc.close();
//		}
	}

}