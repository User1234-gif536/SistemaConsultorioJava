package sistemaconsultoriojava;

public class Paciente {

    int idPaciente;
    String nombre;
    int edad;

    public Paciente(int idPaciente, String nombre, int edad) {
        this.idPaciente = idPaciente;
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDatos() {
        System.out.println("ID: " + idPaciente);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}