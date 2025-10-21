import java.util.Scanner;

public class Day44 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai Anda : ");
        int nilai = input.nextInt();

        if (nilai < 0 || nilai > 100) {
            System.out.println("Nilai tidak valid! Masukkan angka antara 0 sampai 100.");
        } else {
            String predikat = "";

            if (nilai >= 90) {
                predikat = "A (Sangat Baik)";
            } else if (nilai >= 80) {
                predikat = "B (Baik)";
            } else if (nilai >= 70) {
                predikat = "C (Cukup)";
            } else if (nilai >= 60) {
                predikat = "D (Kurang)";
            } else {
                predikat = "E (Gagal)";
            }

            System.out.println("Nilai Anda   : " + nilai);
            System.out.println("Predikat     : " + predikat);
        }
    }
}
