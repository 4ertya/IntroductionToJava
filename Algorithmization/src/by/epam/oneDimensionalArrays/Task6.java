package oneDimensionalArrays;

/**
 * Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых являются
 * простыми числами.
 */

public class Task6 {
    public static void main(String[] args) {
        double[] arr = {2.0, 5.3, 11.2, 4.0, 9.0, 2.4, 6.4, 3.3};
        double sum = arr[2];
        boolean isSimple;

        for (int i = 3; i < arr.length; i++) {
            isSimple = true;
            for (int j = 2; j <= Math.ceil(Math.sqrt(i)); j++) {
                if (i % j == 0) {
                    isSimple = false;
                }
            }
            if (isSimple) {
                sum = sum + arr[i];
            }
        }
        System.out.println(sum);
    }
}
