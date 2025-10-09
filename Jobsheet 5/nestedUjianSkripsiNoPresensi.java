import java.util.Scanner;

public class nestedUjianSkripsiNoPresensi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pesan;

        System.out.println("Apakah mahasiswa sudah bebas kompen? (Iya/Tidak): ");
        String bebasKompen = sc.nextLine() .trim();

        System.out.println("Masukkan jumlah log bimbingan  Pembimbing 1: ");
        int logBimbingan1 = sc.nextInt();
        System.out.println("Masukkan jumlah log bimbingan  Pembimbing 2: ");
        int logBimbingan2 = sc.nextInt();

        if(bebasKompen.equalsIgnoreCase("Iya")) {
            if(logBimbingan1 >= 8 && logBimbingan2 >= 4) {
                pesan = "Semua syarat sudah terpenuhi, mahasiswa dapat mengikuti ujian skripsi";
            } else if (logBimbingan1 < 8 && logBimbingan2 < 4) {
                pesan = "Gagal, jumlah log Pembimbing 1 kurang dari 8 dan Pembimbing 2 kurang dari 4";
            } else if (logBimbingan1 < 8) {
                pesan = "Gagal, jumlah log Pembimbing 1 kurang dari 8";
            } else {
                pesan = "Gagal, jumlah log Pembimbing 2 kurang dari 4";
            }
        } else {
            pesan = "Mahasiswa belum dapat mengikuti ujian skripsi, karena belum bebas kompen";
        }
        System.out.println(pesan);
        sc.close();
    }
}