# Blooming-Boutique
Help customers using your knowledge of flower language. This game is still in its very early stages.


## How It's Made:

**Concepts used:** inheritance, methods, and Arraylists.
I seperated this program into handling the player's turn, computer's turn, win conditions and quit condition. 

### Classes

 #### Flower
The program contains various flower objects classified into different categories like Love, Unrequited, Anger, Apology, and General Emotions. Each category has specific flowers representing emotions and feelings.

    Flower Categories
    Love Flowers: Flowers associated with expressing love in all forms.
    Unrequited Flowers: unrequited feelings.
    Anger Flowers: feelings of abandonment abd hatred.
    Apology Flowers: feelings of regret and forgiveness.
    General Emotional: more general emotions

      both Lover Flowers and Unequited Flowers are futher split into subcategories.
  
 #### Customer Prompts
 Contain various prompts of customers explaining their won

 ### Methods
delayedPrintln and delayedPrint: Print methods that simulate a delay for formatting reasons.

getRandomPrompt: Retrieves a random prompt from the available customer prompts.

handleUserAnswer: Takes the user's response and retrieves the corresponding flower.

assignPointsWithSecondaryAtt & assignPoints: Assign points to the player based on the accuracy of their flower selection.

## Game Flow

  Introduction
Welcomes the player to the Blooming Boutique and explains the game rules.
Allows the user to review the flower catalogue if they desire.

Gameplay:
Simulates interactions with 5 different customers.
For each customer:
- Generates a random prompt for a specific customer situation.
- Takes the user's input on which flower would best suit the situation.
- Assigns points based on the accuracy of the flower selection.

End of Game:
Provides closing remarks based on the total points earned during the game.
Grades the player's performance based on the points earned.

