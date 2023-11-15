package com.raven.main;

import com.formdev.flatlaf.intellijthemes.FlatArcIJTheme;

import com.raven.service.Service;
import com.raven.swing.ComponentResizer;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main extends javax.swing.JFrame {

    public Main() {

        init();
    }

    private void init() {
        setIconImage(new ImageIcon(getClass().getResource("/com/raven/icon/icon.png")).getImage());
        ComponentResizer com = new ComponentResizer();
        com.registerComponent(this);
        com.setMinimumSize(new Dimension(900, 500));
        com.setMaximumSize(Toolkit.getDefaultToolkit().getScreenSize());
        com.setSnapSize(new Dimension(10, 10));

        Service.getInstance().startServer();
    }





    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents


    private int pX;
    private int pY;
    private void titleMouseDragged(java.awt.event.MouseEvent evt) {
        this.setLocation(this.getLocation().x + evt.getX() - pX, this.getLocation().y + evt.getY() - pY);
    }//GEN-LAST:event_titleMouseDragged

    private void titleMousePressed(java.awt.event.MouseEvent evt) {
        pX = evt.getX();
        pY = evt.getY();
    }

    private void cmdCloseActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void cmdMinimizeActionPerformed(java.awt.event.ActionEvent evt) {
        this.setState(JFrame.ICONIFIED);
    }

    public static void main(String args[]) {
        FlatArcIJTheme.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    //


}
