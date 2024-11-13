/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que almacena los datos de las jaulas
 * @author Jose Pablo Vega Solano
 */

public class JaulasKenKen 
{
    private int valor; //El valor al que se tiene que llegar operando dentro de la jaula
    private String operacion; //La operación a realizar entre los operandos dentro de la jaula
    
    private List<Integer> casillasCorrespondientes = new ArrayList<>(); //Una lista con las posiciones de las casillas que forman parte de la jaula
    
    /**
     * Constructor
     * @param valor Valor del resultado de la jaula
     * @param operacion Operacion para llegar al resultado
     * @param casillasCorrespondientes Lista de botones para cada jaula
     */
    public JaulasKenKen(int valor, String operacion, List<Integer> casillasCorrespondientes) //Constructor que recibe parámetros para llenar los valores de los atributos de la clase
    {
        //Asignación de valores
        this.valor = valor;
        this.operacion = operacion;
        this.casillasCorrespondientes = casillasCorrespondientes;
        
    }

    /**
     * Getter de valor
     * @return Retorna el resultado
     */
    public int getValor() {
        return valor;
    }

    /**
     * Getter de operacion
     * @return retorna la operación
     */
    public String getOperacion() {
        return operacion;
    }

    /**
     * Getter de la lista de casillas
     * @return Retorna la lista de botones
     */
    public List<Integer> getCasillasCorrespondientes() {
        return casillasCorrespondientes;
    }
    
}
