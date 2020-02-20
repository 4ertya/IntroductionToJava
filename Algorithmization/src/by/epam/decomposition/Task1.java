package by.epam.decomposition;

public class Task1_1 {
    private int a;
    private int b;

    public static void main(String[] args) {
        Task1_1 task1_1 = new Task1_1(12, 8);
        System.out.println("A = " + task1_1.getA());
        System.out.println("B = " + task1_1.getB());
        System.out.println("НОД = " + task1_1.nod());
        System.out.println("НОK = " + task1_1.nok());

    }

    public int nod() {
        int i = Math.min(a, b);
        for (; i > 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }

    public int nok() {
        return a * b / nod();
    }

    public Task1_1(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }


}
