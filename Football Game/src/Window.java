
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ben
 */
public class Window extends JFrame{
    public Window(int width, int height, String title){
        setSize(width,height);
        setTitle(title);
        setLayout(null);
    }
    public static void main(String[] args) {
        new Game(new Window(800,600,"Football"));
    }
}
