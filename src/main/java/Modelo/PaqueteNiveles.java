/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Controlador.ListaNiveles;
import java.io.Serializable;

/**
 *Clase de copia
 * @author Kenneth Vargas Chacon
 */
public class PaqueteNiveles implements Serializable{
    
    private  Nivel nivel3x3 = new Nivel("3x3");//nivel3x3
    private  Nivel nivel4x4 = new Nivel("4x4");//nivel4x4
    private  Nivel nivel5x5 = new Nivel("5x5");//nivel5x5
    private  Nivel nivel6x6 = new Nivel("6x6");//nivel6x6
    private  Nivel nivel7x7 = new Nivel("7x7");//nivel7x7
    private  Nivel nivel8x8 = new Nivel("8x8");//nivel8x8
    private  Nivel nivel9x9 = new Nivel("9x9");//nivel9x9
    
    /**
     * Constructor
     */
    public PaqueteNiveles() {
        this.nivel3x3 = ListaNiveles.getNivel3x3();
        this.nivel4x4 = ListaNiveles.getNivel4x4();
        this.nivel5x5 = ListaNiveles.getNivel5x5();
        this.nivel6x6 = ListaNiveles.getNivel6x6();
        this.nivel7x7 = ListaNiveles.getNivel7x7();
        this.nivel8x8 = ListaNiveles.getNivel8x8();
        this.nivel9x9 = ListaNiveles.getNivel9x9();
    }
    /**
     * Funcion que pasa a la lista todos los datos serializados
     */
    public void cargarDatos(){
        ListaNiveles.setNivel3x3(nivel3x3);
        ListaNiveles.setNivel4x4(nivel4x4);
        ListaNiveles.setNivel5x5(nivel5x5);
        ListaNiveles.setNivel6x6(nivel6x6);
        ListaNiveles.setNivel7x7(nivel7x7);
        ListaNiveles.setNivel8x8(nivel8x8);
        ListaNiveles.setNivel9x9(nivel9x9);
    }
    /**
     * Getter de la lista
     * @return La lista
     */
    public Nivel getNivel3x3() {
        return nivel3x3;
    }
    /**
     * Setter
     * @param nivel3x3 Lista
     */
    public void setNivel3x3(Nivel nivel3x3) {
        this.nivel3x3 = nivel3x3;
    }
    /**
     * Getter de la lista
     * @return La lista
     */
    public Nivel getNivel4x4() {
        return nivel4x4;
    }
    /**
     * Setter
     * @param nivel4x4 Lista
     */
    public void setNivel4x4(Nivel nivel4x4) {
        this.nivel4x4 = nivel4x4;
    }
    /**
     * Getter de la lista
     * @return La lista
     */
    public Nivel getNivel5x5() {
        return nivel5x5;
    }
    /**
     * Setter
     * @param nivel5x5 Lista
     */
    public void setNivel5x5(Nivel nivel5x5) {
        this.nivel5x5 = nivel5x5;
    }
    /**
     * Getter de la lista
     * @return La lista
     */
    public Nivel getNivel6x6() {
        return nivel6x6;
    }
    /**
     * Setter
     * @param nivel6x6 Lista
     */
    public void setNivel6x6(Nivel nivel6x6) {
        this.nivel6x6 = nivel6x6;
    }
    /**
     * Getter de la lista
     * @return La lista
     */
    public Nivel getNivel7x7() {
        return nivel7x7;
    }
    /**
     * Setter
     * @param nivel7x7 Lista
     */
    public void setNivel7x7(Nivel nivel7x7) {
        this.nivel7x7 = nivel7x7;
    }
    /**
     * Getter de la lista
     * @return La lista
     */
    public Nivel getNivel8x8() {
        return nivel8x8;
    }
    /**
     * Setter
     * @param nivel8x8 Lista
     */
    public void setNivel8x8(Nivel nivel8x8) {
        this.nivel8x8 = nivel8x8;
    }
    /**
     * Getter de la lista
     * @return La lista
     */
    public Nivel getNivel9x9() {
        return nivel9x9;
    }
    /**
     * Setter
     * @param nivel9x9 Lista
     */
    public void setNivel9x9(Nivel nivel9x9) {
        this.nivel9x9 = nivel9x9;
    }
    
    
}
