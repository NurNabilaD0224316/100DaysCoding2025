import java.util.Scanner;
public class Day55 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan batas bawah: ");
        int batasBawah = input.nextInt();

        System.out.print("Masukkan batas atas: ");
        int batasAtas = input.nextInt();

        System.out.print("Masukkan sebuah angka: ");
        int angka = input.nextInt();

        if (angka >= batasBawah && angka <= batasAtas) {
            System.out.println("YAYAYAYA");
        } else {
            System.out.println("NONONONO");
        }
    }
}
