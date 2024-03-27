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
    private float tiempoEspera = 0;
    private float tiempoRespuesta;
    private float tiempoEjecucion;
    
    private int banderaTiempos = 0;
    private int temp = 0;
    private int esperaMin;
    private int esperaMax;
    private int ejecutado;
    private int ejecucionMax;
    private int banderaEspera = 0;
    
    //---------------------------
    private int contador = 0; //Inicializando contador en 0 que nos sirve para contar las veces que sube un proceso a pc

    public void setContador(int contador) { //Modifica el contador
        this.contador = contador;
    }

    public int getContador() { //Obteniendo el contador
        return contador;
    }

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

    public void setTiempoEspera(float tiempoEspera) { //Recibe y asigna el tiempo de espera del proceso
        this.tiempoEspera = tiempoEspera;
    }
    
    public float getTiempoRespuesta() { //Obteniendo tiempo de respuesta del proceso
        return tiempoRespuesta;
    }

    public void setTiempoRespuesta(int tiempoRespuesta) { //Recibe y asigna tiempo de respuesta del proceso
        this.tiempoRespuesta = tiempoRespuesta;
    }
    


    
    public int getBanderaTiempos() {
        return banderaTiempos;
    }

    public int getEsperaMin() {
        return esperaMin;
    }

    public int getEjecutado() {
        return ejecutado;
    }

    public int getEjecucionMax() {
        return ejecucionMax;
    }

    
    
    
    
    
    
    
    
    public void setTiempoRespuesta(float tiempoRespuesta) {
        this.tiempoRespuesta = tiempoRespuesta;
    }

    public void setTiempoEjecucion(float tiempoEjecucion) {
        this.tiempoEjecucion = tiempoEjecucion;
    }

    public void setBanderaTiempos(int banderaTiempos) {
        this.banderaTiempos = banderaTiempos;
    }

    public void setEsperaMin(int esperaMin) {
        this.esperaMin = esperaMin;
    }

    public void setEjecutado(int ejecutado) {
        this.ejecutado = ejecutado;
    }

    public void setEjecucionMax(int ejecucionMax) {
        this.ejecucionMax = ejecucionMax;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }
    
   public void setEsperaMax(int esperaMax){
       this.esperaMax = esperaMax;
   } 
   
   public int getEsperaMax(){
       return esperaMax;
   }

    public int getBanderaEspera() {
        return banderaEspera;
    }

    public void setBanderaEspera(int banderaEspera) {
        this.banderaEspera = banderaEspera;
    }
   
   
    
    
    //Método contructor
    public Proceso(String id, String nombre, int tamano, int tiempoServicio, int tiempoLlegada) {
        this.id = id;
        this.nombre = nombre;
        this.tamano = tamano;
        this.tiempoServicio = tiempoServicio;
        this.tiempoLlegada = tiempoLlegada;
        //this.tiempoEspera = tiempoEspera;
        //////////----------------------------
        //this.contador = contador;
    }
}