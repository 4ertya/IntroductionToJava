package by.epam;

/**
 * Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
 * Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
 * номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
 * Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
 * назначения должны быть упорядочены по времени отправления.
 */

public class Main {
    public static void main(String[] args) {
        Train[] trains = new Train[]{
                new Train("Gomel", 254, "05:58"),
                new Train("Vilnus", 324, "10:48"),
                new Train("Moskow", 115, "13:15"),
                new Train("Gomel", 658, "18:41"),
                new Train("Kiev", 225, "06:40"),
        };

        System.out.println("___________________informationOfTrain___________________________");
        Train myTrain = Train.informationOfTrain(trains, 658);
        System.out.println(myTrain);
        System.out.println("___________________sortingTrainByNumber__________________________");
        Train.sortingTrainByNumber(trains);
        for (Train train : trains) {
            System.out.println(train);
        }
        System.out.println("____________________sortTrainDestinationName______________________");
        Train.sortTrainDestinationName(trains);
        for (Train train : trains) {
            System.out.println(train);
        }


    }
}
