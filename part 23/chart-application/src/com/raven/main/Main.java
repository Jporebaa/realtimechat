
package com.raven.main;

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
        com.setMinimumSize(new Dimension(800, 500));
        com.setMaximumSize(Toolkit.getDefaultToolkit().getScreenSize());
        com.setSnapSize(new Dimension(10, 10));
    }

}
