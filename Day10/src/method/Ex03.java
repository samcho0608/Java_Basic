package method;

public class Ex03 {
	//generic
	public static <T> void printArr(T[] array) {
		for(int i = 0; i < array.length;i++)
			System.out.print(array[i] + " ");
	}
	
	public static void main(String[] args) {
		// 기본 자료형은  위 같은 메서드에서는 안 써짐
		// 그래서 이하의 특별한 자료형으로 변환해서 써야됨
		
		String[] names = new String[] {"홍길동", "김길동", "이길동"};
		Integer[] ages = new Integer[] {17, 25, 31};
		Double[] heights = new Double[] {191.2, 176.5, 185.3};
		Character[] genders = new Character[] {'남','여','남'};

		printArr(names);
		printArr(ages);
		printArr(heights);
		printArr(genders);
		
		// you can't just cast the types of the above special data types(wrapper class)
		// from normal basic data types to the ones above or vice versa
	}

}
