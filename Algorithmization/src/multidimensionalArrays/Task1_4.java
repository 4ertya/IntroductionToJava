package multidimensionalArrays;

import java.util.Arrays;

public class Task1_4 {
    public static void main(String[] args) {
        int n = 6;
        if (n%2!=0){
            System.out.println("\"n\" is odd number, should be even number");
            System.exit(0);
        }
        int[][] arr = new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((i % 2 == 0)) {
                    arr[i][j] = 1 + j;
                } else {
                    arr[i][j] = n - j;
                }
            }
        }
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
