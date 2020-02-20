package by.epam;

/**
 * Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
 * из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
 * номеров групп студентов, имеющих оценки, равные только 9 или 10
 */

public class Main {
    public static void main(String[] args) {

        Student[] students = new Student[]{
                new Student("Petrov A.V.", 114221, new int[]{10, 10, 10, 9, 10}),
                new Student("Ivanov V.S.", 114211, new int[]{7, 8, 4, 3, 6}),
                new Student("Galkin A.P.", 114221, new int[]{5, 10, 10, 9, 6}),
                new Student("Vorobiov A.A.", 114211, new int[]{10, 9, 9, 9, 10}),
                new Student("Pelkin I.G.", 114211, new int[]{7, 8, 4, 3, 6}),
                new Student("Vasechkin V.I.", 114221, new int[]{7, 8, 4, 3, 6}),
                new Student("Silich I.I.", 114211, new int[]{2, 9, 6, 4, 10}),
                new Student("Iodo J.A.", 114211, new int[]{9, 9, 10, 8, 10}),
        };
        Student.printHonourStudent(students);
    }
}
