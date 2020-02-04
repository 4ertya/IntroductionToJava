package multidimensionalArrays;

import java.util.Arrays;

public class Task1_5 {
    public static void main(String[] args) {

        int n =4;
        if (n%2!=0){
            System.out.println("\"n\" is odd number, should be even number");
            System.exit(0);
        }
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length-i; j++) {
                arr[i][j] = i+1;
            }
        }
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
