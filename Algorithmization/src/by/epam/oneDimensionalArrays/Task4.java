package oneDimensionalArrays;

/**
 * Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
 */

public class Task4 {
    public static void main(String[] args) {
        int[] arr = {-2, -6, 15, 2, -3, 0, 5, 0, -4, 0};
        int indexOfMax = 0;
        int indexOfMin = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[indexOfMax]) {
                indexOfMax = i;
            }
            if (arr[i] < arr[indexOfMin]) {
                indexOfMin = i;
            }
        }

        int temp = arr[indexOfMax];
        arr[indexOfMax] = arr[indexOfMin];
        arr[indexOfMin] = temp;

        for (int number : arr) {
            System.out.print(number + " ");
        }
    }
}
