
package Biblioteca;

import java.util.List;
import java.util.ArrayList;

enum EstadoUsuario {
    ACTIVO, INACTIVO, PENDIENTE
}


public class Usuario {

    private String idUsuario;
    private String nombre;
    private String email;
    private String contraseña;
    private EstadoUsuario estado;

    public Usuario(String idUsuario, String nombre, String email, String contraseña) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
        this.estado = EstadoUsuario.PENDIENTE; 
    }

    public void registrar() {
    if (this.estado == EstadoUsuario.PENDIENTE) {
        this.estado = EstadoUsuario.ACTIVO;
        System.out.println("Usuario registrado exitosamente.");
    } else {
        System.out.println("El usuario ya está registrado o no puede registrarse.");
    }
}

public void darDeBaja() {
    if (this.estado == EstadoUsuario.ACTIVO) {
        this.estado = EstadoUsuario.INACTIVO;
        System.out.println("Usuario ha sido dado de baja.");
    } else {
        System.out.println("El usuario no está activo.");
    }
}

public boolean iniciarSesion(String emailIngresado, String contrasenaIngresada) {
    if (this.estado == EstadoUsuario.ACTIVO &&
        this.email.equals(emailIngresado) &&
        this.contraseña.equals(contrasenaIngresada)) {
        System.out.println("Inicio de sesión exitoso.");
        return true;
    }
    System.out.println("Inicio de sesión fallido, intente de nuevo.");
    return false;
}

public void cambiarContrasena(String nuevaContrasena) {
    if (nuevaContrasena != null && !nuevaContrasena.isEmpty()) {
        this.contraseña = nuevaContrasena;
        System.out.println("Contraseña actualizada.");
    } else {
        System.out.println("La nueva contraseña no es válida.");
    }
}

public List<Libro> buscarLibro(CriterioBusqueda criterio) {
    System.out.println("Buscando libros con criterio: " + criterio.getPalabraClave());
    return Biblioteca.buscarLibros(Criterio);
}

public boolean descargarLibro(Libro libro) {
    boolean resultado = Biblioteca.descargar(libro);
    System.out.println(resultado ? "Descarga exitosa." : "Descarga fallida.");
    return resultado;
}

public boolean renovarPrestamo(Prestamo prestamo) {
    boolean resultado = Biblioteca.renovar(prestamo);
    System.out.println(resultado ? "Préstamo renovado." : "No se pudo renovar el préstamo.");
    return resultado;
}
}

