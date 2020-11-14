package array2;

public class Ex02 {

	public static void main(String[] args) {
		int[][] arr2 = new int[5][4];

		int num = 1;
		for(int i = 0; i < arr2.length; i++)
			for(int j = 0; j< arr2[0].length;j++)
				arr2[i][j] = num++;
		
		for(int[] row : arr2) {
			for(int val : row)
				System.out.print((val < 10) ? " " + val + " " : val + " ");
			System.out.println();
		}
	}

}
