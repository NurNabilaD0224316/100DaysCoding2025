import java.util.Scanner;
public class Day65 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai N : ");
        int N = input.nextInt();

        int hasil = 1;   
        for (int i = 1; i <= N; i++) {
            hasil = hasil * i;  
        }
        System.out.println("Faktorial : " + hasil);
    }
}
