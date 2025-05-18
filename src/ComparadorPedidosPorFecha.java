import java.util.Comparator;

public class ComparadorPedidosPorFecha implements Comparator<Pedido> {

    //0 si son iguales
    //Un número negativo si this.fecha es anterior a p.fecha
    //Un número positivo si this.fecha es posterior a p.fecha

    @Override
    public int compare(Pedido o1, Pedido o2) {
        return o1.getFecha().compareTo(o2.getFecha());
    }
}
