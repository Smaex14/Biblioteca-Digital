
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

public void registrarPrestamo(long idPrestamo) {
    
    //actualizar disponibilidad
    //agregar id prestamo con math random
}

public void registrarDevolucion() {
    
}

public void renovarPrestamo() {
    
}

}

