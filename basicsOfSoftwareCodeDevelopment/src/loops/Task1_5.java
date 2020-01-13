package loops;

public class Task1_5 {
    public static void main(String[] args) {
        double e = 0.36;
        int intervalFrom = 1;
        int intervalTo = 15;
        double result = 0;

        for (int i = intervalFrom; i <= intervalTo; i++) {
            double a = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
            if (Math.abs(a) >= Math.abs(e)) {
                result = result + a;
            }
        }
        System.out.println(result);

    }
}
