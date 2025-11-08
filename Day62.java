import java.util.Scanner; 
public class Day62 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai N : ");
        int N = input.nextInt(); 
        int total = 0; 

        for (int i = 1; i <= N; i++) {
            total += i;
            System.out.print(i); 
            if (i < N) {
                System.out.print("+");
            }
        }
        System.out.print(" = " + total);
    }
}
