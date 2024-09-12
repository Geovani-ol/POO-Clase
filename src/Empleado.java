public class Empleado {

    public void calcularSalario(Double sueldo) {
        System.out.println("El sueldo del empleado es: " + sueldo);
    }

    public void calcularSalario(Double sueldo, Double bonificacion) {
        System.out.println("El sueldo más bonificación del empleado es: " + (sueldo + bonificacion));
    }

    public void calcularSalario(Double sueldo, Double bonificacion, Double horasExtra) {
        System.out.println("El sueldo más bonificación más las horas extras del empleado es: " + (sueldo + bonificacion + (horasExtra * 20)));
    }

}
