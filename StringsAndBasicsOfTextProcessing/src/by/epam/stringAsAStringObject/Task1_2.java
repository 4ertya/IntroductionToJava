package by.epam.stringAsAStringObject;

/**
 * В строке вставить после каждого символа 'a' символ 'b'.
 */

public class Task1_2 {
    public static void main(String[] args) {
        String str = "alcohol beard head";
        System.out.println(Task1_2.addBafterA(str));
    }

    private static String addBafterA(String str) {

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            stringBuilder.append(str.charAt(i));
            if (str.charAt(i) == 'a') {
                stringBuilder.append('b');
            }
        }
        return stringBuilder.toString();
    }
}
