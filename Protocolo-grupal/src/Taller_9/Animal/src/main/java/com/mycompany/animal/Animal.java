package com.mycompany.animal;
public class Animal {
String especie;
public Animal(String especie){
    this.especie=especie;
}
public String getEspecie(){
    return especie;
}
public void  mostrarDatos(){
    System.out.println("La especie es: "+especie);
}
}
class Pez extends Animal{
    String tipodeAgua;
    public Pez(String especie, String tipodeAgua ) {
        super(especie);
        this.tipodeAgua=tipodeAgua;
    }
    @Override
    public void mostrarDatos(){
      super.mostrarDatos();
        System.out.println("Tipo de agua: "+tipodeAgua);
    }
}

