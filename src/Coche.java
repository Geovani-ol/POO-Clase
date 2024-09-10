public class Coche {

    public String marca;
    public String modelo;
    public int año;

    public Coche(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public void mostrarInformacion() {
        String info = String.join("",
                "Marca: " + this.marca,
                "\nModelo: " + this.modelo,
                "\nAño: " + this.año);

        System.out.println(info);
    }

    public int calcularEdadDelCoche(int añoActual) {
        return añoActual - this.año;
    }

}
