package multidimensionalArrays;

import java.util.Arrays;

public class Task1_10 {
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
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][i] > 0) {
                System.out.println("arr[" + i + "][" + i + "] = " + arr[i][i] + " > 0");
            }
        }
    }
}
