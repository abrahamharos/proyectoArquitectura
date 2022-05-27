/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.abrahamharos.proyectoarquitectura.UI;

import java.awt.Component;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author abrahamharos
 */
public class FacturasView extends javax.swing.JFrame {

    /**
     * Creates new form FacturasView
     */
    public FacturasView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        windowTitle = new javax.swing.JLabel();
        selectFilesBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaFacturas = new javax.swing.JTable();
        resumenLabel = new javax.swing.JLabel();
        subtotalLabel = new javax.swing.JLabel();
        ivaLabel = new javax.swing.JLabel();
        iepsLabel = new javax.swing.JLabel();
        totalLabel = new javax.swing.JLabel();
        subtotal = new javax.swing.JLabel();
        iva = new javax.swing.JLabel();
        ieps = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        atrasBtn = new javax.swing.JButton();
        siguienteBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RIF Calculator");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setSize(new java.awt.Dimension(1280, 720));

        windowTitle.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        windowTitle.setText("Facturas Recibidas");

        selectFilesBtn.setBackground(java.awt.SystemColor.textHighlight);
        selectFilesBtn.setText("Seleccionar Archivos");
        selectFilesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectFilesBtnActionPerformed(evt);
            }
        });

        tablaFacturas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "#", "¿Incluir?", "Fecha", "Nombre Emisor", "Uso CFDI", "Método de pago", "Subtotal", "IVA", "IEPS", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaFacturas);
        if (tablaFacturas.getColumnModel().getColumnCount() > 0) {
            tablaFacturas.getColumnModel().getColumn(0).setMaxWidth(40);
            tablaFacturas.getColumnModel().getColumn(1).setMaxWidth(60);
            tablaFacturas.getColumnModel().getColumn(2).setMinWidth(120);
            tablaFacturas.getColumnModel().getColumn(2).setMaxWidth(120);
            tablaFacturas.getColumnModel().getColumn(3).setMinWidth(250);
            tablaFacturas.getColumnModel().getColumn(3).setPreferredWidth(10);
            tablaFacturas.getColumnModel().getColumn(3).setMaxWidth(250);
            tablaFacturas.getColumnModel().getColumn(4).setMinWidth(150);
            tablaFacturas.getColumnModel().getColumn(4).setPreferredWidth(75);
            tablaFacturas.getColumnModel().getColumn(4).setMaxWidth(150);
            tablaFacturas.getColumnModel().getColumn(5).setMinWidth(150);
            tablaFacturas.getColumnModel().getColumn(5).setPreferredWidth(10);
            tablaFacturas.getColumnModel().getColumn(5).setMaxWidth(150);
            tablaFacturas.getColumnModel().getColumn(6).setMinWidth(90);
            tablaFacturas.getColumnModel().getColumn(6).setPreferredWidth(10);
            tablaFacturas.getColumnModel().getColumn(6).setMaxWidth(90);
            tablaFacturas.getColumnModel().getColumn(7).setResizable(false);
            tablaFacturas.getColumnModel().getColumn(8).setResizable(false);
            tablaFacturas.getColumnModel().getColumn(9).setResizable(false);
        }

        resumenLabel.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        resumenLabel.setText("Resumen");

        subtotalLabel.setText("Subtotal:");

        ivaLabel.setText("I.V.A. :");

        iepsLabel.setText("I.E.P.S. :");

        totalLabel.setText("Total:");

        subtotal.setText("$0.00");

        iva.setText("$0.00");

        ieps.setText("$0.00");

        total.setText("$0.00");

        atrasBtn.setBackground(java.awt.SystemColor.textHighlight);
        atrasBtn.setText("Atrás");
        atrasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasBtnActionPerformed(evt);
            }
        });

        siguienteBtn.setBackground(java.awt.SystemColor.textHighlight);
        siguienteBtn.setText("Siguiente");
        siguienteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selectFilesBtn)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(resumenLabel)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(totalLabel)
                                                .addComponent(iepsLabel)
                                                .addComponent(ivaLabel)
                                                .addComponent(subtotalLabel))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(total)
                                                .addComponent(ieps)
                                                .addComponent(iva)
                                                .addComponent(subtotal))))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(atrasBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(siguienteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1208, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(557, 557, 557)
                        .addComponent(windowTitle)))
                .addGap(0, 36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(windowTitle)
                .addGap(18, 18, 18)
                .addComponent(selectFilesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(atrasBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(siguienteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(resumenLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(subtotalLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ivaLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(iepsLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(totalLabel))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(subtotal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(iva)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ieps)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(total)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atrasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_atrasBtnActionPerformed

    private void siguienteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_siguienteBtnActionPerformed

    private void selectFilesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectFilesBtnActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setMultiSelectionEnabled(true);
        chooser.showOpenDialog(null);
        File[] files = chooser.getSelectedFiles();
        for (File file : files) {
            if (file.canRead() && file.isFile()) {
                try {
                    String contents = Files.readString(file.toPath());
                    System.out.println(file.getAbsolutePath());
                } catch (IOException ex) {
                    Logger.getLogger(FacturasView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_selectFilesBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FacturasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FacturasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FacturasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FacturasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FacturasView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atrasBtn;
    private javax.swing.JLabel ieps;
    private javax.swing.JLabel iepsLabel;
    private javax.swing.JLabel iva;
    private javax.swing.JLabel ivaLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel resumenLabel;
    private javax.swing.JButton selectFilesBtn;
    private javax.swing.JButton siguienteBtn;
    private javax.swing.JLabel subtotal;
    private javax.swing.JLabel subtotalLabel;
    private javax.swing.JTable tablaFacturas;
    private javax.swing.JLabel total;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JLabel windowTitle;
    // End of variables declaration//GEN-END:variables
}
