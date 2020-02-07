package stringAsAStringObject;

import java.util.Scanner;

public class Task1_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println(getResult(text));
    }

    private static String getResult(String str) {
        String result = "";

        String[] words = str.split(" ");
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > result.length()) {
                result = words[i];
            }
        }
        return result;
    }
}
