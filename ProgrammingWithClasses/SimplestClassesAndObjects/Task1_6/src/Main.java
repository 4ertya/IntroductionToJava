public class Main {
    public static void main(String[] args) {
        Time time = new Time(23, 15, 45);
        time.increaseTime(3, 20, 40);
        System.out.println(time.toString());
        time.reduceTime(2, 40, 50);
        System.out.println(time.toString());
        time.setHours(5);
        time.setMinutes(12);
        time.setSeconds(54);
        System.out.println(time.toString());
    }
}
