import java.util.Scanner;

public class SistemKelulusan {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
        
        // Input nama mahasiswa
        System.out.print("Masukkan Nama Mahasiswa: ");
        String nama = input.nextLine();
        
        // === MATA KULIAH 1: ALGORITMA DAN PEMROGRAMAN ===
        System.out.println("\n=== Algoritma dan Pemrograman ===");
        System.out.print("Masukkan Nilai UTS: ");
        double utsAlgoritma = input.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        double uasAlgoritma = input.nextDouble();
        System.out.print("Masukkan Nilai Tugas: ");
        double tugasAlgoritma = input.nextDouble();
        
        // Hitung nilai akhir Algoritma (UTS 30%, UAS 40%, Tugas 30%)
        double nilaiAkhirAlgoritma = (utsAlgoritma * 0.3) + (uasAlgoritma * 0.4) + (tugasAlgoritma * 0.3);
        
        // === MATA KULIAH 2: STRUKTUR DATA ===
        System.out.println("\n=== Struktur Data ===");
        System.out.print("Masukkan Nilai UTS: ");
        double utsStrukturData = input.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        double uasStrukturData = input.nextDouble();
        System.out.print("Masukkan Nilai Tugas: ");
        double tugasStrukturData = input.nextDouble();
        
        // Hitung nilai akhir Struktur Data
        double nilaiAkhirStrukturData = (utsStrukturData * 0.3) + (uasStrukturData * 0.4) + (tugasStrukturData * 0.3);
        
        // === KONVERSI NILAI KE HURUF & STATUS KELULUSAN ===
        
        // Algoritma dan Pemrograman
        String nilaiHurufAlgoritma;
        String statusAlgoritma;
        
        if (nilaiAkhirAlgoritma >= 80) {
            nilaiHurufAlgoritma = "A";
        } else if (nilaiAkhirAlgoritma >= 75) {
            nilaiHurufAlgoritma = "B+";
        } else if (nilaiAkhirAlgoritma >= 70) {
            nilaiHurufAlgoritma = "B";
        } else if (nilaiAkhirAlgoritma >= 65) {
            nilaiHurufAlgoritma = "C+";
        } else if (nilaiAkhirAlgoritma >= 60) {
            nilaiHurufAlgoritma = "C";
        } else if (nilaiAkhirAlgoritma >= 50) {
            nilaiHurufAlgoritma = "D";
        } else {
            nilaiHurufAlgoritma = "E";
        }
        
        if (nilaiAkhirAlgoritma >= 60) {
            statusAlgoritma = "LULUS";
        } else {
            statusAlgoritma = "TIDAK LULUS";
        }
        
        // Struktur Data
        String nilaiHurufStrukturData;
        String statusStrukturData;
        
        if (nilaiAkhirStrukturData >= 80) {
            nilaiHurufStrukturData = "A";
        } else if (nilaiAkhirStrukturData >= 75) {
            nilaiHurufStrukturData = "B+";
        } else if (nilaiAkhirStrukturData >= 70) {
            nilaiHurufStrukturData = "B";
        } else if (nilaiAkhirStrukturData >= 65) {
            nilaiHurufStrukturData = "C+";
        } else if (nilaiAkhirStrukturData >= 60) {
            nilaiHurufStrukturData = "C";
        } else if (nilaiAkhirStrukturData >= 50) {
            nilaiHurufStrukturData = "D";
        } else {
            nilaiHurufStrukturData = "E";
        }
        
        if (nilaiAkhirStrukturData >= 60) {
            statusStrukturData = "LULUS";
        } else {
            statusStrukturData = "TIDAK LULUS";
        }
        
        // === HITUNG RATA-RATA DAN STATUS SEMESTER (NESTED IF) ===
        double rataRata = (nilaiAkhirAlgoritma + nilaiAkhirStrukturData) / 2;
        String statusSemester;
        
        // Nested If untuk menentukan status semester
        if (statusAlgoritma.equals("LULUS") && statusStrukturData.equals("LULUS")) {
            // Jika kedua mata kuliah LULUS, cek rata-rata
            if (rataRata >= 70) {
                statusSemester = "LULUS";
            } else {
                statusSemester = "TIDAK LULUS";
            }
        } else {
            // Jika salah satu atau kedua tidak lulus
            statusSemester = "TIDAK LULUS";
        }
        
        // === OUTPUT HASIL ===
        System.out.println("\n========================================");
        System.out.println("HASIL EVALUASI KELULUSAN");
        System.out.println("========================================");
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("\n--- Algoritma dan Pemrograman ---");
        System.out.println("Nilai Akhir: " + nilaiAkhirAlgoritma);
        System.out.println("Nilai Huruf: " + nilaiHurufAlgoritma);
        System.out.println("Status: " + statusAlgoritma);
        
        System.out.println("\n--- Struktur Data ---");
        System.out.println("Nilai Akhir: " + nilaiAkhirStrukturData);
        System.out.println("Nilai Huruf: " + nilaiHurufStrukturData);
        System.out.println("Status: " + statusStrukturData);
        
        System.out.println("\n--- Status Semester ---");
        System.out.println("Rata-rata Nilai Akhir: " + rataRata);
        System.out.println("Status Semester: " + statusSemester);
        System.out.println("========================================");
        
        }
    }
}