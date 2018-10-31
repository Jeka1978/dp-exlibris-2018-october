package com.exlibris.java8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Evgeny Borisov
 */
public class ColorFrame extends JFrame {
    public ColorFrame(String newTitle) throws HeadlessException {
        final JButton button = new JButton("click me");
        button.addActionListener(e -> {
            System.out.println("button was clicked");
            button.setText(newTitle);
        });
    }
}
