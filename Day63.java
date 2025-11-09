import java.util.Scanner;
public class Day63 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai N : ");
        int N = input.nextInt();
        int b = 1; 
        
        for (int i = 1; i <= N; i++) {
            System.out.print(i);
            
            if (i < N) {
                System.out.print("*");
            }
            b *= i; 
        }
        System.out.println(" = " + b);
    }
}
