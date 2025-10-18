import java.util.Scanner;

public class Evaluasi5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        int D = input.nextInt();


        int kiri = A*D;
        int kanan = C*B;

        if (kiri == kanan ) {
            System.out.println("sama");
        } else if (kiri<kanan) {
            System.out.println("lebih kecil");
        }else {
            System.out.println("lebih besar");

        }


    }
    }
