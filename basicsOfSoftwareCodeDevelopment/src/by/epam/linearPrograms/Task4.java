package by.epam.linearPrograms;

/**
 * Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
 * Поменять местами дробную и целую части числа и вывести полученное значение числа.
 */

public class Task4 {
    public static void main(String[] args) {
        double x = 123.456;

        double result = (int) x * 0.001 + (int) ((x - (int) x) * 1000);

        System.out.println(result);
    }
}
