package stringAsAStringObject;

import java.util.Scanner;

public class Task1_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        findLetters(text);
    }

    private static void findLetters(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        int countOfSmall = 0;
        int countOfBig = 0;
        for (int i = 0; i < stringBuilder.length(); i++) {
            if (stringBuilder.charAt(i) >= 'a' && stringBuilder.charAt(i) <= 'z') {
                countOfSmall++;
            } else if (stringBuilder.charAt(i) >= 'A' && stringBuilder.charAt(i) <= 'Z') {
                countOfBig++;
            }
        }
        System.out.println("small: " + countOfSmall);
        System.out.println("big: " + countOfBig);
    }
}
