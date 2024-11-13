/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Modelo;

import Modelo.BotonesTablaKenKen;
import Controlador.ManejoInfo;
import com.mycompany.kenken.Movimiento;
import Controlador.LeerXML;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import java.util.Random;
import java.util.Stack;
import javax.swing.BorderFactory;

/**
 * Panel en el que esta el juego, no es el frame en el que se juega
 * @author Jose Pablo Vega Solano
 */
public class KenKenPanel extends javax.swing.JPanel {

    /**
     * Creates new form KenKenPanel
     */
    
    private List<BotonesTablaKenKen> botonesKenKen; //Array que contendrá los botones, cada uno correspondiente a una casilla de la cuadrícula
    private List<JaulasKenKen> Jaulas;
    private List<Partida> Partidas;//Todas las partidas
    private List<Partida> partidasAUsar;//Solo las que se usarán según el tamaño de la cuadrícula
    private Partida partidaAux;
    private String dificultad;
    private Random random = new Random();
    private Stack<Movimiento> deshacerPila = new Stack<>();
    private Stack<Movimiento> rehacerPila = new Stack<>();
    private int sizeCuadricula;
    private int cantidadBotones;
    
    /**
     * Constructor
     */
    public KenKenPanel() 
    {
        
        partidasAUsar = new ArrayList<>(); 
        Jaulas = new ArrayList<>();
        botonesKenKen = new ArrayList<>(); 
        //CrearBotones();//Función que crea los botones según el tamaño seleccionado de cuadrícula
        initComponents();
    }

    /**
     * Señala el tamaño de la cuadricula
     * @param sizeCuadricula Tamaño
     */
    public void setSizeCuadricula(int sizeCuadricula) 
    {
        Partidas = ManejoInfo.getPartidas(sizeCuadricula);
        this.sizeCuadricula = sizeCuadricula;
        System.out.println("Tamaño de la fila: " + sizeCuadricula);
        CrearBotones();
        
    }
    
    /**
     * Se escogen las posibles 9 partidas según el tamaño de la cuadrícula
     */
    public void escogerPartidas()
    {
        
        switch(sizeCuadricula)
        {
            
            case 3:
                
                partidasAUsar = Partidas.subList(0, 9);
                break;
            
            case 4:
                
                partidasAUsar = Partidas.subList(9, 18);
                break;
                
            case 5:
                
                partidasAUsar = Partidas.subList(18, 27);
                break;
                
            case 6:
                
                partidasAUsar = Partidas.subList(27, 36);
                break;
                
            case 7:
                
                partidasAUsar = Partidas.subList(36, 45);
                break;
            
            case 8:
                
                partidasAUsar = Partidas.subList(45, 54);
                break;
                
            case 9:
                
                partidasAUsar = Partidas.subList(54, 63);
                break;
            
        }
        
    }
    
    /**
     * Setter de dificultad
     * @param dificultad Dificultad de la partida
     */
    public void setDificultad(String dificultad) 
    {
        this.dificultad = dificultad;
    }
    
    /**
     * Funcion para crear botones, con un bucle hasta la cantidad de botones según el tamaño
     */
    public void CrearBotones()
    {
        try
        {
            cantidadBotones = sizeCuadricula * sizeCuadricula;
            System.out.println("Cantidad de botones: " + cantidadBotones);
            for(int i = 1; i <= cantidadBotones; i++) //Ciclo para crear los botones
            {

                BotonesTablaKenKen nuevoBoton = new BotonesTablaKenKen();

                this.add(nuevoBoton); //Se añade el botón al panel
                botonesKenKen.add(nuevoBoton); //Se añade el botón al array

            }
        }
        catch(Exception e)
        {

        }
        
    }
    
