public class Day36 {
    public static void main(String[] args) {
        int nilai = 85;

        if (nilai >= 75) {
            System.out.println("Kamu lulus");

            if (nilai >= 90) {
                System.out.println("Nilaimu sangat bagus!");
            } else {
                System.out.println("Nilaimu cukup baik.");
            }
        } else {
            System.out.println("Kamu belum lulus");
        }
    }
}
