package method;

public class Quiz01 {
	public static void printArr(String[] arr) {
		for(String a: arr)
			System.out.print(a + " ");
		System.out.println();
	}
	public static void printArr(int[] arr) {
		for(int a: arr)
			System.out.print(a + " ");
		System.out.println();		
	}
	public static void printArr(double[] arr) {
		for(double a: arr)
			System.out.print(a + " ");
		System.out.println();
	}
	public static void printArr(char[] arr) {
		for(char a: arr)
			System.out.print(a + " ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		String[] names = new String[] {"ȫ�浿", "��浿", "�̱浿"};
		int[] ages = new int[] {17, 25, 31};
		double[] heights = new double[] {191.2, 176.5, 185.3};
		char[] genders = new char[] {'��','��','��'};
		
		
		printArr(names);
		printArr(ages);
		printArr(heights);
		printArr(genders);
	}

}
