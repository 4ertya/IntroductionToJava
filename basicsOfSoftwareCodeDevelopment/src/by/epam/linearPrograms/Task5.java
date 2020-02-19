package by.epam.linearPrograms;

/**
 * Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
 * Вывести данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc.
 */

public class Task5 {
    public static void main(String[] args) {
        int timeInSeconds = 682;
        int hours;
        int minutes;
        int seconds;

        hours = timeInSeconds / 3600;
        minutes = (timeInSeconds - hours * 3600) / 60;
        seconds = timeInSeconds - hours * 3600 - minutes * 60;

        System.out.printf("Time: %02dh %02dm %02ds", hours, minutes, seconds);

    }
}
