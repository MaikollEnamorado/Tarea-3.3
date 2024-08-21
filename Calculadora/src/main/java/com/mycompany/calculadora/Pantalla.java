/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.calculadora;

import java.awt.event.KeyEvent;

/**
 *
 * @author LATITUDE 7390
 */
public class Pantalla extends javax.swing.JFrame {

    /**
     * Creates new form Pantalla
     */
    public Pantalla() {
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

        btn_punto = new javax.swing.JButton();
        btn_ocho = new javax.swing.JButton();
        btn_igual = new javax.swing.JButton();
        btn_nueve = new javax.swing.JButton();
        btn_uno = new javax.swing.JButton();
        btn_suma = new javax.swing.JButton();
        btn_dos = new javax.swing.JButton();
        btn_multiplicacion = new javax.swing.JButton();
        btn_tres = new javax.swing.JButton();
        btn_porcentaje = new javax.swing.JButton();
        btn_cuatro = new javax.swing.JButton();
        btn_positvonegativo = new javax.swing.JButton();
        btn_division = new javax.swing.JButton();
        btn_cinco = new javax.swing.JButton();
        btn_seis = new javax.swing.JButton();
        btn_borrar = new javax.swing.JButton();
        txt_pantalla = new javax.swing.JTextField();
        btn_resta = new javax.swing.JButton();
        btn_cero = new javax.swing.JButton();
        btn_siete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_punto.setText(".");
        btn_punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_puntoActionPerformed(evt);
            }
        });

        btn_ocho.setText("8");
        btn_ocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ochoActionPerformed(evt);
            }
        });

        btn_igual.setText("=");

        btn_nueve.setText("9");

        btn_uno.setText("1");
        btn_uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_unoActionPerformed(evt);
            }
        });

        btn_suma.setText("+");

        btn_dos.setText("2");
        btn_dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dosActionPerformed(evt);
            }
        });

        btn_multiplicacion.setText("*");
        btn_multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multiplicacionActionPerformed(evt);
            }
        });

        btn_tres.setText("3");
        btn_tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tresActionPerformed(evt);
            }
        });

        btn_porcentaje.setText("%");
        btn_porcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_porcentajeActionPerformed(evt);
            }
        });

        btn_cuatro.setText("4");
        btn_cuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cuatroActionPerformed(evt);
            }
        });

        btn_positvonegativo.setText("+/-");

        btn_division.setText("/");
        btn_division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_divisionActionPerformed(evt);
            }
        });

        btn_cinco.setText("5");

        btn_seis.setText("6");

        btn_borrar.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        btn_borrar.setText("AC");

        txt_pantalla.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_pantalla.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_pantalla.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_pantalla.setMaximumSize(null);
        txt_pantalla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_pantallaKeyReleased(evt);
            }
        });

        btn_resta.setText("-");

        btn_cero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_cero.setText("0");

        btn_siete.setText("7");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_pantalla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btn_cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn_cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn_seis, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn_resta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_cero, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_punto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_igual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_uno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_dos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_tres, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_suma, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_siete, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                    .addComponent(btn_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_positvonegativo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_porcentaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_ocho, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_nueve, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_division, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_multiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_division, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_porcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_positvonegativo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_siete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ocho, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_nueve, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_multiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_seis, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_resta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_uno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_dos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_tres, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_suma, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_punto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_igual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_puntoActionPerformed
        // TODO add your handling code here:
        punto();
    }//GEN-LAST:event_btn_puntoActionPerformed
    public void punto(){
        Punto punto = new Punto(txt_pantalla.getText());
        txt_pantalla.setText(punto.accion());
        txt_pantalla.requestFocus();
    }
    private void btn_ochoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ochoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ochoActionPerformed

    private void btn_unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_unoActionPerformed
        // TODO add your handling code here:
        String texto = txt_pantalla.getText();
        texto = texto + "1";
        txt_pantalla.setText(texto);
    }//GEN-LAST:event_btn_unoActionPerformed

    private void btn_dosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_dosActionPerformed

    private void btn_multiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multiplicacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_multiplicacionActionPerformed

    private void btn_tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_tresActionPerformed

    private void btn_porcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_porcentajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_porcentajeActionPerformed

    private void btn_cuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cuatroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cuatroActionPerformed

    private void btn_divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_divisionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_divisionActionPerformed

    private void txt_pantallaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_pantallaKeyReleased
        // TODO add your handling code here:
        escribir(evt);
    }//GEN-LAST:event_txt_pantallaKeyReleased
    public void escribir(KeyEvent evt){
        if(evt.getKeyCode() != 8 && txt_pantalla.getText().isBlank() == false){
            Text_Field condicion = new Text_Field(txt_pantalla.getText());
            txt_pantalla.setText(condicion.numeros());
        }
    }
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
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_borrar;
    private javax.swing.JButton btn_cero;
    private javax.swing.JButton btn_cinco;
    private javax.swing.JButton btn_cuatro;
    private javax.swing.JButton btn_division;
    private javax.swing.JButton btn_dos;
    private javax.swing.JButton btn_igual;
    private javax.swing.JButton btn_multiplicacion;
    private javax.swing.JButton btn_nueve;
    private javax.swing.JButton btn_ocho;
    private javax.swing.JButton btn_porcentaje;
    private javax.swing.JButton btn_positvonegativo;
    private javax.swing.JButton btn_punto;
    private javax.swing.JButton btn_resta;
    private javax.swing.JButton btn_seis;
    private javax.swing.JButton btn_siete;
    private javax.swing.JButton btn_suma;
    private javax.swing.JButton btn_tres;
    private javax.swing.JButton btn_uno;
    private javax.swing.JTextField txt_pantalla;
    // End of variables declaration//GEN-END:variables
}
