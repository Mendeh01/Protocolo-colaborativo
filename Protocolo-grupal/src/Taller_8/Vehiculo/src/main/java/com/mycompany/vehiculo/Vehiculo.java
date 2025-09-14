package com.mycompany.vehiculo;
public class Vehiculo {
    String marca;
    double velocidadmax;
    public Vehiculo(String marca, double velocidadmax){
        this.marca=marca;
        this.velocidadmax=velocidadmax;
    }
    public String getMarca(){
        return marca;
    }
    public double getVelocidadmax(){
        return velocidadmax;
    }
  public void mostrarInformacion(){
      System.out.println("Marca: "+marca);
      System.out.println("Velocidad maxima: "+velocidadmax);
  }
}
  class Coche extends Vehiculo{
        int numeroDePuertas;
        public Coche(String marca, double velocidadmax,int numeroDePuertas ) {
            super(marca, velocidadmax);
            this.numeroDePuertas=numeroDePuertas;
        }
        @Override
        public void mostrarInformacion(){
            System.out.println("Marca: "+marca);
            System.out.println("Velocidad maxima: "+velocidadmax);
            System.out.println("Numero de puertas: "+numeroDePuertas);
        }
    }
class Main{
    public static void main(String[] args) {
Vehiculo v1= new Vehiculo("Audi",100);
Coche c1= new Coche("Nisan",30,4);
v1.mostrarInformacion();
c1.mostrarInformacion();
    }
}
