/**
 *Aquí se declaran todos los atributos de los procesos, para asi hacer uso de este
 * @author Miss Leo
 */
package proyecto_so;

public class Proceso { //Clase llamada Proceso
    //Atributos privados que solo podemos utilizar en esta clase 
    private String id; 
    private String nombre;
    private int tamano;
    private int tiempoServicio; 
    private int tiempoLlegada;
    private float tiempoEspera;
    private float tiempoRespuesta;
    private float tiempoEjecucion;

    //Métodos 
    public String getId() { //Obteniendo el id del proceso
        return id; 
    }

    public void setId(String id) { //Recibe y asigna id 
        this.id = id; 
    }

    public String getNombre() { //Obtiene el nombre del proceso
        return nombre;
    }

    public void setNombre(String nombre) { //Recibe y asigna nombre del proceso
        this.nombre = nombre;
    }

    public int getTamano() { //Obtiene tamaño del proceso
        return tamano; 
    }

    public void setTamano(int tamano) { //Recibe y asigna el tamaño del proceso
        this.tamano = tamano;
    }

    public int getTiempoServicio() { //Obtiene el tiempo de servicio del proceso
        return tiempoServicio;
    }
    
    public void setTiempoServicio(int tiempoServicio) { //Recibe y asigna el tiempo de servicio del proceso
        this.tiempoServicio = tiempoServicio;
    }
    
    public float getTiempoEjecucion() { //Obtiene el tiempo de ejecución
        return tiempoEjecucion;
    }

    public void setTiempoEjecucion(int tiempoEjecucion) { //Recibe y asigna el tiempo de ejecución 
        this.tiempoServicio = tiempoEjecucion;
    }

    public int getTiempoLlegada() { //Obtiene el tiempo de llegada del proceso
        return tiempoLlegada;
    }

    public void setTiempoLlegada(int tiempoLlegada) { //Recibe y asigna el tiempo de llegada  del proceso
        this.tiempoLlegada = tiempoLlegada;
    }

    public float getTiempoEspera() { //Obtiene el tiempo de espera del proceso
        return tiempoEspera;
    }

    public void setTiempoEspera(int tiempoEspera) { //Recibe y asigna el tiempo de espera del proceso
        this.tiempoEspera = tiempoEspera;
    }
    
    public float getTiempoRespuesta() { //Obteniendo tiempo de respuesta del proceso
        return tiempoRespuesta;
    }

    public void setTiempoRespuesta(int tiempoRespuesta) { //Recibe y asigna tiempo de respuesta del proceso
        this.tiempoRespuesta = tiempoRespuesta;
    }
    
    //Método contructor
    public Proceso(String id, String nombre, int tamano, int tiempoServicio, int tiempoLlegada) {
        this.id = id;
        this.nombre = nombre;
        this.tamano = tamano;
        this.tiempoServicio = tiempoServicio;
        this.tiempoLlegada = tiempoLlegada;
    }
}