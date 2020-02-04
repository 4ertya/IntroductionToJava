package multidimensionalArrays;

import java.util.Arrays;

public class Task1_1 {
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
        for (int i = 0; i < arr.length; i = i + 2) {

            if (arr[0][i] > arr[arr.length - 1][i]) {
                System.out.println("column " + (i + 1));
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.println(arr[j][i]);
                }
            }
        }
    }
}

