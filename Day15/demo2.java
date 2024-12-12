package Day15;

public class demo2 {

	public static void main(String[] args)
	{
		 int[] array = {1, 2, 3, 4, 5};

	        for (int i = 0; i < array.length; i++) {
	            System.out.println("Element at index " + i + ": " + array[i]);
	        }
	        
	        for (int element : array) {
	            System.out.println("Element: " + element);
	        }

	        int[][] array2 = {
	                {1, 2, 3},
	                {4, 5, 6},
	                {7, 8, 9}
	            };

	            for (int i = 0; i < array2.length; i++) {
	                for (int j = 0; j < array2[i].length; j++) {
	                    System.out.println("Element at index [" + i + "][" + j + "]: " + array2[i][j]);
	                }
	            }
	            
	            for (int[] row : array2) {
	                for (int element : row) {
	                    System.out.println("Element: " + element);
	                }
	            }
	}
}
