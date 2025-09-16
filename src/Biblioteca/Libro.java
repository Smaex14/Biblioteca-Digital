package Biblioteca;
public class Libro {
    private String idLibro;
    private String titulo;
    private String autor;
    private String tema;
    private int anio; 
    private TipoColeccion tipoColeccion;
    private String resumen;
    private String isbn;
    private int numPaginas;
    private boolean disponible;
    private Ubicacion ubicacion;

    public Libro(String idLibro, String titulo, String autor, String tema, int anio,
                 TipoColeccion tipoColeccion, String resumen, String isbn,
                 int numPaginas, Ubicacion ubicacion) {
        this.idLibro = idLibro;
        this.titulo = titulo;
        this.autor = autor;
        this.tema = tema;
        this.anio = anio; 
        this.tipoColeccion = tipoColeccion;
        this.resumen = resumen;
        this.isbn = isbn;
        this.numPaginas = numPaginas;
        this.ubicacion = ubicacion;
        this.disponible = true;
    }

    public String consultarDetalles() {
        String estado = this.disponible ? "Sí" : "No";
        return String.format(
            "--- %s ---\n" +
            "Autor: %s\n" +
            "Año de publicación: %d\n" +
            "Tema: %s\n" +
            "Colección: %s\n" +
            "Páginas: %d\n" +
            "ISBN: %s\n" +
            "Disponibilidad: %s\n" +
            "Ubicación: %s\n" +
            "--------------------",
            this.titulo, this.autor, this.anio, this.tema, this.tipoColeccion.getDescripcion(), 
            this.numPaginas, this.isbn, estado, this.ubicacion.obtenerUbicacion()
        );
    }

    public String obtenerCitaFormato(FormatoCita formato) {
        return switch (formato) {
            case APA -> String.format("%s (%d). %s.", this.autor, this.anio, this.titulo); 
            case CHICAGO -> String.format("%s. \"%s\". %d.", this.autor, this.titulo, this.anio); 
            case VANCOUVER -> String.format("%s. %s. %d.", this.autor, this.titulo, this.anio); 
        };
    }

    public void actualizarDisponibilidad(boolean estado) {
        this.disponible = estado;
        System.out.printf("\n>> La disponibilidad de '%s' se cambió a: %s.%n",
                this.titulo, (estado ? "Disponible" : "No Disponible"));
    }

    
    public String getIdLibro() { return idLibro; }
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAnio() { return anio; } // Corregido
    public boolean isDisponible() { return disponible; }
    public Ubicacion getUbicacion() { return ubicacion; }
}

