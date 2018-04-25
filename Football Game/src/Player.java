
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
public class Player extends GameObject{
    private int team;
    public Player(int x, int y, int team){
        super(x,y);
        this.team = team;
    }

    @Override
    public void tick(){
        
    }
    
    @Override
    public void render(Graphics g) {
        g.setColor(Color.black);
        if(team==0)
            g.drawOval(x, y, 50, 50);
    }
}
