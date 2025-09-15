/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Prestamo {

    private String idPrestamo;
    private Date fechaPrestamo;
    private Date fechaDevolucion;
    private boolean renovado;


    private static List<Prestamo> prestamosRegistrados = new ArrayList<>();

    public Prestamo(String idPrestamo, Date fechaPrestamo, Date fechaDevolucion) {
        this.idPrestamo = idPrestamo;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.renovado = false;
    }

    public void registrarPrestamo() {
        prestamosRegistrados.add(this);
        System.out.println("Préstamo registrado con ID: " + idPrestamo);
    }

    public void registrarDevolucion() {
        Date hoy = new Date();
        if (hoy.before(fechaDevolucion) || hoy.equals(fechaDevolucion)) {
            System.out.println("Devolución registrada a tiempo.");
        } else {
            System.out.println("Devolución registrada con retraso.");
        }
        // Simulación: eliminar el préstamo de la lista
        prestamosRegistrados.remove(this);
        // Aquí podrías liberar el libro si tuvieras una referencia al objeto Libro
    }

    public boolean renovarPrestamo() {
        Date hoy = new Date();
        if (!renovado && hoy.before(fechaDevolucion)) {
            // Extiende la fecha de devolución por 7 días
            long nuevaFechaMillis = fechaDevolucion.getTime() + (7L * 24 * 60 * 60 * 1000);
            fechaDevolucion = new Date(nuevaFechaMillis);
            renovado = true;
            System.out.println("Préstamo renovado. Nueva fecha de devolución: " + fechaDevolucion);
            return true;
        } else {
            System.out.println("No se puede renovar el préstamo.");
            return false;
        }
    }

    // Getters útiles si necesitas consultar desde otras clases
    public String getIdPrestamo() {
        return idPrestamo;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public boolean isRenovado() {
        return renovado;
    }
}
