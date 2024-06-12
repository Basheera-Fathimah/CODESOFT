import java.util.Scanner;
import java.util.Random;

public class NumberGame {

    private static final int MAX_ATTEMPTS = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain;
        int roundsWon = 0;
        int totalRounds = 0;

        do {
            int targetNumber = random.nextInt(100) + 1;
            boolean guessedCorrectly = false;
            int attempts = 0;
            
            System.out.println("I have generated a number between 1 and 100. Can you guess it?");

            do {
                System.out.printf("Attempt %d: Enter your guess: ", attempts + 1);
                
                while (!scanner.hasNextInt()) {
                    System.out.print("Invalid input. Please enter a number: ");
                    scanner.next(); // Clear the invalid input
                }
                
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == targetNumber) {
                    guessedCorrectly = true;
                    roundsWon++;
                    System.out.println("Congratulations! You've guessed the number correctly.");
                } else if (userGuess > targetNumber) {
                    System.out.println("Your guess is too high.");
                } else {
                    System.out.println("Your guess is too low.");
                }

                if (attempts >= MAX_ATTEMPTS && !guessedCorrectly) {
                    System.out.printf("You've used all %d attempts. The correct number was %d.%n", MAX_ATTEMPTS, targetNumber);
                    break;
                }

            } while (!guessedCorrectly && attempts < MAX_ATTEMPTS);

            totalRounds++;
            System.out.printf("Rounds Won: %d/%d%n", roundsWon, totalRounds);

            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.next().equalsIgnoreCase("yes");

        } while (playAgain);

        System.out.printf("Final Score: %d out of %d rounds won.%n", roundsWon, totalRounds);
        scanner.close();
    }
}
