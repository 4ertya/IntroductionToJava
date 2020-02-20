import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class User {
    private String fullName;
    private List<Treasure> myTreasures;
    private static User instance;

    private User() {
        myTreasures = new ArrayList<>();
    }

    public static User getInstance() {
        if (instance == null) {
            instance = new User();
        }
        return instance;
    }

    public List<Treasure> getMyTreasures() {
        return myTreasures;
    }

    public void printMyTreasures() {
        if (!myTreasures.isEmpty()) {
            myTreasures.forEach(System.out::println);
        }else
            System.err.println("Your list is empty!");
    }



    public void addTreasure(String numbers) throws IOException {
        String[] split = numbers.split(",");
        for (String string : split) {
            for (Treasure treasure : Cave.getInstance().getAllTreasures()) {
                if (treasure.getName().contains(string.trim())) {
                    myTreasures.add(treasure);
                    break;
                }
            }
        }
    }

    public void removeTreasure(String numbers) throws IOException {
        String[] split = numbers.split(",");
        for (String string : split) {
            for (Treasure treasure : Cave.getInstance().getAllTreasures()) {
                if (treasure.getName().contains(string.trim())) {
                    myTreasures.remove(treasure);
                    break;
                }
            }
        }
    }

    public void addDifferentTreasures(String amountOfMoney) throws IOException {
        double amount = Double.parseDouble(amountOfMoney);
        double sum = myTreasures.stream().mapToDouble(Treasure::getCost).sum();
        for (Treasure treasure : Cave.getInstance().shuffleAllTreasures()) {
            if ((sum + treasure.getCost()) < amount) {
                myTreasures.add(treasure);
                sum+=treasure.getCost();
            }
        }
    }
}
