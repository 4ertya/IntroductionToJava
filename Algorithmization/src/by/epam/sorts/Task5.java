package by.epam.sorts;

import java.util.Arrays;

/**
 * Сортировка вставками. Дана последовательность чисел.Требуется переставить числа в порядке возрастания.
 * Место помещения очередного элемента в отсортированную часть производить
 * с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
 */

public class Task1_5 {
    public static void main(String[] args) {
        int[] arr = {2, 8, 11, 12, 15, 13, 6, 9, 7, 8, 10, 12, 11, 15, 13, 14};
        Task1_5.sort(arr, 5);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] sort(int[] array, int startFromIndex) {
        for (int i = startFromIndex; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (temp < array[j]) {
                    array[j + 1] = array[j];
                } else {
                    break;
                }
            }
            array[j + 1] = temp;
        }
        return array;
    }
}
