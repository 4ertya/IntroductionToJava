package by.epam.stringAsAStringObject;

/**
 * Из заданной строки получить новую, повторив каждый символ дважды.
 */

public class Task1_6 {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(Task1_6.addEachSymbol(str));

    }

    private static String addEachSymbol(String str) {

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            stringBuilder.append(str.charAt(i)).append(str.charAt(i));
        }
        return stringBuilder.toString();
    }

}
