package by.epam;

import java.util.ArrayList;

public class Text {
    private Word heading;
    private ArrayList<Sentence> content;

    Text(Word heading) {
        this.heading = heading;
        this.content = new ArrayList<>();
    }
    void addSentence (Sentence sentence) {
        this.content.add(sentence);
    }

    void printText() {
        System.out.println(heading);
        content.stream().forEach(System.out::println);
    }

    void printHeading() {
        System.out.println(heading);
    }

    public void setHeading(Word heading) {
        this.heading = heading;
    }

    public Word getHeading() {
        return this.heading;
    }
}
