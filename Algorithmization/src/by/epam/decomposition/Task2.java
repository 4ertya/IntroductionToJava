package by.epam.decomposition;

/**
 * Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
 */

public class Task1_2 {
    private int a;
    private int b;
    private int c;
    private int d;

    public static void main(String[] args) {
        Task1_2 task1_2 = new Task1_2(12, 8, 16, 20);
        System.out.println("A = " + task1_2.getA());
        System.out.println("B = " + task1_2.getB());
        System.out.println("C = " + task1_2.getC());
        System.out.println("D = " + task1_2.getD());
        System.out.println("НОД = " + task1_2.nod());
    }

    public Task1_2(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public int nod() {
        int i = Math.min(Math.min(a, b), Math.min(c, d));
        for (; i > 1; i--) {
            if (a % i == 0 && b % i == 0 && c % i == 0 && d % i == 0) {
                return i;
            }
        }
        return 1;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int getD() {
        return d;
    }


}
