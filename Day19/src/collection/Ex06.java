package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex06 {

	public static void main(String[] args) {
		// Map takes a pair of key and value for data storage
		// If list used index to get data, Map uses Key to get data
		
		// ex) List
		// 0		1		2		3
		// ȫ�浿		15		172.1	�λ�
		
		
		// ex) Map
		// name		age		height	address
		// ȫ�浿		15		172.1	�λ�
		
		HashMap<String, String> hm = new HashMap<String, String>();
		//	   < Key,	Value >
		// Key is value only used to access Value => has to be unique
		// Value is the actually stored data => doesn't have to be unique
		
		hm.put("Name", "ȫ�浿");
		hm.put("Age", "17");
		hm.put("Height", "172.1");
		hm.put("Address", "�λ�");
		
		System.out.println(hm);
		
		System.out.println();
		System.out.println("    Set Method:");
		System.out.println("==================\n");
		
		// Map accesses the value  using Key
		System.out.println("�̸�: " + hm.get("Name"));
		
		Set<String> set = hm.keySet();	// get all the key values and save them into a set
		
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key + " = " + hm.get(key));
		}
		
		System.out.println();
		System.out.println(" For-Each Method: ");
		System.out.println("==================\n");
		
		for(String key : hm.keySet()) 
			System.out.println(key + " : " + hm.get(key));

	}

}
