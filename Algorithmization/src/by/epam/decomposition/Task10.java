package by.epam.decomposition;

import java.util.Arrays;

public class Task1_10 {
    private int n;

    public static void main(String[] args) {
        Task1_10 task1_10 = new Task1_10(459856);
        System.out.println(Arrays.toString(task1_10.nToMassive()));
    }

    public int[] nToMassive() {
        String number = String.valueOf(n);
        int[] mass = new int[number.length()];
        for (int i = number.length() - 1; i >= 0; i--) {
            mass[i] = n % 10;
            n = n / 10;
        }
        return mass;
    }

    public Task1_10(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
}
