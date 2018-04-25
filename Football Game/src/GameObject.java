
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
public abstract class GameObject {
    protected int x,y;
    public GameObject(int x, int y){
        this.x=x;
        this.y=y;
    }
    
    public abstract void tick();
    public abstract void render(Graphics g);
    
    public int getX(){return x;}
    public int getY(){return y;}
    public void setX(int x){this.x=x;}
    public void setY(int y){this.y=y;}
}
