package multidimensionalArrays;

import java.util.Scanner;

public class Task1_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Magic square of order n = ");
        int n = scanner.nextInt();
        int[][] magicSquare = new int[n][n];

        if (n % 2 != 0) {
            magicSquare = Task1_16.oddArray(n);
        }
        if (n % 2 == 0 && n % 4 != 0) {
            magicSquare = Task1_16.evenOddArray(n);
        }
        if (n % 4 == 0) {
            magicSquare = Task1_16.simpleSquare(n);
            Task1_16.removeDiagonals(magicSquare);
            Task1_16.fillEmptyElements(magicSquare);
        }
        Task1_16.printArray(magicSquare);

    }

    public static int[][] oddArray(int n) {
        int[][] magicSquare = new int[n][n];
        int[][] tempSquare = Task1_16.simpleSquare(n);
        int[][] columns;
        int[][] rows;

        columns = new int[n][n];
        rows = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                columns[i][j] = (((n + 1) / 2 + i + n - j - 1) % n);
                rows[i][j] = ((n + 1) / 2 + i + j) % n;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int col = columns[i][j];
                int row = rows[i][j];
                magicSquare[i][j] = tempSquare[row][col];
            }
        }
        return magicSquare;
    }

    public static void printArray(int[][] array) {

        for (int[] ints : array) {
            int sum = 0;
            for (int nums : ints) {
                sum = sum + nums;
                System.out.printf("%6d", nums);
            }
            System.out.println("    = " + sum);
        }

    }

    public static int[][] simpleSquare(int n) {
        int[][] simpleSquare = new int[n][n];
        int index = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                simpleSquare[i][j] = index;
                index++;
            }
        }
        return simpleSquare;
    }

    public static int[][] removeDiagonals(int[][] array) {

        int tempN = 4;
        for (int row = 0; row < array.length; row = row + 4) {
            for (int col = 0; col < array.length; col = col + tempN) {
                for (int i = 0; i < tempN; i++) {
                    array[row + i][col + i] = 0;
                    array[row + i][col + tempN - 1 - i] = 0;
                }
            }
        }
        return array;
    }

    public static int[][] fillEmptyElements(int[][] array) {
        int index = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[array.length - 1 - i][array.length - 1 - j] == 0) {
                    array[array.length - 1 - i][array.length - 1 - j] = index;
                }
                index++;
            }
        }
        return array;
    }

    public static int[][] evenOddArray(int n) {
        int[][] magicSquare = new int[n][n];
        int tempN = magicSquare.length / 2;

        int[][] tempMagicSquare = Task1_16.oddArray(tempN);
        for (int i = 0; i < tempN; i++) {
            for (int j = 0; j < tempN; j++) {
                magicSquare[i][j] = tempMagicSquare[i][j];
                magicSquare[i][j + tempMagicSquare.length] = tempMagicSquare[i][j] + 2 * (int) Math.pow(tempN, 2);
                magicSquare[i + tempN][j] = tempMagicSquare[i][j] + 3 * (int) Math.pow(tempN, 2);
                magicSquare[i + tempN][j + tempN] = tempMagicSquare[i][j] + (int) Math.pow(tempN, 2);
            }
        }
        for (int i = 1; i <= tempN - 2; i++) {
            int temp = magicSquare[0][0];
            magicSquare[0][0] = magicSquare[tempN][0];
            magicSquare[tempN][0] = temp;
            temp = magicSquare[tempN - 1][0];
            magicSquare[tempN - 1][0] = magicSquare[n - 1][0];
            magicSquare[n - 1][0] = temp;
            temp = magicSquare[i][1];
            magicSquare[i][1] = magicSquare[n / 2 + i][1];
            magicSquare[tempN + i][1] = temp;
        }
        if (tempN - 3 > 1) {
            for (int i = 0; i < tempN; i++) {
                for (int j = tempN - (tempN - 3) / 2; j < tempN + (tempN - 3) / 2; j++) {
                    int temp = magicSquare[i][j];
                    magicSquare[i][j] = magicSquare[tempN + i][j];
                    magicSquare[tempN + i][j] = temp;
                }
            }
        }
        return magicSquare;
    }
}

