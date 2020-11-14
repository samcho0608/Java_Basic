package collection;

import java.util.LinkedList;
import java.util.List;

public class Ex03 {

	public static void main(String[] args) {
		// LinkedList:	- Easy to add and remove data
//						- Slower in accessing data
		// ArrayList: 	- Faster in accessing data
//						- Can face overhead when adding/removing data
		
		LinkedList<Person> list = new LinkedList<Person>();
		
		list.add(new Person("ȫ�浿", 25));
		list.add(new Person());
		
		System.out.println(list);
		
		
		// Using List interface, we often access space of subclasses like ArrayList, LinkedList
		// ��> mainly used when writing argument or
		// ��> when casting into different type of Collection
		List<Person> list_2 = new LinkedList<Person>();
		
		list_2.addAll(list);
		
		System.out.println(list_2);
	}

}