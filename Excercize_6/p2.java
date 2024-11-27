package Excercize_6;
//Star Pattern with Spiral
public class p2 {
	public static void main(String[] args) {
        int n = 5; // Size of the spiral
        char[][] spiral = new char[n][n];
        int top = 0, bottom = n - 1, left = 0, right = n - 1;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                spiral[top][i] = '*';
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                spiral[i][right] = '*';
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    spiral[bottom][i] = '*';
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    spiral[i][left] = '*';
                }
                left++;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(spiral[i][j] == '*' ? "* " : "  ");
            }
            System.out.println();
        }
    }
}