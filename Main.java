import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.Flow;

public class Main {
    // Set up all the flower objects
        // Love Flowers
     static LoveFlowersGeneral redChrysanthemum = new LoveFlowersGeneral("Red Chrysanthemum", "I love you");

     static LoveFlowersFriendship iris = new LoveFlowersFriendship("Iris","Your friendship means so much to me");
     static LoveFlowersFriendship ivy = new LoveFlowersFriendship("Ivy","friendship");
     static LoveFlowersFriendship yellowRoses = new LoveFlowersFriendship("Yellow Roses","Love between friends");

     static LoveFlowersCasualRomance calla = new LoveFlowersCasualRomance("Calla","Beauty");
    static LoveFlowersCasualRomance whiteCarnation = new LoveFlowersCasualRomance("White Carnation","Pure Love");
    static LoveFlowersCasualRomance gloxinia = new LoveFlowersCasualRomance("Gloxinia","Love at first sight");
    static LoveFlowersCasualRomance redRose = new LoveFlowersCasualRomance("Red Rose", "Love you");

    static LoveFlowersWeddings cleome = new LoveFlowersWeddings("Cleome", "Elope with me");
    static LoveFlowersWeddings ivy2 = new LoveFlowersWeddings("Ivy","Fidelity and Wedded love");
    static LoveFlowersWeddings stephanotis = new LoveFlowersWeddings("Stephanotis","Happiness in marriage");
        // Unrequited
    static UnrequitedFlowersRefusal stripedCarnation = new UnrequitedFlowersRefusal("Striped Carnation", "Sorry I can't be with you");
    static UnrequitedFlowersRefusal cyclamen = new UnrequitedFlowersRefusal("Cyclamen", "Resignation and Goodbyes");

    static UnrequitedFlowersDejection pinkCarnation = new UnrequitedFlowersDejection("Pink Carnation","My heart aches for you");
    static UnrequitedFlowersDejection yellowDaffodils = new UnrequitedFlowersDejection("Yellow Daffodils","My love is unrequited");
    static UnrequitedFlowersDejection azalea = new UnrequitedFlowersDejection("Azalea","Take care of yourself for me");
        // Anger
    static AngerFlowers anemone = new AngerFlowers("Anemone","Abandoned");
    static AngerFlowers yellowChrysanthemum = new AngerFlowers("Yellow Chrysanthemum","Slighted love");
    static AngerFlowers orangeLily = new AngerFlowers("Orange Lily","Hatred");
    static AngerFlowers whiteRose = new AngerFlowers("White Rose","You made no impression");

        // Apology
    static ApologyFlowers purpleHyacinth = new ApologyFlowers("Purple Hyacinth","I'm sorry");

    static ApologyFlowers lilyOfTheValley = new ApologyFlowers("Lily of the valley","Return of happiness");
    static ApologyFlowers whiteTulip = new ApologyFlowers("White Tulip","Forgiveness");
        // General Emotions
    static GeneralEmotionalFlowers bellsOfIreland = new GeneralEmotionalFlowers("Bells of Ireland","Luck");
    static GeneralEmotionalFlowers cactus = new GeneralEmotionalFlowers("Cactus","Endurance");
    static GeneralEmotionalFlowers crocus = new GeneralEmotionalFlowers("Crocus", "Cheerfulness");
    static GeneralEmotionalFlowers garlic = new GeneralEmotionalFlowers("Garlic","Courage and Strength");
    static GeneralEmotionalFlowers lavender = new GeneralEmotionalFlowers("Lavender","Admiration and Solitude");
    static GeneralEmotionalFlowers whiteHeather = new GeneralEmotionalFlowers("White Heather", "Protection, Wishes will comes true");
    static GeneralEmotionalFlowers bouquetOfMatureRoses = new GeneralEmotionalFlowers("Bouquet of Mature Roses","Gratitude");


    // set up Prompts
        // Love Prompts
    static CustomerPrompts promptRedChrysanthemum  = new CustomerPrompts(" I want to express my love to someone. What's the best flower to just say \'I love you\'", redChrysanthemum.primaryAttribute, redChrysanthemum.specMeaning, redChrysanthemum.secondaryAttribute);

    static CustomerPrompts promptIris = new CustomerPrompts("I have a friend named Steven that means a lot to me. I want to express how much our relationship means to me. Any suggestions?", iris.primaryAttribute, iris.specMeaning, iris.secondaryAttribute);
    static CustomerPrompts promptIvy = new CustomerPrompts("I want to give a token of friendship to a dear friend. What would you reckon the ideal plant for that would be?", ivy.primaryAttribute, ivy.specMeaning, ivy.secondaryAttribute);
    static CustomerPrompts promptYellowRose = new CustomerPrompts("I'm looking for a flower to like to symbolize the love between friends. I'm not sure what to choose. Do you have any suggestions.",yellowRoses.primaryAttribute, yellowRoses.specMeaning, yellowRoses.secondaryAttribute);

