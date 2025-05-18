import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido implements Comparable<Pedido>,Identificable<Integer> {

    private int id;
    private LocalDate fecha;
    private List<Producto<?>> productos;

    public Pedido(int id, LocalDate fecha) {
        this.id = id;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public void addProducto(Producto<?> producto) {
        if (productos == null) {
            productos = new ArrayList<Producto<?>>();
        }
        productos.add(producto);
    }

    public void removeProducto(Producto<?> producto) {
        this.productos.remove(producto);
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto<?> producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }

    @Override
    public int compareTo(Pedido otro) {
        return Double.compare(this.calcularTotal(), otro.calcularTotal());
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", fecha=" + fecha +
                ", productos=" + productos +
                '}';
    }

    @Override
    public Integer getID() {
        return this.id;
    }

    @Override
    public boolean tieneMismoID(Integer id) {
        return this.id == id;

    }
}
