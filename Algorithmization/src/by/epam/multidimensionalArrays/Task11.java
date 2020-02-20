package multidimensionalArrays;

/**
 * Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
 * которых число 5 встречается три и более раз.
 */

public class Task11 {
    public static void main(String[] args) {
        int[][] arr = new int[10][20];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 16);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("% 3d", arr[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 5) {
                    sum++;
                }
            }
            if (sum >= 3) {
                System.out.println("Line № " + (i + 1) + " contains three or more numbers \"5\"");
            }
        }
    }
}
