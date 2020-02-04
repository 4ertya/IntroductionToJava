package multidimensionalArrays;

import java.util.Arrays;

public class Task1_13 {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
        System.out.println("sort columns from min to max: ");
        for (int i = 0; i < arr.length; i++) {
            for (int x = 0; x < arr.length - 1; x++) {
                for (int j = 0; j < arr[i].length - 1; j++) {
                    if (arr[j][i] > arr[j + 1][i]) {
                        int temp = arr[j][i];
                        arr[j][i] = arr[j + 1][i];
                        arr[j + 1][i] = temp;
                    }
                }
            }
        }
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
        System.out.println("sort columns from max to min: ");
        for (int i = 0; i < arr.length; i++) {
            for (int x = 0; x < arr.length - 1; x++) {
                for (int j = 0; j < arr[i].length - 1; j++) {
                    if (arr[j][i] < arr[j + 1][i]) {
                        int temp = arr[j][i];
                        arr[j][i] = arr[j + 1][i];
                        arr[j + 1][i] = temp;
                    }
                }
            }
        }
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
