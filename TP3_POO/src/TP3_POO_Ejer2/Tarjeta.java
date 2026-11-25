package TP3_POO_Ejer2;

public class Tarjeta extends MedioPago {

    private String ultimosCuatroDigitos;

    public Tarjeta(String titular, String ultimosCuatroDigitos) {
        super(titular); 
        this.ultimosCuatroDigitos = ultimosCuatroDigitos;
    }

    @Override
    public void procesarPago(double monto) {

        if (monto > 0) {
            System.out.println("Pago con tarjeta");
            System.out.println("Titular: " + getTitular());
            System.out.println("Tarjeta terminada en: " + ultimosCuatroDigitos);
            System.out.println("Procesando pago por $" + monto);
        } else {
            System.out.println("Monto inválido: debe ser mayor que cero.");
        }
    }
}