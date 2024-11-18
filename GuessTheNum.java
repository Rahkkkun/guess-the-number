import java.util.Random;
import java.util.Scanner;

public class GuessTheNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(10) + 1; // Number between 1 and 50
        int attempts = 5;

        System.out.println("Guess the number between 1 and 10. You have 5 attempts!");

        while (attempts > 0) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts--;

            if (guess < number) {
                System.out.println("Too low! You have " + attempts + " attempts left.");
            } else if (guess > number) {
                System.out.println("Too high! You have " + attempts + " attempts left.");
            } else {
                System.out.println("Correct! The number was: " + number);
                break;
            }

            if (attempts == 0) {
                System.out.println("Out of attempts! The number was: " + number);
            }
        }
    }
}
