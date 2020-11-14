
public class practice01 {

	public static void main(String[] args) {
		
//		1. Fill up 8x8 2D array with numbers 1~64
		int[][] arr = new int[8][8];
		
		int num = 1;
		for(int i = 0; i < arr.length; i++)
			for(int j = 0; j < arr[0].length;j++)
				arr[i][j] = num++;
		
		for(int[] row : arr) {
			for(int val: row)
				System.out.print((val < 10) ? " " + val + " " : val + " ");
			System.out.println();
		}
		
		
		System.out.println();
		
		
//		2. 1. transpose
		
		num = 1;
		for(int j = 0; j < arr.length; j++)
			for(int i = 0; i < arr[0].length; i++)
				arr[i][j] = num++;
		
		for(int[] row : arr) {
			for(int val: row)
				System.out.print((val < 10) ? " " + val + " " : val + " ");
			System.out.println();
		}
		
		System.out.println();

		
	}
}
