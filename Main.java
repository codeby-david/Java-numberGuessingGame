
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generate a random integer between 1 and 100
        int numberToGuess = random.nextInt(100) + 1;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100.");

        int yourNumber;
        boolean hasGuessedCorrectly = false;

        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            yourNumber = scanner.nextInt();

            // Validate the input
            if (yourNumber < 1 || yourNumber > 100) {
                System.out.println("Please enter a number between 1 and 100.");
                continue; // Skip the rest of the loop and ask for input again
            }

            // Check if the guess is correct
            if (yourNumber == numberToGuess) {
                System.out.println("Correct! You've guessed the number.");
                hasGuessedCorrectly = true;
            } else if (yourNumber < numberToGuess) {
                System.out.println("Your guess is too low. Try again.");
            } else {
                System.out.println("Your guess is too high. Try again.");
            }
        }

        scanner.close();
    }
}


