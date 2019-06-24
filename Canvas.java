/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rainrain;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;


/**
 *int
 * @author Armani Weise
 */
public class Canvas extends JPanel {
    int linex,liney,sizex,sizey;
    public Canvas(int sizex,int sizey){
    this.sizex=sizex;
    this.sizey=sizey;
    this.setLayout(null);
    this.setLocation(0,0);
    this.setSize(sizex, sizey);
    }

    
    @Override
    protected void paintComponent(Graphics g){
        g.create();
        g.setColor(new Color(30,20,100));
        g.drawLine(sizex/2, sizey/2, linex,liney);
        
    }
}
