import java.util.Scanner;

public class ifcetakKRSnopresensi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("---Cetak KRS SIAKAD---");
        System.out.print("apakah UKT sudah lunas? (True/False): ");
        boolean uktLunas = input.nextBoolean();

        if (uktLunas) {
            System.out.println("Pembayaran UKT Terferifikasi");
        } else {
            System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
        }
        
        input.close();
    }   

}