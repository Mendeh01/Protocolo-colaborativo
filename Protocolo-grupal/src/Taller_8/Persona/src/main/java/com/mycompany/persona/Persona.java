package com.mycompany.persona;
public class Persona {
    String nombre;
    int edad;
    public Persona(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public void mostrarInformacion(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
       
    }
}
class Estudiante extends Persona{
    String matricula;
    public Estudiante(String nombre, int edad,String matricula) {
        super(nombre, edad);
        this.matricula=matricula;
    }
    @Override
    public void mostrarInformacion(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Matricula: "+matricula);
    }
}
class Main{

    public static void main(String[] args) {
Persona p1= new Persona("Raul",17);
Estudiante e1=new Estudiante("Raul",17,"Si");
p1.mostrarInformacion();
e1.mostrarInformacion();
    }
}
