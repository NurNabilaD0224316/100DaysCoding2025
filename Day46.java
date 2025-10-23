import java.util.Scanner;

public class Day46 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        System.out.println("=== MENU MAKANAN ===");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Mie Goreng");
        System.out.println("3. Sate Ayam");
        System.out.println("4. Bakso");
        System.out.println("5. Keluar");
        System.out.print("Pilih menu (1-5): ");
        pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Anda memilih Nasi Goreng. Harga: Rp15.000");
                break;
            case 2:
                System.out.println("Anda memilih Mie Goreng. Harga: Rp12.000");
                break;
            case 3:
                System.out.println("Anda memilih Sate Ayam. Harga: Rp20.000");
                break;
            case 4:
                System.out.println("Anda memilih Bakso. Harga: Rp10.000");
                break;
            case 5:
                System.out.println("Terima kasih, keluar dari program.");
                break;
            default:
                System.out.println("Pilihan tidak valid. Silakan pilih 1-5.");
        }
    }
}
