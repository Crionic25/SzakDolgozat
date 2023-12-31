/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.amnproject;

import static com.mycompany.amnproject.MainClass.con;
import static com.mycompany.amnproject.MainClass.fh;
import static com.mycompany.amnproject.MainClass.logger;
import static com.mycompany.amnproject.MainClass.pa;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.SimpleFormatter;
import javax.swing.ImageIcon;
import static png.image.getImage;

/**
 *
 * @author Crionic
 */
public class kapcsolatok extends javax.swing.JFrame {

    /**
     * Creates new form kapcsolatok
     */
    public kapcsolatok() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        aNev = new javax.swing.JTextField();
        vNev = new javax.swing.JTextField();
        bNev = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        aKod = new javax.swing.JTextField();
        vKod = new javax.swing.JTextField();
        bKod = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sNev = new javax.swing.JTextField();
        sKod = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AMNESIA nyilvántartó rendszer v1.5 Új Kapcsolatok");

        jLabel1.setText("Anyag");

        jLabel2.setText("Varroda");

        jLabel3.setText("Beszálitó");

        vNev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vNevActionPerformed(evt);
            }
        });

        jButton1.setIcon(new ImageIcon(getImage("icons/save.png")));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new ImageIcon(getImage("icons/megse3.png")));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Név");

        jLabel5.setText("Kód");

        jLabel6.setText("Szabász");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jButton2))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(aKod)
                                .addComponent(bKod)
                                .addComponent(vKod)
                                .addComponent(sKod, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(82, 82, 82)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bNev)
                                    .addComponent(vNev)
                                    .addComponent(aNev)
                                    .addComponent(sNev, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(aNev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(aKod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vNev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vKod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bNev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bKod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sNev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sKod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vNevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vNevActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vNevActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    if(bNev.getText().isEmpty() == false && bKod.getText().isEmpty() == false) {
        try{
            String query = "Insert into Beszállitó2(id, Név)values(?,?)";
            PreparedStatement pst = con.prepareStatement(query);
            String kod = bKod.getText();
            int vk = Integer.parseInt(kod);
            pst.setInt(1, vk);
            pst.setString(2, bNev.getText());
            pst.executeUpdate();
            
        }catch(SQLException e) {
            System.out.println(e);
        }
    }else if(aNev.getText().isEmpty() == false && aKod.getText().isEmpty() == false){
        try{
            String query = "Insert into anyagfajta2(id, Név)values(?,?)";
            PreparedStatement pst = con.prepareStatement(query);
            String kod = aKod.getText();
            int vk = Integer.parseInt(kod);
            pst.setInt(1, vk);
            pst.setString(2, aNev.getText());
            pst.executeUpdate();
            
        }catch(SQLException e) {
            System.out.println(e);
        }
    }else if(vNev.getText().isEmpty() == false && vKod.getText().isEmpty() == false){
        try{
            String query = "Insert into varroda1(id, név)values(?,?)";
            PreparedStatement pst = con.prepareStatement(query);
            String kod = vKod.getText();
            int vk = Integer.parseInt(kod);
            pst.setInt(1, vk);
            pst.setString(2, vNev.getText());
            pst.executeUpdate();
            
        }catch(SQLException e) {
            System.out.println(e);
        }
    }
    else if(sNev.getText().isEmpty() == false && sKod.getText().isEmpty() == false){
        try{
            String query = "Insert into szab(id, név)values(?,?)";
            PreparedStatement pst = con.prepareStatement(query);
            String kod = sKod.getText();
            int vk = Integer.parseInt(kod);
            pst.setInt(1, vk);
            pst.setString(2, sNev.getText());
            pst.executeUpdate();
            
        }catch(SQLException e) {
            System.out.println(e);
        }
    }
     try {  

            // This block configure the logger with handler and formatter  
            fh = new FileHandler("C:/Users/Crionic/Desktop/log.txt", true);  
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();  
            fh.setFormatter(formatter);  

            // the following statement is used to log any messages  
            logger.info(pa.getProperty("user")+" Mentette a kapcsolatokat.");  
            for(Handler h:logger.getHandlers())
                        {
                            h.close();   //must call h.close or a .LCK file will remain.
                        }
        } catch (SecurityException | IOException y) {  
            y.printStackTrace();  
        }
      aKod.setText("");  
      aNev.setText("");  
      bNev.setText("");  
      bKod.setText("");  
      vNev.setText("");  
      vKod.setText("");  
      sNev.setText("");  
      sKod.setText("");  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         try {  

            // This block configure the logger with handler and formatter  
            fh = new FileHandler("C:/Users/Crionic/Desktop/log.txt", true);  
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();  
            fh.setFormatter(formatter);  

            // the following statement is used to log any messages  
            logger.info(pa.getProperty("user")+" kilépett az új kapcsolatokból.");  
            for(Handler h:logger.getHandlers())
                        {
                            h.close();   //must call h.close or a .LCK file will remain.
                        }
        } catch (SecurityException | IOException y) {  
            y.printStackTrace();  
        }
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aKod;
    private javax.swing.JTextField aNev;
    private javax.swing.JTextField bKod;
    private javax.swing.JTextField bNev;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField sKod;
    private javax.swing.JTextField sNev;
    private javax.swing.JTextField vKod;
    private javax.swing.JTextField vNev;
    // End of variables declaration//GEN-END:variables

}
