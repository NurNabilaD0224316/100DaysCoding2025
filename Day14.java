public class Day14{
    public static void main(String[] args) {
        // String
        String angkaStr = "123";
        String desimalStr = "45.67";
        String boolStr = "true";

        // String -> int
        int angka = Integer.parseInt(angkaStr);
        System.out.println("String ke int: " + angka);

        // String -> double
        double desimal = Double.parseDouble(desimalStr);
        System.out.println("String ke double: " + desimal);

        // String -> float
        float pecahan = Float.parseFloat(desimalStr);
        System.out.println("String ke float: " + pecahan);

        // String -> boolean
        boolean status = Boolean.parseBoolean(boolStr);
        System.out.println("String ke boolean: " + status);
    }
}
