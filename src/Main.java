public class Main {

    public static void main(String[] args) {

        try {
            int n = 0;
            int m = 0;
            int numero = n/m;
            System.out.println("Resultado: " + numero);
        } catch (Exception e) {
            System.out.println("No se puede String a int: " + e);
        } finally {
            int a = 2, b = 9;
            int suma = a + b;
            System.out.println("Resultado de la suma: " + suma);
        }

    }

}