package Biblioteca;

import java.util.*;



public class usuario {
    Scanner sc = new Scanner(System.in);
    List<datosUsuario> usuarios = new ArrayList<>();
    List<datosUsuario> usuariosBaja = new ArrayList<>();

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
    
    public void iniciarSesion() {
        System.out.println("Ingrese su ID: ");
        long idInicio = sc.nextLong();
        sc.nextLine();
        
        System.out.println("Ingrese su contraseña: ");
        String password = sc.nextLine();

        for (datosUsuario usuario : usuarios) {
            if (usuario.idUsuario == idInicio) {
                if (usuario.contraseña.equals(password)) {
                    if (usuario.estado == datosUsuario.estadoUsuario.activo) {
                        System.out.println("¡Inicio de sesión exitoso!");
                        System.out.println("Bienvenido, " + usuario.nombre);
                        return;
                    } else {
                        System.out.println("Usuario inactivo. ¿Desea reactivarlo? (s/n)");
                        String respuesta = sc.nextLine();
                        if (respuesta.equalsIgnoreCase("s")) {
                            usuario.setEstado(datosUsuario.estadoUsuario.activo);
                            System.out.println("Usuario reactivado. Ahora puede iniciar sesión.");
                            return;
                        } else {
                            System.out.println("El usuario sigue inactivo.");
                            return;
                        }
                    }
                } else {
                    System.out.println("Contraseña incorrecta.");
                    return;
                }
            }
        }
        
        for (datosUsuario usuario : usuariosBaja) {
            if (usuario.idUsuario == idInicio) {
                if (usuario.contraseña.equals(password)) {
                    System.out.println("Usuario dado de baja. ¿Desea reactivarlo? (s/n)");
                    String respuesta = sc.nextLine();
                    if (respuesta.equalsIgnoreCase("s")) {
                        usuario.setEstado(datosUsuario.estadoUsuario.activo);
                        usuarios.add(usuario);
                        usuariosBaja.remove(usuario);
                        System.out.println("Usuario reactivado exitosamente.");
                    }
                    return;
                } else {
                    System.out.println("Contraseña incorrecta.");
                    return;
                }
            }
        }
        
        System.out.println("Usuario no encontrado.");
    }
}
