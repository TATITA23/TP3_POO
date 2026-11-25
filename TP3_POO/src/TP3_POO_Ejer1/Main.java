package TP3_POO_Ejer1;

public class Main {
    public static void main(String[] args) {

        LibroDigital libro = new LibroDigital("Rayuela");
        Audiolibro audio = new Audiolibro("El Aleph");

        libro.mostrarDescripcion();
        System.out.println();
        audio.mostrarDescripcion();
    }
}