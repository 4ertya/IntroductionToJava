package by.epam.decomposition;

/**
 * Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
 */

public class Task6 {
    private int a;
    private int b;
    private int c;


    public static void main(String[] args) {
        Task6 task_6 = new Task6(15, 21, 14);
        System.out.println("A = " + task_6.getA());
        System.out.println("B = " + task_6.getB());
        System.out.println("C = " + task_6.getC());
        System.out.println(task_6.isMutuallyPrimeNumbers());
    }

    public Task6(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String isMutuallyPrimeNumbers() {
        int i = Math.min(Math.min(a, b), c);
        for (; i > 1; i--) {
            if (a % i == 0 && b % i == 0 && c % i == 0) {
                return "These are not mutually prime numbers";
            }
        }
        return "These are mutually prime numbers";
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

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }
}
