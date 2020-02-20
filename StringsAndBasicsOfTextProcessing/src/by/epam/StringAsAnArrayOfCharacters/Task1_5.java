package by.epam.StringAsAnArrayOfCharacters;

/**
 * Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
 * Крайние пробелы в строке удалить.
 */

public class Task1_5 {
    public static void main(String[] args) {
        String str = "dad  ada a adawd ad  adw   awda";
        System.out.println(Task1_5.replaceSpaces(str));
    }

    private static String replaceSpaces(String string) {
        StringBuilder strBuilder = new StringBuilder();
        String str = string.trim();
        boolean isSpace = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                if (!isSpace) {
                    strBuilder.append(" ");
                }
                isSpace = true;
            } else {
                strBuilder.append(str.charAt(i));
                isSpace = false;
            }
        }
        return strBuilder.toString();
    }
}

