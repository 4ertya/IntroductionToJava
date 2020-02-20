package by.epam.stringAsAStringObject;

/**
 * С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
 */

public class Task1_4 {
    public static void main(String[] args) {
        String word = "информатика";
        System.out.println(getCake(word));
    }

    private static String getCake(String word) {
        String т = String.valueOf(word.charAt(word.indexOf('т')));
        String cake = т;
        cake = cake + String.valueOf(word.charAt(word.indexOf('о')));
        cake = cake + String.valueOf(word.charAt(word.indexOf('р')));
        cake = cake + т;
        return cake;
    }
}
