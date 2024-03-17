package proyecto_so;

/**
 *
 * @author leo
 */
public class Nodo {
    Proceso proceso;
    Nodo siguiente;

    public Nodo(Proceso proceso) {
        this.proceso = proceso;
        this.siguiente = null;
    }

    public Nodo() {
    }

    

    public Proceso getProceso() {
        return proceso;
    }

    public void setProceso(Proceso proceso) {
        this.proceso = proceso;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
