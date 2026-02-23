
class Estudiante {
    String nombre;
    int edad;

    // Constructor
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}

public class Main {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Ebony", 19);
        e1.mostrarDatos();
    }
}

