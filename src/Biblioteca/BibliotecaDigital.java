/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class BiblotecaDigital {
    public static void main(String[] args) {
        // Inicializar la biblioteca y un escáner para la entrada del usuario
        Biblioteca miBiblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        // --- Crear algunos objetos para la demostración ---
        System.out.println("Inicializando el sistema de la biblioteca...");
        
        // Crear un usuario
        Usuario usuario1 = new Usuario("U001", "Ana Gomez", "ana.gomez@mail.com", "clave123");
        miBiblioteca.registrarUsuario(usuario1);
        
        // Crear algunos libros
        Libro libro1 = new Libro("L001", "Cien años de soledad", "Gabriel García Márquez", "Realismo mágico", 
                                 "Una novela que relata la historia de la familia Buendía...",
                                 TipoColeccion.FISICO, "978-0307455243", 417, true, 
                                 new Ubicacion("A1", 1, "Novela"));
        Libro libro2 = new Libro("L002", "1984", "George Orwell", "Ciencia ficción", 
                                 "Una distopía que describe un futuro totalitario...",
                                 TipoColeccion.FISICO, "978-0451524935", 328, true, 
                                 new Ubicacion("B2", 3, "Ciencia Ficción"));
        
        // Añadir libros a la biblioteca
        miBiblioteca.agregarLibro(libro1);
        miBiblioteca.agregarLibro(libro2);

        // --- Bucle principal de la aplicación (Menú de consola) ---
        boolean salir = false;
        while (!salir) {
            System.out.println("\n--- Menú Principal ---");
            System.out.println("1. Buscar libro");
            System.out.println("2. Ver mi información");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    System.out.print("Ingrese el título del libro a buscar: ");
                    String tituloBusqueda = scanner.nextLine();
                    
                    CriterioBusqueda criterio = new CriterioBusqueda(null, null, tituloBusqueda, null, false);
                    List<Libro> resultados = miBiblioteca.buscarLibros(criterio);

                    if (!resultados.isEmpty()) {
                        System.out.println("Libros encontrados:");
                        for (Libro libro : resultados) {
                            System.out.println(libro.consultarDetalles());
                        }
                    } else {
                        System.out.println("No se encontraron libros con ese título.");
                    }
                    break;
                case "2":
                    System.out.println("Información del usuario:");
                    System.out.println("ID: " + usuario1.getIdUsuario());
                    System.out.println("Nombre: " + usuario1.getNombre());
                    System.out.println("Estado: " + usuario1.getEstado());
                    break;
                case "3":
                    salir = true;
                    System.out.println("Saliendo del sistema. ¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        }
        
        scanner.close();
    }
}
