/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca;

/**
 * Enumeración para representar los diferentes tipos de colecciones de libros.
 */
enum TipoColeccion {
    FISICA, DIGITAL, AUDIOLIBRO, REVISTA, PERIODICO
}

/**
 * Clase que encapsula los criterios de búsqueda para filtrar libros.
 * Permite buscar por autor, tema, título y tipo de colección.
 */
public class CriterioBusqueda {

    // Atributos privados según el diagrama
    private String autor;
    private String tema;
    private String titulo;
    private TipoColeccion tipoColeccion;
    private boolean ordenarPorTitulo;

    /**
     * Constructor para inicializar los criterios de búsqueda.
     * Los parámetros pueden ser nulos si no se aplican.
     */
    public CriterioBusqueda(String autor, String tema, String titulo, TipoColeccion tipoColeccion, boolean ordenarPorTitulo) {
        this.autor = autor;
        this.tema = tema;
        this.titulo = titulo;
        this.tipoColeccion = tipoColeccion;
        this.ordenarPorTitulo = ordenarPorTitulo;
    }

    // --- Métodos de acceso (getters) para obtener los criterios ---

    public String getAutor() {
        return autor;
    }

    public String getTema() {
        return tema;
    }

    public String getTitulo() {
        return titulo;
    }

    public TipoColeccion getTipoColeccion() {
        return tipoColeccion;
    }

    public boolean isOrdenarPorTitulo() {
        return ordenarPorTitulo;
    }

    /**
     * Permite refinar una búsqueda existente con nuevos criterios.
     * Los nuevos criterios sobrescriben los anteriores si no son nulos.
     * @param nuevosCriterios El objeto CriterioBusqueda con los nuevos valores.
     * @return Una nueva instancia de CriterioBusqueda con los criterios combinados.
     */
    public CriterioBusqueda refinarBusqueda(CriterioBusqueda nuevosCriterios) {
        System.out.println("Método refinarBusqueda() invocado.");

        // Lógica para combinar los criterios. Por ejemplo, si el nuevo autor no es nulo, se usa ese.
        String nuevoAutor = (nuevosCriterios.getAutor() != null) ? nuevosCriterios.getAutor() : this.autor;
        String nuevoTema = (nuevosCriterios.getTema() != null) ? nuevosCriterios.getTema() : this.tema;
        String nuevoTitulo = (nuevosCriterios.getTitulo() != null) ? nuevosCriterios.getTitulo() : this.titulo;
        TipoColeccion nuevoTipoColeccion = (nuevosCriterios.getTipoColeccion() != null) ? nuevosCriterios.getTipoColeccion() : this.tipoColeccion;
        boolean nuevoOrdenarPorTitulo = nuevosCriterios.isOrdenarPorTitulo(); // La bandera booleana simplemente se sobrescribe

        return new CriterioBusqueda(nuevoAutor, nuevoTema, nuevoTitulo, nuevoTipoColeccion, nuevoOrdenarPorTitulo);
    }
}
