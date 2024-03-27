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
    // 
    private int tMaxEjecucion; 
    private int tMaxEspera;
    private int tPrimeraVez=-1;// priemra vez que sube 
    // --- 
    private float tEjecutado = 0;
    private int contador = 0; //Inicializando contador en 0 que nos sirve para contar las veces que sube un proceso a pc
    // getters y seters
    public void setContador(int contador) { //Modifica el contador
        this.contador = contador;
    }

    public int getContador() { //Obteniendo el contador
        return contador;
    }

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
   
    public int getTiempoLlegada() { //Obtiene el tiempo de llegada del proceso
        return tiempoLlegada;
    }

    public void setTiempoLlegada(int tiempoLlegada) { //Recibe y asigna el tiempo de llegada  del proceso
        this.tiempoLlegada = tiempoLlegada;
    }

    public int gettMaxEjecucion() {
        return tMaxEjecucion;
    }

    public void settMaxEjecucion(int tMaxEjecucion) {
        this.tMaxEjecucion = tMaxEjecucion;
    }

    public int gettMaxEspera() {
        return tMaxEspera;
    }

    public void settMaxEspera(int tMaxEspera) {
        this.tMaxEspera = tMaxEspera;
    }

    public int gettPrimeraVez() {
        return tPrimeraVez;
    }

    public void settPrimeraVez(int tPrimeraVez) {
        this.tPrimeraVez = tPrimeraVez;
    }

    public float gettEjecutado() {
        return tEjecutado;
    }

    public void settEjecutado(float tEjecutado) {
        this.tEjecutado = tEjecutado;
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