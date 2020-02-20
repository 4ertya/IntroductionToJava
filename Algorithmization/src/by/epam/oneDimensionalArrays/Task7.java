package oneDimensionalArrays;

/**
 * Даны действительные числа a(1), a(2), ..., a(2n) . Найти max(a(1)+a(2n), a(2)+a(2n-1), ...,a(n)+a(n+1)).
 */

public class Task7 {
    public static void main(String[] args) {
        double[] arr = {2, 1, 3, 2, 4, 5, 9, 1};
        double max = arr[0] + arr[arr.length - 1];
        double temp;
        int indexOfFirst = 0;
        int indexOfSecond = 0;

        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i] + arr[arr.length - 1 - i];
            if (temp > max) {
                max = temp;
                indexOfFirst = i;
                indexOfSecond = arr.length - 1 - i;
            }
        }

        System.out.println("arr[" + indexOfFirst + "] + arr[" + indexOfSecond + "] = " + max);
    }
}
