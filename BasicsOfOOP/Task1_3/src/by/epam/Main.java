package by.epam;

import java.time.LocalDate;

/**
 * Создать класс Календарь с внутренним классом,
 * с помощью объектов которого можно хранить информацию о выходных и праздничных днях.
 */

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int year = 2020;
        Calendar calendar = new Calendar(year);
        calendar.addHoliday(LocalDate.parse(year + "-01-01"), "New Year");
        calendar.addHoliday(LocalDate.parse(year + "-03-08"), "Women’s Day");
        calendar.addHoliday(LocalDate.parse(year + "-05-09"), "Victory Day");
        calendar.addHoliday(LocalDate.parse(year + "-01-07"), "Christmas");
        calendar.addHoliday(LocalDate.parse(year + "-07-03"), "Independence Day");

        calendar.printHolidaysAndWeekends();

    }
}
