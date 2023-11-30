package com.raven.component;

import java.awt.Color;
public class Chat_Title extends javax.swing.JPanel {


    public Chat_Title() {
        initComponents();
    }

    public void setUserName(String userName) {
        lbName.setText(userName);
    }
    public void statusActive(){
        lbStatus.setText("Active now");
        lbStatus.setForeground(new java.awt.Color(40,147,59));
    }
    public void setStatusText(String text){
        lbStatus.setText(text);
        lbStatus.setForeground(new Color(160,160,160));
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        setBackground(new java.awt.Color(242, 242, 242));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 40, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    private javax.swing.JLayeredPane layer;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbStatus;
}
