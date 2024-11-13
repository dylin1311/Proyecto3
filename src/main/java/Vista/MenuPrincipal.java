package Vista;

import Vista.FrameSeleccionarPodio;
import Vista.AjustesDePartida;
import Vista.AcercaDe;
import Controlador.Ayuda;
import Modelo.FileManager;
import Modelo.PaqueteNiveles;
import static Controlador.Ayuda.abrirManual;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 * Frame del menú principal
 * @author Kenneth Vargas Chacón
 */
public class MenuPrincipal extends javax.swing.JFrame {
    
    /**
     * Constructor
     */
    public MenuPrincipal() {
        initComponents();
        try{
            PaqueteNiveles leer = (PaqueteNiveles)FileManager.readObject("kenken2023podio.dat");
            leer.cargarDatos();
        }catch(NullPointerException ex){}
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlTitulo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnIniciar = new javax.swing.JButton();
        btnAyuda = new javax.swing.JButton();
        btnAcercade = new javax.swing.JButton();
        btnPodio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlTitulo.setBackground(new java.awt.Color(33, 150, 243));

        lblTitulo.setFont(new java.awt.Font("Gadugi", 1, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("KenKen.java");

        javax.swing.GroupLayout pnlTituloLayout = new javax.swing.GroupLayout(pnlTitulo);
        pnlTitulo.setLayout(pnlTituloLayout);
        pnlTituloLayout.setHorizontalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(lblTitulo)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        pnlTituloLayout.setVerticalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblTitulo)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel1.add(pnlTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 360, 110));

        jButton1.setBackground(new java.awt.Color(0, 105, 192));
        jButton1.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 440, 80, 60));

        btnIniciar.setBackground(new java.awt.Color(19, 127, 217));
        btnIniciar.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        btnIniciar.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciar.setText("Iniciar Juego");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        jPanel1.add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 410, 80));

        btnAyuda.setBackground(new java.awt.Color(19, 127, 217));
        btnAyuda.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        btnAyuda.setForeground(new java.awt.Color(255, 255, 255));
        btnAyuda.setText("Ayuda");
        btnAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaActionPerformed(evt);
            }
        });
        jPanel1.add(btnAyuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 410, 80));

        btnAcercade.setBackground(new java.awt.Color(19, 127, 217));
        btnAcercade.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        btnAcercade.setForeground(new java.awt.Color(255, 255, 255));
        btnAcercade.setText("Acerca de");
        btnAcercade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcercadeActionPerformed(evt);
            }
        });
        jPanel1.add(btnAcercade, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 410, 80));

        btnPodio.setBackground(new java.awt.Color(19, 127, 217));
        btnPodio.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        btnPodio.setForeground(new java.awt.Color(255, 255, 255));
        btnPodio.setText("Podio");
        btnPodio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPodioActionPerformed(evt);
            }
        });
        jPanel1.add(btnPodio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 410, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        AjustesDePartida ventana_ajustes = new AjustesDePartida();
        ventana_ajustes.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaActionPerformed
        abrirManual();
    }//GEN-LAST:event_btnAyudaActionPerformed

    private void btnAcercadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcercadeActionPerformed
        AcercaDe ventanaAcercaDe = new AcercaDe();
        ventanaAcercaDe.setVisible(true);
    }//GEN-LAST:event_btnAcercadeActionPerformed

    private void btnPodioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPodioActionPerformed
        FrameSeleccionarPodio selecion = new FrameSeleccionarPodio();
        selecion.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPodioActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcercade;
    private javax.swing.JButton btnAyuda;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnPodio;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlTitulo;
    // End of variables declaration//GEN-END:variables
}
