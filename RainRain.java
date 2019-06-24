/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rainrain;

/**
 *
 * @author Armani Weise

    /**
     * @param args the command line arguments
     */
 import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Color;

public class RainRain{
	public RainRain(int sizex,int sizey) throws InterruptedException{
		
		Raindrop drops[]= new Raindrop[200];
		for (int n=0;n<200;n++){
			
			drops[n]= new Raindrop();
                        drops[n].setSize((int)(Math.random()*5),(int)(Math.random()*45));
                        
                        drops[n].setBackground(new Color(80,8,96));
                        
			
		}
		JPanel background= new JPanel();
		background.setSize(sizex,sizey);
		background.setBackground(new Color(20,8,36));
        background.setLayout(null);
        
        for (int n=0;n<200;n++){background.add(drops[n]);}
        
       
		JFrame wind= new JFrame();
		wind.setSize(sizex,sizey);
		wind.setResizable(false);
		wind.setVisible(true);
                wind.setDefaultCloseOperation(3);
		wind.setContentPane(background);
                while (true){
                for (int n=0;n<200;n++){
                
                    drops[n].movexy();
                }
                Thread.sleep(25);
                }
                
	}
	
	
	public static void main(String[]args) throws InterruptedException{
	new RainRain(500,500);
}
}
class Raindrop extends JPanel{
	int x=0;
        int y=0;
        int speed=0;
        int L=0,W=0;
        public Raindrop(){
        this.x=(int)(Math.random()*498);
        this.y=(int)(Math.random()*-200);
        this.speed=(int)(Math.random()*12+8);
        
        }
        public void movexy(){
        if (this.y>498){
        this.x=(int)(Math.random()*498);
        this.y=(int)(Math.random()*-200);
        this.L=(int)(Math.random()*40);
        this.W=(int)(Math.random()*3);
        this.setSize(this.W,this.L);
        }
        else{this.y+=this.speed;}
            this.setLocation(x, y);
        }
	
	
}
    

