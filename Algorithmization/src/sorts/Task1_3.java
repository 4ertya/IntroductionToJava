package sorts;

import java.util.Arrays;

public class Task1_3 {
    public static void main(String[] args) {
        int[] arr = {2, 8, 3, 19, 5, 13, 6, 9, 7, 8, 10, 12, 11, 15, 13, 14};

        for (int i = 0; i < arr.length; i++) {
            int max = i;
            for (int j = i; j < arr.length; j++) {

                if (arr[j] > arr[max]) {
                    max = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
