package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.pack();
        frame.setSize(new Dimension(500,200));
        frame.setVisible(true);

        String fileParh = "D:\\Роман\\Ресурсы";
        String dirResult = "D:\\Роман\\Результаты\\";
        //Manager manager = new Manager(dirResult);
      //  manager.processData(fileParh);
    }
}
