
package Biblioteca;

public class BiblotecaDigital {
  public static void main(Strings [] args){
           Scanner sc = new Scanner(System.in);
            int opcion;        
          usuario a=new usuario();
            
        System.out.println("=====Menú Principal=====");
        System.out.println("1.Usuario");
        System.out.println("2.Bibliotecario");
        System.out.println("Seleccione una opcion");
          opcion = sc.nextInt();
            
            switch(opcion){
                case 1:
                System.out.println("====Menu=====");    
                System.out.println("1.-Iniciar sesion");
                System.out.println("2.-Registrarse");
                System.out.println("3.- Dar de baja");
                System.out.println("Seleccione una opcion");
                 int opcion2 = sc.nextInt();   
                 switch (opcion2) {
                    case 1:
                        a.iniciarSesion();
                System.out.println("====Menu de usuario=====");    
                System.out.println("1.Busqueda de libros por criterio");
                System.out.println("2.Gestionar prestamos");
                System.out.println("Seleccione una opcion");
                int opcion3 = sc.nextInt();
                
                switch(opcion3){
                    case 1:
                    System.out.println("====Criterios de busqueda=====");    
                    System.out.println("1.Titulo");
                    System.out.println("2.Autor");
                    System.out.println("3.Tema");
                    System.out.println("Seleccione una opcion");
                    int opcion4 = sc.nextInt();
                    switch(opcion4){
                      case 1:
                        System.out.println("Ingrse el titulo del libro");
                        //scan
                        if(){
                          System.out.println("=====Resultados=====");
                        }else{
                          System.out.println("No se encontraron coincidencias");
                        }
                        break;
                      case 2:
                        System.out.println("Ingrese el autor del libro");
                        //scan
                        if(){
                          System.out.println("=====Resultados=====");
                        }else{
                          System.out.println("No se encontraron coincidencias");
                        }
                          break;
                      case 3:
                        System.out.println("Ingrse el Tema del libro");
                        //scan
                        if(){
                          System.out.println("=====Resultados=====");
                        }else{
                          System.out.println("No se encontraron coincidencias");
                        }
                          break;
                    }
                     break;
                  case 2:
                  System.out.println("====Menu de prestamos=====");    
                  System.out.println("1.Pedir un prestamo");
                  System.out.println("2.Extender prestamo");
                  System.out.println("Devolver libro");
                  System.out.println("Seleccione una opcion");
                  int opcion5 = sc.nextInt();
                  switch(opcion5){
                    case 1:
                      //pedir prestamo
                       System.out.println("")
                          break;
                    case 2:
                    //extender fecha del prestamo
                      break;
                    case 3:
                      //devolver libro
                  }  
                }
                    case 2:
                     a.registrar();
                      System.out.println("Ingrese un correo electronico");
                     //scan
                      System.out.println("Ingrese un nombre de usuario");
                     //scan
                      System.out.println("Ingrese una contrasenia");
                     //scan
                     if(){
                        System.out.println("Usuario registrado correctamente");
                     }else{
                        System.out.println("Datos invalidos o el usuario ya se encuentra registrado")
                     }
                        break;
                   case 3:
                     a.darDebaja();
                     System.out.println("Ingrese nombre de usuario");
                    //scan
                    System.out.println("Ingrese contraseña");
                     //scan
                     if(){
                       System.out.println("El usuario se ha dado de baja exitosamente")
                     }else{
                       System.out.println("El usuario no existe o los datos son invalidos");
                     }
                     break;
                    default:
                    System.out.println("Opcion no valida");
                        break;

                }
                case 2:
                  System.out.println("=====Menu Bibliotecario=====");
                 System.out.println("1.Agregar libro");
                  System.out.println("2.Eliminar libro");
                  System.out.println("Actualizar informacion del libro");
                System.out.println("Actualizar disponibilidad del libro");
                  System.out.println("Seleccione una opcion");
                    break;

                default:
                System.out.println("Opcion no valida");
                    break;
            }


                    
                    
            }
}













