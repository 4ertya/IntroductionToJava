package oneDimensionalArrays;

public class Task1_4 {
    public static void main(String[] args) {
        int[] arr = {-2, -6, 15, 2, -3, 0, 5, 0, -4, 0};
        int max = arr[0];
        int indexOfMax = 0;
        int min = arr[0];
        int indexOfMin = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                indexOfMax = i;
            }
            if (arr[i] < min) {
                min = arr[i];
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
