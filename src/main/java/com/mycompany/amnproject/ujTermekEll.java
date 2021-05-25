/* 11 104 100011
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.amnproject;

import static com.mycompany.amnproject.MainClass.con;
import static com.mycompany.amnproject.MainClass.ertek;
import static com.mycompany.amnproject.MainClass.szám;
import static com.mycompany.amnproject.MainClass.selej;
import static com.mycompany.amnproject.MainClass.tobb_hia;
import static png.image.getImage;
import static com.mycompany.amnproject.MainClass.bek;
import static com.mycompany.amnproject.MainClass.fh;
import static com.mycompany.amnproject.MainClass.logger;
import static com.mycompany.amnproject.MainClass.pa;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.text.PlainDocument;


/**
 *
 * @author Crionic
 */
public class ujTermekEll extends javax.swing.JDialog {


    int szamAr = 0;
    public static double számologép = 0.0;
    int j =1;
    int k =10;
    List<Double> ertekek = new ArrayList<>(Arrays.asList());
    double[][] tomb = new double[k][9];
    public ujTermekEll() {
        super();
        initComponents();
        számologép = bek;
        
        PlainDocument beszá = (PlainDocument) besz.getDocument();
        beszá.setDocumentFilter(new DigitFilter()); 
        PlainDocument any = (PlainDocument) anyagkod.getDocument();
        any.setDocumentFilter(new DigitFilter()); 
        PlainDocument sor = (PlainDocument) sorsz.getDocument();
        sor.setDocumentFilter(new DigitFilter()); 
        PlainDocument hany = (PlainDocument) hanyad.getDocument();
        hany.setDocumentFilter(new DigitFilter()); 

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        besz = new javax.swing.JTextField();
        anyagkod = new javax.swing.JTextField();
        sorsz = new javax.swing.JTextField();
        hanyad = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        tobb = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        sel = new javax.swing.JTextField();
        ellen = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("beszállitó id: ");

        jLabel2.setText("anyagkód: ");

        jLabel3.setText("sorszám");

        jLabel4.setText("anyaghányad");

        besz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beszActionPerformed(evt);
            }
        });

        anyagkod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anyagkodActionPerformed(evt);
            }
        });

        sorsz.setToolTipText("");
        sorsz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sorszActionPerformed(evt);
            }
        });

        jButton1.setIcon(new ImageIcon(getImage("icons/save.png")));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new ImageIcon(getImage("icons/cal.png")));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButton3.setIcon(new ImageIcon(getImage("icons/megse3.png")));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel7.setText("Többlet/Hiány");

        tobb.setText("0");

        jLabel8.setText("Selejt");

        sel.setText("0");

        ellen.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButton4.setIcon(new ImageIcon(getImage("icons/pipa.png")));
        jButton4.setMaximumSize(new java.awt.Dimension(20, 20));
        jButton4.setMinimumSize(new java.awt.Dimension(20, 20));
        jButton4.setPreferredSize(new java.awt.Dimension(20, 20));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ellen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(besz, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(anyagkod, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sorsz, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(103, 103, 103)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(46, 46, 46)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel7)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tobb, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                                    .addComponent(sel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hanyad, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(19, 19, 19)
                                .addComponent(sorsz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(anyagkod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(besz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ellen, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hanyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tobb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       try {  

            // This block configure the logger with handler and formatter  
            fh = new FileHandler("C:/Users/Crionic/Desktop/log.txt", true);  
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();  
            fh.setFormatter(formatter);  
            
            // the following statement is used to log any messages  
            logger.info(pa.getProperty("user")+" Megnyomta a számolót.");  
            for(Handler h:logger.getHandlers())
                        {
                            h.close();   //must call h.close or a .LCK file will remain.
                        }
        } catch (SecurityException | IOException y) {  
        }
        ellenor();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void beszActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beszActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_beszActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         try {  

            // This block configure the logger with handler and formatter  
            fh = new FileHandler("C:/Users/Crionic/Desktop/log.txt", true);  
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();  
            fh.setFormatter(formatter);  
            
            // the following statement is used to log any messages  
            logger.info(pa.getProperty("user")+" Megnyomta a tétel mentését.");  
        for(Handler h:logger.getHandlers())
                        {
                            h.close();   //must call h.close or a .LCK file will remain.
                        }
        } catch (SecurityException | IOException y) {  
            y.printStackTrace();  
        }
        ell();
        j++;
        //System.out.println(j);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void anyagkodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anyagkodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anyagkodActionPerformed

    private void sorszActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sorszActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sorszActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
         ujTermek.jButton1.setEnabled(true);
         try {  

            // This block configure the logger with handler and formatter  
            fh = new FileHandler("C:/Users/Crionic/Desktop/log.txt", true);  
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();  
            fh.setFormatter(formatter);  
         
            // the following statement is used to log any messages  
            logger.info(pa.getProperty("user")+" Megnyomta a termék mentését és kilépett.");  
            for(Handler h:logger.getHandlers())
                        {
                            h.close();   //must call h.close or a .LCK file will remain.
                        }
        } catch (SecurityException | IOException y) {  
            y.printStackTrace();  
        }
        for(int i = 1; i<j; i++){
            /*for(int k = 0;k<9;k++){
                 System.out.println(i + " " +ertekek.get((((i-1)*9)+k)));
                
            }*/
            
            try {
                String lek = "update anyag1 set mennyiség=?, akt_ért=?, Selejt=?, Sel_ért=?, Több_hi=?, több_ért=? where beszállitó =? and anyagkód=? and sorszám=?";
                PreparedStatement st = con.prepareStatement(lek);
                int be = ertekek.get((((i-1)*10)+6)).intValue();
                int an = ertekek.get((((i-1)*10)+7)).intValue();
                 int sor = ertekek.get((((i-1)*10)+8)).intValue();
                st.setDouble(1, ertekek.get((((i-1)*10)+0)) );
                st.setDouble(2, ertekek.get((((i-1)*10)+1)) );
                st.setDouble(3, ertekek.get((((i-1)*10)+2))  );
                st.setDouble(4, ertekek.get((((i-1)*10)+3)) );
                st.setDouble(5, ertekek.get((((i-1)*10)+4)) );
                st.setDouble(6, ertekek.get((((i-1)*10)+5)));
                
                st.setDouble(7, be );
                 
                st.setDouble(8, an );
                
                st.setDouble(9, sor );

               
                double ha =  ertekek.get((((i-1)*10)+9));
                String hozza =" "+ be+" "+an+" "+sor+" "+ha;
                sethozza(hozza, sor, (float) ha);
                int affectedRows = st.executeUpdate();
                if (affectedRows == 0) {
                    throw new SQLException("Creating user failed, no rows affected.");
                }
            } catch (SQLException ex) {
                 System.out.println(ex);
            }
        }
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         try {  

            // This block configure the logger with handler and formatter  
            fh = new FileHandler("C:/Users/Crionic/Desktop/log.txt", true);  
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();  
            fh.setFormatter(formatter);  
            
            // the following statement is used to log any messages  
            logger.info(pa.getProperty("user")+" Megnyomta a árú keresést.");  
            for(Handler h:logger.getHandlers())
                        {
                            h.close();   //must call h.close or a .LCK file will remain.
                        }
        } catch (SecurityException | IOException y) {  
            y.printStackTrace();  
        }
        kommentKeres();
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anyagkod;
    private javax.swing.JTextField besz;
    private javax.swing.JLabel ellen;
    private javax.swing.JTextField hanyad;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField sel;
    private javax.swing.JTextField sorsz;
    private javax.swing.JTextField tobb;
    // End of variables declaration//GEN-END:variables


    public void ellenor() {

        
        try{
           String lek = "Select szám_ár from anyag1 where beszállitó =? and anyagkód=? and sorszám=?";
           PreparedStatement st = con.prepareStatement(lek);
           
          
           String b = besz.getText();
           int be = Integer.parseInt(b);
           st.setInt(1, be);
           String d = anyagkod.getText();
           int an = Integer.parseInt(d);
           st.setInt(2, an);
           String s = sorsz.getText();
           int so = Integer.parseInt(s);
           st.setInt(3, so);
           String h = hanyad.getText();
           double ha = Double.parseDouble(h);
           ResultSet rs = st.executeQuery();
           while(rs.next()){
              
              
                  szamAr = rs.getInt("szám_ár");
                  szám += szamAr * ha;
                  számologép += szám;
                   
               
                  szám = 0;
                  
              
               
           }  
        }catch(SQLException | NumberFormatException e) {
            System.out.println(e);
        } 
        String er = String.valueOf(számologép);
        jLabel6.setText(er);
}

    

    public void ell() {
        double me = 0;
        double keszlet = 0;
        double br =0;
        System.out.println(számologép);
        try{
           String lek = "Select mennyiség, brutto_ár from anyag1 where beszállitó =? and anyagkód=? and sorszám=?";
           PreparedStatement st = con.prepareStatement(lek);
           String b = besz.getText();
           int be = Integer.parseInt(b);
           st.setInt(1, be);
           String d = anyagkod.getText();
           int an = Integer.parseInt(d);
           st.setInt(2, an);
           String s = sorsz.getText();
           int so = Integer.parseInt(s);
           st.setInt(3, so);
           String bea = hanyad.getText();
           float ha = Float.parseFloat(bea);
           
          
           ResultSet rs = st.executeQuery();
           while(rs.next()){ 
                  me = rs.getDouble("mennyiség");
                  br = rs.getDouble("brutto_ár");
                } 
           String hozza =" "+ b+" "+an+" "+so+" "+ha;
           keszlet = me - ertek*ha;
           if(keszlet < 0){
               JOptionPane.showMessageDialog(rootPane, "Hibás, nem lehet negativ.");
               besz.setText("");
               anyagkod.setText("");
               sorsz.setText("");
               hanyad.setText("");
               tobb.setText("");
               sel.setText("");
           }else{
               levon(keszlet,br,ha);
               besz.setText("");
               anyagkod.setText("");
               sorsz.setText("");
               hanyad.setText("");
               tobb.setText("0");
               sel.setText("0");
             
           }
           fh = new FileHandler("C:/Users/Crionic/Desktop/log.txt");  
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();  
            fh.setFormatter(formatter);
            
       }catch(SQLException | NumberFormatException e) {
           System.out.println(e);
        } catch (IOException | SecurityException ex) {
            System.out.println(ex);
        }
    }

    public void levon(double keszlet, double br, float ha){
       
        double mennyiség = 0.0;
        double érték = 0.0;
        double selejt;
        double selejtért;
        double tobl;
        double tobbért;
        double beszáll;
        double anyag;
        double sor;    
        double hany = (double) ha;
        
        
        String sele = sel.getText();
        selej = Double.parseDouble(sele);
        String tob = tobb.getText();
        tobb_hia = Float.parseFloat(tob);
            System.out.println(selej+"s");
            System.out.println(tobb_hia+"t");
            double tobb_kesz = 0.0;
        if(selej != 0 && tobb_hia !=0){
           tobb_kesz = keszlet+tobb_hia; 
        
        if(tobb_kesz > 0 ){
               if(tobb_hia!=0){
                    
                    mennyiség= tobb_kesz;
                     érték= tobb_kesz*br;
               }               
        }else {
            JOptionPane.showMessageDialog(rootPane, "negativ lett az aktuális mennyiség");
             besz.setText("");
               anyagkod.setText("");
               sorsz.setText("");
               hanyad.setText("");
               tobb.setText("0");
               sel.setText("0");
        }
        if((keszlet-selej) >= 0){
            if(tobb_hia!=0){
                    mennyiség=   tobb_kesz-selej;
                    érték=  (tobb_kesz-selej)*br;
               }else if(selej!=0){
                    mennyiség=  keszlet-selej;
                    érték=  (keszlet-selej)*br;
               }else {
                 mennyiség=  keszlet;
                 érték=   keszlet*br;
               } 
            }else {
            JOptionPane.showMessageDialog(rootPane,"negativ lett az aktuális mennyiség" );
             besz.setText("");
               anyagkod.setText("");
               sorsz.setText("");
               hanyad.setText("");
               tobb.setText("0");
               sel.setText("0");
           }
        }else if(selej != 0 && tobb_hia == 0){
            if((keszlet-selej) >= 0){
            if(tobb_hia!=0){
                    mennyiség=   tobb_kesz-selej;
                    érték=  (tobb_kesz-selej)*br;
               }else if(selej!=0){
                    mennyiség=  keszlet-selej;
                    érték=  (keszlet-selej)*br;
               }else {
                 mennyiség=  keszlet;
                 érték=   keszlet*br;
               } 
            }else {
            JOptionPane.showMessageDialog(rootPane,"negativ lett az aktuális mennyiség" );
             besz.setText("");
               anyagkod.setText("");
               sorsz.setText("");
               hanyad.setText("");
               tobb.setText("0");
               sel.setText("0");
           }
        }
        else if(selej == 0 && tobb_hia != 0){
            tobb_kesz = keszlet+tobb_hia; 

           if(tobb_kesz > 0 ){
                  if(tobb_hia!=0){

                       mennyiség= tobb_kesz;
                        érték= tobb_kesz*br;
                  }               
           }else {
               JOptionPane.showMessageDialog(rootPane, "negativ lett az aktuális mennyiség");
                besz.setText("");
                  anyagkod.setText("");
                  sorsz.setText("");
                  hanyad.setText("");
                  tobb.setText("0");
                  sel.setText("0");
           }
        }
        else if(selej == 0 && tobb_hia == 0){
                mennyiség=  keszlet;
                érték=   keszlet*br;
        }
        
        String b = besz.getText();
        beszáll = Integer.parseInt(b);
      
        String d = anyagkod.getText();
        anyag = Integer.parseInt(d);
      
        String s = sorsz.getText();
        sor = Integer.parseInt(s);
        selejt=selej;
        selejtért = selej*br;
        tobl = tobb_hia;
        tobbért = tobb_hia*br;

       
        ertekek.add(mennyiség);
        ertekek.add(érték);
        ertekek.add(selejt + selej(beszáll, anyag, sor));
        ertekek.add(selejtért + sele(beszáll, anyag, sor));
        ertekek.add(tobl + to(beszáll, anyag, sor));
        ertekek.add(tobbért + tos(beszáll, anyag, sor));
        ertekek.add(beszáll);
        ertekek.add(anyag);
        ertekek.add(sor);
        ertekek.add(hany);
        
        System.out.println(ertekek);
        System.out.println(ertekek.get(1));
        
       
       }

    public void sethozza(String hozza, int so, float ha) {
        System.out.println("belépett");
        try{
            String id[] = { "id" };
           
           String lek = "insert into hozzavalok(Azon, anyag, sor, anyagh)values(?,?,?,?)";
           PreparedStatement st = con.prepareStatement(lek, id);
           st.setInt(1, kódSorszám());
           st.setString(2, hozza.toUpperCase());
           st.setInt(3, so);
           st.setFloat(4, ha);
          int affectedRows = st.executeUpdate();
          
          if (affectedRows == 0) {
            throw new SQLException("Creating user failed, no rows affected.");
        }
        ResultSet rs = st.getGeneratedKeys();
        if (rs.next()){
            long is = rs.getLong(1);
            
        }
       
        }catch(SQLException e){
                  System.out.println(e);
                System.exit(0);
        }
    }

    private int kódSorszám() {
         int value = 0;
        try{
            String query = "select Top 1 Sorszám from dbo.sorsz Order by Sorszám DESC ";
            PreparedStatement st = con.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                value = rs.getInt(1);
                return value;
            }
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        
        return value;
    }

    public double selej(double be,double an,double sor) {
        double ertek=0.0;
        try{
           
        String lek = "select Selejt from anyag1 where beszállitó =? and anyagkód=? and sorszám=?";
        PreparedStatement st = con.prepareStatement(lek);
        st.setDouble(1, be);
        st.setDouble(2, an);
        st.setDouble(3, sor);
        
        ResultSet rs = st.executeQuery();
        while(rs.next()){
            ertek = rs.getDouble("Selejt");
            /*if(rs.wasNull()){
                ertek = 0;
            }*/
        }
        }catch(SQLException e){
            System.out.println(e);
        } 
        System.out.println(ertek);
        return ertek;
    }
    public double sele(double be,double an,double sor) {
        double ertek=0.0;
         try{
        String lek = "select Sel_ért from anyag1 where beszállitó =? and anyagkód=? and sorszám=?";
        PreparedStatement st = con.prepareStatement(lek);
        st.setDouble(1, be);
        st.setDouble(2, an);
        st.setDouble(3, sor);
        
        ResultSet rs = st.executeQuery();
        while(rs.next()){
            ertek = rs.getDouble("Sel_ért");
            /*if(rs.wasNull()){
                ertek = 0;Több_hi
            }*/
        }
        }catch(SQLException e){
            System.out.println(e);
        } 
        System.out.println(ertek);
        return ertek;
    }
    public double to(double be, double an, double sor) {
        double ertek=0.0;
        try{
        String lek = "select Több_hi from anyag1 where beszállitó =? and anyagkód=? and sorszám=?";
        PreparedStatement st = con.prepareStatement(lek);
        st.setDouble(1, be);
        st.setDouble(2, an);
        st.setDouble(3, sor);
        
        ResultSet rs = st.executeQuery();
        while(rs.next()){
            ertek = rs.getDouble("Több_hi");
            if(rs.wasNull()){
                ertek = 0.0;
            }
        }
        }catch(SQLException e){
            System.out.println(e);
        }
        System.out.println(ertek);
        return ertek;
    }
    public double tos(double be, double an, double sor) {
        double ertek=0.0;
        try{
        String lek = "select több_ért from anyag1 where beszállitó =? and anyagkód=? and sorszám=?";
        PreparedStatement st = con.prepareStatement(lek);
        st.setDouble(1, be);
        st.setDouble(2, an);
        st.setDouble(3, sor);
        
        ResultSet rs = st.executeQuery();
        while(rs.next()){
            ertek = rs.getDouble("több_ért");
            if(rs.wasNull()){
                ertek = 0.0;
            }
        }
        }catch(SQLException e){
            System.out.println(e);
        }
        System.out.println(ertek);
        return ertek;
    }

    public void kommentKeres() {
        try{
           String lek = "Select komment, mennyiség from anyag1 where beszállitó =? and anyagkód=? and sorszám=?";
           PreparedStatement st = con.prepareStatement(lek);
           String b = besz.getText();
            int be = Integer.parseInt(b);
            st.setInt(1, be);
            String d = anyagkod.getText();
            int an = Integer.parseInt(d);
            st.setInt(2, an);
            String s = sorsz.getText();
            int so = Integer.parseInt(s);
            st.setInt(3, so);
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                String v = rs.getString("komment");
                double va = rs.getDouble("mennyiség");
                String vaa = String.valueOf(va);
              
                ellen.setText(v +"     "+vaa);
            }else ellen.setText("ERRORRR");
        }catch(SQLException e ){
            System.out.println(e);
        }
    }

   /*private Double selej(int be, int an, int sor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

   
}



