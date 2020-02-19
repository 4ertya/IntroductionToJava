package by.epam.loops;

/**
 * Вывести на экран соответствие между символами и их численными обозначениями в памяти компьютера.
 */

public class Task6 {
    public static void main(String[] args) {

        for (int i = 33; i < 127; i++) {
            char ch = (char) i;
            System.out.printf("%03d %3s\n", i, ch);
        }
    }
}
