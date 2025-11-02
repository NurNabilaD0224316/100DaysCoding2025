import java.util.Scanner;
public class Day56 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username;
        int pin;
        int percobaan = 0;
        boolean loginBerhasil = false;

        do {
            System.out.print("Masukkan Username: ");
            username = input.nextLine();

            System.out.print("Masukkan PIN: ");
            pin = input.nextInt();
            input.nextLine();

            if (username.equalsIgnoreCase("Nbila") && pin == 2804) {
                System.out.println("Login Sebagai Pengguna");
                loginBerhasil = true;
            } else {
                System.out.println("Username atau PIN salah. Silakan coba lagi!");
                percobaan++;
            }
            if (percobaan == 3 && !loginBerhasil) {
                System.out.println("Login Gagal! Akun anda terblokir.");
            }
            
        } while (!loginBerhasil && percobaan < 3);
    }
}
