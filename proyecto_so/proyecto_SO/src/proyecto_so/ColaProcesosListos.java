package proyecto_so;

/**
 *
 * @author leo
 */
public class ColaProcesosListos { // Se declaran el inicio y fin de la cola
    private Nodo inicio;
    private Nodo fin;

    public ColaProcesosListos() { // Se inicializa el inicio y fin de la cola como nulos (no hay datos desde un inicio)
        inicio = null;
        fin = null;
    }
    public boolean estaVacia() { 
        return inicio == null;
    }

    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    public Nodo getFin() {
        return fin;
    }

    public void setFin(Nodo fin) {
        this.fin = fin;
    }

    public void insertarProceso(Proceso proceso) {
        Nodo nuevoNodo = new Nodo(proceso);
        if (inicio == null) {
            inicio = nuevoNodo;
        } else {
            fin.siguiente = nuevoNodo;
        }
        fin = nuevoNodo;
    }
    public void devolver(Proceso proceso) {
        Nodo nuevoNodo = new Nodo(proceso);
        Nodo nodoAuxiliar=inicio;
        if (inicio == null) {
            inicio = nuevoNodo;
        } else {
            inicio = nuevoNodo;
        }
        inicio.siguiente = nodoAuxiliar;
    }
    public Proceso eliminarProceso() {
        if (inicio == null) {
            return null;
        }
        Proceso proceso = inicio.proceso;
        inicio = inicio.siguiente;
        if (inicio == null) {
            fin = null;
        }
        return proceso;
    }
    public int sumarTiemposServicio() {
    int total = 0;
    Nodo temp = inicio;
    while (temp != null) {
        total += temp.proceso.getTiempoServicio();
        temp = temp.siguiente;
    }
    return total;
    }

    public void imprimirContenido() {
        System.out.println("Contenido de la cola de procesos listos:");
        Nodo temp = inicio;
        while (temp != null) {
            System.out.print("|" + temp.proceso.getId() + " -> " + temp.proceso.getNombre()+ "|  ");
            temp = temp.siguiente;
        }
        System.out.println();
    }
}
