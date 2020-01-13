package linearPrograms;

/**
 * Find the value of the expression.
 */
public class Task1_3 {
    public static void main(String[] args) {
        double x = Math.toRadians(30);
        double y = Math.toRadians(60);
        double result;

        result = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
        System.out.println(result);
    }
}
