package method;

public class Ex03 {
	//generic
	public static <T> void printArr(T[] array) {
		for(int i = 0; i < array.length;i++)
			System.out.print(array[i] + " ");
	}
	
	public static void main(String[] args) {
		// �⺻ �ڷ�����  �� ���� �޼��忡���� �� ����
		// �׷��� ������ Ư���� �ڷ������� ��ȯ�ؼ� ��ߵ�
		
		String[] names = new String[] {"ȫ�浿", "��浿", "�̱浿"};
		Integer[] ages = new Integer[] {17, 25, 31};
		Double[] heights = new Double[] {191.2, 176.5, 185.3};
		Character[] genders = new Character[] {'��','��','��'};

		printArr(names);
		printArr(ages);
		printArr(heights);
		printArr(genders);
		
		// you can't just cast the types of the above special data types(wrapper class)
		// from normal basic data types to the ones above or vice versa
	}

}