    /**
     * Se pintan los bordes según la jaula a la que pertenezca el botón
     * además le agrega texto si este lo incluye o si es presionado
     */
    public void PintarBordesBotones() 
    {
        escogerPartidas();
        try {
            
            int seleccion = 0;//Se inicializa porque sino da error
            int contador = 0;
            
            //Se pone en un if, puesto que al inicializarse el componente la primera vez, dificulta vale null, 
            //pero una vez inicializado, ya se le da un valor nuevo a dificultad
            if(dificultad != null)
            {
                
                switch(dificultad)
                {
                    case "Fácil":

                        // Generar un número aleatorio entre 0 y 2 para escoger alguna de las 3 partidas de dificultad fácil
                        seleccion = random.nextInt(3);
                        break;

                    case "Intermedio":

                        // Generar un número aleatorio entre 3 y 5 para escoger alguna de las 3 partidas de dificultad intermedio
                        seleccion = random.nextInt(3) + 3;
                        break;

                    case "Difícil":

                        // Generar un número aleatorio entre 6 y 8 para escoger alguna de las 3 partidas de dificultad difícil
                        seleccion = random.nextInt(3) + 6;
                        break;

                }
                
            }

            partidaAux = partidasAUsar.get(seleccion); //La Partida que se usará
            Jaulas = partidaAux.getJaulas(); //Se obtienen todas las jaulas
            
            int indiceBtn = 0;

            //Esta lista almacena cuales son los índices de losprimeros botones 
            //de cada lista para ponerles el texto de operación y valor
            List<Integer> primerosBotones = new ArrayList<>();

            for(BotonesTablaKenKen btn : botonesKenKen)
            {
                System.out.println("Vuelta: " + contador);
                int sup = 0, inf = 0, izq = 0, der = 0; //Se inicializan los bordes con valor 0

                for (JaulasKenKen jaulaAux : Jaulas)//Se recorren todas las jaulas
                {

                    if(indiceBtn == 0)
                    {
                        //Se agrega el primer elemento de la jaula
                        primerosBotones.add(jaulaAux.getCasillasCorrespondientes().get(0));

                    }
                    
                    System.out.println("Valor de la casilla correspondiente: " + jaulaAux.getCasillasCorrespondientes());
                    if (jaulaAux.getCasillasCorrespondientes().contains(indiceBtn))//Una vez se encuentre la jaula que contenga al botón actual
                    {

                        //Todos estos if son los encargados de cambiar los bordes y pintarlos
                        //o despintalos en función de si una casilla tiene casillas hermanas

                        if (jaulaAux.getCasillasCorrespondientes().contains(indiceBtn + 1)){ der = 0; System.out.println("Primer if");}
                        else{der = 1; System.out.println("Primer else");}

                        if (jaulaAux.getCasillasCorrespondientes().contains(indiceBtn - 1)){ izq = 0; System.out.println("Segundo if");}
                        else{izq = 1; System.out.println("Segundo else");}

                        if (jaulaAux.getCasillasCorrespondientes().contains(indiceBtn + sizeCuadricula)){ inf = 0; System.out.println("Tercer if");}
                        else{inf = 1; System.out.println("Tercer else");}

                        if (jaulaAux.getCasillasCorrespondientes().contains(indiceBtn - sizeCuadricula)){ sup = 0; System.out.println("Cuarto if");}
                        else{sup = 1; System.out.println("Cuarto else");}

                        btn.setBorder(BorderFactory.createMatteBorder(sup, izq, inf, der, Color.BLACK));

                    }

                    //Este if agrega el texto superior en caso de que el botón sea el primero de la lista
                    if (indiceBtn == jaulaAux.getCasillasCorrespondientes().get(0) && !primerosBotones.isEmpty())
                    {
                        String texto = jaulaAux.getValor() + jaulaAux.getOperacion();
                        btn.setTextoSuperior(texto);
                        primerosBotones.remove(0);

                    }

                }

                indiceBtn ++;
                contador++;
            }    
            
        }
        catch (Exception e) 
        {
            
            e.printStackTrace();
            System.out.println("Mensaje de error: " + e.getMessage());
            
        }
    }
    
    /**
     * Es la funcion que de hecho pone un texto en el centro de cada boton
     * @param texto Hace un setter del texto para el numero que coloca el usuario
     * Llama a {@link BotonesTablaKenKen#setTextoPrincipal(java.lang.String) }
     */
    public void AgregarTextoCentral(String texto)
    {
        for(BotonesTablaKenKen btn : botonesKenKen)
        {
            btn.setTextoPrincipal(texto);
        }
    }
    
    /**
     * Esta función borra el texto de un botón 
     * Llama a {@link BotonesTablaKenKen#BorrarTextoIndividual() }
     */
    public void BorrarTextoCasilla()
    {
        for(BotonesTablaKenKen btn : botonesKenKen)
        {
            btn.BorrarTextoIndividual();
        }
    }
    
    /**
     * Esta función borra el texto de todos los botones
     * Llama a {@link BotonesTablaKenKen#Reinicio() }
     */
    public void BorrarTextoTotal()
    {
        for(BotonesTablaKenKen btn : botonesKenKen)
        {
            btn.Reinicio();
        }
    }
    
    /**
     * Esta función retorna true si hay al menos un botón activo
     * Llama a {@link BotonesTablaKenKen#getEstadoActivo() }
     * @return si al menos uno está activo
     */
    public boolean AlMenosUnoActivo()
    {
        for(BotonesTablaKenKen btn : botonesKenKen)
        {
            if(btn.getEstadoActivo()){return true;};
        }
        return false;
    }
    
