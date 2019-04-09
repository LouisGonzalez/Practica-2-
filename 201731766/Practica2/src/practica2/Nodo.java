package practica2;
/**
 *
 * @author luisGonzalez
 */
public class Nodo<T> {
    //clase Nodo que se encarga de brindar a Reportes las variables a usar
    private T contenido;
    private Nodo siguiente;
    
    public Nodo(T contenido){
        this.contenido = contenido;
    }
    
    public T obtenerContenido(){
        return contenido;
    }
    
    public Nodo obtenerSiguiennte(){
        return siguiente;
    }
    
    public void especificarSiguiente(Nodo<T> siguiente){
        this.siguiente = siguiente;
    }
}
