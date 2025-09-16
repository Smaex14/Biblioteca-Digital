
package Biblioteca;

public class ubicacion {
    String estante;
    int fila;
    String seccion;
    
public ubicacion(String estante, int fila, String seccion) {
    this.estante=estante;
    this.fila=fila;
    this.seccion=seccion;
    }
public String obtenerUbicacion(){
    return "Estante: " + estante + "\nFila: " + fila + "\nSección: " + seccion;

}
    
}


