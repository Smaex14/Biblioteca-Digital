package Biblioteca;

public enum TipoColeccion {
   
    FISICO("Físico"),
    DIGITAL("Digital"),
    TEMATICA("Temática");
    private final String descripcion;
    TipoColeccion(String descripcion) {
        this.descripcion = descripcion;
    }


    public String getDescripcion() {
        return descripcion;
    }
}

