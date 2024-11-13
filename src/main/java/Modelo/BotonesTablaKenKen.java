/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;

/**
 * Botones customizados para poder manejarlos a placer con las modificaciones que se requiera
 * @author Jose Pablo Vega
 */

public class BotonesTablaKenKen extends JButton
{
    //Atributos del botón
    private boolean act, err, blanc; //Atributo para colorearlo en caso de estar seleccionado, en caso de tener error o en caso de estar en blanco
    private String textoSuperior = "";
    private String textoCentral = "";
    private String textoLimpio = "";
    
    /**
     * Constructor
     */
    public BotonesTablaKenKen()
    {
        act = false; //Se inicializa el estado en apagado
        
        BotonKenKenListener(); //Llama al listener, se encargará de colorear al botón en caso de ser presionado
        setContentAreaFilled(false); // Desactivar el fondo predeterminado del botón
    
    }

     /**
     * Setter de err
     * @param err Nuevo valor del atributo err
     */
    
    public void SetEstadoErr(boolean err) {
        this.err = err;
    }

    /**
     * Función para activar o desactivar el atributo que indica si está o no en blanco la casilla
     * @param blanc Si la casilla está en blanco o no
     */
    public void setCasillaBlanco(boolean blanc) {
        this.blanc = blanc;
    }
    
    /**
     * Esta función pinta el fondo del botón si este se presiona o si tiene error
     * @param g el contexto gráfico en el que se va a pintar el botón.
     */
    @Override
    protected void paintComponent(Graphics g) 
    {
        
        if (act) //Si se activa
        {
            err = false;
            Graphics2D g2 = (Graphics2D) g;
            g2.setColor(new Color(219, 211, 244));
            g2.fillRoundRect(0, 0, getWidth(), getHeight(), 13, 13);
            
        }
        
        if(blanc)
        {
            
            Graphics2D g2 = (Graphics2D) g;
            g2.setColor(new Color(253, 250, 221));
            g2.fillRoundRect(0, 0, getWidth(), getHeight(), 13, 13);
            
        }
        
        if (err) //Si tiene error
        {
            
            Graphics2D g2 = (Graphics2D) g;
            g2.setColor(new Color(255, 153, 153));
            g2.fillRoundRect(0, 0, getWidth(), getHeight(), 13, 13);
            
        }
        
        this.repaint();//Se actualiza la interfaz
        super.paintComponent(g);

    }
    
    /**
     * Listener que se encarga de modificar el estado del botón para colorearlo en caso de ser presionado
     * Llama a {@link BotonesTablaKenKen#cambiarEstadoAtributo() }
     */
    public void BotonKenKenListener() 
    {
        ActionListener buttonListener = new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                
                cambiarEstadoAtributo();
                
            }  
        };
        
        addActionListener(buttonListener);
        
    }

    /**
     * Función para obtener el estado del botón, se usa para detectar si el botón ya está activo o no, y actuar en consecuencia
     * @return Retorna el estado
     */
    public boolean getEstadoActivo()
    {
        
        return act;
        
    }
    
     /**
     * Cambia el estado del atributo.
     * Llama a {@link BotonesTablaKenKen#desactivarOtrosBotones() }
     */
    public void cambiarEstadoAtributo() 
    {
        
        //Invierte el valor del estado del botón
        act = !act;

        if (act) //Manda a apagar cualquier botón que esté encendido
        {

            desactivarOtrosBotones();

        }
        
    }
    
     /**
     * Desactiva otros botones.
     * Llama a {@link BotonesTablaKenKen#getEstadoActivo() }
     * Llama a {@link BotonesTablaKenKen#cambiarEstadoAtributo() }
     */
    private void desactivarOtrosBotones() 
    {
        
        // Se obtienen los demás botones para poder trabajarlos desde este propio botón
        // getParent nos permite acceder al componente padre del botón
        Component[] componentes = getParent().getComponents();//Obtiene los componentes del padre, o sea, sus botones hermanos

        for (Component componente : componentes) 
        {
            
            //Si el componente está activo y no es este mismo (eso es el "this")
            //es decir, trabaja a todos los demás botones "hermanos"
            
            if (((BotonesTablaKenKen) componente).getEstadoActivo() && componente != this)
            {
                
                BotonesTablaKenKen celda = (BotonesTablaKenKen) componente;
                celda.cambiarEstadoAtributo();
                celda.repaint(); //Actualiza la interfaz
                break;
                //Rompe el ciclo porque solo puede haber un botón activo además del
                //que se acaba de activar, así que no hace falta seguir
                
            }
        }
    }
    
    /**
     * Cambia el texto del centro del boton
     * @param textoCentral Asigna el valor al texto principal, que tiene el resultado y la operacion
     */
    public void setTextoPrincipal(String textoCentral)
    {
        if(act)
        {
            if(textoSuperior == "")
            {
                setText("<html><center>" + textoCentral + "</html>");
                this.textoCentral = textoCentral;
            }
            else
            {
                this.setText("<html><center>" + textoSuperior + "<br><br>" + textoCentral +"</html>");
                this.textoCentral = textoCentral;
            }
        }
    }
    
    /**
     * Cambia el texto del encabezado de la jaula
     * @param texto Establece el numero que pone el jugador
     */
    public void setTextoSuperior(String texto)
    {
        
        this.setText("<html><center>" + texto + "<br><br>" + " " + "</html>");
        textoSuperior = texto;
    }

    /**
     * getter de TextoCentral
     * @return Retorna el texto que contiene al numero de cada boton
     */
    public String getTextoCentral() {
        return textoCentral;
    }
    
    /**
     * Función que retorna una valor booleano según si el botón está en blanco o no
     * @return Si está en blanco o no
     */
    public boolean getEnBlanco()
    {
        return blanc;
    }
    
    /**
     * Funcion que hace un set del texto para dejarlo en blanco
     */
    public void BorrarTextoIndividual()
    {
        if(act)
        {
            if(textoSuperior == "")
            {
                setText("");
                this.textoCentral = "";
            }
            else
            {
                this.setText("<html><center>" + textoSuperior + "<br><br>" + " " + "</html>");
                this.textoCentral = "";
            }
        }
    }
    
    /**
     * Funcion que mantiene el textoSuperior
     */
    public void Reinicio()
    {
        
        if(textoSuperior == "")
        {
            setText("");
            this.textoCentral = "";
        }
        else
        {
             this.setText("<html><center>" + textoSuperior + "<br><br>" + " " + "</html>");
             this.textoCentral = "";
        }
        
    }
}
 
