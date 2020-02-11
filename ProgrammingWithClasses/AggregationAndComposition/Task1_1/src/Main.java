public class Main {
    public static void main(String[] args) {
        Word heading = new Word("Heading");
        Text text = new Text(heading);
        text.addSentence(new Sentence("Hello world."));
        text.addSentence(new Sentence("It`s the second sentence"));
        System.out.println("HEADING:");
        text.printHeading();
        System.out.println("Text: ");
        text.printText();
    }
}
