package by.epam.loops;

/**
 * Вычислить значения функции на отрезке [а,b] c шагом h.
 */

public class Task2 {
    public static void main(String[] args) {
        int a = -2;
        int b = 10;
        int step = 2;
        int y;

        for (int i = a; i <= b; i += step) {
            y = (i > 2) ? i : -i;
            System.out.printf("x = %2d, y = %2d\n", i, y);
        }
    }
}
