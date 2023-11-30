package com.raven.form;

public class Chat extends javax.swing.JPanel {


    public Chat() {
        initComponents();
    }


    @SuppressWarnings("unchecked")

    private void initComponents() {

        chatTitle = new com.raven.component.Chat_Title();
        chatBottom = new com.raven.component.Chat_Bottom();
        chatBody = new com.raven.component.Chat_Body();

        setBackground(new java.awt.Color(249, 249, 249));

        javax.swing.GroupLayout chatTitleLayout = new javax.swing.GroupLayout(chatTitle);
        chatTitle.setLayout(chatTitleLayout);
        chatTitleLayout.setHorizontalGroup(
                chatTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        chatTitleLayout.setVerticalGroup(
                chatTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout chatBottomLayout = new javax.swing.GroupLayout(chatBottom);
        chatBottom.setLayout(chatBottomLayout);
        chatBottomLayout.setHorizontalGroup(
                chatBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        chatBottomLayout.setVerticalGroup(
                chatBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(chatTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chatBottom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chatBody, javax.swing.GroupLayout.DEFAULT_SIZE, 727, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(chatTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(chatBody, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
                                .addGap(0, 0, 0)
                                .addComponent(chatBottom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }



    private com.raven.component.Chat_Body chatBody;
    private com.raven.component.Chat_Bottom chatBottom;
    private com.raven.component.Chat_Title chatTitle;

}
