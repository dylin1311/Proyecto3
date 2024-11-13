/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que guarda los datos de jugadores de un size de cuadricula
 * @author Kenneth Vargas Chacon
 */
public class Nivel implements Serializable{
    
    private String cuadricula;//Tamaño
    private List<Jugador> ListaFacil = new ArrayList<>();//Lista facil
    private List<Jugador> ListaMedio = new ArrayList<>();//Lista Medio
    private List<Jugador> ListaDificil = new ArrayList<>();//Lista Dificil
    
    /**
     * Constructor
     * @param cuadricula El tamaño
     * @param dificultad La dificultad
     * @param listaFacil La lista de jugadores en facil
     * @param listaMedio La lista de jugadores en medio
     * @param listaDificil La lista de jugadores en dificil
     */
    public Nivel(String cuadricula,String dificultad, List<Jugador> listaFacil, List<Jugador> listaMedio, List<Jugador> listaDificil){
        this.cuadricula = cuadricula;
        ListaFacil = listaFacil;
        ListaMedio = listaMedio;
        ListaDificil = listaDificil;
    }
    /**
     * Constructor provisional
     * @param cuadricula El tamaño de la cuadricula
     */
    public Nivel(String cuadricula ){
        this.cuadricula = cuadricula;
    }
    /**
     * Añade a la lista facil
     * @param nuevo Nuevo jugador
     */
    public void addfacil(Jugador nuevo){
        ListaFacil.add(nuevo);
    }
    /**
     * Añade a la lista medio
     * @param nuevo Nuevo jugador
     */
    public void addMedio(Jugador nuevo){
        ListaMedio.add(nuevo);
    }
    /**
     * Añade a lista dificil
     * @param nuevo Nuevo jugador
     */
    public void addDificil(Jugador nuevo){
        ListaDificil.add(nuevo);
    }
    /**
     * Retorna el tamaño
     * @return El string de tamaño
     */
    public String getCuadricula() {
        return cuadricula;
    }
    /**
     * Retorna la lista facil
     * @return Retorna la lista
     */
    public List<Jugador> getListaFacil() {
        return ListaFacil;
    }
    /**
     * Retorna la lista medio
     * @return Retorna la lista
     */
    public List<Jugador> getListaMedio() {
        return ListaMedio;
    }
    /**
     * Retorna la lista dificil
     * @return Retorna la lista
     */
    public List<Jugador> getListaDificil() {
        return ListaDificil;
    }
    
    /**
     * Funcion que ordena la lista de jugadores
     * @param lista Lista de jugadores
     */
    public void ordenarJugadores(List<Jugador> lista) {
    for (int j = 1; j < lista.size(); j++) {
        Jugador key = lista.get(j);
        int i = j - 1;
        
        // Corregir el bucle while y cambiar las comparaciones
        while (i >= 0 && lista.get(i).getTiempototal() > key.getTiempototal()) {
            lista.set(i + 1, lista.get(i));
            i--;
        }
        
        lista.set(i + 1, key);
        }
    }

    
    /**
     * Este metodo lo que hace es permitir imprimir o listar todos los jugadores de una dificultad y un tamaño específico
     * @param lista Es una de las listas de los atributos
     * @return Es un String que contiene todos los datos de los jugadores
     * Llama a {@link Jugador#toString() }
     */
    
    public String imprimirListaNivel(List<Jugador> lista){
        String str="";
        for (Jugador persona: lista){
            str+=persona.toString()+"\n";
        }
        return str;
    }
    
}
