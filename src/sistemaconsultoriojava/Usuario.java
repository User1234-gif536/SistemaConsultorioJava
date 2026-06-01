package sistemaconsultoriojava;

public class Usuario {

    String usuario;
    String contrasena;

    public Usuario(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public boolean iniciarSesion(String usuario, String contrasena) {
        return this.usuario.equals(usuario)
                && this.contrasena.equals(contrasena);
    }
}
