package Taller3;

public class TestTaller3 {
    public static void main(String[] args) {
        // Probando Coche Ej1
        Coche c1 = new Coche("Toyota", "Corolla");
        Coche c2 = new Coche("Honda", "Civic");
        Coche.mostrarContador();

        // Probando Matematicas Ej2
        System.out.println("5 + 3 = " + Matematicas.sumar(5, 3));
        System.out.println("10 - 4 = " + Matematicas.restar(10, 4));
        System.out.println("6 * 7 = " + Matematicas.multiplicar(6, 7));
        System.out.println("20 / 4 = " + Matematicas.dividir(20, 4));

        // Probando EjemploIncorrecto corregido Ej3
        EjemploIncorrecto e = new EjemploIncorrecto();
        e.mostrarNombre();
    }
}

