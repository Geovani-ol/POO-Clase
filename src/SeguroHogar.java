public class SeguroHogar extends Seguro {
    private String zona;

    public SeguroHogar(String nombreTitular, double valorAsegurado, String zona) {
        super(nombreTitular, valorAsegurado);
        this.zona = zona;
    }

    public String getZona() {
        return zona;
    }

    @Override
    public double calcularPrima() {
        int valorBase = 500;
        double valor = super.getValorAsegurado() * 0.02;
        double recargo = 0, prima;

        prima = valorBase + valor;

        if (getZona().equals("Zona de riesgo")) {
            recargo = prima * 0.20;
            prima += recargo;
            return prima;
        }
        return prima;
    }

    @Override
    public String detallesSeguro() {
        return super.detallesSeguro() + String.format("Zona: %s", getZona());
    }
}
