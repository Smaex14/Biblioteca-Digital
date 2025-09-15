
package Biblioteca;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Biblioteca {


    private List<Usuario> listaUsuarios;
    private List<Libro> listaLibros;
    private List<Prestamo> listaPrestamos;

    public Biblioteca() {
        this.listaUsuarios = new ArrayList<>();
        this.listaLibros = new ArrayList<>();
        this.listaPrestamos = new ArrayList<>();
    }
    
    public static void main(String[] args){
        
         Scanner scanner = new Scanner(System.in);
                     System.out.println("\n--- Menú Principal ---");
                     System.out.println("1.Iniciar secion");
                     System.out.println("2.Registrarse");
                     System.out.println("3.Salir");
                     System.out.println("Seleccione una opcion");
            String opcion = scanner.nextLine();
            
            switch(opcion){
                case "1"
                        sout
            }
            
            
    }




    
    // --- Métodos de gestión de libros ---

    public void agregarLibro(Libro  libro) {
        System.out.println("Agregar Libro: " + libro.getTitulo());

    }

    /**
     * Elimina un libro de la lista por su ID.
     */
    public void eliminarLibro(String idLibro) {
        System.out.println("Ingrese la id del Libro para eliminarlo: " + idLibro);

    }

    public void actualizarLibro(Libro libro) {
        System.out.println("Actualizar informacion para: " + libro.getTitulo());

    }

    public void registrarUsuario(Usuario usuario) {
        System.out.println("Método registrarUsuario invocado para: " + usuario.getNombre());

    }

    public void darDeBajaUsuario(String idUsuario) {
        System.out.println("Método darDeBajaUsuario invocado para el ID: " + idUsuario);

    }

    public List<Libro> buscarLibros(CriterioBusqueda criterio) {
        System.out.println("Método buscarLibros invocado con un criterio de búsqueda.");

        return new ArrayList<>(); 
    }

    public void imprimirInformacionContacto() {
        System.out.println("Método imprimirInformacionContacto invocado.");

    }

}
