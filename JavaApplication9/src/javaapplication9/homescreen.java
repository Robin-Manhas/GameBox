/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.media.Manager;
import javax.media.NoPlayerException;
import javax.media.Player;
import javax.swing.JFileChooser;
import javax.swing.Timer;
//import javax.media.*;

/**
 *
 * @author hp
 */
public class homescreen extends javax.swing.JFrame {
Calendar c;
homescreenpanel hsp;
boolean playing=false;
Player pl,pl1,pl2;
File f,f1;
static String cr;
static int creditvalue;

    /**
     * Creates new form homescreen
     */
    public homescreen() {
        try {
            
            initComponents();
           // f1=new File("C:\\media\\music\\ENGLISH\\11_-_lonely_day.2.mp3");
            f1=new File("C:\\media\\music\\default.mp3");
             pl2=Manager.createPlayer(f1.toURL());
             playing=false;
                       pl2.start();
            setSize(1366,768);
            hsp=new homescreenpanel();
            jPanel1.add(hsp);
            repaint();
            getContentPane().setBackground(Color.BLACK);
            c=Calendar.getInstance();
//            jLabel1.setText((String.valueOf(c.getTime())));
            timecall();

            String u=mainpage.user11;
            String v;
            int time=c.get(Calendar.HOUR_OF_DAY);
            if(time>=0&&time<12)
            {
                v="Good  Morning";
            }
            else if(time>=12&&time<16)
            {
                v="Good  Afternoon";
                
            }
            else
            {
              
                v="Good  Evening";
            }
            if((time>=23&&time<24)||(time>=0&&time<4))
            {
                jLabel5.setText("It's quite late in the night,u may think about sleeping");
            }
            if(time>=4&&time<=8)
            {
                jLabel5.setText("so u woke up early today..");
            }
            jLabel2.setText(v);
            jLabel3.setText(u);
            jLabel6.setText("Click on icon to play game, stats button for player's stats in game");
            dbconnect db=new dbconnect();
            String q="Select credits from credit_info where name='"+u+"'";
              ResultSet rs12=db.getSelect(q);
               rs12.next();
               cr=rs12.getString("credits");
               jLabel4.setText("CREDITS REMAINING= "+cr);
               creditvalue=Integer.parseInt(cr);
        } catch (IOException ex) {
            Logger.getLogger(homescreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoPlayerException ex) {
            Logger.getLogger(homescreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(homescreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void timecall()
    {
          final DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");  
        ActionListener timerListener = new ActionListener()  
        {  
            @Override
            public void actionPerformed(ActionEvent e)  
            {  
                Date date = new Date();  
                String time = timeFormat.format(date);  
               jLabel1.setText(time);  
            }  
        };  
        Timer timer = new Timer(1000, timerListener);  
        // to make sure it doesn't wait one second at the start  
        timer.setInitialDelay(0);  
        timer.start();
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
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton6 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(840, 0, 190, 30);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(600, 0, 120, 30);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(700, 0, 110, 30);

        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(840, 50, 210, 20);

        jButton1.setText("Gamebox TRAX");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(863, 110, 160, 23);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication9/ticimage.jpg"))); // NOI18N
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(170, 140, 120, 100);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication9/sudokuicon.jpg"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(180, 400, 120, 110);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication9/salbuttonpic.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(430, 140, 120, 100);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication9/dartp.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(440, 400, 120, 110);

        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 0, 550, 30);

        jButton10.setText("Logout");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(869, 470, 120, 23);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(90, 70, 630, 30);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("tic tac toe");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(170, 250, 120, 30);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("sudoku");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(180, 520, 120, 20);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("snakes & ladders");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(430, 250, 150, 30);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Darts");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(440, 510, 110, 30);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(170, 320, 400, 40);

        jButton6.setText("LEADERBOARDS");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(870, 190, 160, 30);

        jPanel1.setLayout(new java.awt.BorderLayout());
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1366, 768);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//      if(playing==false)
//      {
//            try {
//                JFileChooser fs=new JFileChooser();
//                fs.showOpenDialog(this);
//                f=fs.getSelectedFile();
//                pl=Manager.createPlayer(f.toURL());
//                pl.start();
//                playing=true;
//            } catch (IOException ex) {
//                Logger.getLogger(homescreen.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (NoPlayerException ex) {
//                Logger.getLogger(homescreen.class.getName()).log(Level.SEVERE, null, ex);
//            }
//       
//       
//      }
//      else
      {
            try {
                      if(playing==false)
                      {
                JFileChooser fs=new JFileChooser();
                       fs.showOpenDialog(this);
                       f=fs.getSelectedFile();
                       
                       pl1=Manager.createPlayer(f.toURL());
                       pl1.start();
                         //pl.stop();
                         
              //  pl.close();
                        pl2.stop();
                         pl2.close();
                         playing=true;
                      }
                      else
                      {
                           JFileChooser fs=new JFileChooser();
                       fs.showOpenDialog(this);
                       f1=fs.getSelectedFile();
                       
                       pl2=Manager.createPlayer(f1.toURL());
                       pl2.start();
                         //pl.stop();
                         
              //  pl.close();
                        pl1.stop();
                         pl1.close();
                         playing=false;
                          
                      }
               
                     // fs.addChoosableFileFilter();
            } catch (IOException ex) {
                Logger.getLogger(homescreen.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NoPlayerException ex) {
                Logger.getLogger(homescreen.class.getName()).log(Level.SEVERE, null, ex);
            }
         
      }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       tictactoe_homepage h=new tictactoe_homepage(); 
       h.setSize(1366,768);
       h.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        NewJFrame1 nwf=new NewJFrame1();
         //nwf.setSize(1366,768);
       nwf.setVisible(true);
       nwf.start();
      
     
      // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     Sudoku s=new Sudoku();
     s.setVisible(true);
     
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       sal_home s=new sal_home();
       s.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        if(playing==false)
        {
            pl2.close();
        }
        else
        {
            pl1.close();
        }
        logout log=new logout();
        log.setSize(1366,768);
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       leaderboard ld=new leaderboard();
       ld.setSize(1366,768);
       ld.setVisible(true);
 
    }//GEN-LAST:event_jButton6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(homescreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homescreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homescreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homescreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new homescreen().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
