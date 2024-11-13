/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.ListaNiveles;
import java.io.File;

/**
 *Clase que muestra el podio de una dificultad y un tamaño especifico
 * @author Kenneth Vargas Chacon
 */
public class FramePodioSeleccionar extends javax.swing.JFrame {

    /**
     * Constructor
     * @param tamaño El tamaño de la cuadricula
     * @param dificultad La dificultad de la partida
     */
    public FramePodioSeleccionar(String tamaño, String dificultad) {
        initComponents();
        lblTitulo.setText("Podio " + tamaño + dificultad);
        System.out.println(ListaNiveles.getNivel3x3().imprimirListaNivel(ListaNiveles.getNivel3x3().getListaFacil()));
        if (tamaño=="3x3"){
            if (dificultad=="Facil"){
                txaElementos.append(ListaNiveles.getNivel3x3().imprimirListaNivel(ListaNiveles.getNivel3x3().getListaFacil()));
            }else if(dificultad=="Medio"){
                txaElementos.append(ListaNiveles.getNivel3x3().imprimirListaNivel(ListaNiveles.getNivel3x3().getListaMedio()));
            }else if(dificultad=="Dificil"){
                txaElementos.append(ListaNiveles.getNivel3x3().imprimirListaNivel(ListaNiveles.getNivel3x3().getListaDificil()));
            }
        }else if (tamaño=="4x4"){
            if (dificultad=="Facil"){
                txaElementos.append(ListaNiveles.getNivel4x4().imprimirListaNivel(ListaNiveles.getNivel4x4().getListaFacil()));
            }else if(dificultad=="Medio"){
                txaElementos.append(ListaNiveles.getNivel4x4().imprimirListaNivel(ListaNiveles.getNivel4x4().getListaMedio()));
            }else if(dificultad=="Dificil"){
                txaElementos.append(ListaNiveles.getNivel4x4().imprimirListaNivel(ListaNiveles.getNivel4x4().getListaDificil()));
            }
        }else if (tamaño=="5x5"){
            if (dificultad=="Facil"){
                txaElementos.append(ListaNiveles.getNivel5x5().imprimirListaNivel(ListaNiveles.getNivel5x5().getListaFacil()));
            }else if(dificultad=="Medio"){
                txaElementos.append(ListaNiveles.getNivel5x5().imprimirListaNivel(ListaNiveles.getNivel5x5().getListaMedio()));
            }else if(dificultad=="Dificil"){
                txaElementos.append(ListaNiveles.getNivel5x5().imprimirListaNivel(ListaNiveles.getNivel5x5().getListaDificil()));
            }
        }else if (tamaño=="6x6"){
            if (dificultad=="Facil"){
                txaElementos.append(ListaNiveles.getNivel6x6().imprimirListaNivel(ListaNiveles.getNivel6x6().getListaFacil()));
            }else if(dificultad=="Medio"){
                txaElementos.append(ListaNiveles.getNivel6x6().imprimirListaNivel(ListaNiveles.getNivel6x6().getListaMedio()));
            }else if(dificultad=="Dificil"){
                txaElementos.append(ListaNiveles.getNivel6x6().imprimirListaNivel(ListaNiveles.getNivel6x6().getListaDificil()));
            }
        }else if (tamaño=="7x7"){
            if (dificultad=="Facil"){
                txaElementos.append(ListaNiveles.getNivel7x7().imprimirListaNivel(ListaNiveles.getNivel7x7().getListaFacil()));
            }else if(dificultad=="Medio"){
                txaElementos.append(ListaNiveles.getNivel7x7().imprimirListaNivel(ListaNiveles.getNivel7x7().getListaMedio()));
            }else if(dificultad=="Dificil"){
                txaElementos.append(ListaNiveles.getNivel7x7().imprimirListaNivel(ListaNiveles.getNivel7x7().getListaDificil()));
            }
        }else if (tamaño=="8x8"){
            if (dificultad=="Facil"){
                txaElementos.append(ListaNiveles.getNivel8x8().imprimirListaNivel(ListaNiveles.getNivel8x8().getListaFacil()));
            }else if(dificultad=="Medio"){
                txaElementos.append(ListaNiveles.getNivel8x8().imprimirListaNivel(ListaNiveles.getNivel8x8().getListaMedio()));
            }else if(dificultad=="Dificil"){
                txaElementos.append(ListaNiveles.getNivel8x8().imprimirListaNivel(ListaNiveles.getNivel8x8().getListaDificil()));
            }
        }else if (tamaño=="9x9"){
            if (dificultad=="Facil"){
                txaElementos.append(ListaNiveles.getNivel9x9().imprimirListaNivel(ListaNiveles.getNivel9x9().getListaFacil()));
            }else if(dificultad=="Medio"){
                txaElementos.append(ListaNiveles.getNivel9x9().imprimirListaNivel(ListaNiveles.getNivel9x9().getListaMedio()));
            }else if(dificultad=="Dificil"){
                txaElementos.append(ListaNiveles.getNivel9x9().imprimirListaNivel(ListaNiveles.getNivel9x9().getListaDificil()));
            }
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBase = new javax.swing.JPanel();
        pnlTitulo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaElementos = new javax.swing.JTextArea();
        lblOro = new javax.swing.JLabel();
        lblPlata = new javax.swing.JLabel();
        lblBronce = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlBase.setBackground(new java.awt.Color(255, 255, 255));

        pnlTitulo.setBackground(new java.awt.Color(33, 150, 243));

        lblTitulo.setFont(new java.awt.Font("Gadugi", 1, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Podio");

        javax.swing.GroupLayout pnlTituloLayout = new javax.swing.GroupLayout(pnlTitulo);
        pnlTitulo.setLayout(pnlTituloLayout);
        pnlTituloLayout.setHorizontalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addContainerGap(381, Short.MAX_VALUE))
        );
        pnlTituloLayout.setVerticalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblTitulo)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        txaElementos.setBackground(new java.awt.Color(204, 204, 204));
        txaElementos.setColumns(20);
        txaElementos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txaElementos.setRows(5);
        jScrollPane1.setViewportView(txaElementos);

        lblOro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblOro.setForeground(new java.awt.Color(175, 175, 13));
        lblOro.setText("Oro");

        lblPlata.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPlata.setForeground(new java.awt.Color(204, 204, 204));
        lblPlata.setText("Plata");

        lblBronce.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblBronce.setForeground(new java.awt.Color(119, 87, 2));
        lblBronce.setText("Bronce");

        btnSalir.setBackground(new java.awt.Color(33, 150, 243));
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Volver");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBaseLayout = new javax.swing.GroupLayout(pnlBase);
        pnlBase.setLayout(pnlBaseLayout);
        pnlBaseLayout.setHorizontalGroup(
            pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlBaseLayout.createSequentialGroup()
                .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBaseLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lblBronce, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBaseLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPlata, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlBaseLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSalir)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlBaseLayout.setVerticalGroup(
            pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBaseLayout.createSequentialGroup()
                .addComponent(pnlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlBaseLayout.createSequentialGroup()
                        .addComponent(lblOro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPlata, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblBronce)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        MenuPrincipal volver = new MenuPrincipal();
        volver.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBronce;
    private javax.swing.JLabel lblOro;
    private javax.swing.JLabel lblPlata;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlBase;
    private javax.swing.JPanel pnlTitulo;
    private javax.swing.JTextArea txaElementos;
    // End of variables declaration//GEN-END:variables

    
}
