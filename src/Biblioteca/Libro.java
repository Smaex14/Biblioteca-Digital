
package Biblioteca;

public class Libro {
    long idLibro;
    String titulo;
    String autor;
    String tema;
    int anio;
    //tema
    //tipo de coleccion
    String isbn;
    int numPaginas;
    boolean disponible;
    ubicacion ubi;

public libro(long idLibro, String titulo, String autor, String tema,
            int anio, String resumen, String isbn,
            int numPaginas, boolean disponible, ubicacion ubi) {
    this.idLibro = idLibro;
    this.titulo = titulo;
    this.autor = autor;
    this.tema = tema;
    this.anio=anio;
    this.isbn = isbn;
    this.numPaginas = numPaginas;
    this.disponible = disponible;
    this.ubi=ubi;
    }

        public long getIdLibro() { 
            return idLibro; 
        }
        public String getTitulo() { 
            return titulo; 
        }
        public String getAutor() { 
            return autor; 
        }
        public String getTema() { 
            return tema; 
        }
        public int anio(){
            return anio;
        }
        public boolean isDisponible() { 
            return disponible; 
        }
        public ubicacion getUbi() {
            return ubi;
        }

public String consultarDetalles() {
    return titulo + "\nDel autor: " + autor + "Año de publicaciión: " 
    + anio + "\nTema: " + tema + "\nNúmero de páginas: " + numPaginas 
    + "\nISBN: " + isbn + "\nDisponibilidad: " + (disponible ? "Sí" : "No") 
    + "\nUbicación: " + ubi.obtenerUbicacion();
    }
    
public String obtenerCita (formatoCita tipoCita) {
        return switch (tipoCita) {
            case apa -> autor + " (" + anio + "). " + titulo + ".";
            case chicago -> autor + ". " + titulo + ". " + anio + ".";
            case vancouver -> autor + ". " + titulo + ". " + anio + ".";
            default -> titulo + " - " + autor;
        };
}

public void actualizarDisponibilidad(boolean estado) {
    this.disponible = estado;
}
}


