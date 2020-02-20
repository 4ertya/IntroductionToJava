package multidimensionalArrays;

import java.util.Arrays;

/**
 * Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 */

public class Task2 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }

        System.out.println("Diagonal elements: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][i] + " ");
        }
    }
}
