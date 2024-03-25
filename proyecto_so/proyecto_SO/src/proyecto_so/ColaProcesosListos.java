/**
 * Procedimiento para ingresar o borrar elementos a nuestra cola de procesos listos
 * @author leo
 */
package proyecto_so;

public class ColaProcesosListos { //Clase de ColaProcesoListos
    // Atributos privados
    private Nodo inicio; //Representa el inicio de la cola de procesos listos, conteniendo un objeto de proceso
    private Nodo fin; //Representa el fin de la cola de procesos listos, conteniendo un objeto de proceso

    //Método Constructor
    public ColaProcesosListos() { // Se inicializa el inicio y fin de la cola como nulos (indicando que al incio nuestra cola está vacía)
        inicio = null; 
        fin = null;
    }
    
    //Método que verifica si nuestra cola está vacía
    public boolean estaVacia() { 
        return inicio == null;
    }

    public Nodo getInicio() { //Obtiene el nodo inicio de nuestra cola
        return inicio;
    }

    public void setInicio(Nodo inicio) { //Establecen el nodo de inicio
        this.inicio = inicio;
    }

    public Nodo getFin() { //Obtiene el nodo fin de nuestra cola
        return fin;
    }

    public void setFin(Nodo fin) { //Establecen el nodo de inicio
        this.fin = fin;
    }

    //Métodos para manipular la cola
    //Método para insertar procesos a la cola
    public void insertarProceso(Proceso proceso) { 
        Nodo nuevoNodo = new Nodo(proceso); //Creando nuevo nodo con el proceso dado
        if (inicio == null) { //Si nuestro inicio está vacío
            inicio = nuevoNodo; //Nuestro nodo insertado será el incio de nuestra cola
        } else {
            fin.siguiente = nuevoNodo; //Si no es así, el nodo se inserta al final de la cola. Fin representa el último nodo en la cola, por lo que el nodo siguiente al último nodo se establcece como el nuevo nodo.
        }
        fin = nuevoNodo; //Apuntamos al nuevo nodo
    }
    
    //Método que devuelve un proceso a la cola
    public void devolver(Proceso proceso) {
        Nodo nuevoNodo = new Nodo(proceso); //Creando un nuevo nodo
        Nodo nodoAuxiliar = inicio; //Se crea un nodo auxiliar inicializado con el inicio de la cola 
        if (inicio == null) { //Si nuestro inicio está vacío (cola vacía)
            inicio = nuevoNodo; //Nuestro inicio de la cola es el nuevo nodo
        } else {
            inicio = nuevoNodo; //En otro caso, el inico de la cola es el nuevo nodo
        }
        inicio.siguiente = nodoAuxiliar; //Nuetsro siguiente nodo es el auxiliar
    }
    
    //Método para eliminar proceso
    public Proceso eliminarProceso() {
        if (inicio == null) { //Si nuestro inicio está vacío (cola vacía)
            return null; //Regresamos nada, inidicando que no hya procesos a eliminar
        }
        Proceso proceso = inicio.proceso; //Obtenemos proceso guardado en el nodo inicial para borrarlo
        inicio = inicio.siguiente; //Actualizamos el inicio de la cola apuntando al siguiente nodo
        if (inicio == null) { //Si el inicio es vacío (cola vacía)
            fin = null; //Fin nulo 
        }
        return proceso; //Devolvemos el proceso que se eliminó
    }
    
    //Método que suma tiempos de servicio
    public int sumarTiemposServicio() {
        int total = 0; //El total se inicializa con cero
        Nodo temp = inicio; //Nuestro nodo temporal
        while (temp != null) { //Mientras nuestro temporal no sea nulo
            total += temp.proceso.getTiempoServicio(); 
            temp = temp.siguiente; //Ahora nuestro temporal será el siguiente proceso
        }
        return total; //Regresamos el total de tiempo de servicio
    }

    //Método para imprimir contenido
    public void imprimirContenido() {
        System.out.println("Contenido de la cola de procesos listos:");
        Nodo temp = inicio; //Se crea nodo incianizandolo con el valor de inicio de la cola
        while (temp != null) { //Mientras el temporal no sea nulo, imprimimos el contenido de la cola de procesos
            System.out.print("|" + temp.proceso.getId() + " -> " + temp.proceso.getNombre()+ "|  "); //Se imprime el id y el nombre del proceso
            temp = temp.siguiente; //Nuestro siguiente nodo será el nuevo temporal
        }
        System.out.println();
    }
}