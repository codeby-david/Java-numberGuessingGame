                     JAVA NUMBER GUESSING GAME.


-This java game, the code generates a random number between zero to 100; The player guesses the generated random
number. The player should choose a number between 1 to 100 and should be an integer value.
The player guesses a number untils he/ she get it correct otherwise conitue guessing.

CODE EXPLANATION.

-Random Number Generation:

Random random = new Random(); creates a Random object.

int numberToGuess = random.nextInt(100) + 1; generates a random integer between 1 and 100.

Loop for Guessing:

-The while (!hasGuessedCorrectly) loop continues until the player guesses the correct number.

-Inside the loop, the player is prompted to enter a guess.

Input Validation:

-If the player enters a number less than 1 or greater than 100, they are prompted to enter a valid number, and the loop continues.

Checking the Guess:

-If the guess is correct, the loop ends, and the game congratulates the player.

-If the guess is too low or too high, the player is informed and prompted to guess again.

Closing the Scanner:

-scanner.close(); is used to close the Scanner object to avoid resource leaks.
