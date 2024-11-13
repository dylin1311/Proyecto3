/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * Esta clase permite pasar a .dat y leerlo
 * @author Kenneth Vargas Chacón
 */
public class FileManager {
 
    /**
     * Constructor
     */
    public FileManager(){
        
    }
    // read txt file, para ller el query
    /**
     * Funcion que lee archivos
     * @param path Ruta del archivo
     * @return El contenido del archivo
     * @throws FileNotFoundException Permite que no se caiga
     * @throws IOException Permite que no se caiga
     */
    public static String readFile (String path) throws FileNotFoundException, IOException
    {
       
        String everything;

        try(BufferedReader br = new BufferedReader(new FileReader(path))) 
        {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
        everything = sb.toString();
        }   

        return everything;
    }
    
    
    /**
     * Funcion que escribe archivos
     * @param path Nombre del archivo y su ruta
     * @param value Valor
     * @throws IOException Permite que no se caiga
     */
    public static void writeFile (String path, String value) throws IOException 
    {


        try(BufferedWriter bw = new BufferedWriter (new FileWriter(path, true))) 
        {
            bw.write(value);
            bw.close();
        }
        
    }
    
    /**
     * Funcion que escribe un objeto
     * @param obj El objeto
     * @param filePath El camino o ruta
     */
    public static void writeObject (Object obj, String filePath)
    {
        try{
            //use buffering
            OutputStream file = new FileOutputStream(filePath);
            OutputStream buffer = new BufferedOutputStream(file);
            ObjectOutput output = new ObjectOutputStream(buffer);
            try{
                // escribe el objeto
              output.writeObject(obj);
            }
            finally{
              output.close();
            }
          }  
          catch(IOException ex){
              
          }
        
    }
    
    /**
     * Funcion que lee un objeto
     * @param filePath La ruta o nombre del objeto
     * @return El objeto, pero es necesario hacer un casting
     */
    public static Object readObject(String filePath)
    {
        try{
            //use buffering
            InputStream file = new FileInputStream(filePath);
            InputStream buffer = new BufferedInputStream(file);
            ObjectInput input = new ObjectInputStream (buffer);
            try{
              //deserialize the List
              return input.readObject();
            }
            finally{
              input.close();
            }
          }
          catch(ClassNotFoundException ex){
           
          }
          catch(IOException ex){
            
          }
        return null;
    }  
    
    
    
}// fin clase
