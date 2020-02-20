package by.epam;

public enum TypeOfTour {
    SHOPPING,
    CRUISE,
    RECREATION,
    EXCURSION,
    TREATMENT;

    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}
