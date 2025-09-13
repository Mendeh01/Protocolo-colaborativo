package Taller4;

public class CochePrivate {
    private String marca;
    private String modelo;
    private double velocidadMaxima;

    public CochePrivate(String marca, String modelo, double velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public double getVelocidadMaxima() { return velocidadMaxima; }

    public void acelerar(double incremento) {
        if (incremento > 0) {
            velocidadMaxima += incremento;
        }
    }
}

