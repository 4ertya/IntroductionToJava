package multidimensionalArrays;

import java.util.Arrays;

/**
 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 * 1  2   3  ... n
 * n n-1 n-2 ... 1
 * 1  2   3  ... n
 * n n-1 n-2 ... 1
 * ...............
 * n n-1 n-2 ... 1
 */

public class Task4 {
    public static void main(String[] args) {
        int n = 6;
        int[][] arr = new int[n][n];

        if (n % 2 != 0) {
            System.out.println(n + " is odd number, should be even number. Goodbye.");
            System.exit(0);
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((i % 2 == 0)) {
                    arr[i][j] = 1 + j;
                } else {
                    arr[i][j] = n - j;
                }
            }
        }

        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
