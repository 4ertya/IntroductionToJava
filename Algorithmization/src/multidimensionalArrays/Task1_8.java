package multidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task1_8 {
    public static void main(String[] args) {

        int[][] arr = new int[5][5];
        Scanner scanner = new Scanner(System.in);
        int column1 = 0;
        int column2 = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
        do {
            System.out.print("Enter first column: ");
            column1 = scanner.nextInt();
        } while (column1 > arr[0].length);
        do {
            System.out.print("Enter second column: ");
            column2 = scanner.nextInt();
        } while (column2 > arr[0].length);
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i][column1 - 1];
            arr[i][column1 - 1] = arr[i][column2 - 1];
            arr[i][column2 - 1] = temp;
        }
        System.out.println("Result: ");
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
    }
}

