package by.epam.branching;

/**
 * Найти max{min(a, b), min(c, d)}
 */

public class Task2 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = 4;
        int d = 5;
        int minAB;
        int minCD;

        minAB = (a < b) ? a : b;
        minCD = (c < d) ? c : d;

        System.out.println((minAB > minCD) ? minAB : minCD);
    }
}
