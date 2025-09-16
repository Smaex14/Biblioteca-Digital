package Biblioteca;

import java.util.*;

public class usuario {
    Scanner sc = new Scanner(System.in);
    List<datosUsuario> usuarios = new ArrayList<>();
    List<Long> usuariosBaja = new ArrayList<>();

    public void registrar() {
        long idUsuario = (long) (Math.random() * 90000000) + 10000000;

        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese su correo: ");
        String email = sc.nextLine();
        System.out.println("Cree una contraseña (Minimo 8 digitos): ");
        String contraseña = sc.nextLine();
        
        if (contraseña.length() < 8) {
        System.out.println("La contraseña es demasiado corta.");
            } else {

        datosUsuario nuevo = new datosUsuario(idUsuario, nombre, email, contraseña);
        nuevo.setEstado(datosUsuario.estadoUsuario.activo);
        usuarios.add(nuevo);

        System.out.println("Usuario registrado bajo el id: " + idUsuario);
        System.out.println("Usuario registrado: " + nuevo);
        }

    }
    
    public void darDebaja() {
        System.out.println("Ingrese el ID del usuario a dar de baja: ");
        long idBaja = sc.nextLong();
        sc.nextLine();
        
        for (int i = 0; i < usuarios.size(); i++) {
            datosUsuario u = usuarios.get(i);
            
            if (u.idUsuario == idBaja) {
               System.out.println("Ingrese la contraseña del usuario: ");
               String paso = sc.nextLine();
               
                if (u.contraseña.equals(paso)) {
                   u.setEstado(datosUsuario.estadoUsuario.inactivo);
                   usuariosBaja.add(u);
                   usuarios.remove(i);
                   
                System.out.println("El usuario ha sido dado de baja correctamente.");
                return;
                } else {
                    System.out.println("Contraseña incorrecta. ");
                    return;
                }
            }
        }        
        System.out.println("Usuario no encontrado. ");
    }
    
    public void iniciarSesion () {
        System.out.println("Ingrese su ID: ");
        long idInicio = sc.nextLong();
        sc.nextLine();
        
        System.out.println("Ingrese contraseña: ");
        String contrPass = sc.nextLine();
        
        for (datosUsuario usuario: usuarios) {
            if (usuario.idUsuario == id) {
                if (usuario.contrasena.equals(contrPass)) {
                    
                }
            }
        }
    }
}
