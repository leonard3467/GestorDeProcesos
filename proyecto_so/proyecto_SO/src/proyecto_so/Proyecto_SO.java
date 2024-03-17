package proyecto_so;
import java.util.Scanner;

/**
 * @author Miss Leo 
 */

public class Proyecto_SO {

    public static void main(String[] args) {
        
        System.out.println("--> BIENVENIDO AL SIMULADOR DE PLANIFICADOR DE PROCESOS <---");
        
        Scanner scanner = new Scanner(System.in); // Inicializa el scanner
        
        
        System.out.println("\nPrimero, introduzca el valor que tendra la memoria: ");
        int memoriaTot =scanner.nextInt();
        
        System.out.println("\nAhora, introduzca el Quantum que tendra cada proceso al ejecutarse: ");
        int quantumTot = scanner.nextInt();
        
        System.out.print("\nAhora, introduzca el numero total de procesos que se van a ejecutar: "); // 
        int totProcesos = scanner.nextInt(); // Se guarda el numero de procesos que se introduce en la consola
        
        ColaProcesosListos procesos = new ColaProcesosListos(); // Se inicializa la cola de procesos listos
        
        System.out.println("\nGracias, por favor introduzca los datos de cada uno de los procesos que se le piden a continuacion");
        
        for(int i = 1; i <= totProcesos; i++){ // El siguiente for ayudará a ingresar uno por uno los datos de todos los procesos
            System.out.println("\n--- PROCESO " + i + " ---"); // totales que se declararon al principio
            String idProceso = "P" + i;
            String nomProceso = "Proceso " + i;
            System.out.print("Tamano a ocupar de memoria: ");
            int memoProceso = scanner.nextInt();
            System.out.print("Tiempo de rafaga: ");
            int tiempoRafaga = scanner.nextInt();
            System.out.print("Tiempo de llegada: ");
            int tiempoLlegada = scanner.nextInt();
            
            procesos.insertarProceso(new Proceso(idProceso, nomProceso, memoProceso, tiempoRafaga, tiempoLlegada));
        }

        ColaFIFO colaFIFO = new ColaFIFO(); // Se crea la cola FIFO :D

        AdministradorProcesos administrador = new AdministradorProcesos();
        
        administrador.simularCargaProcesos(procesos, colaFIFO, memoriaTot, quantumTot); // Se define la memoria y el Quantum
        


    }
    
}
