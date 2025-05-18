public class Producto <T>{
    private T id;
    private String nombre;
    private double precio;

    public Producto(T id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    //________________________________________________
    public T getId(){
        return id;
    };

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
//_________________________________________________


    public void setId(T id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

}
