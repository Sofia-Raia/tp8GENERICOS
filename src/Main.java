import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        System.out.println("KATA1-------------------------------");
       ArrayList<Producto<String>> ListaDeProductos = new ArrayList<>();
        ListaDeProductos.add(new Producto("aaa123","Galletas",13.3));
        ListaDeProductos.add(new Producto("aaa111","Harina",42.3));
        ListaDeProductos.add(new Producto("aaa123","Pan",31.3));
        ListaDeProductos.add(new Producto("aaa123","Tortitas",11.3));


        System.out.println("PRODUCTOS IDENTIFICADOS POR STRING:");
        for (Producto<String> p : ListaDeProductos) {
            System.out.println(p);
        }

        ArrayList<Producto<Integer>> ListaDeProductos2 = new ArrayList<>();
        ListaDeProductos2.add(new Producto(111111,"Gaseosa",22.3)) ;
        ListaDeProductos2.add(new Producto(222222,"Vino",333.3)) ;
        System.out.println("\nPRODUCTOS IDENTIFICADOS POR INTEGER:");
        for (Producto<Integer> p : ListaDeProductos2) {
            System.out.println(p);
        }


        //kata 2
         System.out.println("KATA2-------------------------------");
        Carrito carrito = new Carrito();
        Producto<String> producto1 = new Producto("aaa123","Galletas",13.3);
        Producto<String> producto2 = new Producto("aaa111","Harina",42.3);
        Producto<String> producto3 = new Producto("aaa123","Pan",31.3);
        carrito.agregarProducto(producto1);
        carrito.agregarProducto(producto2);
        carrito.agregarProducto(producto3);
        double total=carrito.obtenerTotal();
        System.out.println("\nPRODUCTOS DE LA COMPRA:");
        carrito.mostrarProductos();
        System.out.println("\nTOTAL DE LA COMPRA $" + total);

        //kata3
        System.out.println("KATA3-------------------------------");
        //creo PEDIDOS
        Pedido p1 = new Pedido(1, LocalDate.of(2023, 5, 10));
        Pedido p2 = new Pedido(2, LocalDate.of(2022, 3, 15));
        Pedido p3 = new Pedido(3, LocalDate.of(2024, 1, 5));

        //creo PRODUCTOS
        Producto<String> prodA = new Producto<>("aaa","Mouse", 1500.0);
        Producto<Integer> prodB = new Producto<>(22,"Teclado", 3000.0);
        Producto<String> prodC = new Producto<>("bbb","Monitor", 20000.0);

        //Agrego los productos a los pedidos
        p1.addProducto(prodA);
        p2.addProducto(prodB);
        p3.addProducto(prodC);

        //Agrego los pedidos a la lista
        List<Pedido> pedidos = new ArrayList<>();
        pedidos.add(p1);
        pedidos.add(p2);
        pedidos.add(p3);

        System.out.println("Orden por TOTAL:");
        Collections.sort(pedidos); // usa compareTo
        pedidos.forEach(System.out::println);

        System.out.println("\nOrden por FECHA:");
        pedidos.sort(new ComparadorPedidosPorFecha());
        pedidos.forEach(System.out::println);


        //kata 4 nivel experto
        System.out.println("KATA4-------------------------------");

        Buscador <Pedido, Integer> buscador = new Buscador();
        Pedido p= buscador.buscar(pedidos,2);
        System.out.println("Fue encontrado! " +p);
    }
}