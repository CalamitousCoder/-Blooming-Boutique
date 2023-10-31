import java.util.ArrayList;

public class Flowers {
    // Establish instance variables and arrayList containing all CustomerPrompts
    String flowerName;
    boolean hasSecondaryAttribute;

    String primaryAttribute;
    String secondaryAttribute;

    String specMeaning;
    static ArrayList<Flowers> allFlowers = new ArrayList<Flowers>();

    // 2 overloaded constructors depending on if there is a secondary attribute
    public Flowers(String flowerName, boolean hasSecondaryAttribute, String primaryAttribute, String specMeaning) {
        allFlowers.add(this);
        this.flowerName = flowerName;
        this.hasSecondaryAttribute = hasSecondaryAttribute;
        this.primaryAttribute = primaryAttribute;

        this.specMeaning = specMeaning;
    }
    public Flowers(String flowerName, boolean hasSecondaryAttribute, String primaryAttribute, String specMeaning, String secondaryAttribute) {
        allFlowers.add(this);
        this.flowerName = flowerName;
        this.hasSecondaryAttribute = hasSecondaryAttribute;
        this.primaryAttribute = primaryAttribute;
        this.secondaryAttribute = secondaryAttribute;
        this.specMeaning = specMeaning;
    }
    public static void printFlowerNames() throws InterruptedException {
        // prints all flowers names and a corresponding number
        int flowerNum = 0;
        for (Flowers allFlowers : allFlowers) {
            flowerNum++;

                Main.delayedPrintln("\t" + allFlowers.flowerName + ": " + flowerNum, 800);

            System.out.println();
        }
    }
        public static void printFlowerMeanings() throws InterruptedException{
        // prints a flower's name, corresponding number, and it's meaning
            int flowerNum = 0;
            for(Flowers allFlowers: allFlowers){
                flowerNum ++;
                    Main.delayedPrintln( "\t" + allFlowers.flowerName + ": " + flowerNum + " - Represents: " + allFlowers.specMeaning, 1500);

                System.out.println();
            }
    }
}
