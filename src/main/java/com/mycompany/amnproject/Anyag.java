/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.amnproject;

import static com.mycompany.amnproject.MainClass.con;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import static java.awt.Frame.NORMAL;
import java.awt.print.PrinterException;
import java.sql.*;
import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.Highlighter;
import static png.image.getImage;

/**
 *
 * @author Crionic
 */
public class Anyag extends javax.swing.JFrame {
    
      

    private static DecimalFormat df2 = new DecimalFormat("#,###.##");
    /**
     * Creates new form Anyag
     */
    public Anyag()  {
        super();
        initComponents();
        Update();
        this.setExtendedState(this.MAXIMIZED_BOTH);
        
    }
    public double aktMen(){
         double value = 0.0;
         try{
         Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("Select sum(mennyiség) from dbo.anyag1");
        rs.next();
        String er = rs.getString(1);
        value = Double.parseDouble(er);

       
    }catch(SQLException e){
         System.out.println(e); 
                JOptionPane.showMessageDialog(null, "táblázat jelenités\n"+e);
                System.exit(0);
    }
         return value;
     }
    public double aktÉrt(){
         double value = 0.0;
         try{
         Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("Select sum(akt_ért) from dbo.anyag1");
        rs.next();
        String er = rs.getString(1);
        value = Double.parseDouble(er);

       
    }catch(SQLException e){
        System.out.println(e);
    }
         return value;
     }
    public double beérkMen(){
         double value = 0.0;
         try{
         Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("Select sum(beérk_menny ) from dbo.anyag1");
        rs.next();
        String er = rs.getString(1);
        value = Double.parseDouble(er);

       
    }catch(SQLException e){
        System.out.println(e);
    }
         return value;
     }
    public double többé(){
         double value = 0.0;
         try{
         Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("Select sum(több_ért) from dbo.anyag1");
        rs.next();
        String er = rs.getString(1);
        value = Double.parseDouble(er);

       
    }catch(SQLException e){
        System.out.println(e);
    }
         return value;
     }
    public double többm(){
         double value = 0.0;
         try{
         Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("Select sum(Több_hi) from dbo.anyag1");
        rs.next();
        String er = rs.getString(1);
        value = Double.parseDouble(er);

       
    }catch(SQLException e){
        System.out.println(e);
    }
         return value;
     }
    public double SelejtÉr(){
         double value = 0.0;
         try{
         Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("Select sum(Sel_ért) from dbo.anyag1");
        rs.next();
        String er = rs.getString(1);
        value = Double.parseDouble(er);

       
    }catch(SQLException e){
        System.out.println(e);
    }
         return value;
     }
    public double Selehtmeny(){
         double value = 0.0;
        try{
            Statement st = con.createStatement();
           ResultSet rs = st.executeQuery("Select sum(Selejt) from dbo.anyag1");
           rs.next();
           String er = rs.getString(1);
        value = Double.parseDouble(er);


       }catch(SQLException | NumberFormatException e ){
           System.out.println(e);
       }
         return value;
     }
    public double beérkÉrt(){
         double value = 0.0;
         try{
         Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("Select sum(ertek) from dbo.anyag1");
        rs.next();
        String er = rs.getString(1);
        value = Double.parseDouble(er);

       
    }catch(SQLException e){
        System.out.println(e);
    }
         return value;
     }
    public void szurt(JTable tab){
        double total = 0.0;
                double total1 = 0;
                double total2 = 0.0;
                double total3 = 0.0;
                double selm =0.0;
                double selé =0.0;
                double többm =0.0;
                double többé =0.0;

                for (int i = 0; i < tab.getRowCount(); i++){
                        try{
                            String bemen = tab.getValueAt(i , 5).toString();
                            double asda = Double.parseDouble(bemen);
                            df2.format(total1 += asda);

                        }catch(NumberFormatException egy){System.err.println("ex badNumberInput:"+egy);}

                        try{
                            String aktmen = tab.getValueAt(i , 9).toString();
                            double asd = Double.parseDouble(aktmen);

                             df2.format(total += asd);

                        }catch(NumberFormatException ket){System.err.println("ex badNumberInput:"+ket);}
                        try{
                            String aktmen = tab.getValueAt(i , 11).toString();
                            double asda = Double.parseDouble(aktmen);


                            df2.format(total2 += asda);
                        }catch(NumberFormatException har){System.err.println("ex badNumberInput:"+har);}
                        try{

                            String ert = tab.getValueAt(i ,12).toString();          
                            double asd = Double.parseDouble(ert);
                            df2.format(total3 += asd);
                        }catch(NumberFormatException neg){System.err.println("ex badNumberInput:"+neg);}

                        try{

                            String bemen = tab.getValueAt(i , 14).toString();
                            double asda = Double.parseDouble(bemen);
                            df2.format(selm += asda);

                        }catch(NumberFormatException ot){System.err.println("ex badNumberInput:"+ot);}

                        try{
                            String aktmen = tab.getValueAt(i , 15).toString();
                             double asd = Double.parseDouble(aktmen);
                             df2.format(többm += asd);

                        }catch(NumberFormatException hat){System.err.println("ex badNumberInput:"+hat);}
                        try{
                            String aktmen = tab.getValueAt(i , 16).toString();
                            double asda = Double.parseDouble(aktmen);



                            df2.format(selé += asda);
                        }catch(NumberFormatException het){System.err.println("ex badNumberInput:"+het);}
                        try{
                            String bemen = tab.getValueAt(i , 17).toString();


                            double asda = Double.parseDouble(bemen);
                            df2.format(többé += asda);
                        }catch(NumberFormatException nyo){System.err.println("ex badNumberInput:"+nyo);}

                }

                berkMe.setText(String.valueOf(df2.format(total1)));
                beérkÉr.setText(String.valueOf(df2.format(total3)));
                aktMe.setText(String.valueOf(df2.format(total)));
                aktÉr.setText(String.valueOf(df2.format(total2)));
                selem.setText(String.valueOf(df2.format(selm)));
                seleé.setText(String.valueOf(df2.format(selé)));
                tobm.setText(String.valueOf(df2.format(többm)));
                tobé.setText(String.valueOf(df2.format(többé)));
    }
    
