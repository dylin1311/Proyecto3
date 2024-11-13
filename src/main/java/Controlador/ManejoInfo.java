/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.JaulasKenKen;
import java.util.ArrayList;
import java.util.List;
import Modelo.Partida;

/**
 *Esta clase va a manejar la información de las diferentes jaulas extraída del xml
 *Y la información de las pilas con los movimientos realizados y  movimientos deshechos 
 * @author Jose Pablo Vega Solano
 */


public class ManejoInfo 
{
    
    //Lista que almacenará las jaulas según la dificultad seleccionada
    private static List<Partida> listaPartidas = new ArrayList<>();

    
    /**
     * Constructor
     */
    public ManejoInfo() 
    {
        System.out.println(listaPartidas.size());
    }

    /**
     * Función para retornar la lista de las partidas
     * @param tamaño Tamaño de la cuadricula
     * @return Retorna todas las partidas disponibles
     */
    public static List<Partida> getPartidas(int tamaño) 
    {
        LeerXML lectura = new LeerXML(tamaño);
        listaPartidas = lectura.getListaPartidas();
        
        return listaPartidas;
        
    }

    /**
     * Setter de lista
     * @param listaPartidas Asigna las partidas
     */
    public static void setListaPartidas(List<Partida> listaPartidas) {
        ManejoInfo.listaPartidas = listaPartidas;
    }
    
}
