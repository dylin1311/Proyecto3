/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Modelo;

import java.awt.Font;
import javax.swing.JLabel;

/**
 * Clase que permite visualizar el tiempo corriendo como un cronometro
 * @author Kenneth Vargas Chacon
 */
public class CronoLabel extends javax.swing.JLabel {

    private ThreadCrono cronometro; //Referencia al thread
    private int segundos = 0; //Segundos
    private int minutos = 0; //Minutos
    private int horas = 0; //Horas
    
    /**
     * Metodo constructor
     * Inicializa el tiempo, crea una referencia al thread con el que se complemeta
     */
    public CronoLabel() {
      
        cronometro = new ThreadCrono(this);
        cronometro.start();
        
    this.setFont(new java.awt.Font("Arial", 0, 28)); // NOI18N
    this.setSize(100,100);
    }
    
    /**
     * Metodo que actualiza el cronometro en la pantalla
     * @param tiempo Este parametro es un string que ya viene actualizado
     */
    public void actualizarLabel(String tiempo){
        
        this.setText(tiempo);
        
    }

    /**
     * Metodo que realmente mantiene funcionando el contador, pues controla los atributos para poder imprimirlos en pantalla
     * Llama a {@link CronoLabel#actualizarLabel(java.lang.String) }
     * Llama a {@link CronoLabel#formatNumber(int) }
     */
    public void incrementarContador(){
    if(segundos>59){
        segundos=0;
        minutos++;
    }else segundos++;
    if(minutos>59){
        minutos=0;
        horas++;
    }

    actualizarLabel(formatNumber(horas) + ":" + formatNumber(minutos) + ":" + formatNumber(segundos));
    } 

    /**
     * Metodo que corta directamente el ciclo 
     */
    public void detenerCronometro(){
        
        cronometro.setRunning(false);
        
    }
    
    /**
     * Metodo que pausa el cronometro
     */
    public void pausarCronometro(){
        
        cronometro.setPausa(true);
        
    }
    
    /**
     * Metodo que reanuda el cronometro
     */
    public void reanudarCronometro(){
        
        cronometro.setPausa(false);
        
    }
    
    /**
     * Metodo que revisa si uno de los datos es menos a 10 para poder asignar un 0 antes de este, ademas lo pasa a String
     * @param tiempo Es el dato del atributo segundos, minutos u horas
     * @return Un string con el tiempo en nuevo formato
     */
    private String formatNumber(int tiempo) {
        if (tiempo<10){
            return "0" + tiempo;
        }else{
            return tiempo + "";
        }
    }
    
    /**
     * Getter de segundos
     * @return Retorna el atributo Segundos
     */
    public int getSegundos() {
        return segundos;
    }

    /**
     * Setter de segundos
     * @param segundos segundos recoge un entero que va a ser el atributo segundos
     */
    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    /**
     * Getter de Minutos
     * @return Retorna el atributo minutos
     */
    public int getMinutos() {
        return minutos;
    }

    /**
     * Setter de minutos
     * @param minutos Recoge un entero que va a ser el atributo minutos
     */
    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    /**
     * getter de horas
     * @return Retorna el atributo horas
     */
    public int getHoras() {
        return horas;
    }

    /**
     * Setter de horas
     * @param horas Recoge un dato entero que va a ser el atributo hora
     */
    public void setHoras(int horas) {
        this.horas = horas;
    }
    
    
    
}