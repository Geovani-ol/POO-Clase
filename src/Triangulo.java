public class Triangulo {

    public Double ladoUno;
    public Double ladoDos;
    public Double ladoTres;
    public Double altura;
    public Double base;

    public Triangulo(Double ladoUno, Double ladoDos, Double ladoTres, Double altura, Double base) {
        this.ladoUno = ladoUno;
        this.ladoDos = ladoDos;
        this.ladoTres = ladoTres;
        this.altura = altura;
        this.base = base;
    }
    
    public Double calcularArea() {
        return (this.base * this.altura) / 2;
    }
    
    public Double calcularPerimetro() {
        return this.ladoUno + this.ladoDos + this.ladoTres;
    }

    // Sobrecarga de métodos

    public Double calcularArea(Double base) {
        return (base * this.altura) / 2;
    }

    public Double calcularArea(Double base, Double altura) {
        return (base * altura) / 2;
    }

}
