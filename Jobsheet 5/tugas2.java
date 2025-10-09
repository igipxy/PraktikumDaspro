import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan sebuah bilangan bulat: ");
        if (sc.hasNextInt()) {
            System.out.println("Input bukan bilangan bulat.");
            sc.close();
            return;
        }
        int angka = sc.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Genap");
        } else {
            System.out.println("Ganjil");
        }

        sc.close();
    }
}
