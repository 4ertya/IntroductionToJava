import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class Bank {
    private String name;
    private ArrayList<Client> clients;

    public Bank(String name) {
        this.name = name;
        this.clients = new ArrayList<>();
    }

    public void addClient(Client client) {
        clients.add(client);
    }

    public Client getClientByPassportId(String passportId) {
        Optional<Client> client = clients.stream().filter(o -> o.getPassportId().equals(passportId)).findFirst();
        return client.get();
    }

    public void printClients() {
        clients.stream().forEach(System.out::println);
    }

}
