import java.util.Scanner;
public class Day58 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka N: ");
        int n = input.nextInt();
        
        int jumlah = 0;
        int kali = 1;

        System.out.print("Penjumlahan : ");
        for (int i = 1; i <= n; i++) {
            jumlah += i;
            System.out.print(i);
            if (i < n) {
                System.out.print("+");
            }
        }
        System.out.println(" = " + jumlah);
        
        System.out.print("Perkalian : ");
        for (int i = n; i >= 1; i--) {
            kali *= i;
            System.out.print(i);
            if (i > 1) {
                System.out.print("*");
            }
        }
        System.out.println(" = " + kali);

    }
}