    static CustomerPrompts promptGloxinia = new CustomerPrompts("My love for my fiance is like a firework. I gazed at her, and I was just like wow she's the one. \n I'd like to get her some flowers to brighten her day. Got any recommendations. ",gloxinia.primaryAttribute, gloxinia.specMeaning, gloxinia.secondaryAttribute);
    static CustomerPrompts promptRedRose = new CustomerPrompts("I just want to buy something to remind my boyfriend I love him.",redRose.primaryAttribute, redRose.specMeaning, redRose.secondaryAttribute);
    static CustomerPrompts promptCalla= new CustomerPrompts("I think I have the most beautiful girlfriend in the world. I've decided to surprise her with a breakfast and flowers.\n What flower do you think she's like best?", calla.primaryAttribute, calla.specMeaning, calla.secondaryAttribute);
    static CustomerPrompts promptWhiteCarnation = new CustomerPrompts("I've been dating a guy for a few months, and maybe its silly but I truly believe what we have is pure love. Thoughts on a flower I could get him to brighten his day?", whiteCarnation.primaryAttribute, whiteCarnation.specMeaning, whiteCarnation.secondaryAttribute);

   static CustomerPrompts promptCleome = new CustomerPrompts("My partner and I are deeply in love, but my father will never approve. \n I have no intention of giving in to my family. I plan to ask her to elope with me. \n I'm looking for a flower to gift her when I propose.",cleome.primaryAttribute, cleome.specMeaning, cleome.secondaryAttribute);
   static CustomerPrompts promptIvy2 = new CustomerPrompts("I've been engaged for about a month, and I'm ready to take the next step. \n I like a flower to symbolize our soon to be wedded love.", ivy2.primaryAttribute, ivy2.specMeaning, ivy2.secondaryAttribute);
   static CustomerPrompts promptStephanotis = new CustomerPrompts("My bestie is finally getting hitched! I want a flower to wish the couple a happy marriage. Any suggestions?", stephanotis.primaryAttribute, stephanotis.specMeaning, stephanotis.secondaryAttribute);
        // Unrequited Prompts
    static CustomerPrompts promptPinkCarnation= new CustomerPrompts("My relationship has been going through a rough patch and now my heart's weighed down by emotions I struggle to explain. \n I'm sorry burden you with this, but I'm searching for a flower that might express the ache I feel in my heart.", pinkCarnation.primaryAttribute, pinkCarnation.specMeaning, pinkCarnation.secondaryAttribute);
    static CustomerPrompts promptStripedCarnation = new CustomerPrompts("I have a friend who's been pursuing me. I love them deeply, but not they way they love me. \n I've been trying to figure out how to convey my feeling and my regrets gently. \n What's a flower that says softly 'Sorry I can't'?", stripedCarnation.primaryAttribute, stripedCarnation.specMeaning, stripedCarnation.secondaryAttribute);
    static CustomerPrompts promptCyclamen = new CustomerPrompts("I need tell someone I love goodbye for a very long time. \n Do you know of a flower could express that?", cyclamen.primaryAttribute, cyclamen.specMeaning, cyclamen.secondaryAttribute);
    static CustomerPrompts promptAzalea = new CustomerPrompts("I love someone who hasn't yet realized it. They will be leaving the country for a while to study abroad. \n I only want them to stay safe and happy. \n Is there a flower that can express all that?", azalea.primaryAttribute, azalea.specMeaning, azalea.secondaryAttribute);
    static CustomerPrompts promptYellowDaffodils = new CustomerPrompts("My best friend is getting married soon, and I'm the best man. Between you and me, I've always had feelings for him. \n I'm planning to gift him flowers before the bachelor party. \n Call it a bit of morbid humor, but I'd like flowers that hint at my feelings.\n I'd never truly confess and ruin what he has with his future wife, but I just want this small subtle gesture.", yellowDaffodils.primaryAttribute, yellowDaffodils.specMeaning, yellowDaffodils.secondaryAttribute);
        // Anger Prompts
    static CustomerPrompts promptsAnemone = new CustomerPrompts("Someone who I thought cared for me has left me out to dry. I feel abandoned and hurt. \n I'm looking for flower that can capture my inner turmoil.", anemone.primaryAttribute, anemone.specMeaning);
    static CustomerPrompts promptsYellowChrysanthemum = new CustomerPrompts("I've been slighted in love and feel the sting. \n Could you sell me a flower that understands my pain", yellowChrysanthemum.primaryAttribute, yellowChrysanthemum.specMeaning);
    static CustomerPrompts promptsOrangeLily = new CustomerPrompts("I've just found out my husband is having an affair. \n I plan to expose him tomorrow after our 'date night'. \n I hate him dearly and so I'd like to give him our flower fitting of our 'bond", orangeLily.primaryAttribute, orangeLily.specMeaning);
    static CustomerPrompts promptsWhiteRose = new CustomerPrompts("I want to send flowers to my ex that tell her just how little she meant to me. \n I want her to know that she truly left no impression on me. \n What flowers do you would be best?", whiteRose.primaryAttribute, whiteRose.specMeaning);
         // Apology Prompts
    static CustomerPrompts promptsPurpleHyacinth = new CustomerPrompts("I've made a big mistake recently. I want a flower that conveys a heartfelt 'I'm sorry'. \n Any suggestions?", purpleHyacinth.primaryAttribute, purpleHyacinth.specMeaning);
    static CustomerPrompts promptsLilyOfTheValley = new CustomerPrompts("I've deeply hurt my wife. I'm planning to talk to her tonight and lay everything on the table. \n I hope that we can recover from my mistake. My goal is for us to return to happiness we once felt. \n Sorry for going off on a tangent. Do you have any flowers you'd recommend.", lilyOfTheValley.primaryAttribute, lilyOfTheValley.specMeaning);
    static CustomerPrompts promptsWhiteTulip= new CustomerPrompts("My husband and I had an argument recently and I went way to far. \n  I'd like buy him some flowers and make him a big dinner to make it up to him. I really just want his forgiveness. \n Do you have any recommendations for a good flowers to give him. ", whiteTulip.primaryAttribute, whiteTulip.specMeaning);
        // General Emotions
    static CustomerPrompts promptsBellsOfIreland = new CustomerPrompts("I have a son who has a soccer game soon. \n Could you recommend me a flower for to wish him luck.", bellsOfIreland.primaryAttribute, bellsOfIreland.specMeaning);
    static CustomerPrompts promptsCactus= new CustomerPrompts("My friend is really worried about her upcoming midterms. \n I'd like to give her a flower to show her to keep going! Any suggestions.", cactus.primaryAttribute, cactus.specMeaning);
    static CustomerPrompts promptsCrocus = new CustomerPrompts("I've been feeling particularly cheerful lately, and I'd just like to buy a flower to brighten up my apartment.", crocus.primaryAttribute, crocus.specMeaning);
    static CustomerPrompts promptsGarlic = new CustomerPrompts("I think my younger sister will be moving out soon and is nervous. \n I want gift her something that reminds her to be brave.", garlic.primaryAttribute, garlic.specMeaning);
    static CustomerPrompts promptsLavender = new CustomerPrompts("I admire someone from a distance and want to express my feelings.", lavender.primaryAttribute, lavender.specMeaning);
    static CustomerPrompts promptsWhiteHeather = new CustomerPrompts("My daughter got a job offer and is leaving the country. I'm so proud of her. \n She'll be so far from family. All I want is for to be safe and to find what's she's looking for. \n Do you have any plants you'd think She'd enjoy.", whiteHeather.primaryAttribute, whiteHeather.specMeaning);
    static CustomerPrompts promptsBouquetOfMatureRoses= new CustomerPrompts("I'm graduating soon, and I really owe a lot to my English Professor. I'd like buy a flower to thank him.", bouquetOfMatureRoses.primaryAttribute , bouquetOfMatureRoses.specMeaning);

