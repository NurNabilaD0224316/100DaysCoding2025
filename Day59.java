import java.util.Scanner;
public class Day59 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan N: ");
        int N = input.nextInt();

        for (int i = 2; i <= N; i += 2) {
            System.out.print(i);
            if (i + 2 <= N) {
                System.out.print(" - ");
            }
        }
        System.out.println();

        for (int i = N; i >= 1; i--) {
            if (i % 2 != 0) {
                System.out.print(i);
                if (i - 2 > 0) {
                    System.out.print(" - ");
                }
            }
        }
    }
}
