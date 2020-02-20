import java.io.IOException;
import java.util.Scanner;

public class Menu {
    private static final String MENUINFO =
            "\n1. Print a list of treasures.\n" +
                    "2. Take treasures by numbers.\n" +
                    "3. Remove treasures from your list.\n" +
                    "4.Print your list of Treasures.\n" +
                    "5. Take different treasures for amount.\n" +
                    "6.Exit.\n\n" +
                    "Please make your choice: ";

    public static void makeAChoise() throws IOException {
        while (true) {
            System.out.print(MENUINFO);
            Scanner scanner = new Scanner(System.in);
            int choise = Integer.parseInt(scanner.nextLine());
            switch (choise) {
                case (1):
                    System.out.println("List of treasures in the cave: ");
                    Cave.getInstance().printListOTreasures();
                    break;
                case (2):
                    System.out.print("Enter numbers of treasures you need:");
                    User.getInstance().addTreasure(scanner.nextLine());
                    break;
                case (3):
                    System.out.print("Enter numbers of treasures you want to remove:");
                    User.getInstance().removeTreasure(scanner.nextLine());
                    break;
                case (4):
                    User.getInstance().printMyTreasures();
                    break;
                case (5):
                    System.out.print("Enter amount of money:");
                    User.getInstance().addDifferentTreasures(scanner.nextLine());
                    break;
                case (6):
                    System.exit(0);
            }
        }
    }
}
