package JOBSHEET_11.Assignment;

import java.util.Scanner;

public class SquareDisplay {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N (min 3): ");
        int N = scanner.nextInt();
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(N + " ");
            }
            System.out.println();
        }
    }
}
