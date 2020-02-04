package sorts;

import java.util.Arrays;

public class Task1_2 {
    public static void main(String[] args) {
        int[] a = {1, 4, 9, 12, 15};
        int[] b = {2, 3, 5, 6, 7, 8, 10, 11, 13, 14};
        int[] c = new int[a.length + b.length];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            c[index] = a[i];
            index++;
        }
        for (int i = 0; i < b.length; i++) {
            c[index] = b[i];
            index++;
        }
        for (int i = 0; i < c.length - 1; i++) {
            for (int j = 0; j < c.length - 1; j++) {
                if (c[j] > c[j + 1]) {
                    int temp = c[j];
                    c[j] = c[j + 1];
                    c[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(c));
    }
}
