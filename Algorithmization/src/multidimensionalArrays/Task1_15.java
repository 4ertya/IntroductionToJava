package multidimensionalArrays;

import java.util.Arrays;

public class Task1_15 {
    public static void main(String[] args) {
        int n = 5;
        int[][] arr = new int[n][n];
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (-5 + Math.random() * 11);
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < 0) {
                    arr[i][j] = max;
                }
            }
        }
        System.out.println("max number = " + max);
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
