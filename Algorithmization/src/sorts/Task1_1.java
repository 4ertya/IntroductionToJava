package sorts;

import java.util.Arrays;
import java.util.Scanner;

public class Task1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("k = ");
        int k = scanner.nextInt();
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[] c = new int[a.length + b.length];
        int index = 0;
        for (int i = 0; i <= k; i++) {
            c[i] = a[i];
            index++;
        }
        for (int i = 0; i < b.length; i++) {
            c[index] = b[i];
            index++;
        }
        for (int i = k + 1; i < a.length; i++) {
            c[index] = a[i];
            index++;
        }
        System.out.println(Arrays.toString(c));
    }
}
