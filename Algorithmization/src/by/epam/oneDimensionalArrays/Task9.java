package oneDimensionalArrays;

/**
 * В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких чисел несколько,
 * то определить наименьшее из них.
 */

public class Task9 {
    public static void main(String[] args) {
        int[] arr = {7, 3, 2, 3, 2, 4, 5, 9, 7, 3, 5, 2, 4, 7};
        int countResult = 0;
        int number = arr[0];

        for (int x : arr) {
            int count = 0;
            for (int value : arr) {
                if (value == x) {
                    count++;
                }
            }
            if (count >= countResult) {
                countResult = count;
                number = (Math.min(number, x));
            }
        }

        System.out.println("Number: " + number + " was found " + countResult + " times");
    }
}
