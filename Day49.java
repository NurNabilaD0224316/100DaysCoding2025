import java.util.Scanner;

public class Day49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        String jenis = (angka % 2 == 0) ? "Genap" : "Ganjil";
        System.out.println("Angka " + angka + " adalah " + jenis);

        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

        String status = (nilai >= 60) ? "Lulus" : "Tidak Lulus";
        System.out.println("Status: " + status);

    }
}
