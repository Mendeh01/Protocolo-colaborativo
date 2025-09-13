package Taller4;

public class TestTaller4 {
    public static void main(String[] args) {
        // Probando Estudiante Ej1
        Estudiante est = new Estudiante("Camila", 23, 4.9);
        System.out.println("Nombre: " + est.getNombre());
        System.out.println("Edad: " + est.getEdad());
        System.out.println("Nota promedio: " + est.getNotaPromedio());

        // Probando CochePrivate ej2
        CochePrivate cp = new CochePrivate("Ford", "Fiesta", 180);
        System.out.println("Velocidad inicial: " + cp.getVelocidadMaxima());
        cp.acelerar(20);
        System.out.println("Velocidad después de acelerar: " + cp.getVelocidadMaxima());
    }
}

