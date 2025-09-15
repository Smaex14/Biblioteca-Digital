/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca;

// Las siguientes clases/enums se asumen que existen o deben ser creadas
// enum TipoColeccion { ... }
// class Ubicacion { ... }
// enum FormatoCita { ... }

/**
 * Clase que representa un libro en la biblioteca.
 * Contiene todos los metadatos y el estado del libro.
 */
public class Libro {

    // Atributos privados según el diagrama
    private String idLibro;
    private String titulo;
    private String autor;
    private String tema;
    private String resumen;
    private TipoColeccion tipoColeccion;
    private String isbn;
    private int numPaginas;
    private boolean disponible;
    private Ubicacion ubicacionFisica;

    /**
     * Constructor para crear un nuevo libro.
     */
    public Libro(String idLibro, String titulo, String autor, String tema, String resumen,
                 TipoColeccion tipoColeccion, String isbn, int numPaginas,
                 boolean disponible, Ubicacion ubicacionFisica) {
        this.idLibro = idLibro;
        this.titulo = titulo;
        this.autor = autor;
        this.tema = tema;
        this.resumen = resumen;
        this.tipoColeccion = tipoColeccion;
        this.isbn = isbn;
        this.numPaginas = numPaginas;
        this.disponible = disponible;
        this.ubicacionFisica = ubicacionFisica;
    }


    public String consultarDetalles() {
        // Lógica para formatear y devolver una cadena con los detalles del libro
        return "ID: " + idLibro + ", Título: " + titulo + ", Autor: " + autor + ", ...";
    }

    /**
     * Genera una cita bibliográfica del libro en un formato específico.
     * @param formato El formato de cita deseado (ej. APA, MLA).
     * @return Una cadena con la cita bibliográfica formateada.
     */
    public String obtenerCita(FormatoCita formato) {
        // Lógica para generar la cita según el formato
        System.out.println("Método obtenerCita() invocado para el formato: " + formato);
        return "Cita bibliográfica del libro.";
    }

    /**
     * Actualiza la disponibilidad del libro.
     * @param estado true si el libro está disponible, false en caso contrario.
     */
    public void actualizarDisponibilidad(boolean estado) {
        System.out.println("Método actualizarDisponibilidad() invocado. Estado: " + estado);
        this.disponible = estado;
    }
}
