/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

/**
 *Clase que despliega el manual de usuario
 * @author Jose Pablo Vega Solano
 */
public class Ayuda {
    /**
     * Constructor
     */
    public Ayuda(){
        
    }
    /**
     * Funcion que abre el manual
     */
    public static void abrirManual(){
        try {
            String ruta= "Manual de usuario.pdf";
            File file = new File(ruta);
            if (file.exists()){
                if (Desktop.isDesktopSupported()){
                    Desktop.getDesktop().open(file);
                }
            }
        } catch (IOException e) {
        }
    }
    
}
