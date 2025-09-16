package Biblioteca;

public class datosLibro {
    long idLibro;
    String titulo;
    String autor;
    String tema;
    int anio; 
    TipoColeccion tipoColeccion;
    String resumen;
    String isbn;
    int numPaginas;
    boolean disponible;
    Ubicacion ubicacion;
    
public datosLibro(long idLibro, String titulo, String autor, String tema,
             int anio, String resumen, String isbn,
             int numPaginas, boolean disponible, ubicacion ubi) {
    
    this.idLibro = idLibro;
    this.titulo = titulo;
    this.autor = autor;
    this.tema = tema;
    this.anio=anio;
    this.tipoColeccion=tipoColeccion;
    this.isbn = isbn;
    this.numPaginas = numPaginas;
    this.disponible = disponible;
    this.ubi=ubi;
    }

@Override
    public String toString() {
    return  tema + idLibro + " / ISBN:" + isbn + "\nTitulo: " + titulo + "\nAutor: " + "\nAño: " + anio 
            + "\nTema" + tema + " / Tipo de colección: " + tipoColeccion + 
            "\nNúmero de páginas: " + numPaginas + "\nEstado: " + disponible + "/ Ubicación: " + ubi + '\'';
}
