import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Tipe pengguna (Lecture/student): ");
        String user = sc.nextLine();
        if (user.equals("lecture")) {
            System.out.println("WIFI access granted (lecture)");
        } else if (user.equals("student")) {
            System.out.print("Masukkan jumlah kredit: ");
            int kredit = sc.nextInt();
            if (kredit >= 12) {
                System.out.println("WIFI access granted (active student)");
            } else {
                System.out.println("access denied");
            }
        } else {
            System.out.println("access denied");
        }

        sc.close();
    }
}
