package stringAsAStringObject;

public class Task1_1 {
    public static void main(String[] args) {
        String str = "  adaw awds asdd   asd  as    as    awdd ada ";
        System.out.println(Task1_1.findMaxCount(str));
    }


    private static int findMaxCount(String strings) {
        int count = 0;
        int max = 0;

        for (int i = 0; i < strings.length(); i++) {
            if (strings.charAt(i) == ' ') {
                count++;
            } else {
                if (count > max) {
                    max = count;
                }
                count = 0;
            }
        }
        return max;
    }
}
