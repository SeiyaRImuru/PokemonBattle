# Unit 3 Lab - Pokemon Battle #
The programming project for this segment is to program
a “starter” Pokémon battle sequence. This is a somewhat 
open-ended assignment, you may submit a basic 
program that runs 1 or 2 interactions, or a complete battle 
sequence. 

## Exercise 1
Write a method called battleStart() that introduces the battle, prompts the user to choose their first
Pokémon to battle, and outputs the pairing. battleStart() should also return the name of the Pokemon chosen. Your output should look something like this:

    Another trainer is issuing a challenge!

    Zebstrika appeared.

    Which Pokémon do you choose? Arcanine
    
    You chose Arcanine!

    It’s a Pokémon battle between Arcanine and Zebstrika! Go!

Call battleStart() from your main() method and store the name of the Pokemon in a variable.

## Exercise 2
Write a method called damage() that takes a Pokemon’s name as a parameter and returns the about of HP after damage has been done. damage() should prompt the user for their base stats in order to calculate damage.  Use the following equations for calculating damage:

    Modifier = Same Type Attack Bonus (STAB) \* Random
    Damage = Modifier * ((2*Level+10)/250 + (Attack/Defense)*Base + 2)

_Hint: The Pokémon game always selects a random number between 0.85 and 1.0._

Your output should look like this:

    Zebstrika used Thunderbolt!

    Trainer, what are your Arcanine’s stats?
    Level:
    Attack:
    Defense:
    Base:
    STAB:
    HP:

    Arcanine sustained 10 points damage. 
    HP, after damage, are now 70.

Call damage() from your main() method with the Pokemon’s name from Exercise 1 and store the return value (HP) in a variable.

## Exercise 3
Write a method called statsTable() that accepts the user’s Pokemon name, stats and learned moves as parameters, and outputs something similar to this image:

You are not required to align the columns of the tables in any fancy way, but if you do, use escape
sequences to align data. For your drawing, you may use code you’ve grabbed from the internet, or
recycle an image you created earlier in the year.

Sample output:

    Name      Alakazam
    Level     40
    ------------------------------
    HP        96
    ATTACK    52
    DEFENSE   51
    SP. ATK   121
    SP. DEF   81
    SPEED     107
    -------------------------------
    Moves Learned: Thunder Wave, Hidden Power, Psycho Cut, Recover
    
Call statsTable() from your main() method with the Pokemon’s name from Exercise 1 and the HP from Exercise 2 and any other values you’d like for the other parameters.

## Conclusion
In your completed project should include the following methods:
  - battleStart()
  - damage()
  - statsTable()

These methods should all be called in main() so that the player can experience the entire battle in one sitting.

## Learning Targets ##
* Understands how to structure an interactive programs by prompting the user for input.
* Shows an understanding of advanced static functions with proper return values and parameter types.
    * All three required methods are present and return what the prompts ask for. 
* Shows an understanding of order of operations and how expressions work by properly calculating pokemon damage. 

## Rubric (10 pts) ##
| Category | 4 | 3 | 2 | 1 |
|:--------:|---|---|---|---|
|Demonstrates Learning Targets (4pts) | Meets all targets | Meets only 2 | Meets only 1 | Doesn't show any attempt at the learning targets | 
| Style (2pts) | Demonstrates a strong understanding with flawless style | Minor style errors | Demonstrates low understanding of style | Code is unreadable | 
| Executes Properly (2pts) | Runs without any errors | Compiles and runs, but output seems buggy | Doesn't compile but due to minor errors | Large syntax errors left in the code | 
| Provided Diagrams (2pts) | Diagrams were complete | Provided partially done diagrams  | | Didn't even bother to complete the outlines| 

