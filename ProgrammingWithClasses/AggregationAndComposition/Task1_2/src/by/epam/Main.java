package by.epam;

/**
 * Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
 * менять колесо, вывести на консоль марку автомобиля.
 */

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Car car = new Car("BMW E28", 192, 4, 17);
        car.run();
        Thread.sleep(2000);
        car.breakWheel();
        car.changeWheel();
        car.run();
        Thread.sleep(2000);
        car.noFuel();
        car.refuel();
        car.run();
        System.out.println(car.getEngine());
        System.out.println(car.getWheels());


    }
}
