package by.epam.loops;

/**
 * Составить программу нахождения произведения квадратов первых двухсот чисел.
 */

public class Task4 {
    public static void main(String[] args) {
        int n = 200;
        int result = 1;

        for (int i = 1; i <= n; i++) {
            int temp = result * i * i;
            if (temp < 0) {
                System.out.println("The result is very large for Integer. last used number: " + (i - 1));
                break;
            }
            result = temp;
        }
        System.out.println("result: " + result);
    }
}
