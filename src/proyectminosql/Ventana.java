/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectminosql;

import java.awt.Color;
import java.io.File;
import java.util.Formatter;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author gigabyte
 */
public class Ventana extends javax.swing.JFrame {
    int i;
    int[] indice;
    String ubicacion;
    public Ventana() {
        this.ubicacion = System.getProperty("user.dir");
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

        comboEsquema = new javax.swing.JComboBox<>();
        textEsquema = new javax.swing.JTextField();
        buttonEsquema = new javax.swing.JButton();
        buttonBorrarEsquema = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        comboTabla = new javax.swing.JComboBox<>();
        textTabla = new javax.swing.JTextField();
        buttonTabla = new javax.swing.JButton();
        buttonBorrarTabla = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        comboEsquema.setActionCommand("comboEsquema");
        comboEsquema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEsquemaActionPerformed(evt);
            }
        });

        textEsquema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textEsquemaActionPerformed(evt);
            }
        });

        buttonEsquema.setText("Nuevo Esquema");
        buttonEsquema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEsquemaActionPerformed(evt);
            }
        });

        buttonBorrarEsquema.setText("Borrar Esquema");
        buttonBorrarEsquema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBorrarEsquemaActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID"
            }
        ));
        tabla.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(tabla);

        comboTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTablaActionPerformed(evt);
            }
        });

        buttonTabla.setText("Nueva Tabla");
        buttonTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTablaActionPerformed(evt);
            }
        });

        buttonBorrarTabla.setText("Borrar Tabla");
        buttonBorrarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBorrarTablaActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minosql/icon/icon.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 877, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(comboTabla, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(comboEsquema, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textEsquema, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonEsquema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonBorrarEsquema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonBorrarTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonBorrarEsquema)
                            .addComponent(buttonEsquema)
                            .addComponent(textEsquema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboEsquema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonTabla)
                            .addComponent(buttonBorrarTabla)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void comboEsquemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEsquemaActionPerformed
     if(comboEsquema.getSelectedItem().equals("")){
       comboTabla.setEnabled(false);
       textTabla.setEnabled(false);
     }
        
    }//GEN-LAST:event_comboEsquemaActionPerformed

    private void textEsquemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textEsquemaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textEsquemaActionPerformed

    private void buttonTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTablaActionPerformed
        // TODO add your handling code here:
     
        ObservableList<String> comboContentDos=
        FXCollections.observableArrayList();
        String ttabla=textTabla.getText();
        comboContentDos.add(ttabla);
        comboTabla.setSelectedItem(ttabla);
        comboTabla.addItem(ttabla);
        textTabla.setText("");
        AgregarColumnas columna= new AgregarColumnas(this,true);
        columna.setVisible(true);
       
        
   
    }//GEN-LAST:event_buttonTablaActionPerformed

    private void buttonEsquemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEsquemaActionPerformed

        ObservableList<String> comboContentUno=
        FXCollections.observableArrayList();
        String esquema=textEsquema.getText();
        comboContentUno.add(esquema);
        comboEsquema.addItem(esquema);
        comboEsquema.setSelectedItem(esquema);
        textEsquema.setText("");
        i++;
       // indice[i];
        
       
    }//GEN-LAST:event_buttonEsquemaActionPerformed

    private void comboTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTablaActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_comboTablaActionPerformed

    private void buttonBorrarEsquemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBorrarEsquemaActionPerformed
        // TODO add your handling code here:
        int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea elminar el esquema?", "Alerta!", JOptionPane.YES_NO_OPTION);
        if (resp==JOptionPane.YES_OPTION){
       String esquema= (String) comboEsquema.getSelectedItem();
        comboEsquema.removeItem(esquema);
        }
    }//GEN-LAST:event_buttonBorrarEsquemaActionPerformed

    private void buttonBorrarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBorrarTablaActionPerformed
        // TODO add your handling code here:
        int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea elminar la tabla?", "Alerta!", JOptionPane.YES_NO_OPTION);
        if (resp==JOptionPane.YES_OPTION){
        String tablas=(String) comboTabla.getSelectedItem();
        comboTabla.removeItem(tablas);
        }
    }//GEN-LAST:event_buttonBorrarTablaActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBorrarEsquema;
    private javax.swing.JButton buttonBorrarTabla;
    private javax.swing.JButton buttonEsquema;
    private javax.swing.JButton buttonTabla;
    private javax.swing.JComboBox<String> comboEsquema;
    private javax.swing.JComboBox<String> comboTabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField textEsquema;
    private javax.swing.JTextField textTabla;
    // End of variables declaration//GEN-END:variables
}
