package multidimensionalArrays;

import java.util.Arrays;

public class Task1_14 {
    public static void main(String[] args) {
        int m = 4;
        int n = 8;
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i + 1; j++) {
                arr[j][i] = 1;
            }
        }
        for (int i = 0; i < arr.length / 2; i++) {
            int index = (int) (Math.random() * n);
            int[] temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }

        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
