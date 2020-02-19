package by.epam.loops;

import java.util.Scanner;

/**
 * Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
 * m и n вводятся с клавиатуры.
 */

public class Task7 {
    public static void main(String[] args) {
        int intervalFrom;
        int intervalTo;


        intervalFrom = input("Interval from: ");
        intervalTo = input("Interval to: ");

        for (int i = intervalFrom; i <= intervalTo; i++) {
            String temp = i + ": ";
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    temp = temp + j + "; ";
                }
            }
            System.out.println(temp);
        }
    }

    public static int input(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Введенные данные не являются натуральным числом, повторите ввод: ");
        }
        return scanner.nextInt();
    }
}
