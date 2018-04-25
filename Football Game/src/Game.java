
import java.awt.Color;
import java.awt.Graphics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ben
 */
public class Game extends Window{
    int width, height;
    int i=0;
    public Game(int width, int height, String title){
        super(width,height,title);
        this.width=width;
        this.height=height;
        
    }
    
    @Override
    public void paint(Graphics g){
        g.setColor(Color.green);
        g.fillRect(0, 0, width, height);
    }
    
    
}
