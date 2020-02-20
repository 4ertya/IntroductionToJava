package multidimensionalArrays;

import java.util.Arrays;

/**
 * Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
 */

public class Task12 {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 10);
            }
        }

        System.out.println("Array: \n");

        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }

        System.out.println("\nsort lines from min to max: ");

        for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr[i]);
        }

        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }

        System.out.println("\nsort lines from max to min: ");

        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < arr[i].length / 2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][arr[i].length - j - 1];
                arr[i][arr[i].length - j - 1] = temp;
            }
        }

        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
