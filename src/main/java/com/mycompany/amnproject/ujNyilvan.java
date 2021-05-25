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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.SimpleFormatter;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static png.image.getImage;

/**
 *
 * @author Crionic
 */
public class ujNyilvan extends javax.swing.JFrame {

    /**
     * Creates new form ujNyilvan
     */
    public ujNyilvan() {
        initComponents();
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 try {  

            // This block configure the logger with handler and formatter  
            fh = new FileHandler("C:/Users/Crionic/Desktop/log.txt", true);  
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();  
            fh.setFormatter(formatter);  
            
            // the following statement is used to log any messages  
            logger.info(pa.getProperty("user")+" Mentette az ój nyilvantartást.");  
            for(Handler h:logger.getHandlers())
                        {
                            h.close();   //must call h.close or a .LCK file will remain.
                        }
        } catch (SecurityException | IOException y) {  
            y.printStackTrace();  
        }
                feltolt();
            }
        });
        //V aktuálisból levonni, S és H azt meg a saját oszlopukból
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        besz = new javax.swing.JTextField();
        any = new javax.swing.JTextField();
        sor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        S_T = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton(new ImageIcon(getImage("icons/save.png")));
        jButton2 = new javax.swing.JButton(new ImageIcon(getImage("icons/megse3.png")));
        jLabel5 = new javax.swing.JLabel();
        meny = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AMNESIA nyilvántartó rendszer v1.5 Új Nyilvántartás");

        jLabel1.setText("Beszállitó");

        jLabel2.setText("Anyagkód");

        jLabel3.setText("sorszám");

        jLabel4.setText("S/H/V/M");

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Mennyiség");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(besz)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(any))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sor))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(S_T, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jButton2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(meny)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(besz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(any, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(S_T, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(meny, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(59, 59, 59))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       try {  

            // This block configure the logger with handler and formatter  
            fh = new FileHandler("C:/Users/Crionic/Desktop/log.txt", true);  
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();  
            fh.setFormatter(formatter);  
           
            // the following statement is used to log any messages  
            logger.info(pa.getProperty("user")+" kilépett az új nyilvántartásból.");  
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
    private javax.swing.JTextField S_T;
    private javax.swing.JTextField any;
    private javax.swing.JTextField besz;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField meny;
    private javax.swing.JTextField sor;
    // End of variables declaration//GEN-END:variables

    private void feltolt() {
        try{
            String query = "Insert into nyilvan(beszállitó, anyagkód, sorszám, T_S, mennyiség, érték)values(?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(query);
            String b = besz.getText();
            int be = Integer.parseInt(b);
            pst.setInt(1, be);
            String a = any.getText();
            double an = Double.parseDouble(a);
            pst.setDouble(2, an);
            String s = sor.getText();
            double so = Double.parseDouble(s);
            pst.setDouble(3, so);
            pst.setString(4, S_T.getText().toUpperCase());
            String m = meny.getText();
            double me = Double.parseDouble(m);
            double hm = opcio(S_T.getText().toUpperCase());
            pst.setDouble(5, me);
            levon(S_T.getText(),hm);
            pst.setDouble(6, brutto()*me);
            pst.executeUpdate();
            
        }catch(SQLException e) {
            System.out.println(e);
        }
    
      besz.setText("");  
      any.setText("");  
      sor.setText("");  
      S_T.setText("");
      meny.setText("");
    }

    private double opcio(String text) {
        double ertek=0.0;
        if(null != text)switch (text) {
            case "S":
                try{
                    String query = "Select Selejt from anyag1 where beszállitó =? and anyagkód=? and sorszám=? ";
                    PreparedStatement pst = con.prepareStatement(query);
                    String b = besz.getText();
                    double be = Double.parseDouble(b);
                    pst.setDouble(1, be);
                    String a = any.getText();
                    double an = Double.parseDouble(a);
                    pst.setDouble(2, an);
                    String s = sor.getText();
                    double so = Double.parseDouble(s);
                    pst.setDouble(3, so);
                    ResultSet rs = pst.executeQuery();
                    while(rs.next()){
                        ertek = rs.getDouble(1);
                    }
                }catch(SQLException e ){
                    System.out.println(e);
                }       break;
            case "H":
                try{
                    String query = "Select Több_hi from anyag1 where beszállitó =? and anyagkód=? and sorszám=? ";
                    PreparedStatement pst = con.prepareStatement(query);
                    String b = besz.getText();
                    double be = Double.parseDouble(b);
                    pst.setDouble(1, be);
                    String a = any.getText();
                    double an = Double.parseDouble(a);
                    pst.setDouble(2, an);
                    String s = sor.getText();
                    double so = Double.parseDouble(s);
                    pst.setDouble(3, so);
                    ResultSet rs = pst.executeQuery();
                    while(rs.next()){
                        ertek = rs.getDouble(1);
                    }
                }catch(SQLException e ){
                    System.out.println(e);
                }       break;
            case "V":
                try{
                    String query = "Select mennyiség from anyag1 where beszállitó =? and anyagkód=? and sorszám=? ";
                    PreparedStatement pst = con.prepareStatement(query);
                    String b = besz.getText();
                    double be = Double.parseDouble(b);
                    pst.setDouble(1, be);
                    String a = any.getText();
                    double an = Double.parseDouble(a);
                    pst.setDouble(2, an);
                    String s = sor.getText();
                    double so = Double.parseDouble(s);
                    pst.setDouble(3, so);
                    ResultSet rs = pst.executeQuery();
                    while(rs.next()){
                        
                        ertek = rs.getDouble(1);
                        System.out.println(ertek);
                    }
                }catch(SQLException e ){
                    System.out.println(e);
                }       break;
            case "M":
                try{
                    String query = "Select mennyiség from anyag1 where beszállitó =? and anyagkód=? and sorszám=? ";
                    PreparedStatement pst = con.prepareStatement(query);
                    String b = besz.getText();
                    double be = Double.parseDouble(b);
                    pst.setDouble(1, be);
                    String a = any.getText();
                    double an = Double.parseDouble(a);
                    pst.setDouble(2, an);
                    String s = sor.getText();
                    double so = Double.parseDouble(s);
                    pst.setDouble(3, so);
                    ResultSet rs = pst.executeQuery();
                    while(rs.next()){
                        
                        ertek = rs.getDouble(1);
                        System.out.println(ertek);
                    }
                }catch(SQLException e ){
                    System.out.println(e);
                }       break;
            default:
                break;
        }
  
      return ertek;
    }

    private void levon(String text, double hm) {
        if(null != text)switch (text) {
            case "S":
                try{
                    String query = "Update anyag1 set Selejt=?, Sel_ért=? where beszállitó =? and anyagkód=? and sorszám=? ";
                    PreparedStatement pst = con.prepareStatement(query);
                    String m = meny.getText();
                    double me = Double.parseDouble(m);
                    System.out.println(hm-me);
                    double valt = hm-me;
                    if(valt < 0){
                        JOptionPane.showMessageDialog(rootPane,"negativ lett az aktuális mennyiség" );
                        besz.setText("");  
                        any.setText("");  
                        sor.setText("");  
                        S_T.setText("");
                        meny.setText("");
                    }
                    pst.setDouble(1, valt);
                    pst.setDouble(2, valt*brutto());
                    String b = besz.getText();
                    double be = Double.parseDouble(b);
                    pst.setDouble(3, be);
                    String a = any.getText();
                    double an = Double.parseDouble(a);
                    pst.setDouble(4, an);
                    String s = sor.getText();
                    double so = Double.parseDouble(s);
                    pst.setDouble(5, so);
                    
                    pst.executeUpdate();
                    
                }catch(SQLException e ){
                    System.out.println(e);
                }       break;
            case "H":
                try{
                    String query = "Update anyag1 set Több_hi=?, több_ért=? where beszállitó =? and anyagkód=? and sorszám=? ";
                    PreparedStatement pst = con.prepareStatement(query);
                    String b = besz.getText();
                    double be = Double.parseDouble(b);
                    pst.setDouble(3, be);
                    String a = any.getText();
                    double an = Double.parseDouble(a);
                    pst.setDouble(4, an);
                    String s = sor.getText();
                    double so = Double.parseDouble(s);
                    pst.setDouble(5, so);
                    String m = meny.getText();
                    double me = Double.parseDouble(m);
                    System.out.println(hm+me);
                    pst.setDouble(1, hm+me);
                    pst.setDouble(2, (hm+me)*brutto());
                    pst.executeUpdate();
                }catch(SQLException e ){
                    System.out.println(e);
                }       break;
            case "V":
                try{
                    String query = "Update anyag1 set mennyiség=?, akt_ért=? where beszállitó =? and anyagkód=? and sorszám=? ";
                    PreparedStatement pst = con.prepareStatement(query);
                    String b = besz.getText();
                    double be = Double.parseDouble(b);
                    pst.setDouble(3, be);
                    String a = any.getText();
                    double an = Double.parseDouble(a);
                    pst.setDouble(4, an);
                    String s = sor.getText();
                    double so = Double.parseDouble(s);
                    pst.setDouble(5, so);
                    String m = meny.getText();
                    double me = Double.parseDouble(m);
                    System.out.println(hm-me);
                    double valt = hm-me;
                    if(valt < 0){
                        JOptionPane.showMessageDialog(rootPane,"negativ lett az aktuális mennyiség" );
                        besz.setText("");  
                        any.setText("");  
                        sor.setText("");  
                        S_T.setText("");
                        meny.setText("");
                    }
                    pst.setDouble(1, valt);
                    pst.setDouble(2, valt*brutto());
                    pst.executeUpdate();
                }catch(SQLException e ){
                    System.out.println(e);
                }       break;
            
                
            case "M":
                try{
                    String query = "Update anyag1 set mennyiség=?, akt_ért=? where beszállitó =? and anyagkód=? and sorszám=? ";
                    PreparedStatement pst = con.prepareStatement(query);
                    String b = besz.getText();
                    double be = Double.parseDouble(b);
                    pst.setDouble(3, be);
                    String a = any.getText();
                    double an = Double.parseDouble(a);
                    pst.setDouble(4, an);
                    String s = sor.getText();
                    double so = Double.parseDouble(s);
                    pst.setDouble(5, so);
                    String m = meny.getText();
                    double me = Double.parseDouble(m);
                    System.out.println(hm-me);
                    double valt = hm-me;
                    if(valt < 0){
                        JOptionPane.showMessageDialog(rootPane,"negativ lett az aktuális mennyiség" );
                        besz.setText("");  
                        any.setText("");  
                        sor.setText("");  
                        S_T.setText("");
                        meny.setText("");
                    }
                    pst.setDouble(1, valt);
                    pst.setDouble(2, valt*brutto());
                    pst.executeUpdate();
                }catch(SQLException e ){
                    System.out.println(e);
                }       break;
            
            case "U":
                try{
                    String query = "Update anyag1 set mennyiség=?, akt_ért=? where beszállitó =? and anyagkód=? and sorszám=? ";
                    PreparedStatement pst = con.prepareStatement(query);
                    String b = besz.getText();
                    double be = Double.parseDouble(b);
                    pst.setDouble(3, be);
                    String a = any.getText();
                    double an = Double.parseDouble(a);
                    pst.setDouble(4, an);
                    String s = sor.getText();
                    double so = Double.parseDouble(s);
                    pst.setDouble(5, so);
                    String m = meny.getText();
                    double me = Double.parseDouble(m);
                    System.out.println(hm-me);
                    double valt = hm-me;
                    if(valt < 0){
                        JOptionPane.showMessageDialog(rootPane,"negativ lett az aktuális mennyiség" );
                        besz.setText("");  
                        any.setText("");  
                        sor.setText("");  
                        S_T.setText("");
                        meny.setText("");
                    }
                    pst.setDouble(1, valt);
                    pst.setDouble(2, valt*brutto());
                    pst.executeUpdate();
                }catch(SQLException e ){
                    System.out.println(e);
                }       break;
            default:
                break;
        }
    }

    private double brutto() {
        double ertek=0.0;
        try{
                    String query = "Select brutto_ár from anyag1 where beszállitó =? and anyagkód=? and sorszám=? ";
                    PreparedStatement pst = con.prepareStatement(query);
                    String b = besz.getText();
                    double be = Double.parseDouble(b);
                    pst.setDouble(1, be);
                    String a = any.getText();
                    double an = Double.parseDouble(a);
                    pst.setDouble(2, an);
                    String s = sor.getText();
                    double so = Double.parseDouble(s);
                    pst.setDouble(3, so);
                    ResultSet rs = pst.executeQuery();
                    while(rs.next()){
                        ertek = rs.getDouble(1);
                    }
                }catch(SQLException e ){
                    System.out.println(e);
                } 
        return ertek;
    }
}
