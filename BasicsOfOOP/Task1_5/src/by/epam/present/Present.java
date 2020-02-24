package by.epam.present;

public class Present {
    private Package aPackage;
    private Sweets sweets;

    public void addaPackage(Package aPackage) {
        this.aPackage = aPackage;
    }

    public void addsweets(Sweets sweets) {
        this.sweets = sweets;
    }

    public Package getaPackage() {
        return aPackage;
    }

    public Sweets getSweets() {
        return sweets;
    }

    @Override
    public String toString() {
        return "Present:\n"
                 + aPackage +"\n"
                 + sweets ;
    }
}
