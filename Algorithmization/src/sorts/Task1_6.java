package sorts;

import java.util.Arrays;

public class Task1_6 {
    public static void main(String[] args) {
        int[] arr = {2, 8, 3, 19, 5, 13, 6, 9, 7, 8, 10, 12, 11, 15, 13, 14};

        for (int j = 0; j < arr.length - 1; ) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                j--;
                continue;
            }
            j++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
