package oneDimensionalArrays;

/**
 * В массив A[N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному K.
 */

public class Task1 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 12, 17, 19};
        int k = 3;
        int sum = 0;

        for (int number : arr) {
            if (number % k == 0) {
                sum = sum + number;
            }
        }
        System.out.println(sum);
    }
}
