package by.epam;

/**
 * Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
 * и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
 * методами. Задать критерии выбора данных и вывести эти данные на консоль.
 * Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
 * Найти и вывести:
 * a) список рейсов для заданного пункта назначения;
 * b) список рейсов для заданного дня недели;
 * c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */

public class Main {
    public static void main(String[] args) {
        Schedule mySchedule = new Schedule("My Airport");
        mySchedule.addAirline("Krasnodar", "B2927", "Boeing", "00:25"
                , new String[]{"tuesday", "wednesday"});
        mySchedule.addAirline("Moscow", "SU1835", "Sukhoi", "05:40"
                , new String[]{"monday", "friday", "saturday"});
        mySchedule.addAirline("Vienna", "B2690", "Boeing", "06:00"
                , new String[]{"tuesday", "wednesday", "sunday"});
        mySchedule.addAirline("Moscow", "SU1831", "Sukhoi", "07:25"
                , new String[]{"monday", "wednesday", "friday"});
        System.out.println("To Moscow: ");
        mySchedule.findAirlinesToDestination("moscow");
        System.out.println("On Monday: ");
        mySchedule.findAirlinesOnDay("tuesday");
        System.out.println("On Wednesday after 03:00 : ");
        mySchedule.findAirlinesOnDayAndTime("wednesday", "03:00");
    }
}
