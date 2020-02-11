public class Tour {
    private static int id = 100;
    private int tourId;
    private String country;
    private TypeOfTour type;
    private Transport transport;
    private Food food;
    private int numberOfDays;
    private double price;

    public Tour(String country, TypeOfTour type, Transport transport, Food food, int numberOfDays, double price) {
        this.tourId = id;
        this.country = country;
        this.type = type;
        this.transport = transport;
        this.food = food;
        this.numberOfDays = numberOfDays;
        this.price = price;
        id++;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public TypeOfTour getType() {
        return type;
    }

    public void setType(TypeOfTour type) {
        this.type = type;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getTourId() {
        return tourId;
    }

    public void setTourId(int tourId) {
        this.tourId = tourId;
    }

    @Override
    public String toString() {
        return
                "id= " + tourId +
                        ", country= " + country +
                        ", type= " + type +
                        ", transport= " + transport +
                        ", food= " + food +
                        ", numberOfDays= " + numberOfDays +
                        ", price= " + price;
    }
}
