package decomposition;

public class Task1_6 {
    private int a;
    private int b;
    private int c;


    public static void main(String[] args) {
        Task1_6 task1_6 = new Task1_6(15, 21, 14);
        System.out.println("A = " + task1_6.getA());
        System.out.println("B = " + task1_6.getB());
        System.out.println("C = " + task1_6.getC());
        System.out.println(task1_6.isMutuallyPrimeNumbers());
    }

    public Task1_6(int a, int b, int c) {
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


}
