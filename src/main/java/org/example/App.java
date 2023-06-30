package org.example;

import javax.swing.*;
import java.awt.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        DrawSquare drawSquare = new DrawSquare();
        JPanel top = new JPanel();
        top.setLayout(new FlowLayout());
        JTextField textField = new JTextField(6);
        //textField.setPreferredSize(new Dimension(100,50));
        top.add(textField);
        JButton addButton  = new JButton("Add");
        addButton.addActionListener(e -> {
            //add no to tree
            int input = Integer.parseInt(textField.getText());
            drawSquare.insert(input);
            drawSquare.repaint();

        });
        top.add(addButton);
        JButton clear = new JButton("clear");
        clear.addActionListener(e-> {
            drawSquare.setInput(0);
            drawSquare.repaint();
        });
        top.add(clear);
        JFrame frame = new JFrame("Binary Tree");
        frame.setLayout(new BorderLayout());
        frame.getContentPane().add(top,BorderLayout.NORTH);
        frame.getContentPane().add(drawSquare,BorderLayout.CENTER);
        frame.setSize(1000,1000);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
