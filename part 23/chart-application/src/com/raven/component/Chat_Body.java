package com.raven.component;

import com.raven.swing.ScrollBar;
import java.awt.Color;
import net.miginfocom.swing.MigLayout;

public class Chat_Body extends javax.swing.JPanel {

    public Chat_Body() {
        initComponents();
        init();
        addItemRight("Test wyświetlania wiadomości.");
        addItemRight("test\nCześć");
        addItemLeft("Test wyświetlania wiadomości. Test wyświetlania wiadomości. Test wyświetlania wiadomości. Test wyświetlania wiadomości. Test wyświetlania wiadomości.");
        addItemLeft("test\ntestest\ntestest");
        addItemRight("test\ntestest\ntestest");
        addItemLeft("test\ntestest\ntestest");
        addItemRight("test\ntestest\ntestest");

    }

    private void init() {
        body.setLayout(new MigLayout("fillx", "", "5[]5"));
        sp.setVerticalScrollBar(new ScrollBar());
        sp.getVerticalScrollBar().setBackground(Color.WHITE);
    }

    public void addItemLeft(String text) {
        Chat_Left item = new Chat_Left();
        item.setText(text);
        body.add(item, "wrap, w ::80%");

        body.repaint();
        body.revalidate();
    }

    public void addItemRight(String text) {
        Chat_Right item = new Chat_Right();
        item.setText(text);
        body.add(item, "wrap, al right, w ::80%");

        body.repaint();
        body.revalidate();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        sp = new javax.swing.JScrollPane();
        body = new javax.swing.JPanel();

        sp.setBorder(null);
        sp.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        body.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
                bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 826, Short.MAX_VALUE)
        );
        bodyLayout.setVerticalGroup(
                bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 555, Short.MAX_VALUE)
        );

        sp.setViewportView(body);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(sp)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(sp)
        );
    }



    private javax.swing.JPanel body;
    private javax.swing.JScrollPane sp;

}