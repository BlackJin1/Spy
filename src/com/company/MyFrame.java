package com.company;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;


/**
 * Created by knyazev.v on 26.10.2017.
 */
public class MyFrame extends JFrame {
    private JTextField jTextField;
    private JButton jButton1 = new JButton("Выбрать");
    private JButton jButton2 = new JButton("Выбрать");
    private JButton jButton3 = new JButton("Запустить");
    private JPanel jPanel = new JPanel();

    public MyFrame(){
        jButton1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        jButton2.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        jButton3.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(12);
            }
        });

        jPanel.add(jButton1);
        jPanel.add(jButton2);
        this.getContentPane().add(jPanel);
    }
}
