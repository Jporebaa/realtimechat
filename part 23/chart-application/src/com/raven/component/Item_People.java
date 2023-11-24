package com.raven.component;

import com.raven.event.PublicEvent;
import com.raven.model.Model_User_Account;
import com.raven.swing.ActiveStatus;
import com.raven.swing.ImageAvatar;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Item_People extends JPanel {
    private boolean mouseOver;
    private final Model_User_Account user;
    private ActiveStatus activeStatus;
    private ImageAvatar imageAvatar1;
    private JLabel lb;
    private JLabel lbStatus;

    public Model_User_Account getUser() {
        return this.user;
    }

    public Item_People(Model_User_Account user) {
        this.user = user;
        this.initComponents();
        this.lb.setText(user.getUserName());
        this.activeStatus.setActive(user.isStatus());
        this.init();
    }

    public void updateStatus() {
        this.activeStatus.setActive(this.user.isStatus());
    }

    private void init() {
        this.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent me) {
                Item_People.this.setBackground(new Color(230, 230, 230));
                Item_People.this.mouseOver = true;
            }

            public void mouseExited(MouseEvent me) {
                Item_People.this.setBackground(new Color(242, 242, 242));
                Item_People.this.mouseOver = false;
            }

            public void mouseReleased(MouseEvent me) {
                if (Item_People.this.mouseOver) {
                   PublicEvent.getInstance().getEventMain().selectUser(Item_People.this.user);
                }

            }
        });
    }

    private void initComponents() {
        this.imageAvatar1 = new ImageAvatar();
        this.lb = new JLabel();
        this.lbStatus = new JLabel();
        this.activeStatus = new ActiveStatus();
        this.setBackground(new Color(242, 242, 242));
        this.imageAvatar1.setBorderSize(0);
        this.imageAvatar1.setImage(new ImageIcon(this.getClass().getResource("/com/raven/icon/user.png")));
        this.lb.setFont(new Font("sansserif", 0, 14));
        this.lb.setText("Name");
        this.lbStatus.setFont(new Font("sansserif", 2, 12));
        this.lbStatus.setForeground(new Color(117, 117, 117));
        this.lbStatus.setText("New User");
        this.activeStatus.setActive(true);
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.imageAvatar1, -2, 44, -2).addPreferredGap(ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.lb, -1, 144, 32767).addGroup(layout.createSequentialGroup().addComponent(this.lbStatus).addGap(3, 3, 3).addComponent(this.activeStatus, -2, -1, -2).addGap(0, 0, 32767))).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, layout.createSequentialGroup().addGap(3, 3, 3).addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.lb).addGap(6, 6, 6).addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.activeStatus, Alignment.TRAILING, -1, -1, 32767).addComponent(this.lbStatus, Alignment.TRAILING, -1, -1, 32767))).addComponent(this.imageAvatar1, -2, 44, -2)).addGap(3, 3, 3)));
    }
}
