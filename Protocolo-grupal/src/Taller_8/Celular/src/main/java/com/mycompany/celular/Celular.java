package com.mycompany.Celular;
//caso 1
//clase  1
class Celular1 {
    String marca;
    public Celular1(String marca){
        this.marca = marca;
    }
}

// Clase 2
class Camara {
    int megapixeles;
    public Camara(int megapixeles){
        this.megapixeles = megapixeles;
    }
}

// no se pueden herredar dos clases
//class Smartphone extends Celular, Camara {
    //public Smartphone(String marca, int megapixeles){
        //super(marca);
   // }

//caso 2

// Clase base con atributos privados
class Celular {
    private String marca;
    private double precio;

    public Celular(String marca, double precio){
        this.marca = marca;
        this.precio = precio;
    }
}
  
// Clase derivada
class Smartphone extends Celular {
    String sistemaOperativo;

    public Smartphone(String marca, double precio, String sistemaOperativo){
        super(marca, precio);
        this.sistemaOperativo = sistemaOperativo;
    }

    public void mostrarInfo(){
        //no se pueden aceder
        System.out.println("Sistema Operativo: " + sistemaOperativo);
    }
}


