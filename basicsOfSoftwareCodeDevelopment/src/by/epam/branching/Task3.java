package by.epam.branching;

/**
 * Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
 */

public class Task3 {
    public static void main(String[] args) {
        int x1 = 2;
        int y1 = 3;
        int x2 = 4;
        int y2 = 5;
        int x3 = 6;
        int y3 = 7;

        if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)) {
            System.out.println("Points on one line");
        } else System.out.println("Points are not on one line");
    }
}
