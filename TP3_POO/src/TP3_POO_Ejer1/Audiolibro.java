package TP3_POO_Ejer1;

public class Audiolibro extends MaterialDigital {

    public Audiolibro(String titulo) {
        super(titulo);
    }

    @Override
    public void mostrarDescripcion() {
        System.out.println("Audiolibro: " + getTitulo());
        System.out.println("Se puede escuchar");
    }
}