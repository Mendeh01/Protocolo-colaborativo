package Taller3;

public class EjemploIncorrecto {
    private String nombre = "Sebas";

    /*
    public static void mostrarNombre() {
        System.out.println(nombre);
    }// ERROR
    */

    // Corrección: hacerlo no static
    public void mostrarNombre() {
        System.out.println("Nombre: " + nombre);
    }
}

