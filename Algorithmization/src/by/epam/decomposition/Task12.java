package by.epam.decomposition;

import java.util.Arrays;

public class Task1_12 {
    private int k = 8;
    private int n = 5;

    public static void main(String[] args) {
        Task1_12 task1_12 = new Task1_12();
        System.out.println(Arrays.toString(task1_12.getMass(8, 5, 10)));

    }

    public int[] getMass(int k, int n, int massLength) {
        this.k = k;
        this.n = n;
        int[] mass = new int[massLength];
        for (int i = 0; i < massLength; i++) {
            mass[i] = getNumber();
        }
        return mass;
    }

    public int getNumber() {
        int i = 0;
        String temp = "";
        while (i < k) {
            int x = (int) (Math.random() * n + 1);
            i = i + x;
            temp = temp.concat(String.valueOf(x));
        }
        int number = Integer.parseInt(temp);
        if (i > k) {
            number = number - (i % k);
        }
        return number;
    }
}
