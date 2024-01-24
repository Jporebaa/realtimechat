package com.raven.form;

import com.raven.component.Chat_Body;
import com.raven.component.Chat_Bottom;
import com.raven.component.Chat_Title;
import com.raven.event.EventChat;
import com.raven.event.PublicEvent;
import com.raven.model.*;
import com.raven.service.Service;
import io.socket.client.Ack;
import net.miginfocom.swing.MigLayout;

import java.util.ArrayList;
import java.util.List;

public class Chat extends javax.swing.JPanel {

    private Chat_Title chatTitle;
    private Chat_Body chatBody;
    private Chat_Bottom chatBottom;

    public Chat() {
        initComponents();
        init();
    }

    private void init() {
        setLayout(new MigLayout("fillx", "0[fill]0", "0[]0[100%, fill]0[shrink 0]0"));
        chatTitle = new Chat_Title();
        chatBody = new Chat_Body();
        chatBottom = new Chat_Bottom();
        PublicEvent.getInstance().addEventChat(new EventChat() {
            @Override
            public void sendMessage(Model_Send_Message data) {
                chatBody.addItemRight(data);
            }

            @Override
            public void receiveMessage(Model_Receive_Message data) {
                if (chatTitle.getUser().getUserID() == data.getFromUserID()) {
                    chatBody.addItemLeft(data);
                }
            }


            //List<Model_Receive_Message> data

            @Override
            public void loadMessages() {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        PublicEvent.getInstance().getEventMain().showLoading(true);

                        Model_All_Messages data = new Model_All_Messages(Service.getInstance().getUser().getUserID(), chatTitle.getUser().getUserID());

                        Service.getInstance().getClient().emit("get_messages", data.toJsonObject(), new Ack() {
                            @Override
                            public void call(Object... os) {
                                if (os.length > 0) {


                                    List<Model_Receive_Message> data = new ArrayList<>();
                                    for (Object o : os) {
                                        Model_Receive_Message m = new Model_Receive_Message(o);
                                        data.add(m);
                                    }
                                    PublicEvent.getInstance().getEventMain().showLoading(false);
                                    for (Model_Receive_Message m : data) {
                                        if (chatTitle.getUser().getUserID() == m.getFromUserID()) {
                                            chatBody.addItemLeft(m);
                                        } else {
                                            chatBody.addItemRight(m);
                                        }
                                    }
                                    chatBody.scrollToBottom();

                                    PublicEvent.getInstance().getEventMain().showLoading(false);
                                } else {
                                    PublicEvent.getInstance().getEventMain().showLoading(false);
                                }
                            }
                        });

                    }
                }).start();
            }



        });
        add(chatTitle, "wrap");
        add(chatBody, "wrap");
        add(chatBottom, "h ::50%");
    }

    public void setUser(Model_User_Account user) {
        chatTitle.setUserName(user);
        chatBottom.setUser(user);
        chatBody.clearChat();
    }

    public void updateUser(Model_User_Account user) {
        chatTitle.updateUser(user);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 727, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 681, Short.MAX_VALUE)
        );
    }



}
