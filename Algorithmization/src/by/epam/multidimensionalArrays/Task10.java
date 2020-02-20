package multidimensionalArrays;

/**
 * Найти положительные элементы главной диагонали квадратной матрицы.
 */

public class Task10 {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (-5 + Math.random() * 11);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("% 2d", arr[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i][i] > 0) {
                System.out.println("arr[" + i + "][" + i + "] = " + arr[i][i] + " > 0");
            }
        }
    }
}
