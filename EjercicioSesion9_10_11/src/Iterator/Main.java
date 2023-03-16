package Iterator;

public class Main {

    public static void main(String[] args) {

        Productos productos = new Productos();
        productos.crear(new Producto(0000.1,"arroz", "canasta familiar", 100000.00));
        productos.crear(new Producto(0000.2,"jabon", "utilez de aseo", 200000.00));
        productos.crear(new Producto(0000.3,"cerveza", "Licores", 500000.00));
        productos.crear(new Producto(0000.4,"galletas", "bizcocheria", 130000.00));
        productos.crear(new Producto(0000.5,"frijol", "granos", 300000.00));

        while (productos.hayMas()){
            Producto producto = productos.siguiente();
            System.out.println("producto es : " + producto.getNombre() + " categoria : " + producto.getCategoria());
        }

        productos.crear(new Producto(0000.6,"papel", "utiles de aseo", 400000.00));
        Producto producto = productos.siguiente();
        System.out.println("  id producto es : " + producto.getId() + " nombre es : " + producto.getNombre());


       productos.reinicia();
       while (productos.hayMas()){
           producto = productos.siguiente();
           System.out.println("producto es : " + producto.getNombre() + " categoria : " + producto.getCategoria());
       }
    }
}
