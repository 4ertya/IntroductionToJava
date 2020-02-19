package by.epam.linearPrograms;

/**
 * Вычислить значение выражения по формуле (все переменные принимают действительные значения).
 */

public class Task3 {
    public static void main(String[] args) {
        double x = Math.toRadians(30);
        double y = Math.toRadians(60);
        double result;

        result = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);

        System.out.println(result);
    }
}
