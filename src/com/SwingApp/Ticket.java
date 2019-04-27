package com.SwingApp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ticket {
    private JTextField textField1;
    private JPanel panel1;
    private JButton button1;




    public void getTicket(){
        JFrame frame=new JFrame("Ticket ");
        frame.setContentPane(new Ticket().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
