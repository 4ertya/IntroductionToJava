package decomposition;

import java.util.Scanner;

public class Task1_17 {
    private int number;

    public static void main(String[] args) {
        Task1_17 task1_17 = new Task1_17();
        task1_17.setN();
        int result = task1_17.countOfIterationToZero();
        System.out.println(result+ " iterations");
    }

    private void setN() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number = ");
        number = scanner.nextInt();
    }

    public int countOfIterationToZero() {
        int count = 0;
        while (number != 0) {
            number=minusSumOfDigits(number);
            count++;
        }
        return count;
    }

    public int minusSumOfDigits(int x) {
        String str = String.valueOf(x);
        int sumOfDigits = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int y = Character.getNumericValue(ch);
            sumOfDigits = sumOfDigits + y;
            }
        x = x - sumOfDigits;
                return x;
    }
}
