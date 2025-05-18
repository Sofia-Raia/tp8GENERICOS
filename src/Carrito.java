import java.util.ArrayList;
import java.util.List;

public class Carrito <T extends Producto<?>>{
    private List<T> productos;

    public void agregarProducto(T producto){
        if(productos == null){
            productos = new ArrayList<T>();
        }
        this.productos.add(producto);
    };

    public void eliminarProducto(T producto){
        this.productos.remove(producto);
    };

    public double obtenerTotal(){
        double total = 0;
        for(T producto : this.productos){
            total+=producto.getPrecio();
        }
        return total;
    };

    public void mostrarProductos(){
        for(T producto : this.productos){
            System.out.println(producto);
        }
    };

}
