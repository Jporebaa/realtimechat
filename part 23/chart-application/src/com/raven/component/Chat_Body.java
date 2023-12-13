package com.raven.component;

import com.raven.swing.ScrollBar;
import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import net.miginfocom.swing.MigLayout;

public class Chat_Body extends javax.swing.JPanel {

    public Chat_Body() {
        initComponents();
        init();
        addItemRight("Test wyświetlania wiadomości.");
        addItemRight("test\nCześć");
        addItemLeft("Test wyświetlania wiadomości. Test wyświetlania wiadomości. Test wyświetlania wiadomości. Test wyświetlania wiadomości. Test wyświetlania wiadomości.","Test", new ImageIcon(getClass().getResource("/com/raven/icon/test/dog.jpg")));
        addDate("01/12/2023");
        String img[] = {"LRMj,K-:?G9G_JIon}WqD~ITRPs,", "LCGlO@00.R~o.9DOO[%L02?aJ7D*"};
        addItemLeft("hello\nerererew\newewe", "Dara", img);
        addItemLeft("test\ntestest\ntestest","Ania");
        addItemRight("test\ntestest\ntestest",new ImageIcon(getClass().getResource("/com/raven/icon/test/dog.jpg")));
        addItemLeft("","Kazimierz",new ImageIcon(getClass().getResource("/com/raven/icon/test/dog.jpg")));
        addDate("Dzisiaj");
        addItemRight("test\ntestest\ntestest");
        addItemFile("Przeslam dokument", "Bartek","dokument.pdf","1 MB");
        addItemFileRight("","plik.rar", "20 MB");

    }

    private void init() {
        body.setLayout(new MigLayout("fillx", "", "5[]5"));
        sp.setVerticalScrollBar(new ScrollBar());
        sp.getVerticalScrollBar().setBackground(Color.WHITE);
    }

    public void addItemLeft(String text, String user, Icon ...image) {
        Chat_Left_With_Profile item = new Chat_Left_With_Profile();
        item.setText(text);
        item.setImage(image);
        item.setTime();
        item.setUserProfile(user);
        body.add(item, "wrap, w 100::80%");
        body.repaint();
        body.revalidate();
    }

    public void addItemLeft(String text, String user, String[] image) {
        Chat_Left_With_Profile item = new Chat_Left_With_Profile();
        item.setText(text);
        item.setImage(image);
        item.setTime();
        item.setUserProfile(user);
        body.add(item, "wrap, w 100::80%");
        body.repaint();
        body.revalidate();
    }

    public void addItemFile(String text, String user, String fileName, String fileSize) {
        Chat_Left_With_Profile item = new Chat_Left_With_Profile();
        item.setText(text);
        item.setFile(fileName, fileSize);
        item.setTime();
        item.setUserProfile(user);
        body.add(item, "wrap, w 100::80%");
        body.repaint();
        body.revalidate();
    }

    public void addItemRight(String text, Icon... image) {
        Chat_Right item = new Chat_Right();
        item.setText(text);
        item.setImage(image);
        body.add(item, "wrap, al right, w 100::80%");
        body.repaint();
        body.revalidate();
    }

    public void addItemFileRight(String text, String fileName, String fileSize) {
        Chat_Right item = new Chat_Right();
        item.setText(text);
        item.setFile(fileName, fileSize);
        body.add(item, "wrap, al right, w 100::80%");
        body.repaint();
        body.revalidate();
    }

    public void addDate(String date){
        Chat_Date item=new Chat_Date();
        item.setDate(date);
        body.add(item,"wrap, al center");
        body.repaint();
        body.revalidate();
    }

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
