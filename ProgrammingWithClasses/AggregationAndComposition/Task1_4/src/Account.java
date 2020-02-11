import java.math.BigInteger;

public class Account {
    private BigInteger accountNumber;
    private String currency;
    private boolean status;
    private int amount;

    public Account(String accountNumber, String currency, int amount) {
        this.accountNumber = new BigInteger(accountNumber);
        this.currency = currency;
        this.status = true;
        this.amount = amount;
    }

    public void putMoney(int amount) {
        this.amount += amount;
    }

    public void takeMoney(int amount) {
        this.amount -= amount;
    }

    public void blockAccount() {
        this.status = false;
    }

    public void unblockAccount() {
        this.status = true;
    }

    public boolean getStatus() {
        return status;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getAmount() {
        return amount;
    }

    public BigInteger getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String toString() {
        return "accountNumber= " + accountNumber +
                ", currency= " + currency +
                ", status= " + status +
                ", amount= " + amount;
    }
}
