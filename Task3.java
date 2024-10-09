import java.util.Scanner;
import java.util.Random;
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        while (true) {
            int targetNumber = random.nextInt(100) + 1; 
            int maxAttempts = 7;
            int attempts = 0;
            System.out.println("\nI have chosen a number between 1 and 100.");
            System.out.println("You have " + maxAttempts + " attempts to guess it.");

            while (attempts < maxAttempts) {
                System.out.print("Attempt " + (attempts + 1) + "/" + maxAttempts + ": Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess == targetNumber) {
                    System.out.println("Congratulations! correct number!");
                    break;
                } else if (guess < targetNumber) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }
            }
            if (attempts == maxAttempts) {
                System.out.println("Sorry, you're out of attempts! The correct number was " + targetNumber + ".");
            }
            System.out.print("want to play again? (yes/no): ");
            String playAgain = scanner.next().toLowerCase();
            if (!playAgain.equals("yes")) {
                System.out.println("Thanks for playing!");
                break;
            }
        }
        scanner.close();
    }
}