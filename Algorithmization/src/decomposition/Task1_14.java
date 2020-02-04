package decomposition;

import java.util.Arrays;
import java.util.Enumeration;

public class Task1_14 {
    private int x;
    private String xToString;

    public static void main(String[] args) {
        Task1_14 task1_14 = new Task1_14();
        task1_14.findArmstrongNumber(100,1000);
    }

    public int[] numberToMassive(int x) {
        this.x = x;
        xToString = String.valueOf(x);
        int[] mass = new int[xToString.length()];
        int a = x;
        for (int i = mass.length - 1; i >= 0; i--) {
            mass[i] = a % 10;
            a = a / 10;
        }
        return mass;
    }

    public boolean isArmstrong(int[] mass) {
        int sum = 0;
        for (int i = 0; i < mass.length; i++) {
            sum = sum + (int)Math.pow(mass[i],xToString.length());
        }
        return sum == x;
    }

    public void findArmstrongNumber(int l,int k) {
        for (int i = l; i <= k; i++) {
            if (isArmstrong(numberToMassive(i))) {
                System.out.println(i);
            }
        }
    }
}

