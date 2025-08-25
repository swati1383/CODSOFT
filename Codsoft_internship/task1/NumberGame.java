import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int totalScore = 0;
        boolean playAgain;

        do {
            int randomNumber = random.nextInt(100) + 1; // Generate random number between 1 and 100
            int attempts = 0;
            int maxAttempts = 10; // Limit the number of attempts
            boolean guessedCorrectly = false;

            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("Guess the number between 1 and 100. You have " + maxAttempts + " attempts.");

            while (attempts < maxAttempts && !guessedCorrectly) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess < randomNumber) {
                    System.out.println("Too low!");
                } else if (userGuess > randomNumber) {
                    System.out.println("Too high!");
                } else {
                    guessedCorrectly = true;
                    System.out.println("Correct! You've guessed the number in " + attempts + " attempts.");
                    totalScore++;
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry! You've used all attempts. The number was: " + randomNumber);
            }

            System.out.println("Your current score: " + totalScore);
            System.out.print("Would you like to play again? (true/false): ");
            playAgain = scanner.nextBoolean();

        } while (playAgain);

        System.out.println("Thank you for playing! Your final score: " + totalScore);
        scanner.close();
    }
}
