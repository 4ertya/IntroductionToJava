public class Main {
    public static void main(String[] args) {
        TravelAgency alatan = new TravelAgency("Alatan Tour");
        alatan.addTour(new Tour("Hawaii", TypeOfTour.CRUISE,
                Transport.SHIP, Food.BREAKFAST, 12, 1000.99));
        alatan.addTour(new Tour("Hawaii", TypeOfTour.RECREATION,
                Transport.PLANE, Food.ALL_INCLUSIVE, 14, 854));
        alatan.addTour(new Tour("Italy", TypeOfTour.EXCURSION,
                Transport.BUS, Food.ALL_INCLUSIVE, 10, 300.2));
        alatan.addTour(new Tour("Italy", TypeOfTour.CRUISE,
                Transport.SHIP, Food.BREAKFAST, 20, 865.95));
        alatan.addTour(new Tour("Italy", TypeOfTour.SHOPPING,
                Transport.PLANE, Food.BREAKFAST, 3, 399.99));
        alatan.addTour(new Tour("Hawaii", TypeOfTour.EXCURSION,
                Transport.PLANE, Food.NOT_INCLUDED, 5, 987.15));
        alatan.addTour(new Tour("Hawaii", TypeOfTour.RECREATION,
                Transport.CAR, Food.BREAKFAST, 15, 600.3));
        alatan.addTour(new Tour("Hawaii", TypeOfTour.TREATMENT,
                Transport.SHIP, Food.ALL_INCLUSIVE, 8, 500.80));
        alatan.addTour(new Tour("Italy", TypeOfTour.TREATMENT,
                Transport.TRAIN, Food.ALL_INCLUSIVE, 13, 1099.11));
        alatan.addTour(new Tour("Italy", TypeOfTour.SHOPPING,
                Transport.CAR, Food.NOT_INCLUDED, 5, 599.50));
        Client client = new Client("Victor", "Rybin");
        alatan.addClient(client);
        alatan.sortToursByPrice();
        alatan.searchWithCountry("hawaii");
        client.setTour(alatan.getTourById(101));
        System.out.println(client);

    }
}
