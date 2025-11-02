import java.util.Scanner;
public class Day56 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pinBenar = 1234;   
        int pin;             
        int percobaan = 0;     
        boolean akses = false; 

        do {
            System.out.print("Masukkan PIN Anda: ");
            pin = input.nextInt();

            if (pin == pinBenar) {
                System.out.println("PIN Benar. Selamat datang di sistem ATM!");
                akses = true; 
            } else {
                System.out.println("PIN Salah. Silakan coba lagi.");
                percobaan++; 
            }
            if (percobaan == 3 && !akses) {
                System.out.println("Akun anda terblokir karena 3 kali salah.");
            }

        } while (!akses && percobaan < 3); 
    }
}
