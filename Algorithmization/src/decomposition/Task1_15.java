package decomposition;

import java.util.Scanner;

public class Task1_15 {
    private int n;

    public static void main(String[] args) {
        Task1_15 task1_15 = new Task1_15();
        task1_15.findNumbers();
    }

    private void setN() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        n = scanner.nextInt();
    }

    public void findNumbers() {
        setN();
        for (int i = (int) Math.pow(10, n - 1); i < (int) Math.pow(10, n) - 1; i++) {
            if (isIncreasing(i)) {
                System.out.println(i);
            }
        }
    }

    public boolean isIncreasing(int x) {
        String str = String.valueOf(x);
        boolean isIncreasing = true;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i + 1) <= str.charAt(i)) {
                isIncreasing = false;
                break;
            }
        }
        return isIncreasing;
    }
}
