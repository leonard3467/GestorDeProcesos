package proyecto_so;

/**
 *
 * @author leo
 */
public class AdministradorProcesos {
 public void simularCargaProcesos(ColaProcesosListos procesos, ColaFIFO colaFIFO, int tamanoMemoria,int quantum) {
        int memoriaDisponible = tamanoMemoria;
        int Quantum= quantum;
        int tiempo = procesos.getInicio().proceso.getTiempoLlegada(); // Tiempo de conteo del programa
        Proceso enEjecucion = null;
        int bandera=0;
        int banderaEspacio=0;
        int tiempototal=procesos.sumarTiemposServicio();
        System.out.println("\n<----->  Tiempo total de servicio de todos los procesos = "+tiempototal + " <----->");
        while ((!procesos.estaVacia() || !colaFIFO.estaVacia())|| tiempo!=tiempototal) {
            while(procesos.estaVacia()==false && procesos.getInicio().proceso.getTiempoLlegada()<=tiempo && banderaEspacio==0){ // Verifica que los tiempos de llegada de los procesos sean los mismos
         
                Proceso proceso = procesos.getInicio().getProceso();
                if (proceso.getTamano() <= memoriaDisponible) {
                    procesos.eliminarProceso();
                    colaFIFO.encolar(proceso);
                    
                    memoriaDisponible -= proceso.getTamano();
                    System.out.println("\n-> El proceso " + proceso.getId() + " subio a la cola de Procesos listos para ejecucion y restan " + memoriaDisponible + " unidades de memoria en el tiempo "+tiempo);                
                    colaFIFO.imprimirContenido();
                } 
                else {
                    System.out.println("-> El proceso " + proceso.getId() + " no puede ser cargado en memoria, por lo tanto va a la cola de procesos listos");
                    //procesos.devolver(proceso);
                    banderaEspacio=1;
                    procesos.imprimirContenido();
                    colaFIFO.imprimirContenido();
                }     
            }
         
            if (bandera==0 || enEjecucion==null){
                System.out.println("--- Tiempo: " +tiempo +"  |  Memoria: "+tamanoMemoria+ "   ---");
                enEjecucion=colaFIFO.desencolar();
                if (enEjecucion==null) {
                    System.out.println("Esperando proceso ....");
                    
                }else{
                System.out.println("El proceso "+enEjecucion.getId()+" esta en ejecucion en el tiempo "+tiempo);}
                bandera=1;
            }
           
            
            
            if (Quantum==0) { 
                System.out.println("\n---| Tiempo: " +tiempo +" |---");
                Quantum=quantum;
                if (enEjecucion.getTiempoServicio()==0) {
                    memoriaDisponible += enEjecucion.getTamano();
                    System.out.println("El proceso "+ enEjecucion.getId()+ " ha concluido en el tiempo "+tiempo +" liberando "+enEjecucion.getTamano() + " unidades de memoria :D");
                    System.out.println("Memoria disponible actual = "+memoriaDisponible);
                    banderaEspacio=0;
                
                
                } else{
                    colaFIFO.encolar(enEjecucion);
                }
                enEjecucion=colaFIFO.desencolar();
                if(enEjecucion==null){
                        System.out.println("\nEsperando Proceso....");
                    }else{
                    System.out.println("El proceso " + enEjecucion.getId() + " subio en el tiempo "+tiempo + " a la CPU");}
               }else{
                
                 if (enEjecucion.getTiempoServicio()==0) { // Cuando el Quantum no se termina, pero el de rafaga ya se acabo
                    banderaEspacio=0;
                    enEjecucion.setTiempoEjecucion(tiempo - enEjecucion.getTiempoLlegada());
                    System.out.println("\n--- Tiempo: " +tiempo +" ---");
                    Quantum=quantum; // Se reinicia el quantum
                    memoriaDisponible += enEjecucion.getTamano(); // La memoria
                    System.out.println("El proceso "+ enEjecucion.getId()+ " ha concluido en el tiempo "+tiempo +" liberando "+enEjecucion.getTamano()+" unidades de memoria :D");
                    enEjecucion=colaFIFO.desencolar();
                    if(enEjecucion==null){
                        System.out.println("Esperando Proceso....");
                    }else{
                    System.out.println("El proceso " + enEjecucion.getId() + " subio en el tiempo "+tiempo + " a la CPU");}
                }
                
            }
            
                
             
            
          
        
        if(enEjecucion==null){
            
            System.out.println("Esperando Proceso....");
        }else{
        Quantum--;
        tiempo++;
            
        enEjecucion.setTiempoEjecucion(enEjecucion.getTiempoServicio()-1);}
        
        
        
        
        }
        
        System.out.println("|| Memoria " +memoriaDisponible + " ||"); 
        System.out.println("|| Tiempo "+tiempo + " ||");
        procesos.imprimirContenido();
        colaFIFO.imprimirContenido();
    }
    
 
    
    
}
