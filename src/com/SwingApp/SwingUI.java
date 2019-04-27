package com.SwingApp;

import javafx.scene.control.PasswordField;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Objects;


public class SwingUI  extends  UserWindow{
    private JButton OKButton;
    private JButton cancelButton;
    private JPanel field1;
    private JTextField Login;
    private JPasswordField passwordField1;

    public SwingUI () {
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username=Login.getText().toString();
                System.out.println(username);
                String pass=String.valueOf(passwordField1.getPassword());
                System.out.println(pass);
               if( Objects.equals(username,"Admin")&& Objects.equals(pass,"Admin")) {
                   new UserWindow().getWindow();
                   field1.setVisible(false);
                    JOptionPane.showMessageDialog(null,"wellcome "+username);


                }
                else{
                    JOptionPane.showMessageDialog(null,"You not Admin");
                }
            }
        });


    }



    public static void main(String[] args) {
         JFrame frame=new JFrame("Car managment ");
         frame.setContentPane(new SwingUI().field1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
