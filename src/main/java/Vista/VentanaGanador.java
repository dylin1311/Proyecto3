/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Modelo.FileManager;
import Modelo.Jugador;
import Controlador.ListaNiveles;
import Modelo.PaqueteNiveles;
import java.util.List;

/**
 * clase para cuando un jugador termina exitosamente una partida cronometrada o temporizada
 * @author José Pablo Vega Solano
 */
public class VentanaGanador extends javax.swing.JFrame {

    private String nombre;
    private String correo;
    private String tiempo;
    private int horas;
    private int minutos;
    private int segundos;
    private int tamaño;
    private String dificultad;
    //public Nivel niveljugado;
    /**
     * Constructor
     * @param tiempo Tiempo
     * @param horas Horas
     * @param minutos   Minutos
     * @param segundos  Segundos
     * @param tamaño tamaño
     * @param dificultad  dificultad
     */
    public VentanaGanador(String tiempo, int horas, int minutos, int segundos, int tamaño, String dificultad) 
    {
        this.tamaño = tamaño;
        this.tiempo = tiempo;
        this.dificultad = dificultad;
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
        initComponents();
        panelError.setVisible(false);
        campoTiempo.setText(tiempo);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        pnlPrincipal = new javax.swing.JPanel();
        pnlTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campoTiempo = new javax.swing.JTextField();
        campoNombre = new javax.swing.JTextField();
        campoCorreo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        panelError = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(650, 370));

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.setMinimumSize(new java.awt.Dimension(650, 370));
        pnlPrincipal.setPreferredSize(new java.awt.Dimension(650, 370));
        pnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlTitulo.setBackground(new java.awt.Color(33, 150, 243));

        jLabel1.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("¡Felicidades! Has terminado el juego");

