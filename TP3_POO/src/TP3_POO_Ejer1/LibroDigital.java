package TP3_POO_Ejer1;

public class LibroDigital extends MaterialDigital {

    public LibroDigital(String titulo) {
        super(titulo);
    }

 
    @Override
    public void mostrarDescripcion() {
        System.out.println("Libro digital: " + getTitulo());
        System.out.println("Se puede leer en pantalla");
    }
}