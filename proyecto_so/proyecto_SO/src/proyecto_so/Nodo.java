/**
 *Lo que hacemos es tener un nodo con una referencia a un objeto de la clase Proceso, y el siguiente nodo se inicializa como nulo, 
 * pudiendo ser modificado posteriormente para apuntar a otro Nodo
 * 
 * @author leo & miss ay mis pendejos <3
 */
package proyecto_so;

public class Nodo { //Clase llamada Nodo
    //Atributos
    Proceso proceso; //Representa un objeto de la clase Proceso
    Nodo siguiente; //Representa referencia al siguiente nodo (vinculado al nodo siguiente)

    //Método Constructor que inicializa con un objeto Proceso y asignado el siguiente como vacío
    public Nodo(Proceso proceso) {
        this.proceso = proceso;
        this.siguiente = null;
    }

    //Método constructor vacío
    public Nodo() {
    }

    public Proceso getProceso() { //Obtiene el proceso
        return proceso;
    }

    public void setProceso(Proceso proceso) { //Recibe y asigna el proceso
        this.proceso = proceso;
    }

    public Nodo getSiguiente() { //Obtiene el siguiente nodo
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) { ////Recibe y asigna el siguiente nodo
        this.siguiente = siguiente;
    }
}