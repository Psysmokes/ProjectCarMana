package com.SwingApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserWindow  extends Ticket{
    private JPanel UserW;
    private JButton tiketButton;
    private JButton button1;

    public UserWindow() {
        tiketButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getTicket();

            }
        });
    }

    public void  getWindow(){
        JFrame frame1=new JFrame("Car managment ");
        JPanel UserW= new JPanel();
        frame1.setContentPane(new UserWindow().UserW);
        //   UserW.setPreferredSize(new Dimension(5000,10000));

        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //     UserW.setLocation(75,100);
        frame1.pack();
        frame1.setVisible(true);

    }

    public static void main(String[] args) {
        JFrame frame1=new JFrame("Car managment ");
        JPanel UserW= new JPanel();
        frame1.setContentPane(new UserWindow().UserW);
     //   UserW.setPreferredSize(new Dimension(5000,10000));

        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   //     UserW.setLocation(75,100);
        frame1.pack();
        frame1.setVisible(true);

    }
}

