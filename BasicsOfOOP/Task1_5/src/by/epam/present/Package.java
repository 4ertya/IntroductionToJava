package by.epam.present;

import by.epam.enumforapp.PackingRibbon;
import by.epam.enumforapp.PackingType;

public class Package {
    private PackingType type;
    private String material;
    private PackingRibbon ribbonColor;
    String massage;

    public static class Builder {
        private Package newPackage;

        public Builder() {
            newPackage = new Package();
        }

        public Builder withMaterial(String name) {
            newPackage.material = name;
            return this;
        }

        public Builder withType(String surname) {
            try {
                newPackage.type = PackingType.valueOf(surname);
            } catch (IllegalArgumentException e) {
                System.out.println("Sorry, we dont have \"" + surname + "\" packing type");
            }
            return this;
        }

        public Builder withRibbonColor(String name) {
            newPackage.ribbonColor = PackingRibbon.valueOf(name);
            return this;
        }

        public Package build() {
            return newPackage;
        }
    }

    @Override
    public String toString() {
        return "Package: " +
                "type=" + type +
                ", material=" + material +
                ", ribbonColor=" + ribbonColor;
    }
}
