package by.epam.present;

import by.epam.enumforapp.Sweet;

import java.util.ArrayList;

import java.util.List;

public class Sweets {
    private List<Sweet> sweets = new ArrayList<>();

    public static class Builder {
        private Sweets newSweets;

        public Builder() {
            newSweets = new Sweets();
        }

        public Sweets.Builder addSweets(String text) {

            String[] sweets = text.split(",");
            for (String sweet : sweets) {
                try {
                    newSweets.sweets.add(Sweet.valueOf(sweet.trim()));
                } catch (IllegalArgumentException e) {
                    System.err.println("Sorry, we don`t have \"" + sweet + "\" sweets");
                }
            }

            return this;
        }

        public Sweets build() {
            return newSweets;
        }
    }

    @Override
    public String toString() {
        return "Sweets: " +
                sweets;
    }
}