    /**
     * Esta función valida la partida
     * Llama a {@link BotonesTablaKenKen#getTextoCentral() }
     * @return Si se repiten elementos
     */
    public boolean validarRepetidosJuego()
    {
        for(int i = 0; i <= botonesKenKen.size()-1; i++)
        {
            //System.out.println("Valor de i: " + i);
            if(i != 0)
            {
                if(validarRepetidosFila((i/sizeCuadricula)*sizeCuadricula, i) || validarRepetidosColumna(i%sizeCuadricula, i))
                {
                    return true;
                }
            }
            else
            {
                if(validarRepetidosFila((i/sizeCuadricula)*sizeCuadricula, i) || validarRepetidosColumna(0, i))
                {
                    return true;
                }
            }
            
        }
        return false;
    }
    
    /**
     * Funcion que valida si hay un repetido en una fila
     * @param numFila La fila
     * @param numCasilla La casilla para comparar
     * @return Si está repetido o no
     * Llama a {@link BotonesTablaKenKen#getTextoCentral() }
     * Llama a {@link BotonesTablaKenKen#SetEstadoErr(boolean) }
     */
    public boolean validarRepetidosFila(int numFila, int numCasilla)
    {
        String textoBtnCualquiera;
        String textoBtnActual = botonesKenKen.get(numCasilla).getTextoCentral();
        
        for(int i = 0 + numFila; i < 0 + numFila + sizeCuadricula; i++)
        {
            
            if(i != numCasilla)
            {
                textoBtnCualquiera = botonesKenKen.get(i).getTextoCentral();
                if(textoBtnCualquiera == textoBtnActual && textoBtnCualquiera != "")
                {
                    
                    botonesKenKen.get(numCasilla).SetEstadoErr(true);
                    botonesKenKen.get(i).SetEstadoErr(true);
                    return true;
                    
                }
            }
        }
        
        return false;
    }
    
    /**
     * Funcion que valida si hay un repetido en una fila
     * @param numColumna  La fila
     * @param numCasilla La casilla para comparar
     * @return Si está repetido o no
     * Llama a {@link BotonesTablaKenKen#getTextoCentral() }
     * Llama a {@link BotonesTablaKenKen#SetEstadoErr(boolean) }
     */
    public boolean validarRepetidosColumna(int numColumna, int numCasilla)
    {
        String textoBtnCualquiera;
        String textoBtnActual = botonesKenKen.get(numCasilla).getTextoCentral();
        for(int i = 0 + numColumna; i < 0 + numColumna + (cantidadBotones-(sizeCuadricula-1)); i+=sizeCuadricula)
        {
            if(i != numCasilla)
            {
                textoBtnCualquiera = botonesKenKen.get(i).getTextoCentral();
                if(textoBtnCualquiera == textoBtnActual && textoBtnCualquiera != "")
                {
                    
                    botonesKenKen.get(numCasilla).SetEstadoErr(true);
                    botonesKenKen.get(i).SetEstadoErr(true);
                    return true;
                    
                }
            }
        }
        
        return false;
    }
    
    /**
    * Función que se encargará de manipular el valor de si las casillas están en blanco o no
    * @param modo si es true, se pintan las casillas para indicarle al jugador que quedan casillas sin llenar, si está en false, se despintan
    * Llama a {@link BotonesTablaKenKen#setCasillaBlanco(boolean) }
    */
    public void casillasEnBlanco(boolean modo)
    {
        for(BotonesTablaKenKen btn : botonesKenKen)
        {
            if(btn.getTextoCentral() == "" && modo)
            {
                btn.setCasillaBlanco(true);
            }
            else
            {
                btn.setCasillaBlanco(false);
            }
        }
    }
    /**
     * Metodo que quita el estado de error
     * Llama a {@link BotonesTablaKenKen#SetEstadoErr(boolean) }
     */
    public void QuitarEstadoError()
    {
        for(BotonesTablaKenKen btn : botonesKenKen)
        {
            btn.SetEstadoErr(false);
        }
    }
    
