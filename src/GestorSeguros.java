public class GestorSeguros {

    public void seguros() {
        SeguroAuto seguroAuto = new SeguroAuto("Juan", 10000, 20);
        seguroAuto.calcularPrima();
        System.out.println(seguroAuto.detallesSeguro());

        System.out.println();

        SeguroAuto seguroAuto2 = new SeguroAuto("Maria", 10000, 30);
        seguroAuto2.calcularPrima();
        System.out.println(seguroAuto2.detallesSeguro());

        System.out.println("\n************************************************\n");

        SeguroHogar seguroHogar = new SeguroHogar("Rebeca", 30000, "Zona de riesgo");
        seguroHogar.calcularPrima();
        System.out.println(seguroHogar.detallesSeguro());

        System.out.println();

        SeguroHogar seguroHogar2 = new SeguroHogar("Pedro", 30000, "Zona de no riesgo");
        seguroHogar2.calcularPrima();
        System.out.println(seguroHogar2.detallesSeguro());

        System.out.println("\n************************************************\n");

        SeguroVida seguroVida = new SeguroVida("Rogelio", 60000, 65);
        seguroVida.calcularPrima();
        System.out.println(seguroVida.detallesSeguro());

        System.out.println();

        SeguroVida seguroVida2 = new SeguroVida("Martha", 60000, 48);
        seguroVida2.calcularPrima();
        System.out.println(seguroVida2.detallesSeguro());
    }

}
