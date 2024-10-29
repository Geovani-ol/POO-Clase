public class SeguroAuto extends Seguro {
    private int edad;

    public SeguroAuto(String nombreTitular, double valorAsegurado, int edad) {
        super(nombreTitular, valorAsegurado);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public double calcularPrima() {
        int valorBase = 300;
        double valor = super.getValorAsegurado() * 0.05;
        double recargo = 0, prima;

        prima = valorBase + valor;

        if (getEdad() < 25) {
            recargo = prima * 0.15;
            prima += recargo;
            return prima;
        }
        return prima;
    }

    @Override
    public String detallesSeguro() {
        return super.detallesSeguro() + String.format("Edad del Titular: %d", getEdad());
    }
}
