package decomposition;

import javax.swing.*;

public class Task1_8 {

    private int[] mas = new int[10];
    private int count = 0;

    public static void main(String[] args) {
        Task1_8 task1_8 = new Task1_8();
        task1_8.addElement(2);
        task1_8.addElement(2);
        task1_8.addElement(5);
        task1_8.addElement(7);
        task1_8.addElement(1);
        task1_8.addElement(0);
        task1_8.addElement(3);

        System.out.println(task1_8.sum(1, 3));
        System.out.println(task1_8.sum(3, 5));
        System.out.println(task1_8.sum(4, 6));

    }

    public void addElement(int x) {
        mas[count] = x;
        count++;
    }

    public int sum(int k, int m) {
        int sum = 0;
        for (int i = k; i <= m; i++) {
            sum = sum + mas[i];
        }
        return sum;
    }
}
