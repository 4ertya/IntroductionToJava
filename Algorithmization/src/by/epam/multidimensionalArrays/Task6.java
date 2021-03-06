package multidimensionalArrays;

import java.util.Arrays;

/**
 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 * 1    1  ... 1    1
 * 0    1  ... 1    0
 * ...................
 * 0    1  ... 1    0
 * 1    1  ... 1    1
 */

public class Task6 {
    public static void main(String[] args) {
        int n = 8;
        int[][] arr = new int[n][n];

        if (n % 2 != 0) {
            System.out.println("\"n\" is odd number, should be even number");
            System.exit(0);
        }

        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length / 2) {
                for (int j = i; j < arr[i].length - i; j++) {
                    arr[i][j] = 1;
                }
            } else {
                for (int j = arr[i].length - i - 1; j <= i; j++) {
                    arr[i][j] = 1;
                }
            }
        }

        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
    }
}

