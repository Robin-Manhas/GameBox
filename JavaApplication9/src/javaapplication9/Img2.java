/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author disco dancer
 */
public class Img2 extends javax.swing.JPanel {

    /**
     * Creates new form Img2
     */
    public Img2() {
        initComponents();
    }
    public void paintComponent(Graphics g){
        Image img=new ImageIcon(getClass().getResource("bacground.jpg")).getImage();
        g.drawImage(img, 0, 0, this);
        super.paint(g);
            g.setColor(Color.black);
            // g.drawLine(x5, 39, x6, 39); g.drawLine(x7, 38, x8, 38);             g.drawLine(x9, 37, x10, 37); 

            g.drawLine(Ball.x1, Ball.y1, Ball.x2, Ball.y2);
            g.drawLine(683,Ball.y3, 683, Ball.y4);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
