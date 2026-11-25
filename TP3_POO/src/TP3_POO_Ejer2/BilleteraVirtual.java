package TP3_POO_Ejer2;

public class BilleteraVirtual extends MedioPago {

    private String nombreAplicacion;

    public BilleteraVirtual(String titular, String nombreAplicacion) {
        super(titular);
        this.nombreAplicacion = nombreAplicacion;
    }

    @Override
    public void procesarPago(double monto) {
        if (monto > 0) {
            System.out.println("Pago con billetera virtual");
            System.out.println("Titular: " + getTitular());
            System.out.println("Aplicación: " + nombreAplicacion);
            System.out.println("Procesando pago por $" + monto);
        } else {
            System.out.println("Monto inválido: debe ser mayor que cero.");
        }
    }
}