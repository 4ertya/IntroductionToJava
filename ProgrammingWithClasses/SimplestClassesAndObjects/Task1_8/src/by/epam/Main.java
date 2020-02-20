package by.epam;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 * Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
 * и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
 * и методами. Задать критерии выбора данных и вывести эти данные на консоль.
 * Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
 * Найти и вывести:
 * a) список покупателей в алфавитном порядке;
 * b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 */

public class Main {
    public static void main(String[] args) {
        SosediCustomers constantClient = new SosediCustomers("constant client", new ArrayList<>());
        constantClient.addCustomer("Ribin", "Victor", "Sergeevich",
                "Minsk", 1457893215687811L, new BigInteger("12351616546545678"));
        constantClient.addCustomer("Palchynskaya", "Milana", "Sergeevna",
                "Minsk", 1341141119464159L, new BigInteger("11515610654651165188"));
        constantClient.addCustomer("Pushkin", "Oleg", "Andreevich",
                "Vitebsk", 1111111111111111L, new BigInteger("123418165168415678"));
        constantClient.addCustomer("Blablablakin", "Victor", "Sergeevich",
                "Minsk", 5299554854123118L, new BigInteger("1233151515134185418"));
        constantClient.addCustomer("Kukin", "Victor", "Sergeevich",
                "Grodno", 9455151515151433L, new BigInteger("116516516515111250158"));
        System.out.println("Sorted by lastname: ");
        constantClient.sortAndPrint();
        System.out.println("Sorted by card : ");
        constantClient.printCustomersCardRange(1300000000000000L, 1460000000000000L);

    }
}
