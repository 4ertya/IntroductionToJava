package StringAsAnArrayOfCharacters;

public class Task1_4 {
    public static void main(String[] args) {
        String str = "124 ada54 ad 5 adw9";
        System.out.println(Task1_4.findNumbers(str));

    }

    private static int findNumbers(String strings) {
        int counter = 0;
        for (int i = 0; i < strings.length(); i++) {
            if (isDigit(strings.charAt(i))) {
                if (i == strings.length() - 1 || !isDigit(strings.charAt(i + 1))) {
                    counter++;
                }
            }
        }
        return counter;
    }

    private static boolean isDigit(char chars) {
        boolean isDigit = false;
        char[] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        for (int i = 0; i < digits.length; i++) {
            if (chars == digits[i]) {
                isDigit = true;
                break;
            }
        }
        return isDigit;
    }
}
