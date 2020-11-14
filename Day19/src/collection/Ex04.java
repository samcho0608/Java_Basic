package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Ex04 {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		
		hs.add(10);
		hs.add(10);
		hs.add(20);
		hs.add(30);
		
		System.out.println(hs);

//		hs.get(0); HashSet got no order == HashSet has no index
		
		// How to get the values?
		// 1. iterator
		// 2. for-each loop
		
		// 1. ITERATOR METHOD
		
		System.out.println();
		System.out.println(" Iterator Method: ");
		System.out.println("==================\n");
		
		Iterator<Integer> it = hs.iterator();
//							  HashSet의 앞에 커서를 놓고 그걸 반환
		
		System.out.println(it.hasNext());
		System.out.println(it.next());	// move the cursor to the next position and return the value there
		System.out.println(it.next());
		System.out.println(it.next());
//		System.out.println(it.next());	// no more data after this position => EXCEPTION
		
		System.out.println(it.hasNext());
		
		// iterator is at the very end
		// to repeat, set it to the initial position
		
		it = hs.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println();
		
		// 2. FOR-EACH METHOD
		System.out.println(" For-Each Method: ");
		System.out.println("==================\n");
		
		for(int i : hs)
			System.out.println(i);
		
		
		hs.remove(30);
		System.out.println(hs);
		
		hs.remove(40);			// if the element doesn't exist, basically ignored
		System.out.println(hs);
		
		// List: remove based on the index
		// Set: remove based on the value
	}

}
