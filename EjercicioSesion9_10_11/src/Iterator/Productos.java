package Iterator;

import java.util.LinkedList;

public class Productos implements  ProductoIterator{

    private LinkedList<Producto> productos = new LinkedList();

    private  int posicion = 0;

    public  void crear(Producto producto){
        productos.add(producto);
    }
    @Override
    public boolean hayMas() {
        return posicion < productos.size();
    }

    @Override
    public Producto siguiente() {
        Producto producto = productos.get(posicion);
        posicion += 1;
        return producto;
    }

    @Override
    public void reinicia() {
        posicion = 0;

    }
}