    public void Update(){
        lis.setVisible(false);

        try{
         Statement stat = con.createStatement();
        ResultSet rs = stat.executeQuery("Select * from dbo.anyag1 ");
        while(tab.getRowCount() > 0) 
        {
            ((DefaultTableModel) tab.getModel()).removeRow(0);
        }
        int columns = rs.getMetaData().getColumnCount();
        while(rs.next())
        {  
            Object[] row = new Object[columns];
            for (int i = 1; i <= columns; i++)
            {  
                row[i - 1] = rs.getObject(i);
            }
            ((DefaultTableModel) tab.getModel()).insertRow(rs.getRow()-1,row);
        }
        DefaultTableCellRenderer r = new DefaultTableCellRenderer() {
             Font font = new Font("Tahoma", Font.BOLD, 14);

            @Override
            public Component getTableCellRendererComponent(JTable table,
                    Object value, boolean isSelected, boolean hasFocus,
                    int row, int column) {
                super.getTableCellRendererComponent(table, value, isSelected, hasFocus,
                        row, column);
                setFont(font);
                setBackground(Color.LIGHT_GRAY);
                return this;
            }

        };
        tab.setAutoCreateRowSorter(true);
        tab.setDefaultEditor(tab.getColumnClass(NORMAL), null);
        
        //tab.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        tab.setPreferredScrollableViewportSize(tab.getPreferredSize());
        tab.setFillsViewportHeight(true);
       
        TableColumnModel col = tab.getColumnModel();
        tab.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 14));
        col.getColumn(0).setPreferredWidth(30);
        col.getColumn(1).setPreferredWidth(30);
        col.getColumn(2).setPreferredWidth(40);
        col.getColumn(4).setPreferredWidth(80);
        col.getColumn(8).setPreferredWidth(200);
        col.getColumn(9).setPreferredWidth(50);
        col.getColumn(9).setCellRenderer(r);
        col.getColumn(10).setPreferredWidth(50);
        col.getColumn(11).setPreferredWidth(50);
        col.getColumn(12).setPreferredWidth(50);
        col.getColumn(13).setPreferredWidth(50);
        col.getColumn(14).setPreferredWidth(50);
        col.getColumn(15).setPreferredWidth(50);
        col.getColumn(16).setPreferredWidth(50);
        col.getColumn(17).setPreferredWidth(50);
        
        
        
