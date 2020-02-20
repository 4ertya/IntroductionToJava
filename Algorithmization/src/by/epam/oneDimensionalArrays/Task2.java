package oneDimensionalArrays;

import java.util.Arrays;

/**
 * Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим числом.
 * Подсчитать количество замен.
 */

public class Task2 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 12, 15, 19, 14, 1, 5, 9};
        int z = 8;
        int changes = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > z) {
                arr[i] = z;
                changes++;
            }
        }
        System.out.println("count of changes: " + changes);
        System.out.println(Arrays.toString(arr));
    }
}
