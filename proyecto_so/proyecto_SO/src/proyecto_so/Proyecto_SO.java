/**
 * @author Miss Leonard 
 */

package proyecto_so;
import java.util.Scanner; //Libreria para poder utilizar clase Scanner

public class Proyecto_SO {

    public static void main(String[] args) {
        /*
        System.out.println("--> BIENVENIDO AL SIMULADOR DE PLANIFICADOR DE PROCESOS <---");
        
        Scanner scanner = new Scanner(System.in); // Inicializa el scanner
        
        System.out.println("\nPrimero, introduzca el valor que tendra la memoria: ");
        int memoriaTot =scanner.nextInt(); //Guarda el total de la memoria que se tiene
      
        
        System.out.println("\nAhora, introduzca el Quantum que tendra cada proceso al ejecutarse: ");
        int quantumTot = scanner.nextInt(); //Se guarda el quantum que se desea 
        
        System.out.print("\nAhora, introduzca el numero total de procesos que se van a ejecutar: "); // 
        int totProcesos = scanner.nextInt(); // Se guarda el numero de procesos que se introduce en la consola
        
        ColaProcesosListos procesos = new ColaProcesosListos(); // Se inicializa la cola de procesos listos
        
        System.out.println("\nGracias, por favor introduzca los datos de cada uno de los procesos que se le piden a continuacion");
        
        for(int i = 1; i <= totProcesos; i++){ // El siguiente for ayudará a ingresar uno por uno los datos de todos los procesos totales que se declararon al principio
            System.out.println("\n--- PROCESO " + i + " ---"); 
            String idProceso = "P" + i; //Indicamos proceso a teclear
            String nomProceso = "Proceso " + i;
            System.out.print("Tamano a ocupar de memoria: ");
            int memoProceso = scanner.nextInt(); //Cada tamaño se guarda en memoProceso
            System.out.print("Tiempo de rafaga: ");
            int tiempoRafaga = scanner.nextInt(); //Cada rafaga guardada en tiempoRafaga
            System.out.print("Tiempo de llegada: ");
            int tiempoLlegada = scanner.nextInt(); //Cada llegada guardada en timepoLlegada
            
            //Llamando al método insertarProceso dentro de la clase ColaProcesosListos, con argumentos un nuevo objeto Proceso
            procesos.insertarProceso(new Proceso(idProceso, nomProceso, memoProceso, tiempoRafaga, tiempoLlegada)); 
        }

        //Creando Cola FIFO vacío
        ColaFIFO colaFIFO = new ColaFIFO(); 

        //Creando administrador de procesos vacío
        AdministradorProcesos administrador = new AdministradorProcesos();
        
        //Llamando al método simularCargaProcesos con argumentos de proceso, colaFIIFO, memoriaTot y quantumTot
        administrador.simularCargaProcesos(procesos, colaFIFO, memoriaTot, quantumTot,totProcesos); 
    */
        ColaProcesosListos procesos = new ColaProcesosListos(); // Se inicializa la cola de procesos listos
        procesos.insertarProceso(new Proceso("A", "Proceso 1", 1, 20, 0));
        procesos.insertarProceso(new Proceso("C", "Proceso 3", 1, 8, 0));
        procesos.insertarProceso(new Proceso("B", "Proceso 2", 1, 10, 0));
        procesos.insertarProceso(new Proceso("D", "Proceso 4", 1, 2, 0));
    
        
        procesos.imprimirContenido();
        ColaFIFO colaFIFO = new ColaFIFO();

        AdministradorProcesos administrador = new AdministradorProcesos();
        
        administrador.simularCargaProcesos(procesos, colaFIFO, 1000,4,4);

    
    }
}
