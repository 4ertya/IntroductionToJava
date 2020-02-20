package by.epam.stringAsAStringObject;

/**
 * Проверить, является ли заданное слово палиндромом.
 */

public class Task1_3 {
    public static void main(String[] args) {
        String str = "abcdedcba";
        System.out.println(isPalindrome(str));

    }

    private static boolean isPalindrome(String str) {

        for (int i = 0; i < (str.length() / 2); i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
