import java.util.ArrayList;

public class CustomerPrompts {
    // Establish instance variables and arrayList containing all CustomerPrompts
    String prompt;
    String primaryAttribute;
    String specMeaning;
    String secondaryAttribute;
    boolean hasSecondaryAttribute;
    static ArrayList<CustomerPrompts> allPrompts = new ArrayList<CustomerPrompts>();
    // 2 overloaded constructors depending on if there is a secondary attribute
    public CustomerPrompts(String prompt, String primaryAttribute, String specMeaning, String secondaryAttribute){
        this.prompt = prompt;
        this.primaryAttribute = primaryAttribute;
        this.specMeaning = specMeaning;
        this.secondaryAttribute = secondaryAttribute;
        this.hasSecondaryAttribute = true;
        allPrompts.add(this);

    }
    public CustomerPrompts(String prompt, String primaryAttribute, String specMeaning) {
        this.prompt = prompt;
        this.primaryAttribute = primaryAttribute;
        this.specMeaning = specMeaning;
        this.hasSecondaryAttribute = false;
        allPrompts.add(this);
    }
}

