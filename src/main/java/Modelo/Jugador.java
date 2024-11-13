/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.Serializable;
import static java.lang.Math.pow;

/**
 * Esta clase permite guardar los datos de un jugador en un objeto
 * @author Kenneth Vargas Chacón
 */
public class Jugador implements Serializable{
    
    private final String nombre;//Correo
    private final String correo;//Correo
    private final String tiempo;//Correo
    private int horas;//Horas
    private int minutos;//Minutos
    private int segundos;//Segundos
    private int tiempototal;//Tiempo total

    /**
     * Constructor
     * @param nombre Nombre del jugador
     * @param correo Correo si se desea enviar una notificación
     * @param tiempo Tiempo que se muestra en el podio
     * @param horas Horas para comparar
     * @param minutos Minutos para comparar
     * @param segundos Segundos para comparar
     */
    public Jugador(String nombre, String correo, String tiempo, int horas, int minutos, int segundos) {
        this.nombre = nombre;
        this.correo = correo;
        this.tiempo = tiempo;
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
        this.tiempototal = (int) ((horas*pow(10,4)) + minutos*pow(10,2) + segundos);
    }

    /**
     * Getter de nombre
     * @return Retorna el atributo nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Getter de correo
     * @return Retorna el atributo correo
     */
    public String getCorreo() {
        return correo;
    }
    /**
     * Getter de tiempo
     * @return Retorna el atributo tiempo
     */
    public String getTiempo() {
        return tiempo;
    }
    /**
     * Getter de horas
     * @return Retorna el atributo horas
     */
    public int getHoras() {
        return horas;
    }
    /**
     * Setter de horas
     * @param horas Nuevo valor de horas
     */
    public void setHoras(int horas) {
        this.horas = horas;
    }
    /**
     * Getter de minutos
     * @return Retorna el atributo minutos
     */
    public int getMinutos() {
        return minutos;
    }
    /**
     * Setter de minutos
     * @param minutos Nuevo valor de minutos
     */
    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }
    /**
     * Getter de segundos
     * @return Retorna el atributo segundos
     */
    public int getSegundos() {
        return segundos;
    }
    /**
     * Setter de segundos
     * @param segundos Nuevo valor de segundos
     */
    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
    /**
     * getter de tiempototal
     * @return Retorna el atributo de tiempo total
     */
    public int getTiempototal() {
        return tiempototal;
    }
    /**
     * Setter de tiempo total
     * @param tiempototal Nuevo valor de tiempototal
     */
    public void setTiempototal(int tiempototal) {
        this.tiempototal = tiempototal;
    }

    
    /**
     * Metodo toString
     * @return String de informacion del jugador
     */
    @Override
    public String toString() {
        return "Nombre: " + this.getNombre() + "\tTiempo: " + this.getTiempo();
    }
    
    
    
    
}
