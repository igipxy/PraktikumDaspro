import java.util.Scanner;

public class midTermExamQ2 {
    public static void main(String[] args) {
        //this is for input scanner and declare the variable etc
        Scanner sc = new Scanner(System.in);

        String dayType;
        int age;
        double basePrice = 0;
        double discount = 0;
        double surcharge = 0;
        double finalPrice;

        // Input
        System.out.print("Enter day type (weekday/weekend): ");
        dayType = sc.nextLine();

        System.out.print("Enter age: ");
        age = sc.nextInt();

        // when input not valid
        if ((!dayType.equals("weekday") && !dayType.equals("weekend")) || age <= 0) {
            System.out.println("Invalid input! Please check your entries.");
        }

        // Base price
        if (dayType.equals("weekday")) {
            basePrice = 40000;

            if (age <= 12) discount = 0.50;       // 50% off
            else if (age >= 60) discount = 0.30;  // 30% off
            else discount = 0;                    // no no discount

        } else if (dayType.equals("weekend")) {
            basePrice = 50000;

            if (age <= 12) discount = 0.30;       // 30% off
            else if (age >= 60) discount = 0.10;  // 10% off
            else discount = 0;                    // no discount
        }

        // Apply discount
        finalPrice = basePrice - (basePrice * discount);

        // Apply surcharge for youth (18–25)
        if (age >= 18 && age <= 25) {
            surcharge = 0.05;
            finalPrice += basePrice * surcharge;
        }

        // Output
        System.out.println("--- CinemaGo Ticket Price ---");
        System.out.println("Day Type       : " + dayType);
        System.out.println("Age            : " + age);
        System.out.println("Base Price     : Rp" + basePrice);
        System.out.println("Discount       : " + (discount * 100) + "%");
        System.out.println("Surcharge      : " + (surcharge * 100) + "%");
        System.out.println("Final Price    : Rp" + finalPrice);
    }
}
