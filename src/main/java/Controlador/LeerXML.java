/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Partida;
import Modelo.JaulasKenKen;
import Controlador.ManejoInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * Clase que lee el XML
 * @author Jose Pablo Vega Solano
 */
public class LeerXML {
    
    private List<JaulasKenKen> jaulasList;
    private List<Partida> listaPartidas;
    private String XMLRuta;
    private int tamaño;
    
    /**
     * Constructor
     * @param tamaño Tamaño de la cuadricula
     */
    public LeerXML(int tamaño) 
    {
        //Se inicializan los valores
        this.tamaño = tamaño;
        jaulasList = new ArrayList<>();
        listaPartidas = new ArrayList<>();
        XMLRuta = "src/main/java/Modelo/KenKen.xml";
        realizarLectura();

    }
    
    /**
     * Metodo que realiza la lectura
     * Asigna los valores de ciertos datos a base del contenido de las etiquetas de XML
     */
    public void realizarLectura()
    {

        try {
            
            //Se usa la ruta proporcionada para leer el xml y almacenarlo 
            File file = new File(XMLRuta);
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(file);
            doc.getDocumentElement().normalize();
            
            //Se hace una lista de nodos de los elementos con la etiqueta "partida"
            NodeList partidaList = doc.getElementsByTagName("partida");
            
            //Se recorren todos los nodos de la lista de nodos
            for (int i = 0; i < partidaList.getLength(); i++) 
            {
                
                //Se limpia cualquier contenido de la lista de jaulas para que no se acumule ningún valor anteior
                jaulasList.clear();
                
                //Se escoge el nodo actual para operar sobre el
                Node partidaNode = partidaList.item(i);

                //Se recorren los elementos del nodo
                if (partidaNode.getNodeType() == Node.ELEMENT_NODE) 
                {
                    
                    Element partidaElement = (Element) partidaNode;

                    //Se obtienen los elementos del nodo que tengan la etiqueta "jaula"
                    NodeList jaulaList = partidaElement.getElementsByTagName("jaula");
                    
                    //Se recorre la lista de elementos jaula
                    for (int j = 0; j < jaulaList.getLength(); j++) 
                    {
                          
                        Node jaulaNode = jaulaList.item(j);

                        if (jaulaNode.getNodeType() == Node.ELEMENT_NODE) 
                        {
                            
                            Element jaulaElement = (Element) jaulaNode;
                            String jaulaData = jaulaElement.getTextContent();
                            String[] jaulaDataArray = jaulaData.split(",");//Se almacena el contenido del nodo jaula en una lista, separándolos por coma
      
                            //Se almacena el primer elemento en una variable entera
                            int valor = Integer.parseInt(jaulaDataArray[0].trim());
                            
                            //Se almacena el segundo elemento en una variable String
                            String operacion = jaulaDataArray[1].trim();

                            //Se crea una lista para almacenar las coordenadas de las celdas de la jaula
                            List<Integer> coordenadas = new ArrayList<>();
                            
                            //Se recorren los elementos de la lista jaula, sin contar los primeros dos que ya se almacenaron
                            for (int k = 2; k < jaulaDataArray.length-1; k = k+2) 
                            {
                                
                                String coordenada = jaulaDataArray[k].trim();                               
                                
                                coordenada = coordenada + "," + jaulaDataArray[k+1].trim();
                                
                                // Eliminar los paréntesis
                                coordenada = coordenada.replaceAll("\\(", "").replaceAll("\\)", "");
                                String[] coordenadaArray = coordenada.split(",");
                                
                                //Estos ajustes se hacen porque el formato del xml es para una matriz
                                //pero nosotros trabajaremos con ArrayList
                                int row = Integer.parseInt(coordenadaArray[0].trim()) - 1; // Restar 1 para ajustar a ArrayList
                                int col = Integer.parseInt(coordenadaArray[1].trim()) - 1; // Restar 1 para ajustar a ArrayList

                                int index = row * tamaño + col; // Calcular el índice en ArrayList
                                
                                //Se almacenan los valores en la variable "coordenadas"
                                coordenadas.add(index);
                                
                            }
                            
                            //Se crea un objeto "JaulasKenKen" con los valores que ya almacenamos en las variables
                            JaulasKenKen jaula = new JaulasKenKen(valor, operacion, coordenadas);
                            
                            //Se añade la jaula a la lista de jaulas
                            jaulasList.add(jaula);
                            
                        }

                    }
                    
                    //Se guarda la dificultad en una variable String
                    NodeList dificultadPartidaElement = partidaElement.getElementsByTagName("niveldedificultad");
                    String nivelDificultad = dificultadPartidaElement.item(0).getTextContent();
                    
                    //Se crea un elemento partida en el que almacenamos la lisa de jaulas previamente creada
                    Partida partida = new Partida(nivelDificultad, new ArrayList<>(jaulasList));
                    
                    //Se añade la partida a la lista de partidas
                    listaPartidas.add(partida);
                    
                }
                
            }
            
        } 
        catch (Exception e) 
        {
            
            e.printStackTrace();
            
        }
    }

    /**
     * Metodo que retorna la lista de partidas
     * @return Retorna la lista de partidas
     */
    public List<Partida> getListaPartidas() 
    {

        return listaPartidas;
        
    }
    
}
