package loops;

public class Task1_8 {
    public static void main(String[] args) {
        int a = 563445187;
        int b = 836248592;
        String stringA = String.valueOf(a);
        String stringB = String.valueOf(b);
        String temp = "";

        for (int i = 0; i < stringA.length(); i++) {
            char ch = stringA.charAt(i);
            if (stringB.contains(String.valueOf(ch)) && temp.indexOf(ch) == -1) {
                System.out.print(ch + "; ");
                temp = temp + ch;
            }
        }
    }
}
