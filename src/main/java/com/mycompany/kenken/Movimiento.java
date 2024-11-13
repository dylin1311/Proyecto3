/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kenken;

/**
 *Clase para guardar los movimientos
 * @author José Pablo Vega
 */
public class Movimiento {
    
    String texto;
    String tipo;
    int numeroBtn;

    /**
     * Constructor
     * @param tipo Tipo de movimiento
     * @param texto Texto interno
     * @param numeroBtn Numero de boton
     */
    public Movimiento(String tipo, String texto, int numeroBtn) {
        this.tipo = tipo;
        this.texto = texto;
        this.numeroBtn = numeroBtn;
    }
    /**
     * Getter
     * @return Atributo texto 
     */
    public String getTexto() {
        return texto;
    }
    /**
     * Getter
     * @return Getter de tipo 
     */
    public String getTipo() {
        return tipo;
    }
    /**
     * Getter
     * @return El numero del boton 
     */
    public int getNumeroBtn() {
        return numeroBtn;
    }
    /**
     * Setter
     * @param texto Asigna el string
     */
    public void setTexto(String texto) {
        this.texto = texto;
    }
    /**
     * Setter
     * @param tipo Asigna el tipo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    /**
     * Setter
     * @param numeroBtn Asigna el numero
     */
    public void setNumeroBtn(int numeroBtn) {
        this.numeroBtn = numeroBtn;
    }
    
}
