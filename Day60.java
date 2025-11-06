import java.util.Scanner;
public class Day60 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan N: ");
        int N = input.nextInt();

        int totalGenap = 0;
        System.out.print("Genap :\n");
        for (int i = 2; i <= N; i += 2) {
            System.out.print(i);
            totalGenap += i;
            if (i + 2 <= N) {
                System.out.print("+");
            }
        }
        System.out.println(" = " + totalGenap);
        
        int totalGanjil = 0;
        System.out.print("Ganjil :\n");
        for (int i = N; i >= 1; i--) {
            if (i % 2 != 0) {
                System.out.print(i);
                totalGanjil += i;
                if (i - 2 > 1) { 
                    System.out.print("+");
                }
            }
        }
        System.out.println(" = " + totalGanjil);
    }
}
