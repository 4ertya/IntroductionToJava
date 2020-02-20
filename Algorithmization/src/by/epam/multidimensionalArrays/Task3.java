package multidimensionalArrays;

import java.util.Arrays;

/**
 * Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 */

public class Task3 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        int k = 2;
        int p = 3;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }

        System.out.println(k + " line: ");

        for (int i = 0; i < arr[k].length; i++) {
            System.out.print(arr[k - 1][i] + " ");
        }

        System.out.println("\n" + p + " column: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][p - 1] + " ");
        }
    }
}


