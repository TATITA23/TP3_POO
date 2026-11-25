package TP3_POO_Ejer2;

public class Main {
    public static void main(String[] args) {

        Tarjeta tarjeta = new Tarjeta("Mati", "4521");
        BilleteraVirtual billetera = new BilleteraVirtual("Mati", "Mercado Pago");

    
        tarjeta.procesarPago(15000.50);
        System.out.println();
        billetera.procesarPago(8200);

   
        System.out.println();
        tarjeta.procesarPago(-100);
    }
}