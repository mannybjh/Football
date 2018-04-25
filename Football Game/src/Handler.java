
import java.awt.Graphics;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ben
 */
public class Handler {
    ArrayList<GameObject> objects = new ArrayList<>();
    
    public Handler(){
        
    }
    
    public void render(Graphics g){
        for(int i = 0; i < objects.size(); i++){
            objects.render(g);
        }
    }
    
    public void addObject(GameObject object){
        objects.add(object);
    }
    
}
