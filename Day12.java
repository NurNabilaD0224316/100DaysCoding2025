import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
       
        System.out.print("Masukkan Nama      : ");
        String nama = input.nextLine();

        System.out.print("Masukkan NIM       : ");
        String nim = input.nextLine();

        System.out.print("Masukkan Jurusan   : ");
        String jurusan = input.nextLine();

        System.out.print("Masukkan Alamat    : ");
        String fakultas = input.nextLine();

        System.out.print("Masukkan Umur      : ");
        int umur = input.nextInt();

        
        System.out.println("\n=== BIODATA MAHASISWA ===");
        System.out.println("Nama     : " + nama);
        System.out.println("NIM      : " + nim);
        System.out.println("Jurusan  : " + jurusan);
        System.out.println("Alamat   : " + fakultas);
        System.out.println("Umur     : " + umur + " tahun");
    }
}
