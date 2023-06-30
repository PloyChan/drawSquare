package org.example;

import javax.swing.*;
import java.awt.*;

public class DrawSquare extends JLabel {
    private int input;
    @Override
    protected void paintComponent(Graphics g) {
        int x = 300, y =50 ,width = 50, height = 50;

        Graphics2D g2 = (Graphics2D) g;
        if(input > 0){
            g2.setColor(Color.black);
            g2.drawString(input+"",450,30);
        }
        for(int i = 0; i<input; i++){
            for(int j = 0; j < input; j++){
                if(  i == j || i == input-j-1){
                    displayColor(g2,x = x+50,y,width,height);
                }
                else {
                    displaySquare(g2,x = x+50,y,width,height);
                }
            }
            x = 300;
            y = y+50;
        }
    }
    private void displaySquare(Graphics2D g,int x, int y, int width, int height){
        g.setColor(Color.black);
        g.drawRect(x,y,width,height);
    }
    private void displayColor(Graphics2D g,int x, int y, int width, int height){
        g.setColor(Color.GREEN);
        g.fillRect(x,y,width,height);
    }

    public void insert(int input) {
        this.input = input;
    }

    public void setInput(int input) {
        this.input = input;
    }
}
