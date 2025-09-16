
package Biblioteca;

public class BiblotecaDigital {
  public static void main(Strings [] args){
           Scanner sc = new Scanner(System.in);
            String u="a";
            String c="b";
            String co="c";
    usuario a=new usuario("1230",u,c,co);
        System.out.println("\n--- Menú Principal ---");
        System.out.println("1.Usuario");
        System.out.println("2.Bibliotecario");
        System.out.println("Seleccione una opcion");
            int opcion = sc.nextInt();
            
            switch(opcion){
                case 1:
                System.out.println("====Menu de usuario=====");    
                System.out.println("Iniciar sesion");
                System.out.println("Registrarse");
                System.out.println("Seleccione una opcion");
                 int opcion2 = sc.nextInt();   
                 switch (opcion2) {
                    case 1:
                        
                        break;
                    case 2:
                     System.out.println("Ingrese un nombre de usuario: ");
                     u=sc.next();
                     System.out.println("Ingrese un correo: ");
                     c=sc.next();
                     System.out.println("Ingrese su contraseña: ");
                     co=sc.next();
                     
                     a.registrar();
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





