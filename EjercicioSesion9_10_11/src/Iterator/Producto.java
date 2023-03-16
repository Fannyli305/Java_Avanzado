package Iterator;

import javax.swing.undo.UndoableEditSupport;

public class Producto {

    private Double id;
    private String nombre;
    private String categoria;
    private Double precio;

    private Producto(){}

    public Producto(Double id, String nombre, String categoria, Double precio) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
    }

    public Double getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public Double getPrecio() {
        return precio;
    }
}
