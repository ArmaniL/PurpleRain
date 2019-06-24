/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rainrain;

import javax.swing.JFrame;

/**
 *
 * @author Armani Weise
 */
public class Animate {
Canvas canvas;
public Animate() throws InterruptedException{
canvas=new Canvas(700,700);
    JFrame window= new JFrame();
window.setSize(700, 700);
window.setVisible(true);
window.setDefaultCloseOperation(3);
window.add(canvas);
window.setContentPane(canvas);

while (true){ 
 canvas.paintComponent(canvas.getGraphics());
Thread.sleep(2);
canvas.linex++;
canvas.validate();
}    
    
    
}
public static void main(String[]args) throws InterruptedException{

}

    
}
