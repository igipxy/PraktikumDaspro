package JOBSHEET_11.Assignment;

import java.util.Scanner;

public class InvertedTriangle {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N (min 5): ");
        int N = scanner.nextInt();
        
        for (int i = N; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
