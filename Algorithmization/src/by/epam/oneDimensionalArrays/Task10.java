package oneDimensionalArrays;

/**
 * Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй элемент
 * (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
 */

public class Task10 {
    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 2, 4, 5, 9, 7, 3, 5, 2, 4, 7, 8, 9, 10, 11};
        int countOfElements = 1;

        for (int i = 1; i + i < arr.length; i++) {
            arr[i] = arr[i + i];
            countOfElements++;
        }

        for (int i = countOfElements; i < arr.length; i++) {
            arr[i] = 0;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
