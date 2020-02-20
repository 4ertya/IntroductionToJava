package by.epam.decomposition;

import java.util.Scanner;

public class Task1_16 {
    private int n;

    public static void main(String[] args) {
        Task1_16 task1_16 = new Task1_16();
        int resultSum = task1_16.sumOfNumbers();
        int countOfEven = task1_16.countOfEven(resultSum);
        System.out.println("result sum = " + resultSum);
        System.out.println("count of even = " + countOfEven);
    }

    private void setN() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        n = scanner.nextInt();
    }

    public int sumOfNumbers() {
        setN();
        int sum = 0;
        for (int i = (int) Math.pow(10, n - 1); i < (int) Math.pow(10, n) - 1; i++) {
            if (isIncreasing(i)) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public boolean isIncreasing(int x) {
        String str = String.valueOf(x);
        boolean isIncreasing = true;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int y = Character.getNumericValue(ch);
            if (y % 2 == 0 || y == 0) {
                isIncreasing = false;
                break;
            }
        }
        return isIncreasing;
    }

    public int countOfEven(int x) {
        int sum = 0;
        String str = String.valueOf(x);
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int y = Character.getNumericValue(ch);
            if (y % 2 == 0 && y != 0) {
                sum++;
            }
        }
        return sum;
    }
}
