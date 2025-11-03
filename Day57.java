import java.util.Scanner;
public class Day57 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        if (angka > 0) {
            for (int i = 1; i <= angka; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else if (angka < 0) {
            angka = Math.abs(angka);
            for (int i = angka; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else {
            System.out.println("kosong");
        }
    }
}
