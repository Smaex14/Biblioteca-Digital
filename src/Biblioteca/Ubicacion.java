/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca;

/**
 * Clase que representa la ubicación física de un libro en la biblioteca.
 * Contiene el estante, la fila y la sección donde se encuentra el libro.
 */
public class Ubicacion {

    // Atributos privados según el diagrama
    private String estante;
    private int fila;
    private String seccion;

    /**
     * Constructor para crear una nueva ubicación.
     * @param estante El número o nombre del estante.
     * @param fila El número de la fila en el estante.
     * @param seccion La sección a la que pertenece el libro (ej. "Novela", "Historia").
     */
    public Ubicacion(String estante, int fila, String seccion) {
        this.estante = estante;
        this.fila = fila;
        this.seccion = seccion;
    }

    // --- Métodos de acceso (getters) ---

    public String getEstante() {
        return estante;
    }

    public int getFila() {
        return fila;
    }

    public String getSeccion() {
        return seccion;
    }

    /**
     * Devuelve la ubicación completa como una cadena de texto.
     * @return Una cadena formateada que describe la ubicación física.
     */
    public String obtenerUbicacion() {
        return "Sección: " + seccion + ", Estante: " + estante + ", Fila: " + fila;
    }
}
