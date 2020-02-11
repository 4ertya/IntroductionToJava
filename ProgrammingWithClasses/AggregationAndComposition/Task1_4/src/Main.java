public class Main {
    public static void main(String[] args) {
        Bank bgpb = new Bank("BelGazPromBank");
        Client client1 = new Client("Dmitry", "Palchynski", "MP2756569");
        client1.addAccount(new Account("123456789101112131415", "BYN", -150));
        client1.addAccount(new Account("124523548962156624521", "BYN", 100));
        client1.addAccount(new Account("324532655224589965485", "BYN", 1500));
        client1.addAccount(new Account("332140000052169416654", "BYN", -500));
        bgpb.addClient(client1);
        bgpb.getClientByPassportId("MP2756569").sortAccountsByAmount();
        System.out.println(bgpb.getClientByPassportId("MP2756569"));
        bgpb.getClientByPassportId("MP2756569").printAccounts();
        bgpb.getClientByPassportId("MP2756569").printSumOfNegativeAccounts();
        bgpb.getClientByPassportId("MP2756569").printSumOfPositiveAccounts();
        bgpb.getClientByPassportId("MP2756569").printSumOfAllAccounts();

    }
}
