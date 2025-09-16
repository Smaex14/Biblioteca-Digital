
package Biblioteca;
import java.util.*;

public class Prestamo {
   libro libro;
   //usuario
   long idPrestamo;
   Date fechaPrestamo;
   Date fechaDevolucion;
   boolean estadoPr;
   
public prestamo(libro libro, long idPrestamo, Date fechaPrestamo, Date fechaDevolucion,
        boolean estadoPr) {
    this.libro=libro;
    this.idPrestamo=idPrestamo;
    this.fechaPrestamo=fechaPrestamo;
    this.fechaDevolucion=fechaDevolucion;
    this.estadoPr=estadoPr;
}

public void registrarPrestamo() {
    
    this.idPrestamo = (long) (Math.random() * 9000000) + 10000000;

    this.fechaPrestamo = new Date();

    this.estadoPr = true;

    System.out.println("Préstamo registrado exitosamente.");
    System.out.println("ID del Préstamo: " + this.idPrestamo);
    System.out.println("Usuario: " + this.usuario.getNombre());
    System.out.println("Libro: " + this.libro.getTitulo());

public void registrarDevolucion() {

    this.fechaDevolucion = new Date();

    this.estadoPr = false;

    
    System.out.println("Devolución registrada exitosamente para el préstamo con ID: " + this.idPrestamo);
}

public void renovarPrestamo() {
  
    if (this.estadoPr) {

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.fechaDevolucion);
        calendar.add(Calendar.DAY_OF_YEAR, 7);
        this.fechaDevolucion = calendar.getTime();
        
        System.out.println("Préstamo renovado. La nueva fecha de devolución es: " + this.fechaDevolucion);
    } else {
        System.out.println("El préstamo no está activo y no puede ser renovado.");
    }
}

}


