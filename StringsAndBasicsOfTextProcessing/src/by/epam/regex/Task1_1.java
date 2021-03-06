package by.epam.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных
 * операции: отсортировать абзацы по количеству предложений; в каждом предложении отсортировать слова по длине;
 * отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по
 * алфавиту.
 */

public class Task1_1 {
    public static void main(String[] args) {
        sortParagraphsBySentences(text);
        System.out.println("-------------------------------------------");
        sortWordsByLength(text);
        System.out.println("-------------------------------------------");
        sortLexemes(text, "m");
    }


    final static String text = "Casting is not magic. If you have a DoubleStream instance, you can't just cast that instance " +
            "to Supplier<DoubleStream> and expect the cast to magically transform the stream to a supplier. \n" +
            "\n" +
            "Despite all this, it's not clear at all why you need to get a supplier from the stream in the" +
            " first place. \n" +
            "\n" +
            "Regarding the return type of DoubleStream.max and DoubleStream.min methods. It's OptionalDouble " +
            "(instead of just double) because the stream might be empty, in which case there would be neither a max " +
            "or a min value. In this case, the returned OptionalDouble instance would be empty. ";

    public static List<String> getParagraphs(String text) {
        List<String> list = new ArrayList<>();
        Matcher matcher = Pattern.compile(".+\\.\\s").matcher(text);
        while (matcher.find()) {
            list.add(matcher.group());
        }
        return list;
    }

    public static List<String> getSentences(String text) {
        List<String> list = new ArrayList<>();
        Matcher matcher = Pattern.compile("[A-Z].+?\\.\\s").matcher(text);
        while (matcher.find()) {
            list.add(matcher.group().trim());
        }
        return list;
    }

    public static List<String> getWords(String text) {
        List<String> list = new ArrayList<>();
        Matcher matcher = Pattern.compile("[A-Za-z]+").matcher(text);
        while (matcher.find()) {
            list.add(matcher.group().trim());
        }
        return list;
    }

    public static void sortParagraphsBySentences(String text) {
        List<String> sortedParagraphs = getParagraphs(text);
        for (int i = 1; i < sortedParagraphs.size(); i++) {
            for (int j = 1; j < sortedParagraphs.size(); j++)
                if (getSentences(sortedParagraphs.get(j)).size() > getSentences(sortedParagraphs.get(j - 1)).size()) {
                    String temp = sortedParagraphs.get(j);
                    sortedParagraphs.set(j, sortedParagraphs.get(j - 1));
                    sortedParagraphs.set(j - 1, temp);
                }
        }
        for (String str : sortedParagraphs) {
            System.out.println(str);
        }
    }

    public static void sortWordsByLength(String text) {
        List<String> sortedSentences = getSentences(text);
        for (int i = 0; i < sortedSentences.size(); i++) {
            String sentence = sortedSentences.get(i);
            List<String> words = getWords(sentence);
            for (int j = 0; j < words.size(); j++) {
                for (int k = 1; k < j; k++) {
                    if (words.get(k).length() > words.get(k - 1).length()) {
                        String temp = words.get(k);
                        words.set(k, words.get(k - 1));
                        words.set(k - 1, temp);
                    }
                }
            }
            String result = "";
            for (String str : words) {
                result += str + " ";
            }
            sortedSentences.set(i, result);
        }
        for (String str : sortedSentences) {
            System.out.println(str);
        }
    }

    public static void sortLexemes(String text, String letter) {
        List<String> sortedSentences = getSentences(text);
        for (int i = 0; i < sortedSentences.size(); i++) {
            String sentence = sortedSentences.get(i);
            List<String> words = getWords(sentence);
            for (int j = 0; j < words.size() - 1; j++) {
                for (int k = 0; k < words.size() - 1; k++) {
                    int countK = 0;
                    int countK1 = 0;
                    for (int m = 0; m < words.get(k).length(); m++)
                        if (String.valueOf(words.get(k).charAt(m)).compareToIgnoreCase(letter) == 0) {
                            countK++;
                        }
                    for (int m = 0; m < words.get(k + 1).length(); m++) {
                        if (String.valueOf(words.get(k + 1).charAt(m)).compareToIgnoreCase(letter) == 0) {
                            countK1++;
                        }
                    }
                    if (countK < countK1) {
                        String temp = words.get(k);
                        words.set(k, words.get(k + 1));
                        words.set(k + 1, temp);
                    } else if (countK == countK1) {
                        String[] forCompare = {words.get(k), words.get(k + 1)};
                        if (Character.toLowerCase(forCompare[0].charAt(0)) > Character.toLowerCase(forCompare[1].charAt(0))) {
                            words.set(k, forCompare[1]);
                            words.set(k + 1, forCompare[0]);
                        }
                    }
                }
            }
            String result = "";
            for (String str : words) {
                result += str + " ";
            }
            sortedSentences.set(i, result);
        }
        for (
                String str : sortedSentences) {
            System.out.println(str);
        }
    }
}




