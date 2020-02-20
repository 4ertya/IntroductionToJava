package by.epam.stringAsAStringObject;

/**
 * Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным
 * знаком. Определить количество предложений в строке X.
 */

public class Task1_10 {
    public static void main(String[] args) {
        String text = "Returns a stream consisting of the elements of this stream! sorted\n" +
                "according to natural order. Is it clear?";
        countOfSentences(text);
    }


    private static void countOfSentences(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        int count = 0;
        for (int i = 0; i < stringBuilder.length(); i++) {
            if (stringBuilder.charAt(i) == '!' || stringBuilder.charAt(i) == '?' || stringBuilder.charAt(i) == '.') {
                count++;
            }
        }
        System.out.println("sentences: " + count);
    }
}
