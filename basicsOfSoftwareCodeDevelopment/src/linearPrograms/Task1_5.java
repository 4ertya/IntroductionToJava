package linearPrograms;

public class Task1_5 {
    public static void main(String[] args) {
        int timeInSeconds =682;

        int hours =timeInSeconds/3600;
        int minutes=(timeInSeconds-hours*3600)/60;
        int seconds=timeInSeconds-hours*3600-minutes*60;
        System.out.printf("Time: %02dh %02dm %02ds", hours, minutes, seconds);

    }
}
