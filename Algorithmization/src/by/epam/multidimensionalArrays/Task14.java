package multidimensionalArrays;

import java.util.Arrays;

/**
 * Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
 * единиц равно номеру столбца.
 */

public class Task14 {
    public static void main(String[] args) {
        int m = 5;
        int n = 5;
        int[][] arr = new int[m][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                arr[j][i] = 1;
            }
        }

        for (int i = 0; i < arr.length / 2; i++) {
            int index = (int) (Math.random() * m);
            int[] temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }

        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
