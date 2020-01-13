package loops;

import java.util.Scanner;

public class Task1_1 {
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
