package branching;

public class Task1_5 {
    public static void main(String[] args) {
        int x = 4;
        double result;

        result = (x <= 3) ? Math.pow(x, 2) - 3 * x + 9 : 1 / (Math.pow(x, 3) + 6);
        System.out.printf("%.3f", result);
    }
}
