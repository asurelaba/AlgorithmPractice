public class CelciusToFarenheit {
    public static void main(String[] args) {
        //F = °C × (9/5) + 32
        System.out.println(celToFar(-100.0d));
    }

    public static double celToFar(double celsius){
        return celsius * (9.0/5) + 32.0;
    }
}
