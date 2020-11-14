package fileIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ex02 {

	public static void main(String[] args) {
		String path = "H:\\KG아이티뱅크\\자바\\JAVA 실습\\Day20\\fileIO.txt";
		
		try {
			OutputStream out = new FileOutputStream(path);
			
			String word = "안녕하세요~";
			
			out.write(word.getBytes());
			
			out.close();
		}
		catch(FileNotFoundException e){
			System.out.println("파일을 찾을 수 없습니다.");
		}
		catch(IOException e) {
			System.out.println("입출력 에러~");
		}

	}

}
