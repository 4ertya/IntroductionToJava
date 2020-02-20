import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Cave {
    private List<Treasure> allTreasures = new ArrayList<>();
    private static Cave instance;

    private Cave() throws IOException {
        addTreasures();
    }

    public static Cave getInstance() throws IOException {
        if (instance == null) {
            instance = new Cave();
        }
        return instance;
    }

    private FileReader parseResourceFile() throws IOException {
        ClassLoader classLoader = getClass().getClassLoader();
        return new FileReader(classLoader.getResource("Treasures.txt").getFile());
    }

    private void addTreasures() throws IOException {
        Scanner scanner = new Scanner(parseResourceFile());
        String[] split;
        while (scanner.hasNextLine()) {
            split = scanner.nextLine().split("-");
            allTreasures.add(new Treasure(split[0].trim(), Double.parseDouble(split[1].trim())));
        }
    }

    public List<Treasure> getAllTreasures() {
        return allTreasures;
    }

    public List<Treasure> shuffleAllTreasures() {
        List<Treasure> shuffle = allTreasures;
        Collections.shuffle(shuffle);
        return shuffle;
    }

    public Treasure getTreasure(String number) {
        Treasure resultTreasure = null;
        for (Treasure treasure : allTreasures) {
            if (treasure.getName().contains(number)) {
                resultTreasure = treasure;
                break;
            }
        }
        return resultTreasure;
    }

    void printListOTreasures() {
        allTreasures.forEach(System.out::println);
    }
}
