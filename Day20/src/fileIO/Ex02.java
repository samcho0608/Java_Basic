package fileIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ex02 {

	public static void main(String[] args) {
		String path = "H:\\KG����Ƽ��ũ\\�ڹ�\\JAVA �ǽ�\\Day20\\fileIO.txt";
		
		try {
			OutputStream out = new FileOutputStream(path);
			
			String word = "�ȳ��ϼ���~";
			
			out.write(word.getBytes());
			
			out.close();
		}
		catch(FileNotFoundException e){
			System.out.println("������ ã�� �� �����ϴ�.");
		}
		catch(IOException e) {
			System.out.println("����� ����~");
		}

	}

}
