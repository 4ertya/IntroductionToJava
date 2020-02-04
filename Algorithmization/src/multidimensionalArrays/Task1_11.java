package multidimensionalArrays;

import java.util.Arrays;

public class Task1_11 {
    public static void main(String[] args) {
        int[][] arr = new int[10][20];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 15);
            }
        }
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
        for (int i = 0; i < arr.length; i++) {
            int sum =0;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]==5){
                    sum++;
                }
            }
            if (sum>=3){
                System.out.println("Line № "+(i+1)+ " contains three or more numbers \"5\"");
            }
        }
    }
}
