public class Day21 {
    public static void main(String[] args) {
        int a = 15;
        int b = 20;
        System.out.println("Sebelum tukar: a = " + a + " b = " + b);
      
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Sesudah tukar: a = " + a + " b = " + b);
    
	}
}
