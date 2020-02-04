package multidimensionalArrays;

import java.util.Arrays;

public class Task1_9 {
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

        int maxSum = 0;
        int column = 0;

        for (int i = 0; i < arr.length; i++) {
            int tempSum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                tempSum = tempSum + arr[j][i];
            }

            if (tempSum > maxSum) {
                maxSum = tempSum;
                column = i + 1;
            }
            System.out.println("column " + (i + 1) + " : " + tempSum);
        }
        System.out.println("Max sum of elements in " + column + " column");
    }
}

