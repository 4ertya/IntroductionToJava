package by.epam.loops;

/**
 * Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е.
 * Общий член ряда имеет вид: a(n) = 1/Math.pow(2, n) + 1/ Math.pow(3, n)
 */

public class Task5 {
    public static void main(String[] args) {
        double e = 0.36;
        int intervalFrom = 1;
        int intervalTo = 15;
        double result = 0;

        for (int i = intervalFrom; i <= intervalTo; i++) {
            double temp = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
            if (Math.abs(temp) >= Math.abs(e)) {
                result = result + temp;
            }
        }
        System.out.println(result);
    }
}
