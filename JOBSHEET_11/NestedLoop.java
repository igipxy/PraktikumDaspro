package JOBSHEET_11;

import java.util.Scanner;

public class NestedLoop {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] temps = new double[5][7];
        
        // Input temperatures
        for (int i = 0; i < temps.length; i++) {
            System.out.println("City: " + i);
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Day " + (j + 1) + ": ");
                temps[i][j] = scanner.nextDouble();
            }
            System.out.println();
        }
        
        // Display using foreach
        System.out.println("Temperatures using foreach:");
        for (double[] cityTemps : temps) {
            for (double temp : cityTemps) {
                System.out.print(temp + " ");
            }
            System.out.println();
        }
        
        // Display averages
        System.out.println("\nAverage temperatures for each city:");
        for (int i = 0; i < temps.length; i++) {
            double sum = 0;
            for (int j = 0; j < temps[0].length; j++) {
                sum += temps[i][j];
            }
            double average = sum / temps[0].length;
            System.out.println("City " + i + ": " + average);
        }
    }
}
