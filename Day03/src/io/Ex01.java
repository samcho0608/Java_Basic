package io;

import java.io.IOException;

public class Ex01 {
	public static void main(String[] args) throws IOException {
		
		// System.out, in, err exists
		// stdout, stdin, stderr
	
		System.out.println("Ãâ·Â¹®");
		
		// The below is hecka hectic

		int num = System.in.read(); // reads only 1 byte
		
		System.out.println((char)num);
		
		// ASCII: used by the C-type languages
		//		  1 byte, uses only 0~127
		
		// UNICODE: used by Java, Python, etc.
		//		    2 bytes = ASCII + 1 byte
	}
}
