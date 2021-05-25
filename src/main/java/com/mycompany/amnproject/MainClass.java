/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.amnproject;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import static png.image.getImage;

/**
 *
 * @author Crionic
 */

 public class MainClass{
   
     
     public static Connection con;
     public static int ertek =0;
     public static double szám =0;
     public static double bek =0;
     public static float tobb_hia =0;
     public static double selej =0;
     public static String url;
     public static boolean correct;
     public static FileHandler fh; 
     public static Logger logger = Logger.getLogger("MyLog"); 
     public static final Properties p = new Properties();
     public static final Properties pa = new Properties();
         
        
     //="jdbc:sqlserver://localhost:1433;databaseName=amn;integratedSecurity=true"
     //public static String url ="jdbc:sqlserver://localhost:1433;databaseName=amn;user=dsa;password=asd";
     /*
     SQL user name:  svc_AMNPRG
     SQL user passw: Pod71_Prg

     */
     public static JFrame frame = new JFrame("AMNESIA nyilvántartó rendszer v1.5");
     
     public static void main(String[] args) throws IOException  {
        System.setProperty("java.util.logging.SimpleFormatter.format", "%4$s: %5$s [%1$tc]%n"); 
         
         
       
        p.load(new FileInputStream("p:\\settings.properties"));
         pa.load(new FileInputStream("c:\\settings.properties"));
       
        //InputStream s = MainClass.class.getResourceAsStream("/config.properties");

        
        // "jdbc:sqlserver://192.168.1.134;databaseName=amn;integratedSecurity=true"
        //192.168.1.134
      

         
        url ="jdbc:sqlserver://"+p.getProperty("comName")+"databaseName="+p.getProperty("dbName")+"user="+pa.getProperty("user")+"password="+pa.getProperty("password");

         try{
             
            con = DriverManager.getConnection(url);
            
            }catch(SQLException e) {
             e.printStackTrace();
                JOptionPane.showMessageDialog(null, e);
                System.exit(0);
            }
          /*
            try{
             
             frame.setEnabled(correct);
              loginCheck dialog = new loginCheck();
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
              
               
         }catch(Error e){
             System.out.println(e);
         }*/
            Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
            int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
            int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
            frame.setLocation(x, y);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setContentPane(new JLabel(new ImageIcon(getImage("icons/logo.png"))));
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            JButton btn = new JButton("Termékek");
            JButton btn3 = new JButton("Anyagok");
            JButton btn1 = new JButton("Új Anyag");
            JButton btn2 = new JButton("Új Termek");
            JButton btn4 = new JButton("Új Kapcsolat");
            JButton btn6 = new JButton("Kapcsolatok");
            JButton btn7 = new JButton("Új Visszáruzás");
            JButton btn8 = new JButton("Visszáru");
            JButton btn5 = new JButton(new ImageIcon(getImage("icons/megse3.png")));
            frame.add(btn);
            frame.add(btn3);
            frame.add(btn1);
            frame.add(btn2);
            frame.add(btn4);
            frame.add(btn5);
            frame.add(btn6);
            frame.add(btn7);
            frame.add(btn8);

            frame.setSize(800, 300);
            frame.setVisible(true);

            btn.setVisible(true);
            btn.setSize(120, 30);
            btn.setLocation(100, 100);
            btn3.setVisible(true);
            btn3.setSize(120, 30);
            btn3.setLocation(100, 150);
            btn4.setVisible(true);
            btn4.setSize(120, 30);
            btn4.setLocation(600, 50);
            
            btn7.setVisible(true);
            btn7.setSize(120, 30);
            btn7.setLocation(600, 200);
            
            btn8.setVisible(true);
            btn8.setSize(120, 30);
            btn8.setLocation(100, 200);

            btn1.setVisible(true);
            btn1.setSize(120, 30);
            btn1.setLocation(600, 100);
            btn6.setVisible(true);
            btn6.setSize(120, 30);
            btn6.setLocation(100, 50);
            btn2.setVisible(true);
            btn2.setSize(120, 30);
            btn2.setLocation(600, 150);
            
            btn5.setLocation(350, 200);
            btn5.setSize(60,60);
            btn5.setVisible(true);
            btn5.addActionListener(new ActionListener(){
                

             @Override
             public void actionPerformed(ActionEvent e) {
                 try {
                     con.close();
                 } catch (SQLException ex) {
                     System.out.println(ex);
                 }
                System.exit(0);
             }
            });
            btn.addActionListener(new ActionListener() {
                
                @Override
                public void actionPerformed(ActionEvent e) {
                java.awt.EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                Termek dialog = new Termek();
                dialog.setVisible(false);
                 
                            
                    try {  

                  // This block configure the logger with handler and formatter  
                  fh = new FileHandler("C:/Users/Crionic/Desktop/log.txt", true);  
                  logger.addHandler(fh);
                  SimpleFormatter formatter = new SimpleFormatter();
                  fh.setFormatter(formatter);  
                  // the following statement is used to log any messages  
                  logger.info(pa.getProperty("user")+" belépett a Termékbe.");  
                  for(Handler h:logger.getHandlers())
                        {
                            h.close();   //must call h.close or a .LCK file will remain.
                        }
              } catch (SecurityException | IOException y) {  
                  y.printStackTrace();  
              }
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        
                        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                          try {  

                  // This block configure the logger with handler and formatter  
                  fh = new FileHandler("C:/Users/Crionic/Desktop/log.txt", true);  
                  logger.addHandler(fh);
                  SimpleFormatter formatter = new SimpleFormatter();
                  fh.setFormatter(formatter);  
                  // the following statement is used to log any messages  
                  logger.info(pa.getProperty("user")+" kilépett a Termékből.");  
                  for(Handler h:logger.getHandlers())
                        {
                            h.close();   //must call h.close or a .LCK file will remain.
                        }
              } catch (SecurityException | IOException y) {  
                  y.printStackTrace();  
              } 
                    }
                });
                dialog.setVisible(true);
                }
                });   
                }    
            });
            
            btn3.addActionListener(new ActionListener() {
                    @Override
                public void actionPerformed(ActionEvent e) {
                java.awt.EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                Anyag dialog = new Anyag();
                 
                            
                                 try {  

                                // This block configure the logger with handler and formatter  
                                fh = new FileHandler("C:/Users/Crionic/Desktop/log.txt", true);  
                                logger.addHandler(fh);
                                SimpleFormatter formatter = new SimpleFormatter();  
                                fh.setFormatter(formatter);  
                                
                                // the following statement is used to log any messages  
                                logger.info(pa.getProperty("user")+" belépett a Anyagokba.");  
                                for(Handler h:logger.getHandlers())
                                    {
                                        h.close();   //must call h.close or a .LCK file will remain.
                                    }
                            } catch (SecurityException | IOException y) {  
                                y.printStackTrace();  
                            }
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                         try {  

                                // This block configure the logger with handler and formatter  
                                fh = new FileHandler("C:/Users/Crionic/Desktop/log.txt", true);  
                                logger.addHandler(fh);
                                SimpleFormatter formatter = new SimpleFormatter();  
                                fh.setFormatter(formatter);  
                                
                                // the following statement is used to log any messages  
                                logger.info(pa.getProperty("user")+" kilépett a Anyagokból.");  
                                for(Handler h:logger.getHandlers())
                                    {
                                        h.close();   //must call h.close or a .LCK file will remain.
                                    }
                            } catch (SecurityException | IOException y) {  
                                y.printStackTrace();  
                            }
                    }
                });
                dialog.setVisible(true);
                }
                });   
                }    
            });
               
            btn1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                java.awt.EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                NewJDialog dialog = new NewJDialog();
                          try {  
                            // This block configure the logger with handler and formatter  
                        fh = new FileHandler("C:/Users/Crionic/Desktop/log.txt", true);  
                        logger.addHandler(fh);
                        SimpleFormatter formatter = new SimpleFormatter();  
                        fh.setFormatter(formatter);  
                       
                        // the following statement is used to log any messages  
                        logger.info(pa.getProperty("user")+" belépett a új anyagokba.");  
                        for(Handler h:logger.getHandlers())
                                    {
                                        h.close();   //must call h.close or a .LCK file will remain.
                                    }
                    } catch (SecurityException | IOException y) {  
                        y.printStackTrace();  
                    }
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                         dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                          try {  

                        // This block configure the logger with handler and formatter  
                        fh = new FileHandler("C:/Users/Crionic/Desktop/log.txt", true);  
                        logger.addHandler(fh);
                        SimpleFormatter formatter = new SimpleFormatter();  
                        fh.setFormatter(formatter);  
                       
                        // the following statement is used to log any messages  
                        logger.info(pa.getProperty("user")+" kilépett a új anyagokból.");  
                        for(Handler h:logger.getHandlers())
                                    {
                                        h.close();   //must call h.close or a .LCK file will remain.
                                    }
                    } catch (SecurityException | IOException y) {  
                        y.printStackTrace();  
                    }
                    }
                    });
                    dialog.setVisible(true);
                    }
                });
                }
            });
            btn2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {   
                java.awt.EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                ujTermek dialog = new ujTermek();
                                  try {  

                                // This block configure the logger with handler and formatter  
                                fh = new FileHandler("C:/Users/Crionic/Desktop/log.txt", true);  
                                logger.addHandler(fh);
                                SimpleFormatter formatter = new SimpleFormatter();  
                                fh.setFormatter(formatter);  
                                for(Handler h:logger.getHandlers())
                      
                                // the following statement is used to log any messages  
                                logger.info(pa.getProperty("user")+" belépett a új termékbe.");  
                                    for(Handler h:logger.getHandlers())
                                    {
                                        h.close();   //must call h.close or a .LCK file will remain.
                                    }
                            } catch (SecurityException | IOException y) {  
                                y.printStackTrace();  
                            }
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                           try {  

                                // This block configure the logger with handler and formatter  
                                fh = new FileHandler("C:/Users/Crionic/Desktop/log.txt", true);  
                                logger.addHandler(fh);
                                SimpleFormatter formatter = new SimpleFormatter();  
                                fh.setFormatter(formatter);  
                                for(Handler h:logger.getHandlers())
                      
                                // the following statement is used to log any messages  
                                logger.fine(pa.getProperty("user")+" kilépett a új termékből.");  
                                    for(Handler h:logger.getHandlers())
                                    {
                                        h.close();   //must call h.close or a .LCK file will remain.
                                    }
                            } catch (SecurityException | IOException y) {  
                                y.printStackTrace();  
                            }
                    }
                    });
                    dialog.setVisible(true);
                    }
                });
               }
            });
            btn4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {   
                java.awt.EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                kapcsolatok dialog = new kapcsolatok();
               
                                          try {  

                                // This block configure the logger with handler and formatter  
                                fh = new FileHandler("C:/Users/Crionic/Desktop/log.txt", true);  
                                logger.addHandler(fh);
                                SimpleFormatter formatter = new SimpleFormatter();  
                                fh.setFormatter(formatter);  
                        
                                // the following statement is used to log any messages  
                                logger.info(pa.getProperty("user")+" belépett a kapcsolatokba.");  
                                for(Handler h:logger.getHandlers())
                                    {
                                        h.close();   //must call h.close or a .LCK file will remain.
                                    }
                            } catch (SecurityException | IOException y) {  
                                y.printStackTrace();  
                            }
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                                    try {  

                                // This block configure the logger with handler and formatter  
                                fh = new FileHandler("C:/Users/Crionic/Desktop/log.txt", true);  
                                logger.addHandler(fh);
                                SimpleFormatter formatter = new SimpleFormatter();  
                                fh.setFormatter(formatter);  
                        
                                // the following statement is used to log any messages  
                                logger.info(pa.getProperty("user")+" kilépett a kapcsolatokból.");  
                                for(Handler h:logger.getHandlers())
                                    {
                                        h.close();   //must call h.close or a .LCK file will remain.
                                    }
                            } catch (SecurityException | IOException y) {  
                                y.printStackTrace();  
                            }
                    }
                    });
                    dialog.setVisible(true);
                    }
                });
               }
            });
            btn6.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {   
                java.awt.EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                kapcsTabla dialog;
                    try {
                        dialog = new kapcsTabla();
                         
                         
                                  try {  

                                // This block configure the logger with handler and formatter  
                                fh = new FileHandler("C:/Users/Crionic/Desktop/log.txt", true);  
                                logger.addHandler(fh);
                                SimpleFormatter formatter = new SimpleFormatter();  
                                fh.setFormatter(formatter);  
                       
                                // the following statement is used to log any messages  
                                logger.info(pa.getProperty("user")+" belépett a kapcsolatokba.");  
                                    for(Handler h:logger.getHandlers())
                                    {
                                        h.close();   //must call h.close or a .LCK file will remain.
                                    }
                            } catch (SecurityException | IOException y) {  
                                y.printStackTrace();  
                            }
                        dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                             try {  

                                // This block configure the logger with handler and formatter  
                                fh = new FileHandler("C:/Users/Crionic/Desktop/log.txt", true);  
                                logger.addHandler(fh);
                                SimpleFormatter formatter = new SimpleFormatter();  
                                fh.setFormatter(formatter);  
                                for(Handler h:logger.getHandlers())
                     
                                // the following statement is used to log any messages  
                                logger.info(pa.getProperty("user")+" kilépett a kapcsolatokból.");  
                                for(Handler h:logger.getHandlers())
                                    {
                                        h.close();   //must call h.close or a .LCK file will remain.
                                    }
                            } catch (SecurityException | IOException y) {  
                                y.printStackTrace();  
                            }
                    }
                    });
                    dialog.setVisible(true);
                    } catch (SQLException ex) {
                        Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
                    }
                
                    }
                });
               }
            });
            btn7.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {   
                java.awt.EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                ujNyilvan dialog;
                dialog = new ujNyilvan();
                
                        
                                  try {  

                                // This block configure the logger with handler and formatter  
                                fh = new FileHandler("C:/Users/Crionic/Desktop/log.txt", true);  
                                logger.addHandler(fh);
                                SimpleFormatter formatter = new SimpleFormatter();  
                                fh.setFormatter(formatter);  
                                for(Handler h:logger.getHandlers())
                     
                                // the following statement is used to log any messages  
                                logger.info(pa.getProperty("user")+" belépett a új nyilvántartásba.");  
                                for(Handler h:logger.getHandlers())
                                    {
                                        h.close();   //must call h.close or a .LCK file will remain.
                                    }
                            } catch (SecurityException | IOException y) {  
                                y.printStackTrace();  
                            }
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                             try {  

                                // This block configure the logger with handler and formatter  
                                fh = new FileHandler("C:/Users/Crionic/Desktop/log.txt", true);  
                                logger.addHandler(fh);
                                SimpleFormatter formatter = new SimpleFormatter();  
                                fh.setFormatter(formatter);  
                                for(Handler h:logger.getHandlers())
                     
                                // the following statement is used to log any messages  
                                logger.info(pa.getProperty("user")+" kilépett a új nyilvántartásból.");  
                                for(Handler h:logger.getHandlers())
                                    {
                                        h.close();   //must call h.close or a .LCK file will remain.
                                    }
                            } catch (SecurityException | IOException y) {  
                                y.printStackTrace();  
                            }
                    }
                });
                dialog.setVisible(true);
                
                    }
                });
               }
            });
            btn8.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {   
                java.awt.EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                nyilvan dialog;
                    try {
                        dialog = new nyilvan();
                                // This block configure the logger with handler and formatter  
                                fh = new FileHandler("C:/Users/Crionic/Desktop/log.txt", true);  
                                logger.addHandler(fh);
                                SimpleFormatter formatter = new SimpleFormatter();  
                                fh.setFormatter(formatter);  
                                 
                                // the following statement is used to log any messages  
                                logger.info(pa.getProperty("user")+" belépett a nyilvántartásba.");  
                                for(Handler h:logger.getHandlers())
                                    {
                                        h.close();   //must call h.close or a .LCK file will remain.
                                    }
                        dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                        try {  
                            fh = new FileHandler("C:/Users/Crionic/Desktop/log.txt", true);
                        } catch (IOException ex) {
                            Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (SecurityException ex) {
                            Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
                        }
                                logger.addHandler(fh);
                                SimpleFormatter formatter = new SimpleFormatter();  
                                fh.setFormatter(formatter);  
                                 
                                // the following statement is used to log any messages  
                                logger.info(pa.getProperty("user")+" kilépett a nyilvántartásból.");  
                                for(Handler h:logger.getHandlers())
                                    {
                                        h.close();   //must call h.close or a .LCK file will remain.
                                    }
                    }
                    });
                    dialog.setVisible(true);
                    } catch (SQLException ex) {
                       Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SecurityException ex) {
                        Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
                    }/* catch (IOException | SecurityException ex) {
                        logger.warning((Supplier<String>) ex);
                    }*/
                
                    }
                });
               }
            });
      
    }

    
     
 }




 
 
