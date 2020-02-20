package sorts;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
 * один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
 * дополнительный массив.
 */

public class Task1 {
    public static void main(String[] args) {

        int k;
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[] c = new int[a.length + b.length];
        int index = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("k = ");
        k = scanner.nextInt();

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
