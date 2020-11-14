package array;

public class Ex01 {

	public static void main(String[] args) {
		int[] arr1 = new int[] { 10, 20, 30 }, arr2 = new int[3];
		
		arr1[0] = 100;
		
		System.out.print("arr1 = { ");
		for(int i = 0; i < 3; i++)
			System.out.print(arr1[i] + " ");
		System.out.println("}");
		
		
		System.out.print("arr2 = { ");
		for(int i = 0; i < 3;i++) {
			arr2[i] = i+1;
			System.out.print(arr2[i] + " ");
		}
		System.out.println("}");
	}

}
