import java.util.Collection;
import java.util.Iterator;

public class Buscador <T extends Identificable,K> {

    //Debe permitir buscar un pedido en una lista por su identificador
    public T buscar(Collection<? extends T> elementos, K id){
        T encontrado = null;

        Iterator<? extends T> iterador = elementos.iterator();

       while(iterador.hasNext() && encontrado == null){
           //toma el elemento por el cual itera y lo asigna en "actual"
           T actual = iterador.next();

           if(actual.tieneMismoID(id)){
               encontrado = actual;
           }
       }
        return encontrado;
    };
}
