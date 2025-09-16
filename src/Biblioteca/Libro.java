package Biblioteca;
package biblioteca;

import java.util.*;

public class Libro {
    Scanner sc = new Scanner(System.in);
    
    List<datosLibro> libros = new ArrayList<>();
    
    public String consultarDetalles() {
        System.out.println("Ingrese el título del libro a consultar: ");
        String tituloBusqueda = sc.nextLine();
        
        for (datosLibro libro : libros) {
            if (libro.titulo.equalsIgnoreCase(tituloBusqueda)) {
                return libro.toString();
            }
        }
        
        return "Libro no encontrado.";
    }
    
    public String obtenerCita(FormatoCita tipoCita, datosLibro libro) {
        return switch (tipoCita) {
            case APA -> libro.autor + " (" + libro.anio + "). " + libro.titulo + ".";
            case CHICAGO -> libro.autor + ". " + libro.titulo + ". " + libro.anio + ".";
            case VANCOUVER -> libro.autor + ". " + libro.titulo + ". " + libro.anio + ".";
            default -> libro.titulo + " - " + libro.autor;
        };
    }

    public void actualizarDisponibilidad() {
        System.out.println("Ingrese el ID del libro: ");
        long idLibro = sc.nextLong();
        sc.nextLine();
        
        System.out.println("¿Está disponible? (true/false): ");
        boolean estado = sc.nextBoolean();
        sc.nextLine();
        
        for (datosLibro libro : libros) {
            if (libro.idLibro == idLibro) {
                libro.disponible = estado;
                System.out.println("Disponibilidad actualizada correctamente.");
                return;
            }
        }
        
        System.out.println("Libro no encontrado.");
    }

    public void agregarLibro() {
        long idLibro = (long) (Math.random() * 90000000) + 10000000;
        
        System.out.println("Ingrese el título: ");
        String titulo = sc.nextLine();
        System.out.println("Ingrese el autor: ");
        String autor = sc.nextLine();
        System.out.println("Ingrese el tema: ");
        String tema = sc.nextLine();
        System.out.println("Ingrese el año: ");
        int anio = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el resumen: ");
        String resumen = sc.nextLine();
        System.out.println("Ingrese el ISBN: ");
        String isbn = sc.nextLine();
        System.out.println("Ingrese el número de páginas: ");
        int numPaginas = sc.nextInt();
        sc.nextLine();
        System.out.println("¿Está disponible? (true/false): ");
        boolean disponible = sc.nextBoolean();
        sc.nextLine();
        
        System.out.println("--- Ubicación del libro ---");
        System.out.println("Ingrese el estante: ");
        String estante = sc.nextLine();
        System.out.println("Ingrese la fila: ");
        int fila = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese la sección: ");
        String seccion = sc.nextLine();
        
        Ubicacion ubi = new Ubicacion(estante, fila, seccion);
        
        //agregar tipo de coleccion
        
        datosLibro nuevo = new datosLibro(idLibro, titulo, autor, tema, anio, tipoColeccion, resumen, isbn, numPaginas, disponible, ubi);
        libros.add(nuevo);
        
        System.out.println("Libro agregado con ID: " + idLibro);
    }

    public void borrarLibro() {
        System.out.println("Ingrese el ID del libro a borrar: ");
        long idBorrar = sc.nextLong();
        sc.nextLine();
        
        for (int i = 0; i < libros.size(); i++) {
            datosLibro libro = libros.get(i);
            if (libro.idLibro == idBorrar) {
                libros.remove(i);
                System.out.println("Libro borrado correctamente.");
                return;
            }
        }
        
        System.out.println("Libro no encontrado.");
    }
}


