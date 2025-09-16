
package Biblioteca;

public class BiblotecaDigital {
  public static void main(Strings [] args){
           Scanner sc = new Scanner(System.in);
            int opcion;        
          usuario a=new usuario();
            
        System.out.println("\n--- Menú Principal ---");
        System.out.println("1.Usuario");
        System.out.println("2.Bibliotecario");
        System.out.println("Seleccione una opcion");
          opcion = sc.nextInt();
            
            switch(opcion){
                case 1:
                System.out.println("====Menu de usuario=====");    
                System.out.println("1.-Iniciar sesion");
                System.out.println("2.-Registrarse");
                System.out.println("3.- Dar de baja");
                System.out.println("Seleccione una opcion");
                 int opcion2 = sc.nextInt();   
                 switch (opcion2) {
                    case 1:
                        a.iniciarSesion();
                     
                        break;
                    case 2:
                     a.registrar();
                        break;
                   case 3:
                     a.darDebaja();
                     break;
                    default:
                    System.out.println("Opcion no valida");
                        break;

                }
                case 2:
                  System.out.println("====Menu Bibliotecario====");
                  System.out.println("");
                    break;

                default:
                System.out.println("Opcion no valida");
                    break;
            }


                    
                    
            }
}