    /**
     * Funcion que valida si el resultado dentro de las jaulas coincide con lo requerido por el texto superior
     * @return Si está correcto o no
     * Llama a {@link JaulasKenKen#getCasillasCorrespondientes() }
     * Llama a {@link BotonesTablaKenKen#getTextoCentral() }
     * Llama a {@link JaulasKenKen#getOperacion() }
     * Llama a {@link JaulasKenKen#getValor() }
     * Llama a {@link BotonesTablaKenKen#SetEstadoErr(boolean) }
     */
    public boolean ValidarResultadosJaulas()
    {
        List<Integer> casillasJaula;
        int resultado = 0;
        int n1, n2 = 0;
        boolean caso = true; //esta variable será la que se retornará, comienza en true, se volverá false si algún valor no cumple el resultado esperado
        for (JaulasKenKen jaulaAux : Jaulas)//Se recorren todas las jaulas
        {
        
            if(caso)
            {
                casillasJaula = jaulaAux.getCasillasCorrespondientes();
                
                n1 = casillasJaula.get(0);
                
                //Este if es para que no se caiga en las casillas de las constantes
                if(casillasJaula.size() != 1)
                {
                    n2 = casillasJaula.get(1);
                }
                
                if(!botonesKenKen.get(n1).getTextoCentral().equals("")
                    && !botonesKenKen.get(n2).getTextoCentral().equals(""))
                {

                    //Todo este condicional maneja la resta, división y las casillas de constantes
                    switch (jaulaAux.getOperacion()) {
                        case "-":

                            n1 = casillasJaula.get(0);
                            n2 = casillasJaula.get(1);
                            
                            
                            if(Integer.parseInt(botonesKenKen.get(n1).getTextoCentral()) - Integer.parseInt(botonesKenKen.get(n2).getTextoCentral()) == jaulaAux.getValor()
                                    || Integer.parseInt(botonesKenKen.get(n2).getTextoCentral()) - Integer.parseInt(botonesKenKen.get(n1).getTextoCentral()) == jaulaAux.getValor())
                            {
                                continue;
                            }
                            else
                            {
                                botonesKenKen.get(n1).SetEstadoErr(true);
                                botonesKenKen.get(n2).SetEstadoErr(true);
                                return false;
                            }
                        case "/":

                            if(Integer.parseInt(botonesKenKen.get(n1).getTextoCentral()) / Integer.parseInt(botonesKenKen.get(n2).getTextoCentral()) == jaulaAux.getValor()
                                    || Integer.parseInt(botonesKenKen.get(n2).getTextoCentral()) / Integer.parseInt(botonesKenKen.get(n1).getTextoCentral()) == jaulaAux.getValor())
                            {
                                continue;
                            }
                            else
                            {
                                
                                botonesKenKen.get(n1).SetEstadoErr(true);
                                botonesKenKen.get(n2).SetEstadoErr(true);
                                return false;
                            }
                        case " ":
                            if(Integer.parseInt(botonesKenKen.get(n1).getTextoCentral()) == jaulaAux.getValor())
                            {
                                continue;
                            }
                            else
                            {
                                botonesKenKen.get(n1).SetEstadoErr(true);
                                return false;
                            }
                        default:
                            break;
                    }

                    for(int i = 0; i <= casillasJaula.size()-2; i++)//Bucle que revisa las sumas y las multiplicaciones
                    {
                        if(botonesKenKen.get(n1).getTextoCentral() == "" || botonesKenKen.get(n2).getTextoCentral() == "")//Si la casilla está vacía, retorna false
                        {
                            return false;
                        }
                        n1 = casillasJaula.get(i);
                        n2 = casillasJaula.get(i+1);
                        switch (jaulaAux.getOperacion())
                        {
                            case "+":

                                if(i == 0)
                                {
                                    resultado = Integer.parseInt(botonesKenKen.get(n1).getTextoCentral());//Resultado es igual al valor de la primera celda de la jaula
                                }

                                resultado += Integer.parseInt(botonesKenKen.get(n2).getTextoCentral());

                                break;

                            case "*":

                                if(i == 0)
                                {
                                    resultado = Integer.parseInt(botonesKenKen.get(n1).getTextoCentral());//Resultado es igual al valor de la primera celda de la jaula
                                }

                                resultado *= Integer.parseInt(botonesKenKen.get(n2).getTextoCentral());

                                break;

                        }
                    }
                    
                    if(resultado == jaulaAux.getValor())
                    {
                        continue;
                    }
                    else
                    {
                        for(int i = 0; i <= casillasJaula.size()-1; i++)
                        {
                            n1 = casillasJaula.get(i);
                            botonesKenKen.get(n1).SetEstadoErr(true);
                        }
                        return false;
                    }
                    
                }
                else //Si la jaula está vacía, retorna falso
                {
                    return false;
                }
                
            }
                
        }
        
        return caso;
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        setMaximumSize(new java.awt.Dimension(306, 306));
        setMinimumSize(new java.awt.Dimension(306, 306));
        setPreferredSize(new java.awt.Dimension(306, 306));
        setLayout(new java.awt.GridLayout(6, 6));
    }// </editor-fold>                        


    // Variables declaration - do not modify                     
    // End of variables declaration                   
}
