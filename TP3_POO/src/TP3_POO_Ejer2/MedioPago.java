package TP3_POO_Ejer2;

public class MedioPago {

    private String titular;


    public MedioPago(String titular) {
        this.titular = titular;
    }


    public String getTitular() {
        return titular;
    }


    public void procesarPago(double monto) {
        System.out.println("Procesando pago por $" + monto);
    }
}