package sistemaconsultoriojava;

public class Doctor {

    int idDoctor;
    String nombre;
    String especialidad;

    public Doctor(int idDoctor, String nombre, String especialidad) {
        this.idDoctor = idDoctor;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public void mostrarDatos() {
        System.out.println("ID: " + idDoctor);
        System.out.println("Nombre: " + nombre);
        System.out.println("Especialidad: " + especialidad);
    }
}