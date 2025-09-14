package com.mycompany.celular;

public class Celular {
    String marca;

    public Celular(String marca) {
        this.marca = marca;
    }

    public void mostrarMarca() {
        System.out.println("Marca: " + marca);
    }
}

class Main {
    public static void main(String[] args) {
        Celular c1 = new Celular("Nokia");

        // Error
        super.mostrarMarca();  
    }
}