        javax.swing.GroupLayout pnlTituloLayout = new javax.swing.GroupLayout(pnlTitulo);
        pnlTitulo.setLayout(pnlTituloLayout);
        pnlTituloLayout.setHorizontalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );
        pnlTituloLayout.setVerticalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );

        pnlPrincipal.add(pnlTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 80));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tiempo:");
        pnlPrincipal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 90, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nombre:");
        pnlPrincipal.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 90, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Correo electrónico:");
        pnlPrincipal.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 150, 20));

        campoTiempo.setEditable(false);
        campoTiempo.setBackground(new java.awt.Color(255, 255, 255));
        campoTiempo.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 12)); // NOI18N
        campoTiempo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoTiempo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(33, 150, 243), 1, true));
        campoTiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTiempoActionPerformed(evt);
            }
        });
        pnlPrincipal.add(campoTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 460, 40));

        campoNombre.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 12)); // NOI18N
        campoNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoNombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(33, 150, 243), 1, true));
        campoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNombreActionPerformed(evt);
            }
        });
        pnlPrincipal.add(campoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 460, 40));

        campoCorreo.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 12)); // NOI18N
        campoCorreo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoCorreo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(33, 150, 243), 1, true));
        campoCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCorreoActionPerformed(evt);
            }
        });
        pnlPrincipal.add(campoCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 460, 40));

        jButton1.setBackground(new java.awt.Color(33, 150, 243));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        pnlPrincipal.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 323, 120, 40));

        panelError.setBackground(new java.awt.Color(255, 153, 153));
        panelError.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Rellene todos los campos");
        panelError.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 160, -1));

        pnlPrincipal.add(panelError, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 160, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoTiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTiempoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTiempoActionPerformed

    private void campoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNombreActionPerformed

    private void campoCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCorreoActionPerformed

    /**
     * Una vez se presiona el botón, se guardan los datos en las variables, para posteriormente agregarlos al .dat si es que entran en podio
     * @param evt 
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(campoNombre.getText() != "" || campoCorreo.getText() != "")
        {
            nombre = campoNombre.getText();
            correo = campoCorreo.getText();
        }
        else
        {
            panelError.setVisible(true);
            jLabel5.setText("Rellene todos los campos");
        }
        
        Jugador jugador = new Jugador(nombre,correo,tiempo,horas,minutos,segundos);
        switch (tamaño) {
            case 3:
                 if (null == dificultad){
                     ListaNiveles.getNivel3x3().addDificil(jugador);
                 }else switch (dificultad) {
                case "Facil":
                    ListaNiveles.getNivel3x3().addfacil(jugador);
                    System.out.println(ListaNiveles.getNivel3x3().imprimirListaNivel(ListaNiveles.getNivel3x3().getListaFacil()));
                    break;
                case "Intermedio":
                    ListaNiveles.getNivel3x3().addMedio(jugador);
                    break;
                default:
                    ListaNiveles.getNivel3x3().addDificil(jugador);
                    break;
            }
            break;

            case 4:
                 if (null == dificultad){
                     ListaNiveles.getNivel4x4().addDificil(jugador);
                 }else switch (dificultad) {
                case "Facil":
                    ListaNiveles.getNivel4x4().addfacil(jugador);
                    break;
                case "Intermedio":
                    ListaNiveles.getNivel4x4().addMedio(jugador);
                    break;
                default:
                    ListaNiveles.getNivel4x4().addDificil(jugador);
                    break;
            }
            break;

            case 5:
                 if (null == dificultad){
                     ListaNiveles.getNivel5x5().addDificil(jugador);
                 }else switch (dificultad) {
                case "Facil":
                    ListaNiveles.getNivel5x5().addfacil(jugador);
                    break;
                case "Intermedio":
                    ListaNiveles.getNivel5x5().addMedio(jugador);
                    break;
                default:
                    ListaNiveles.getNivel5x5().addDificil(jugador);
                    break;
            }
            break;

            case 6:
                 if (null == dificultad){
                     ListaNiveles.getNivel6x6().addDificil(jugador);
                 }else switch (dificultad) {
                case "Facil":
                    ListaNiveles.getNivel6x6().addfacil(jugador);
                    break;
                case "Intermedio":
                    ListaNiveles.getNivel6x6().addMedio(jugador);
                    break;
                default:
                    ListaNiveles.getNivel6x6().addDificil(jugador);
                    break;
            }
            break;

            case 7:
                 if (null == dificultad){
                     ListaNiveles.getNivel7x7().addDificil(jugador);
                 }else switch (dificultad) {
                case "Facil":
                    ListaNiveles.getNivel7x7().addfacil(jugador);
                    break;
                case "Intermedio":
                    ListaNiveles.getNivel7x7().addMedio(jugador);
                    break;
                default:
                    ListaNiveles.getNivel7x7().addDificil(jugador);
                    break;
            }
            break;

            case 8:
                 if (null == dificultad){
                     ListaNiveles.getNivel8x8().addDificil(jugador);
                 }else switch (dificultad) {
                case "Facil":
                    ListaNiveles.getNivel8x8().addfacil(jugador);
                    break;
                case "Intermedio":
                    ListaNiveles.getNivel8x8().addMedio(jugador);
                    break;
                default:
                    ListaNiveles.getNivel8x8().addDificil(jugador);
                    break;
            }
            break;

            case 9:
                 if (null == dificultad){
                     ListaNiveles.getNivel9x9().addDificil(jugador);
                 }else switch (dificultad) {
                case "Facil":
                    ListaNiveles.getNivel9x9().addfacil(jugador);
                    break;
                case "Intermedio":
                    ListaNiveles.getNivel9x9().addMedio(jugador);
                    break;
                default:
                    ListaNiveles.getNivel9x9().addDificil(jugador);
                    break;
            }
            break;

            default:
                System.out.println("Hola mundo");
                break;
        }
        System.out.println(ListaNiveles.getNivel3x3().imprimirListaNivel(ListaNiveles.getNivel3x3().getListaFacil()));
        
        FileManager.writeObject(new PaqueteNiveles(), "kenken2023podio.dat");
        
        MenuPrincipal ventana_menu = new MenuPrincipal();
        ventana_menu.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoCorreo;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoTiempo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel panelError;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JPanel pnlTitulo;
    // End of variables declaration//GEN-END:variables
}
