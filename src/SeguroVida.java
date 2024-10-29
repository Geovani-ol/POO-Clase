public class SeguroVida extends Seguro {
    private int edad;

    public SeguroVida(String nombreTitular, double valorAsegurado, int edad) {
        super(nombreTitular, valorAsegurado);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public double calcularPrima() {
        int valorBase = 400;
        double valor = super.getValorAsegurado() * 0.015;
        double recargo = 0, prima;

        prima = valorBase + valor;

        if (getEdad() > 60) {
            recargo = prima * 0.25;
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
