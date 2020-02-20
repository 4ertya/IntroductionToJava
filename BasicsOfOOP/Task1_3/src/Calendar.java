import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;

public class Calendar {
    private int year;
    private ArrayList<Holiday> holidaysAndWeekends;

    public Calendar(int year) {
        this.year = year;
        this.holidaysAndWeekends = new ArrayList<>();

        addWeekend(year);
    }

    private void addWeekend(int year) {
        LocalDate date = LocalDate.of(year, 1, 1);

        while (date.getYear() == year) {
            if (date.getDayOfWeek() == DayOfWeek.SATURDAY) {
                holidaysAndWeekends.add(new Holiday(date, "Saturday"));
                date = date.plusDays(1);
            } else if (date.getDayOfWeek() == DayOfWeek.SUNDAY) {
                holidaysAndWeekends.add(new Holiday(date, "Sunday"));
                date = date.plusDays(6);
            } else {
                date = date.plusDays(1);
            }
        }
    }


    public void addHoliday(LocalDate holidayDate, String nameOfHoliday) {
        holidaysAndWeekends.add(new Holiday(holidayDate, nameOfHoliday));
        Collections.sort(holidaysAndWeekends);
    }

    public void printHolidaysAndWeekends() {
        holidaysAndWeekends.sort(Comparator.comparing(Holiday::getHolidayDate));
        for (Holiday holiday : holidaysAndWeekends) {
            if (holiday.getNameOfHoliday().equals("Saturday") || holiday.getNameOfHoliday().equals("Sunday")) {
                System.out.println(holiday);
            } else {
                System.err.println(holiday);
            }
        }
    }

    class Holiday implements Comparable<Holiday> {
        private LocalDate holidayDate;
        private String nameOfHoliday;

        public Holiday(LocalDate holiday, String nameOfHoliday) {
            this.holidayDate = holiday;
            this.nameOfHoliday = nameOfHoliday;
        }

        public LocalDate getHolidayDate() {
            return holidayDate;
        }

        public String getNameOfHoliday() {
            return nameOfHoliday;
        }

        @Override
        public String toString() {
            return holidayDate +
                    " - " + nameOfHoliday;
        }

        @Override
        public int compareTo(Holiday o) {
            return this.holidayDate.compareTo(o.getHolidayDate());
        }
    }
}
