
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author hp
 */
public class mainpage extends javax.swing.JFrame {
CardLayout c;
  panel1 pl;
  JPanel panel,panelh;
  static String q12,q13;
 static String usr;
 static String user11;
 mainpagepanel p1;
 mainpageheader p2;
Graphics g;
  boolean users,flag;
   
  

    /**
     * Creates new form mainpage
     */
    public mainpage() {
      initComponents();
      setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        p1=new mainpagepanel();
        jPanel1.add(p1);
        repaint();
        p2=new mainpageheader();
        jPanel2.add(p2);
         repaint();
     
      //mainpage m=new mainpage();
     // pl=new panel1();
      //p2=new panel1();
      // setIconImage(new ImageIcon(getClass().getResource("skateboarding.jpg")).getImage());
   
      setSize(1366, 750);
      setVisible(true);
    
    //  panel=new JPanel();
//      c=new CardLayout();
//      pl=new panel1();
//      add(panel);
//    // panel=new JPanel();
//    panel.setLayout(c);
//   panel.add(jPanel1,"1");
//   
//   panel.add(pl,"2");
//   
      //JPanel blank=new JPanel();
      //add(p);
      
       
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("USERNAME");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 130, 150, 40);

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PASSWORD");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 200, 150, 40);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(210, 140, 160, 30);
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(210, 200, 160, 30);

        jButton1.setText("Sign in");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(50, 270, 100, 23);

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("or new to GAMEBOX?");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(160, 270, 120, 20);

        jButton2.setText("Retrieve password");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(50, 360, 150, 23);

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("Forgot Password?");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 320, 180, 30);

        jButton3.setText("Sign up");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(297, 270, 100, 23);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setPreferredSize(new java.awt.Dimension(1366, 100));
        jPanel2.setLayout(new java.awt.BorderLayout());
        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1366, 760);
        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      nextframe n=new nextframe();
   n.setVisible(true);
   n.setSize(1366,768);
   this.dispose();
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       try {
            String u1;String p1;
             u1=jTextField1.getText();
             p1=jPasswordField1.getText();
            dbconnect db=new dbconnect();
            String q1="Select * from login_details";
            
            ResultSet rs1=db.getSelect(q1);
  
            
                 while(rs1.next())
                 {
                     String user=rs1.getString("username");
                     String pass=rs1.getString("password");
                    if((user.equals(u1))&&(pass.equals(p1)))
                    {
                        users=true;
                        break;
                        
                        
                    }
                    
                 }
                 if(users==true)
                 {
                     user11=u1;
                        JOptionPane.showMessageDialog(rootPane,"u have successfully logged in","LOGIN SUCCESSFUL",JOptionPane.INFORMATION_MESSAGE);
                        homescreen hs=new homescreen();
                        hs.setSize(1366,768);
                        hs.setVisible(true);
                        this.dispose();
                 }
                 else if(users==false)
                 {
                  JOptionPane.showMessageDialog(rootPane,"login details are inaccurate","LOGIN FAILED",JOptionPane.ERROR_MESSAGE);   
                 }
                 users=false;
                 
        } catch (SQLException ex) {
            Logger.getLogger(mainpage.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      try {
            dbconnect db=new dbconnect();
            usr=jTextField1.getText();
                    
          String q11="Select * from reg_details where username='"+usr+"'";
           ResultSet rs12=db.getSelect(q11);
           rs12.next();
           q12=rs12.getString("securityq");
           q13=rs12.getString("password");
         
           
           
            retpass ret=new retpass();
            ret.setSize(1200,500);
            ret.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(mainpage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new mainpage().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
