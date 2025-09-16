package bibliotecadigital;

public class datosUsuario {
    long idUsuario;
    String nombre;
    String email;
    String contraseña;
    estadoUsuario estado;

public datosUsuario(long idUsuario, String nombre, String email, String contraseña) {
    this.idUsuario = idUsuario;
    this.nombre = nombre;
    this.email = email;
    this.contraseña = contraseña;
    this.estado = estadoUsuario.pendiente; 
    }

public enum estadoUsuario {
    activo, inactivo, pendiente;
}

public void setEstado(estadoUsuario nuevoEstado) {
    this.estado = nuevoEstado;
}

@Override
    public String toString() {
    return  "Usuario " + idUsuario + "\nESTADO:" + estado + ": " + "\nNombre='" + nombre + '\'' +
            "\nEmail='" + email + '\''; 
}
}
