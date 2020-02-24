package by.epam;

import by.epam.present.Package;
import by.epam.present.Present;
import by.epam.present.Sweets;

public class Menu {
    static Present present;
    static Package aPackage;
    static Sweets sweets;

    public static void createPresent() {
        present = new Present();
    }

    public static void createAPackage() {
        System.out.println("Введите: ");
        String type = "BOX";
        System.out.println("Тип упаковки: " + type);
        String material = "PLASTIC";
        System.out.println("Материал упаковки: " + material);
        String ribbon = "RED";
        System.out.println("Цвет ленты (если нужна): " + ribbon);

        aPackage = new Package.Builder()
                .withType(type)
                .withMaterial(material)
                .withRibbonColor(ribbon)
                .build();
        present.addaPackage(aPackage);
    }

    public static void addSweets() {

        String sweet = "MARS, SDF, SNICKERS, BOUNTY";
        System.out.println("Добавьте конфеты : " + sweet);

        sweets = new Sweets.Builder()
                .addSweets(sweet)
                .build();
        present.addsweets(sweets);
    }

    public static Present getPresent(){
        return present;
    }

}
