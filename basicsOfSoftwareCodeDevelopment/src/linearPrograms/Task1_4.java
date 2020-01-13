package linearPrograms;

/**
 * Swap whole and fractional parts of nnn.ddd number
 */
public class Task1_4 {
    public static void main(String[] args) {
        double x = 123.456;

        String number = String.valueOf(x);
        int indexOfDot = number.indexOf('.');
        String newNumber = number.substring(indexOfDot + 1) + '.' + number.substring(0, indexOfDot);
        double result = Double.parseDouble(newNumber);
        System.out.println(result);
    }
}