    public static void delayedPrintln(String printedString,int delayInMS) throws InterruptedException{
        // Method Prints a string and delays the message for a given amount in milliseconds
        System.out.println(printedString);
        Thread.sleep(delayInMS);

    }
    public static void delayedPrint (String printedString, int delayInMS) throws InterruptedException {
        // Method is the same as DelayedPrintln, but doesn't print a new line
        System.out.print(printedString);
        Thread.sleep(delayInMS);
    }
    public static CustomerPrompts getRandomPrompt(int customNumTracker) throws InterruptedException {
        // Method grabs a random prompt from an Array containing all prompts
        customNumTracker ++;
        double generatedNum = Math.random() * (CustomerPrompts.allPrompts.size()-1);
        int randomIndex = (int) generatedNum;
        System.out.println();
        System.out.println();

        // Prints Customer: Current number
        delayedPrintln("Customer " + customNumTracker + ":",2500);
        CustomerPrompts generatedPrompt = CustomerPrompts.allPrompts.get(randomIndex);

        // returns the prompt generated
        delayedPrintln(generatedPrompt.prompt,4000);
        return generatedPrompt;
    }
    public static Flowers handleUserAnswer(Scanner userInput, CustomerPrompts generatedPrompt) throws InterruptedException{
       // Takes the user's response and picks out the corresponding flower and returns it
        int flowerIndex;
        String answer;

        System.out.println();

        delayedPrintln("Please type the number of the flower you think would be best for the customer",4600);
        flowerIndex = userInput.nextInt() -1;
        return Flowers.allFlowers.get(flowerIndex);

    }
    public static int assignPointsWithSecondaryAtt(Flowers chosenFlower, CustomerPrompts generatedPrompts) throws InterruptedException{
        // assigns points based on how close the player's flower and generated prompt is
            // Customers print a line based on their satisfaction
        int points = 0;
    if(generatedPrompts.specMeaning.equals(chosenFlower.specMeaning)){
        points = 8;

        System.out.println();
        delayedPrintln("Customer: That's perfect thank you!",2500);

    } else if(generatedPrompts.secondaryAttribute.equals(chosenFlower.secondaryAttribute)){
        points = 6;

        System.out.println();
        delayedPrintln("Customer: I like this a lot. Thanks",2500);
    }   else if(generatedPrompts.primaryAttribute.equals(chosenFlower.primaryAttribute)){
        points = 4;
        System.out.println();
        delayedPrintln("Customer: Hmm... I think this will work",2500);
    } else {
        System.out.println();
        delayedPrintln("Customer: This isn't really what I was looking for",2500);

    }
return points;
    }
    public static int assignPoints(Flowers chosenFlower, CustomerPrompts generatedPrompts) throws InterruptedException{
        // assigns points based on how close the player's flower and generated prompt is
         // Customers print a line based on their satisfaction
        int points = 0;
        if(generatedPrompts.specMeaning.equals(chosenFlower.specMeaning)){
            points = 8;
            System.out.println();
            delayedPrintln("Customer: That's perfect thank you!",2500);

        } else if(generatedPrompts.primaryAttribute.equals(chosenFlower.primaryAttribute)){
            points = 4;

            System.out.println();
            delayedPrintln("Customer: Hmm... I think this will work",2500);
        } else {
            System.out.println();
            delayedPrintln("Customer: This isn't really what I was looking for",2500);
        }
        return points;
    }
    public static void main(String[] args) throws InterruptedException{
        //basic variable set up
        Scanner userInput = new Scanner(System.in);
        String userResponse;
        int userPoints = 0;

        // Intro
        delayedPrintln("Welcome to the Blooming Boutique",1500);
             System.out.println();
             // Game explanation
        delayedPrintln("Customers will come in looking for flowers that meet their needs",2500);
           System.out.println();
        delayedPrintln("Your job is to listen closely to their situations and pick a fitting flower with your expert knowledge of flower language",3200);
           System.out.println();
        delayedPrintln("Don't worry too much if you can't find the exactly perfect flower. Just try to be as accurate as possible!",2500);
           System.out.println();

           // Allow user to review flowers
           delayedPrintln("Would you like to scroll through our flower catalogue to give yourself a refresher: Y or N",2500);
           userResponse = userInput.next();
         if (userResponse.equals("Y")){
             Flowers.printFlowerMeanings();

         } else {
             delayedPrintln("Okay!",2500);
         }
        delayedPrintln("The day will begin soon. Good luck!",2500);
         // Game play
            // Loop that handles are 5 customers
        for(int i =0; i < 5; i++) {
            // generate prompt
            CustomerPrompts currentPrompt = getRandomPrompt(i);

            // take user choice of flower
            Flowers chosenFlower = handleUserAnswer(userInput, currentPrompt);

           // check if the prompt has a secondary attribute
                // decide which method to use to assign points
            if (currentPrompt.hasSecondaryAttribute) {
                userPoints += assignPointsWithSecondaryAtt(chosenFlower, currentPrompt);
            } else {
                userPoints += assignPoints(chosenFlower, currentPrompt);

            }
            // formatting
            System.out.println();
            System.out.println();

            // print next customer or the shop is closed if the last customer was served
            if(i < 4) {
                delayedPrintln("Next Customer!", 3000);
            } else{
                delayedPrintln("The shop is closed!", 3000);
            }
            System.out.println();
        }
// End game
            // ending dialogue based on player's points at end of simulation
        System.out.println();
        delayedPrintln("Good work today!",2500);
        if (userPoints > 29){
                delayedPrintln("You had " + userPoints + " points.",2500);
                delayedPrintln("Nice work you earned an A",2500);

        } else if (userPoints < 29 && userPoints > 19 ){
            delayedPrintln("You had " + userPoints + " points.",2500);
            delayedPrintln("Solid job. You got a B",2500);

        } else {
            delayedPrintln("You had " + userPoints + " points.",2500);
            delayedPrintln("Solid effort. You got a C. Keep at it.",2500);

        }

    }
}