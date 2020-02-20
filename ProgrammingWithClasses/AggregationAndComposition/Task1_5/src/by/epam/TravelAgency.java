package by.epam;

import java.util.ArrayList;
import java.util.Comparator;

public class TravelAgency {

    private String nameOfAgency;
    private ArrayList<Tour> tours;
    private ArrayList<Client> clients;

    public TravelAgency(String nameOfAgency) {
        this.nameOfAgency = nameOfAgency;
        tours = new ArrayList<>();
        clients = new ArrayList<>();
    }

    public void addClient(Client client) {
        clients.add(client);
    }

    public void printClients() {
        clients.forEach(System.out::println);
    }

    public Client getClientById(int id) {
        for (Client client : clients) {
            if (client.getClientId() == id) {
                return client;
            }
        }
        return null;
    }

    public void addTour(Tour tour) {
        tours.add(tour);
    }

    public void printTours() {
        tours.forEach(System.out::println);
    }

    public Tour getTourById(int id) {
        for (Tour tour : tours) {
            if (tour.getTourId() == id) {
                return tour;
            }
        }
        return null;
    }

    public void printToursByType(TypeOfTour type) {
        tours.stream().filter(o -> o.getType().equals(type)).forEach(System.out::println);
    }

    public void sortToursByPrice() {
        tours.sort(Comparator.comparing(Tour::getPrice));
    }

    public void searchWithCountry(String country) {
        tours.stream().filter(o -> o.getCountry().equalsIgnoreCase(country)).forEach(System.out::println);
    }

    public void searchWithDays(int days) {
        tours.stream().filter(o -> o.getNumberOfDays() == days).forEach(System.out::println);
    }

    public void searchWithTransport(Transport transport) {
        tours.stream().filter(o -> o.getTransport().equals(transport)).forEach(System.out::println);
    }

    public void searchWithFood(Food food) {
        tours.stream().filter(o -> o.getFood().equals(food)).forEach(System.out::println);
    }

    public void searchWithParameters(TypeOfTour type, Food food, Transport transport) {
        tours.stream()
                .filter(o -> o.getTransport().equals(transport) && o.getFood().equals(food) && o.getType().equals(type))
                .forEach(System.out::println);
    }
}
