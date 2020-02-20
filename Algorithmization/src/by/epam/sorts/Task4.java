package by.epam.sorts;

import java.util.Arrays;

/**
 * Сортировка обменами. Дана последовательность чисел
 * a1 <= a2  an
 * .Требуется переставить числа в
 * порядке возрастания. Для этого сравниваются два соседних числа
 * i i+1 a и a . Если ai  ai+1 , то делается
 * перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
 * Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
 */

public class Task1_4 {
    public static void main(String[] args) {
        int[] arr = {2, 8, 3, 19, 5, 13, 6, 9, 7, 8, 10, 12, 11, 15, 13, 14};
        int countOfSwap=0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    countOfSwap++;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(countOfSwap);
    }
}
