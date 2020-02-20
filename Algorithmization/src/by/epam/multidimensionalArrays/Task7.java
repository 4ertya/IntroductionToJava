package multidimensionalArrays;

/**
 * Сформировать квадратную матрицу порядка N по правилу:
 * A[I,J] = sin( (I^2-J^2)/N )
 * и подсчитать количество положительных элементов в ней.
 */

public class Task7 {
    public static void main(String[] args) {
        int n = 4;
        double[][] arr = new double[n][n];
        int countOfPositive = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length - i; j++) {
                arr[i][j] = Math.sin((i * i - j * j) / (double) n);
                if (arr[i][j] > 0) {
                    countOfPositive++;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("% 2.3f  ", arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("Count of negative elements: " + countOfPositive);
    }
}
