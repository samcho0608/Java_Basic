package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Ex05 {

	public static void main(String[] args) {
		// casting between List and Set
		
		Random ran = new Random();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i = 0; i < 6; i++) {
			arr.add(ran.nextInt(45) + 1);
		}
		
		HashSet<Integer> hs = new HashSet<Integer>(arr);
		
		System.out.println(arr);
		System.out.println(hs);
		
		arr = new ArrayList<Integer>(hs); // removing all duplicates
		arr.sort(null);
		
		System.out.println(arr);
		
	}

}