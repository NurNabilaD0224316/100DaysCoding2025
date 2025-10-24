import java.util.Scanner;

public class Day47 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hari;

        System.out.print("Masukkan angka (1-7): ");
        hari = input.nextInt();

        switch (hari) {
            case 1:
                System.out.println("Hari Senin");
                break;
            case 2:
                System.out.println("Hari Selasa");
                break;
            case 3:
                System.out.println("Hari Rabu");
                break;
            case 4:
                System.out.println("Hari Kamis");
                break;
            case 5:
                System.out.println("Hari Jumat");
                break;
            case 6:
                System.out.println("Hari Sabtu");
                break;
            case 7:
                System.out.println("Hari Minggu");
                break;
            default:
                System.out.println("Angka yang dimasukkan tidak valid! Masukkan angka 1-7 saja.");
        }

    }
}
