package proyecto_so;

// Aquí se declaran todos los atributos de los procesos, para asi hacer uso de este

/**
 *
 * @author leo
 */

public class Proceso {
    private String id;
    private String nombre;
    private int tamano;
    private int tiempoServicio;
    private int tiempoLlegada;
    private int tiempoEspera;
    private int tiempoRespuesta;
    private int tiempoEjecucion;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public int getTiempoServicio() {
        return tiempoServicio;
    }

    public void setTiempoEjecucion(int tiempoEjecucion) {
        this.tiempoServicio = tiempoEjecucion;
    }


    public int getTiempoLlegada() {
        return tiempoLlegada;
    }

    public void setTiempoLlegada(int tiempoLlegada) {
        this.tiempoLlegada = tiempoLlegada;
    }

    public int getTiempoEspera() {
        return tiempoEspera;
    }

    public int getTiempoRespuesta() {
        return tiempoRespuesta;
    }

    public int getTiempoEjecucion() {
        return tiempoEjecucion;
    }

    public void setTiempoServicio(int tiempoServicio) {
        this.tiempoServicio = tiempoServicio;
    }

    public void setTiempoEspera(int tiempoEspera) {
        this.tiempoEspera = tiempoEspera;
    }

    public void setTiempoRespuesta(int tiempoRespuesta) {
        this.tiempoRespuesta = tiempoRespuesta;
    }
    
    
    
    public Proceso(String id, String nombre, int tamano, int tiempoServicio, int tiempoLlegada) {
        this.id = id;
        this.nombre = nombre;
        this.tamano = tamano;
        this.tiempoServicio = tiempoServicio;
        this.tiempoLlegada = tiempoLlegada;
    }

}
