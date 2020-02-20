package by.epam.stringAsAStringObject;

/**
 * Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
 */

public class Task1_5 {
    public static void main(String[] args) {
        String str = "Algorithmization";
        System.out.println(Task1_5.countOfA(str));
    }

    private static int countOfA(String str) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.toLowerCase(str.charAt(i)) == 'a') {
                counter++;
            }
        }
        return counter;
    }
}
