package Taller3;

public class Coche {
    private String marca;
    private String modelo;
    private static int contadorCoches = 0;

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        contadorCoches++; // cada vez que se crea un objeto, aumenta el contador
    }

    public static void mostrarContador() {
        System.out.println("Número de coches creados: " + contadorCoches);
    }
}

