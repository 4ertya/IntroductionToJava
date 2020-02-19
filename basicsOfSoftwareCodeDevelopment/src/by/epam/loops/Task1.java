package by.epam.loops;

import java.util.Scanner;

/**
 * Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа
 * от 1 до введенного пользователем числа.
 */

public class Task1 {
    public static void main(String[] args) {
        int number;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");

        number = scanner.nextInt();

        while (number <= 0) {
            System.out.println("Error! Enter a positive integer!");
            number = scanner.nextInt();
        }

        for (int i = 1; i < number; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of numbers [1.." + number + ") : " + sum);
    }
}
