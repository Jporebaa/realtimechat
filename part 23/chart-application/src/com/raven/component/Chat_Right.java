package com.raven.component;

import javax.swing.*;
import java.awt.Color;

public class Chat_Right extends javax.swing.JLayeredPane {

    public Chat_Right() {
        initComponents();
        txt.setBackground(new Color(179, 233, 255));
    }

    public void setText(String text) {
        if (text.equals("")) {
            txt.hideText();
        } else {
            txt.setText(text);
        }
        txt.seen();
    }

    public void setImage(Icon... image) {
        txt.setImage(true, image);
    }

    public void setTime() {
        txt.setTime("10:30 PM");    //  Testing
    }


    @SuppressWarnings("unchecked")

    private void initComponents() {

        txt = new com.raven.component.Chat_Item();

        setLayer(txt, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }



    private com.raven.component.Chat_Item txt;

}
