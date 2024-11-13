/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase threas que permite que el cronometro siga corriendo
 * @author Kenneth Vargas Chacon
 */
public class ThreadCrono extends Thread{
    
    private boolean running = true; //Permite que corra el tiempo
    private boolean pausa = false; //Permite pausar el tiempo
    private int contador = 0; //Muestra el tiempo
    private CronoLabel referencia_crono; //Referencia al label
    
    /**
     * Constructor
     * @param pCrono Es una referencia al label
     */
    public ThreadCrono(CronoLabel pCrono){
        
        this.referencia_crono = pCrono;
        
    }

    /**
     * Metodo que permite que todo funcione
     * Llama a {@link CronoLabel#incrementarContador() }
     */
    public void run(){
        
       while (running){
           try {
               
               while(pausa){
                   sleep(100);
               }
               sleep(1000);
               referencia_crono.incrementarContador();
           } catch (InterruptedException ex) {
           }
       }
        
    }
    
    /**
     * Getter del atributo running
     * @return retorna el estado del while true
     */
    public boolean isRunning() {
        return running;
    }
    
    /**
     * Pone el otro estado al elemento pausa
     */
    public void pause(){
        this.pausa = !this.pausa;
    }

    /**
     * Getter de pausa
     * @return Retorna el estado de pausa
     */
    public boolean isPaused() {
        return pausa;
    }
    
    /**
     * Detiene el programa
     */
    public void detener(){
        this.running = false;
    }

    /**
     * Cambia el estado de running
     * @param running Permite cambiar el estado del elemento
     */
    public void setRunning(boolean running) {
        this.running = running;
    }

    /**
     * Setter de pausa
     * @param pausa Asigna un estado al elemento pausas
     */
    public void setPausa(boolean pausa) {
        this.pausa = pausa;
    }
    
}
