/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Modelo.JaulasKenKen;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que contiene las jaulas y la dificultad de una partida
 * @author Jose Pablo Vega Solano
 */
public class Partida {
    
    private String nivelDificultad;
    private List<JaulasKenKen> jaulas = new ArrayList<>();

    /**
     * Constructor
     * @param nivelDificultad Selecciona un nivel de dificultad para elegir una partida
     * @param jaulas Crea una lista de jaulas para armar el tablero
     */
    public Partida(String nivelDificultad, List<JaulasKenKen> jaulas) 
    {
        
        this.nivelDificultad = nivelDificultad;
        this.jaulas = jaulas;
        
    }
    
    /**
     * Setter de nivelDificultad
     * @param nivelDificultad Selecciona al dificultad para que sea facil buscar una partida de esta misma
     */
    public void setNivelDificultad(String nivelDificultad) 
    {
        this.nivelDificultad = nivelDificultad;
    }

    /**
     * Setter de jaulas
     * @param jaulas Asigna el valor de la lista de jaulas ya hecha a esta partida
     */
    public void setJaulas(List<JaulasKenKen> jaulas) {
        this.jaulas = jaulas;
    }

    /**
     * Getter de getnivelDificultad
     * @return String Retorna el nivel de dificultad
     */
    public String getNivelDificultad() {
        return nivelDificultad;
    }

    /**
     * Getter de una lista que es de Jaulas
     * @return  Retorna la lista de jaulas
     */
    public List<JaulasKenKen> getJaulas() {
        return jaulas;
    }
    
}
