package com.mycompany.empleado;
public class Empleado {
    String nombre;
    double salario;
    public Empleado(String nombre, double salario){
        this.nombre=nombre;
        this.salario=salario;
    }
    public String getNombre(){
        return nombre;
    }
    public double getSalario(){
        return salario;
    }
    public void mostrarDetalles(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Salario: "+salario);
       
    }
}
class Gerente extends Empleado{
    String departamento;
    public Gerente(String nombre, double salario,String departamento) {
        super(nombre, salario);
        this.departamento=departamento;
    }
    @Override
    public void mostrarDetalles(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Salario: "+salario);
        System.out.println("Departamento: "+departamento);
    }
}
class Main{

    public static void main(String[] args) {
Empleado e1= new Empleado("Raul",1700);
Gerente g1=new Gerente("Pepe",17200,"Comerico");
e1.mostrarDetalles();
g1.mostrarDetalles();
    }
}