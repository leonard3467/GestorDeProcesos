/**
 * Realizamos proceso para administrar nuesta cola FIFO, donde encolamos, desencolamos e imprimimos proceso
 * @author leo
 */
package proyecto_so;

public class ColaFIFO { //Clase llamada Cola FIFO
    //Atributod privados
    private Nodo inicio; //Representa el inicio de la cola FIFO, conteniendo un objeto de proceso
    private Nodo fin; //Representa el fin de la cola FIFO, conteniendo un objeto de proceso

    //Método Constructor indicando que tanto el inicio como nuestro final de la cola van a estar vacíos
    public ColaFIFO() {
        inicio = null;
        fin = null;
    }

    public Nodo getInicio() { //Obtiene el nodo inicio de nuestra cola
        return inicio;
    }

    public void setInicio(Nodo inicio) { //Establece el nodo inicio de nuestra cola
        this.inicio = inicio;
    }

    public Nodo getFin() { //Obtiene el nodo fin de nuestra cola
        return fin;
    }

    public void setFin(Nodo fin) { //Establece el nodo fin de nuestra cola
        this.fin = fin;
    }

    //Métodos para manipular la cola
    //Método para encolar
    public void encolar(Proceso proceso, int quantum) {
        Nodo nuevoNodo = new Nodo(proceso); //Creamos un nuevo nodo
        if (inicio == null) { //Si tenemos nuestra cola de procesos vacía
            inicio = nuevoNodo; //El inicio de esta será el nodo creado
        } else { 
            fin.siguiente = nuevoNodo; //Si no es así, el nodo se inserta al final de la cola. Fin representa el último nodo en la cola, por lo que el nodo siguiente al último nodo se establcece como el nuevo nodo.
        }
        fin = nuevoNodo; //Apuntamos a nuevo nodo
        
        
        //-------------------------------------------------
        proceso.setContador(proceso.getContador() + 1); // Incrementamos el contador del proceso
        int tiempoEspera = ((proceso.getContador()-1)*quantum); //Obteniendo el tiempo de espera del proceso, restando 1 al contador y multiplicando por el quantum
        proceso.settEjecutado(tiempoEspera);
        
        // System.out.println("\n------AYUDA-----------------El proceso "+proceso.getId()+" ha subido "+proceso.getContador()+" veces");
        //System.out.println("\n------DIOS-------------El proceso "+proceso.getId()+" tiene tiempo de espera de "+proceso.getTiempoEspera());
    }

    //Método para desencolar 
    public Proceso desencolar() {
        if (inicio == null) { //Si nuetsro inicio es nulo (cola vacía)
            return null; //Devolvemos null para indicar que no hay procesos por desencolar
        }
        Proceso proceso = inicio.proceso; //Se obtiene proceso que está al inicio de la cola 
        inicio = inicio.siguiente; //Actualizamos el inicio de la cola apuntando al siguiente nodo
        if (inicio == null) { //Si el inicio está vacío (cola vacía)
            fin = null; //Final vacío
        }
        return proceso; //Devolvemos el proceso que desencolamos
    }

    //Método que verifica si nuestra cola está vacía
    public boolean estaVacia() {
        return inicio == null;
    }

    //Método que imprime contenido de nuestra cola
    public void imprimirContenido() {
        System.out.println("Contenido de la cola FIFO:");
        Nodo temp = inicio; //Nuestro temporal es el nodo inicial de la cola
        while (temp != null) { //Mientras el temporal no sea nulo, imprimimos el contenido de la cola de procesos
            System.out.print("|" + temp.proceso.getId() + " -> " + temp.proceso.getNombre() + "|  "); //Se imprime el id y el nombre del proceso
            temp = temp.siguiente; //Nuestro siguiente nodo será el nuevo temporal
        }
        System.out.println();
    }
}