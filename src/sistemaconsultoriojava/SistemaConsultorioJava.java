package sistemaconsultoriojava;

import java.util.Scanner;

public class SistemaConsultorioJava {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Usuario admin = new Usuario("Kevin65", "Kev589");

        String usuario;
        String contrasena;

        System.out.println("=== SISTEMA DE CONSULTORIO ===");

        System.out.print("Usuario: ");
        usuario = teclado.nextLine();

        System.out.print("Contraseña: ");
        contrasena = teclado.nextLine();

        if (!admin.iniciarSesion(usuario, contrasena)) {

            System.out.println("Acceso denegado");
            return;
        }

        System.out.println("Acceso concedido");

        Doctor doctor = null;
        Paciente paciente = null;
        Cita cita = null;

        int opcion;

        do {

            System.out.println("\nMENU PRINCIPAL");
            System.out.println("1. Registrar doctor");
            System.out.println("2. Registrar paciente");
            System.out.println("3. Crear cita");
            System.out.println("4. Mostrar informacion");
            System.out.println("5. Salir");

            System.out.print("Seleccione una opcion: ");
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("ID del doctor: ");
                    int idDoctor = teclado.nextInt();
                    teclado.nextLine();

                    System.out.print("Nombre del doctor: ");
                    String nombreDoctor = teclado.nextLine();

                    System.out.print("Especialidad: ");
                    String especialidad = teclado.nextLine();

                    doctor = new Doctor(idDoctor, nombreDoctor, especialidad);

                    System.out.println("Doctor registrado correctamente");
                    break;

                case 2:

                    System.out.print("ID del paciente: ");
                    int idPaciente = teclado.nextInt();
                    teclado.nextLine();

                    System.out.print("Nombre del paciente: ");
                    String nombrePaciente = teclado.nextLine();

                    System.out.print("Edad: ");
                    int edad = teclado.nextInt();
                    teclado.nextLine();

                    paciente = new Paciente(idPaciente, nombrePaciente, edad);

                    System.out.println("Paciente registrado correctamente");
                    break;

                case 3:

                    System.out.print("Fecha de la cita: ");
                    String fecha = teclado.nextLine();

                    System.out.print("Hora de la cita: ");
                    String hora = teclado.nextLine();

                    cita = new Cita(fecha, hora);

                    System.out.println("Cita creada correctamente");
                    break;

                case 4:

                    System.out.println("\n===== INFORMACION =====");

                    if (doctor != null) {
                        doctor.mostrarDatos();
                    } else {
                        System.out.println("No hay doctor registrado");
                    }

                    System.out.println();

                    if (paciente != null) {
                        paciente.mostrarDatos();
                    } else {
                        System.out.println("No hay paciente registrado");
                    }

                    System.out.println();

                    if (cita != null) {
                        cita.mostrarCita();
                    } else {
                        System.out.println("No hay cita registrada");
                    }

                    break;

                case 5:

                    System.out.println("Saliendo del sistema");
                    break;

                default:

                    System.out.println("Opcion no valida");
            }

        } while (opcion != 5);

    }
}