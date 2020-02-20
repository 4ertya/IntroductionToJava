package by.epam;

/**
 * Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте
 * конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра
 * класса.
 */

public class Main {
    public static void main(String[] args) {
        Test2 test2_1 = new Test2();
        Test2 test2_2 = new Test2(3, 6);
        test2_2.setA(7);
        test2_2.setB(8);
        System.out.println("test2_1:");
        System.out.println("int a =" + test2_1.getA());
        System.out.println("int b =" + test2_1.getB());
        System.out.println("test2_1:");
        System.out.println("int a =" + test2_2.getA());
        System.out.println("int b =" + test2_2.getB());

    }
}
