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
public void mostrarDetalles(){
    System.out.println("El nombre es: "+nombre);
    System.out.println("La edad es: "+edad);
}
}

class Empleado extends Persona{
    String departamento;
        public Empleado(String nombre, int edad, String departamento) {
            super(nombre, edad);
            this.departamento=departamento;
        }
    @Override
        public void mostrarDetalles(){
          super.mostrarDetalles();
            System.out.println("Departamento: "+departamento);
        }
}
class Main{
public static void main(String[] args) {
Persona p1= new Persona("Raul",17);
Empleado e1 = new Empleado("Alonso", 20, "Ninguno");

    System.out.println("Persona:");
    p1.mostrarDetalles();
    System.out.println("Empleado:");
    e1.mostrarDetalles();
    }
}
