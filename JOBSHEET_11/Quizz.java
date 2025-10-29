package JOBSHEET_11;

import java.util.Random;
import java.util.Scanner;

public class Quizz {
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        char menu = 'y';
        do {
            int number = rand.nextInt(10) + 1;
            boolean success = false;
            
            do {
                System.out.print("Guess the number (1-10): ");
                int answer = input.nextInt();
                input.nextLine();
                
                if (answer < number) {
                    System.out.println("Too small! Try again.");
                } else if (answer > number) {
                    System.out.println("Too big! Try again.");
                } else {
                    success = true;
                    System.out.println("Congratulations! You guessed it right!");
                }
            } while (!success);
            
            System.out.print("Do you want to repeat the game? (y/n): ");
            menu = input.nextLine().charAt(0);
        } while (menu == 'y' || menu == 'Y');
    }
}
