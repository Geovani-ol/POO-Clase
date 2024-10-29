public abstract class Seguro {
    private String nombreTitular;
    private double valorAsegurado;

    public Seguro(String nombreTitular, double valorAsegurado) {
        this.nombreTitular = nombreTitular;
        this.valorAsegurado = valorAsegurado;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public double getValorAsegurado() {
        return valorAsegurado;
    }

    public abstract double calcularPrima();

    public String detallesSeguro() {
        return String.format("""
                        Titular: %s
                        Valor Asegurado %s
                        Prima Calculada: %s%n""",
                getNombreTitular(),
                getValorAsegurado(),
                this.calcularPrima());
    }
}
