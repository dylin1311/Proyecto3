/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Nivel;
import java.io.Serializable;

/**
 *Clase que guarda las listas y conforma el Patron Singleton
 * @author Kenneth Vargas Chacon
 */
public class ListaNiveles {
    
    private static Nivel nivel3x3 = new Nivel("3x3");
    private static Nivel nivel4x4 = new Nivel("4x4");
    private static Nivel nivel5x5 = new Nivel("5x5");
    private static Nivel nivel6x6 = new Nivel("6x6");
    private static Nivel nivel7x7 = new Nivel("7x7");
    private static Nivel nivel8x8 = new Nivel("8x8");
    private static Nivel nivel9x9 = new Nivel("9x9");
    
    //SINGLETON: atributo estatico privado que hace referencia a la clase
    private static ListaNiveles instance = null;
    
    /**
     * Constructor privado para evitar la creacion de nuevas instancias fuera de la clase
     */
    private ListaNiveles(){
        
    }
    
    /**
     * Metodo que permite que solamente exista una instancia y de esta forma el patron tenga forma 
     * @return retorna la instancia.
     */
    public static ListaNiveles getInstance(){
        if (instance == null){
            instance = new ListaNiveles();
        }
        return instance;
    }

    /**
     * Getter
     * @return El nivel 
     */
    public static Nivel getNivel3x3() {
        return nivel3x3;
    }
    /**
     * Setter
     * @param nivel3x3 Valor de nivel
     */
    public static void setNivel3x3(Nivel nivel3x3) {
        ListaNiveles.nivel3x3 = nivel3x3;
    }
    /**
     * Getter
     * @return El nivel 
     */
    public static Nivel getNivel4x4() {
        return nivel4x4;
    }
    /**
     * Setter
     * @param nivel4x4 Valor de nivel
     */
    public static void setNivel4x4(Nivel nivel4x4) {
        ListaNiveles.nivel4x4 = nivel4x4;
    }
    /**
     * Getter
     * @return El nivel 
     */
    public static Nivel getNivel5x5() {
        return nivel5x5;
    }
    /**
     * Setter
     * @param nivel5x5 Valor de nivel
     */
    public static void setNivel5x5(Nivel nivel5x5) {
        ListaNiveles.nivel5x5 = nivel5x5;
    }
    /**
     * Getter
     * @return El nivel 
     */
    public static Nivel getNivel6x6() {
        return nivel6x6;
    }
    /**
     * Setter
     * @param nivel6x6 Valor de nivel
     */
    public static void setNivel6x6(Nivel nivel6x6) {
        ListaNiveles.nivel6x6 = nivel6x6;
    }
    /**
     * Getter
     * @return El nivel 
     */
    public static Nivel getNivel7x7() {
        return nivel7x7;
    }
    /**
     * Setter
     * @param nivel7x7 Valor de nivel
     */
    public static void setNivel7x7(Nivel nivel7x7) {
        ListaNiveles.nivel7x7 = nivel7x7;
    }
    /**
     * Getter
     * @return El nivel 
     */
    public static Nivel getNivel8x8() {
        return nivel8x8;
    }
    /**
     * Setter
     * @param nivel8x8 Valor de nivel
     */
    public static void setNivel8x8(Nivel nivel8x8) {
        ListaNiveles.nivel8x8 = nivel8x8;
    }
    /**
     * Getter
     * @return El nivel 
     */
    public static Nivel getNivel9x9() {
        return nivel9x9;
    }
    /**
     * Setter
     * @param nivel9x9 Valor de nivel 
     */
    public static void setNivel9x9(Nivel nivel9x9) {
        ListaNiveles.nivel9x9 = nivel9x9;
    }
    
    
    
}
