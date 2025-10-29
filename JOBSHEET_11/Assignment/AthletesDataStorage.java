package JOBSHEET_11.Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class AthletesDataStorage {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] athletes = new String[4][5];
        String[] sports = {"Badminton", "Table Tennis", "Basketball", "Volleyball"};
        
        // Input athlete names
        for (int i = 0; i < sports.length; i++) {
            System.out.println("Enter names for " + sports[i] + " athletes:");
            for (int j = 0; j < 5; j++) {
                System.out.print("Athlete " + (j + 1) + ": ");
                athletes[i][j] = scanner.nextLine();
            }
            System.out.println();
        }
        
        // Display in ascending order
        for (int i = 0; i < sports.length; i++) {
            Arrays.sort(athletes[i]); // Sort names alphabetically
            System.out.println(sports[i] + " Athletes (Ascending Order):");
            for (int j = 0; j < 5; j++) {
                System.out.println((j + 1) + ". " + athletes[i][j]);
            }
            System.out.println();
        }
    }
}