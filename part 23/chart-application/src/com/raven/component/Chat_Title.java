package com.raven.component;

import com.raven.model.Model_User_Account;

import java.awt.Color;

public class Chat_Title extends javax.swing.JPanel {

    private Model_User_Account getUser(){
        return user;
    }
    private Model_User_Account user;

    public Chat_Title() {
        initComponents();
    }
    public void setUserName(Model_User_Account user){
        this.user = user;
        lbName.setText(user.getUserName());
        if (user.isStatus()){
            statusActive();
        }else {
            setStatusText("Offline");
        }
    }

    public void updateUser(Model_User_Account user){
        if(this.user == user){
            lbName.setText(user.getUserName());
            if (user.isStatus()){
                statusActive();
            }else {
                setStatusText("Offline");
            }
        }
    }
    private void statusActive() {
        lbStatus.setText("Aktywny teraz");
        lbStatus.setForeground(new java.awt.Color(40, 147, 59));
    }

    private void setStatusText(String text) {
        lbStatus.setText(text);
        lbStatus.setForeground(new Color(160, 160, 160));
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        layer = new javax.swing.JLayeredPane();
        lbName = new javax.swing.JLabel();
        lbStatus = new javax.swing.JLabel();

        setBackground(new java.awt.Color(229, 229, 229));

        layer.setLayout(new java.awt.GridLayout(0, 1));

        lbName.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lbName.setForeground(new java.awt.Color(66, 66, 66));
        lbName.setText("Imie");
        layer.add(lbName);

        lbStatus.setForeground(new java.awt.Color(40, 147, 59));
        lbStatus.setText("Aktywny teraz");
        layer.add(lbStatus);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(layer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(406, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(layer, javax.swing.GroupLayout.PREFERRED_SIZE, 34, Short.MAX_VALUE)
                                .addGap(3, 3, 3))
        );
    }


    private javax.swing.JLayeredPane layer;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbStatus;
}
