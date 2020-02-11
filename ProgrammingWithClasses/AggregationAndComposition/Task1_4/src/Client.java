import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Client {
    private String name;
    private String lastname;
    private String passportId;
    private ArrayList<Account> accounts;

    public Client(String name, String lasname, String passportId) {
        this.name = name;
        this.lastname = lasname;
        this.passportId = passportId;
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLasname() {
        return lastname;
    }

    public void setLasname(String lasname) {
        this.lastname = lasname;
    }

    public String getPassportId() {
        return passportId;
    }

    public void setPassportId(String passportId) {
        this.passportId = passportId;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public Account getAccount(String accountNumber) {
        return (Account) accounts.stream().filter(o -> o.getAccountNumber().toString().equals(accountNumber));
    }

    public void printAccounts() {
        accounts.stream().forEach(System.out::println);

    }

    public void sortAccountsByAmount() {
        accounts.sort(Comparator.comparing(o -> o.getAmount()));
    }

    public void printSumOfPositiveAccounts() {
        int sum = accounts.stream().filter(o -> o.getAmount() > 0).mapToInt(o -> o.getAmount()).sum();
        System.out.println("Positive sum: " + sum);
    }

    public void printSumOfNegativeAccounts() {
        int sum = accounts.stream().filter(o -> o.getAmount() < 0).mapToInt(o -> o.getAmount()).sum();
        System.out.println("Negative sum: " + sum);
    }

    public void printSumOfAllAccounts() {
        int sum = accounts.stream().mapToInt(o -> o.getAmount()).sum();
        System.out.println("Sum: " + sum);
    }


    @Override
    public String toString() {
        return "name= " + name +
                ", lastname= " + lastname +
                ", passportId= " + passportId;
    }
}
