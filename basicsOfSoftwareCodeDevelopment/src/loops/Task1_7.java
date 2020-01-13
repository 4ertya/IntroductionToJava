package loops;

import java.util.Scanner;

public class Task1_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Interval from: ");
        int intervalFrom = scanner.nextInt();
        System.out.print("Interval to: ");
        int intervalTo = scanner.nextInt();

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
}
