/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.amnproject;

import static com.mycompany.amnproject.MainClass.con;
import static java.awt.Frame.NORMAL;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.imgscalr.Scalr;


/**
 *
 * @author Crionic
 */
public class Próba extends JDialog {
     BufferedImage img;
    /**
     * Creates new form Próba
     */
    public Próba() {
        super();
        initComponents();
        Update();
        
        
    }
     public double osszert(){
         double value = 0.0;
         try{
             
       // Connection conn = DriverManager.getConnection("jdbc:sqlserver://127.0.0.1;databaseName=amn;user=dsa;password=asd");
            Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("Select sum(bekerülési) from dbo.termék");
        rs.next();
        String er = rs.getString(1);
        value = Double.parseDouble(er);
        
       
    }catch(SQLException e){
        System.out.println(e);
    }
         return value;
     }
    public void Update(){
        try{
         //Connection conn = DriverManager.getConnection("jdbc:sqlserver://CRIONIC_PC\\SQLEXPRESS:1433;databaseName=amn;user=dsa;password=asd");
          Statement stat = con.createStatement();
        ResultSet rs = stat.executeQuery("Select * from dbo.termék");
        while(tabla.getRowCount() > 0) 
        {
            ((DefaultTableModel) tabla.getModel()).removeRow(0);
        }
        int columns = rs.getMetaData().getColumnCount();
        while(rs.next())
        {  
            Object[] row = new Object[columns];
            for (int i = 1; i <= columns; i++)
            {  
                row[i - 1] = rs.getObject(i);
            }
            ((DefaultTableModel) tabla.getModel()).insertRow(rs.getRow()-1,row);
        }

        /* 
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("Select * from dbo.termék");
        tabla.setModel(DbUtils.resultSetToTableModel(rs)); */
        tabla.setAutoCreateRowSorter(true);
        tabla.setDefaultEditor(tabla.getColumnClass(NORMAL), null);
        tabla.setPreferredScrollableViewportSize(tabla.getPreferredSize());
        tabla.setFillsViewportHeight(true);
        
        jLabel1.setVisible(false);
       hozzaval.setVisible(false);
        
       
    }catch(SQLException e){
        JOptionPane.showMessageDialog(null, "táblázat jelenités\n"+e);
         System.exit(0);
    }
        
        
        keres.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                search(keres.getText());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                search(keres.getText());           
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                search(keres.getText());
            }
            public void search(String str) {
           
           TableRowSorter sorter = (TableRowSorter) tabla.getRowSorter();
                if (str.length() == 0) {
               sorter.setRowFilter(null);
            } else {
               sorter.setRowFilter(RowFilter.regexFilter("(?i)" + str));
            }
            }
        });
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        keres = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        hozzaval = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("AMNESIA nyilvántartó rendszer v1.5 Termékek");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Név", "Dátum", "sz_ár", "varr", "varr_ár", "kell_ár", "Mennyiség", "Komment", "bekerülési", "kód"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.Object.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Object.class, java.lang.Double.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla);

        keres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keresActionPerformed(evt);
            }
        });

        jButton1.setText("Hozzávalók");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Vissza");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Lista, mikből áll");

        hozzaval.setColumns(20);
        hozzaval.setRows(5);
        jScrollPane2.setViewportView(hozzaval);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(68, 68, 68)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(keres, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 918, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 825, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(keres, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void keresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_keresActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         jLabel1.setVisible(true);
       hozzaval.setVisible(true);
       int selectedRowIndex = tabla.getSelectedRow();
       
       hozzaval.setText(hozzaval(selectedRowIndex));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jLabel1.setVisible(false);
       hozzaval.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea hozzaval;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField keres;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
 private String hozzaval(int selectedRowIndex) {
        String er = "";
        try{
        //Connection conn = DriverManager.getConnection("jdbc:sqlserver://CRIONIC_PC:1433;databaseName=amn;user=dsa;password=asd");   
        String lek = "Select anyag from dbo.hozzavalok where Azon=?";
        PreparedStatement st = con.prepareStatement(lek);
        String index =  tabla.getModel().getValueAt(selectedRowIndex, 9).toString();
        int inde = Integer.parseInt(index);
        st.setInt(1, inde);
        ResultSet rs = st.executeQuery();
        LoadImageApp(inde);
        while(rs.next()){
            er += rs.getString(1)+"\n";
        }
        
        }catch(SQLException e){
        System.out.println(e);
        }
        return er;
    }

    private void LoadImageApp(int inde) {
        try {
            
        
           img = ImageIO.read(new File("C:\\Users\\Crionic\\Documents\\NetBeansProjects\\"+inde+".jpg"));
            simpleResizeImage(img, 500);
           ImageIcon imgThisImg = new ImageIcon(img);

           jLabel2.setIcon(imgThisImg);
          
           
       } catch (IOException  e) {
            System.out.println(e);
       } catch (Exception ex) {
             Logger.getLogger(Próba.class.getName()).log(Level.SEVERE, null, ex);
         }
    }

   BufferedImage simpleResizeImage(BufferedImage originalImage, int targetWidth) throws Exception {
        return Scalr.resize(originalImage, targetWidth);
    }
}
