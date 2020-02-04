package decomposition;

import java.util.Arrays;

public class Task1_5 {
    public static void main(String[] args) {
        int[] mas = new int[10];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 11);
        }
        int max = mas[0];
        int afterMax = mas[1];
        for (int number : mas) {
            if (number > max) {
                max = number;
            }
        }
        for (int number : mas) {
            if (number != max && number > afterMax) {
                afterMax = number;
            }
        }
        System.out.println(Arrays.toString(mas));
        System.out.println(afterMax);
    }
}

