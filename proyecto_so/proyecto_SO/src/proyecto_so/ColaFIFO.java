package proyecto_so;

/**
 *
 * @author leo
 */
public class ColaFIFO {
    
    private Nodo inicio;
    private Nodo fin;

    public ColaFIFO() {
        inicio = null;
        fin = null;
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

    public void encolar(Proceso proceso) {
        Nodo nuevoNodo = new Nodo(proceso);
        if (inicio == null) {
            inicio = nuevoNodo;
        } else {
            fin.siguiente = nuevoNodo;
        }
        fin = nuevoNodo;
    }

    public Proceso desencolar() {
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

    public boolean estaVacia() {
        return inicio == null;
    }

    public void imprimirContenido() {
        System.out.println("Contenido de la cola FIFO:");
        Nodo temp = inicio;
        while (temp != null) {
            System.out.print("|" + temp.proceso.getId() + " -> " + temp.proceso.getNombre() + "|  ");
            temp = temp.siguiente;
        }
        System.out.println();
    }
    
}
