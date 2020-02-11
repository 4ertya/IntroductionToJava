import java.math.BigInteger;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SosediCustomers constantClient = new SosediCustomers("constant client", new ArrayList<>());
        constantClient.addCustomer("Ribin", "Victor", "Sergeevich",
                "Minsk", 1457893215687811L, new BigInteger("12351616546545678"));
        constantClient.addCustomer("Palchynskaya", "Milana", "Sergeevna",
                "Minsk", 1341141119464159L, new BigInteger("11515610654651165188"));
        constantClient.addCustomer("Pushkin", "Oleg", "Andreevich",
                "Vitebsk", 1111111111111111L, new BigInteger("123418165168415678"));
        constantClient.addCustomer("Blablablakin", "Victor", "Sergeevich",
                "Minsk", 5299554854123118L, new BigInteger("1233151515134185418"));
        constantClient.addCustomer("Kukin", "Victor", "Sergeevich",
                "Grodno", 9455151515151433L, new BigInteger("116516516515111250158"));
        System.out.println("Sorted by lastname: ");
        constantClient.sortAndPrint();
        System.out.println("Sorted by card : ");
        constantClient.printCustomersCardRange(1300000000000000L, 1460000000000000L);

    }
}
