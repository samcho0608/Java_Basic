package collection;

import java.util.ArrayList;

// Collection Framework

// Thanks to structured tools:
// 	- development time is reduced
// 	- can write a consistent program

// 3 interfaces of collection framework
//  - Collection : List, Set
//  - Map

// Classes implementing List: (Old: Vector, New: ArrayList), LinkedList
// Classes implementing Set: HashSet
// Classes implementing Map: HashMap


public class Ex01 {

	public static void main(String[] args) {
		// ArrayList : can be created every time data is necessary and can be removed
		
		int[] arr = new int[5];	// Array aka �迭
								// memory addition / removal in runtime not possible
		
		arr[0] = 10;
		
		ArrayList arrList = new ArrayList();		// without the <E> specification
													// can accept any data type
		
//		arrList[0] = 10;		�÷����� ��� �޼���� ������
		
		arrList.add(10);
		arrList.add(10);
		arrList.add(20);
		arrList.add(30);
		arrList.add(40);
		arrList.add("java");
		arrList.add(3.14);
		arrList.add(true);		

		System.out.println(arr); // array prints out Hashcode when printing out
		System.out.println(arrList); // Collection prints out stored data when printing out
		
		System.out.println("arrList ũ��: " + arrList.size());
		System.out.println("5�� �ε���: " + arrList.get(0));
		
		// �ݺ���
		
		for(int i = 0; i < arrList.size(); i++) {
			System.out.print(arrList.get(i) + " ");
		}
		
		System.out.println();
		
		// ����
		arrList.remove(3);
		System.out.println(arrList);
		
		arrList.clear();
		System.out.println(arrList);
		System.out.println("ũ��: " + arrList.size());

	}

}
