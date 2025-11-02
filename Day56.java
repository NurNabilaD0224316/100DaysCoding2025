import java.util.Scanner;

public class Day56 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username;
        String nim;
        int percobaan = 0;
        boolean loginBerhasil = false;

        do {
            System.out.print("Masukkan Username: ");
            username = input.nextLine();

            System.out.print("Masukkan NIM: ");
            nim = input.nextLine(); // ubah jadi nextLine() karena nim berupa teks

            if (username.equalsIgnoreCase("Nbila") && nim.equals("D224316")) {
                System.out.println("Login Sebagai Pengguna");
                loginBerhasil = true;
            } else if (username.equalsIgnoreCase("Admin") && nim.equals("D0224316")) {
                System.out.println("Login Sebagai Admin");
                loginBerhasil = true;
            } else {
                System.out.println("Username atau NIM salah. Silakan coba lagi!");
                percobaan++;
            }

            if (percobaan == 3 && !loginBerhasil) {
                System.out.println("Login Gagal! Akun anda terblokir.");
            }

        } while (!loginBerhasil && percobaan < 3);
    }
}