        tab.setFillsViewportHeight(true);
        String aktm = String.valueOf(df2.format(aktMen()));
        aktMe.setText(aktm);
        String akté = String.valueOf(df2.format(aktÉrt()));
        aktÉr.setText(akté);
        String bem = String.valueOf(df2.format(beérkMen()));
        berkMe.setText(bem);
        String beé = String.valueOf(df2.format(beérkÉrt()));
        beérkÉr.setText(beé);
        String selm = String.valueOf(df2.format(Selehtmeny()));
        selem.setText(selm);
        String selé = String.valueOf(df2.format(SelejtÉr()));
        seleé.setText(selé);
        String tobbm = String.valueOf(df2.format(többm()));
        tobm.setText(tobbm);
        String tobbé = String.valueOf(df2.format(többé()));
        tobé.setText(tobbé);
        
    }catch(SQLException e){
         JOptionPane.showMessageDialog(null, "táblázat jelenités\n"+e);
         System.exit(0);
    }
    
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(JLabel.RIGHT);

        tab.setDefaultRenderer(Double.class, new TableCellRenderer(){
            private DefaultTableCellRenderer DEFAULT_RENDERER =  new DefaultTableCellRenderer();
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = DEFAULT_RENDERER.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                
                if (row%2 == 0){
                    c.setBackground(Color.WHITE);
                }
                else {
                    c.setBackground(Color.LIGHT_GRAY);
                }                        
                return c;
            }

        });
        tab.setDefaultRenderer(String.class, new TableCellRenderer(){
            private DefaultTableCellRenderer DEFAULT_RENDERER =  new DefaultTableCellRenderer();
            
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = DEFAULT_RENDERER.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                
                if (row%2 == 0){
                    c.setBackground(Color.white);
                    
                }
                else {
                    c.setBackground(Color.LIGHT_GRAY);
                }                        
                return c;
            }

        });
        
        kereses.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                //search(keres.getText());
                TableRowSorter sorter = (TableRowSorter) tab.getRowSorter();
                
                String text = kereses.getText();
               
                if (text.length() == 0) {
                sorter.setRowFilter(null);
                String aktm = String.valueOf(df2.format(aktMen()));
                aktMe.setText(aktm);
                String akté = String.valueOf(df2.format(aktÉrt()));
                aktÉr.setText(akté);
                String bem = String.valueOf(df2.format(beérkMen()));
                berkMe.setText(bem);
                String beé = String.valueOf(df2.format(beérkÉrt()));
                beérkÉr.setText(beé);
                String selm = String.valueOf(df2.format(Selehtmeny()));
                selem.setText(selm);
                String selé = String.valueOf(df2.format(SelejtÉr()));
                seleé.setText(selé);
                String tobbm = String.valueOf(df2.format(többm()));
                tobm.setText(tobbm);
                String tobbé = String.valueOf(df2.format(többé()));
                tobé.setText(tobbé);
                
            } else {
                sorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                szurt(tab);
                
            }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                TableRowSorter sorter = (TableRowSorter) tab.getRowSorter();
                String text = kereses.getText();
                if (text.length() == 0) {
                    sorter.setRowFilter(null);
                    String aktm = String.valueOf(df2.format(aktMen()));
                    aktMe.setText(aktm);
                    String akté = String.valueOf(df2.format(aktÉrt()));
                    aktÉr.setText(akté);
                    String bem = String.valueOf(df2.format(beérkMen()));
                    berkMe.setText(bem);
                    String beé = String.valueOf(df2.format(beérkÉrt()));
                    beérkÉr.setText(beé);
                    String selm = String.valueOf(df2.format(Selehtmeny()));
                    selem.setText(selm);
                    String selé = String.valueOf(df2.format(SelejtÉr()));
                    seleé.setText(selé);
                    String tobbm = String.valueOf(df2.format(többm()));
                    tobm.setText(tobbm);
                    String tobbé = String.valueOf(df2.format(többé()));
                    tobé.setText(tobbé);
                } else {
                sorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                szurt(tab);
                
            }          
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                TableRowSorter sorter = (TableRowSorter) tab.getRowSorter();
                String text = kereses.getText();
                  if (text.length() == 0) {
                    sorter.setRowFilter(null);
                    String aktm = String.valueOf(df2.format(aktMen()));
                    aktMe.setText(aktm);
                    String akté = String.valueOf(df2.format(aktÉrt()));
                    aktÉr.setText(akté);
                    String bem = String.valueOf(df2.format(beérkMen()));
                    berkMe.setText(bem);
                    String beé = String.valueOf(df2.format(beérkÉrt()));
                    beérkÉr.setText(beé);
                    String selm = String.valueOf(df2.format(Selehtmeny()));
                    selem.setText(selm);
                    String selé = String.valueOf(df2.format(SelejtÉr()));
                    seleé.setText(selé);
                    String tobbm = String.valueOf(df2.format(többm()));
                    tobm.setText(tobbm);
                    String tobbé = String.valueOf(df2.format(többé()));
                    tobé.setText(tobbé);
            }
                  else {
                sorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                szurt(tab);
                
            }       
            }
    });
       keres.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                 updateFilters();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                 updateFilters();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                 updateFilters();
            }
       });
       
       ker.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                 updateFilters();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                 updateFilters();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                 updateFilters();
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
        tab = new javax.swing.JTable();
        keres = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        berkMe = new javax.swing.JLabel();
        beérkÉr = new javax.swing.JLabel();
        aktMe = new javax.swing.JLabel();
        aktÉr = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lis = new javax.swing.JTextArea();
        ker = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        kereses = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        selem = new javax.swing.JLabel();
        seleé = new javax.swing.JLabel();
        tobm = new javax.swing.JLabel();
        tobé = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AMNESIA nyilvántartó rendszer v1.5 Anyagok");
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(0, 0));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tab.setAutoCreateRowSorter(true);
        tab.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "beszállitó", "anyagkód", "sorszám", "beszállit", "anyag", "beérk_menny", "brutto_ár", "érk_dát", "komment", "akt menny", "végek", "akt_ért", "ertek", "szám_ár", "Selejt", "Több_hiá", "Sel_ért", "több_ért"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tab.setToolTipText("");
        tab.setGridColor(new java.awt.Color(153, 153, 153));
        tab.setMaximumSize(new java.awt.Dimension(2147483647, 125125125));
        tab.setNextFocusableComponent(this);
        tab.setOpaque(false);
        tab.setRowHeight(22);
        tab.setShowGrid(true);
        tab.setShowVerticalLines(false);
        jScrollPane1.setViewportView(tab);

        keres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keresActionPerformed(evt);
            }
        });

        jLabel1.setText("Beérk m");

        jLabel2.setText("Beérk érték");

        jLabel3.setText("Akt m");

        jLabel4.setText("Akt érték");

        berkMe.setText("jLabel5");

        beérkÉr.setText("jLabel6");

        aktMe.setText("jLabel7");

        aktÉr.setText("jLabel8");

        jButton1.setText("Termék");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lis.setColumns(20);
        lis.setRows(5);
        jScrollPane2.setViewportView(lis);

        ker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kerActionPerformed(evt);
            }
        });

        jButton2.setText("Vissza");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        kereses.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        kereses.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        jLabel5.setText("Selejt m");

        jLabel6.setText("Selejt érték");

        jLabel7.setText("Többlet/Hiány m");

        jLabel8.setText("Többlet/Hiány érték");

        selem.setText("jLabel9");

        seleé.setText("jLabel10");

        tobm.setText("jLabel11");

        tobé.setText("jLabel12");

        jButton3.setIcon(new ImageIcon(getImage("icons/print.png")));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(48, 48, 48)
                                .addComponent(jButton2))
                            .addComponent(keres, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kereses, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ker, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33))
                    .addComponent(berkMe, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(beérkÉr, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(aktMe, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(aktÉr, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tobé, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tobm, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(seleé, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(selem))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)))
                            .addGap(162, 162, 162))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1434, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(kereses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(keres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(berkMe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(beérkÉr))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(aktMe))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(aktÉr))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(selem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(seleé)
                        .addGap(18, 18, 18)
                        .addComponent(tobm)
                        .addGap(18, 18, 18)
                        .addComponent(tobé))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)))
                .addGap(68, 68, 68)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 787, Short.MAX_VALUE)
        );

        setBounds(0, 0, 1735, 826);
    }// </editor-fold>//GEN-END:initComponents

    private void keresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_keresActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        
        int rows[]=this.tab.getSelectedRows();

        for(int i=0;i<rows.length;i++)
        {
            String value = tab.getValueAt(rows[i], 2).toString();
            System.out.println(value);
            int sor = Integer.parseInt(value);
            lis.setText(Termek(sor));
        }    
        //System.out.println(inde);
        
        lis.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void kerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kerActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        lis.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            MessageFormat header = new MessageFormat(" ");
        MessageFormat footer = new MessageFormat(" ");
    try {
        tab.print(JTable.PrintMode.FIT_WIDTH, header, footer);
    } catch (java.awt.print.PrinterAbortException e) {
        Logger.getLogger(Termek.class.getName()).log(Level.SEVERE, null, e);
    } catch (PrinterException ex) {
        Logger.getLogger(Termek.class.getName()).log(Level.SEVERE, null, ex);
    }        
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aktMe;
    private javax.swing.JLabel aktÉr;
    private javax.swing.JLabel berkMe;
    private javax.swing.JLabel beérkÉr;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField ker;
    private javax.swing.JTextField keres;
    private javax.swing.JTextField kereses;
    private javax.swing.JTextArea lis;
    private javax.swing.JLabel selem;
    private javax.swing.JLabel seleé;
    private javax.swing.JTable tab;
    private javax.swing.JLabel tobm;
    private javax.swing.JLabel tobé;
    // End of variables declaration//GEN-END:variables

    private String Termek(int ert) {
       int rt =0;
       String ca = "";
       
        try{
        String lek = "Select Azon, anyagh from dbo.hozzavalok where sor=?";
        PreparedStatement st = con.prepareStatement(lek);
        
        st.setInt(1, ert);
        ResultSet rs = st.executeQuery();
        while(rs.next()){
             rt = rs.getInt(1);
            double anyag = rs.getDouble(2);
         
            
            System.out.println(rt+ " a "+anyag+" any");
           ca +=  Tablazat(rt, anyag)+"\n";
        }
        
        }catch(SQLException e){
            System.out.println(e);
        }
        return ca;
    }

    private String Tablazat(int rt, double anyag) {
        
        String valami = "";
        try{
        String lek = "Select Név, Dátum from dbo.termék where kód=?";
        PreparedStatement st = con.prepareStatement(lek);
        
        st.setInt(1, rt);
        ResultSet rss = st.executeQuery();
        System.out.println(rt+"n");
         
         System.out.println(valami+"V");
        if(rss.next()){
            for(int i = 1; i<=2; i++){
                valami += rss.getString(i) + " ";
            }
           valami+= " "+anyag;
        }
        
        }catch(SQLException e){
            System.out.println(e);
        }
        return valami;
    }

     public void updateFilters() {
            TableRowSorter sorter = (TableRowSorter) tab.getRowSorter();
            RowFilter kere = RowFilter.regexFilter(keres.getText());
            RowFilter ke = RowFilter.regexFilter(ker.getText());
            if (keres.getText().length() > 0) {
                if (ker.getText().length() > 0) {
                    List<RowFilter<DefaultTableModel, Integer>> filters =
                    new ArrayList<RowFilter<DefaultTableModel, Integer>>(2);
                    filters.add(kere);
                    filters.add(ke);
                    RowFilter<DefaultTableModel, Integer> comboFilter = RowFilter.andFilter(filters);
                    sorter.setRowFilter(comboFilter);
                    szurt(tab);
                // Both filters active so construct an and filter.
                //sorter.setRowFilter(RowFilter.andFilter(kere, ke));
                }else {
               // first non-empty but second empty.
                    sorter.setRowFilter(RowFilter.regexFilter("(?i)" +kere));
                    szurt(tab);
                }
            } else if (keres.getText().length() > 0) {
              // first empty but second non-empty.
                sorter.setRowFilter(RowFilter.regexFilter("(?i)" +ke));
                szurt(tab);
            }  
            
            else {
              // Neither filter "active" so remove filter from sorter.
              sorter.setRowFilter(null); 
            }
            }

}
