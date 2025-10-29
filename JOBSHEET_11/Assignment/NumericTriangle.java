package JOBSHEET_11.Assignment;

import java.util.Scanner;

public class NumericTriangle {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N (min 3): ");
        int N = scanner.nextInt();
        
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

