package sistemaconsultoriojava;

public class Cita {

    String fecha;
    String hora;

    public Cita(String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }

    public void mostrarCita() {
        System.out.println("Fecha: " + fecha);
        System.out.println("Hora: " + hora);
    }
}