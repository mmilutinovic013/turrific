/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package turrificapp;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.Rectangle;
import javax.swing.JLabel;

/**
 *
 * @author markymark1346
 */
public class Desk implements Collidables{
    private int xCoordinate;
    private int yCoordinate;
    private ImageIcon icon;
    private Rectangle bound;
    private boolean objectPlaced;
    private Rectangle endzone;
    private JLabel deskImage;
    
    public Desk(int x, int y){
        xCoordinate = x;
        yCoordinate = y;
        ImageIcon icon = new ImageIcon("images/desk.png");
        deskImage = new JLabel(new ImageIcon("images/desk.png"));
        endzone = new Rectangle(60,60);
    }
    
    public int getDeskX(){
        return xCoordinate;
    }
    
    public int getDeskY(){
        return yCoordinate;
    }
    
    public void setDeskX(int newDeskX){
        xCoordinate = newDeskX;
    }
    
    public void setDeskY(int newDeskY){
        yCoordinate = newDeskY;
    }
    
    public void placeWeapon(){
        
    }
    
    public JLabel deskImageSetup(){
        return deskImage;
    }

    @Override
    public void checkBounds(Desk d, Enemy e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
    }

    @Override
    public void checkBounds(Projectile p, Enemy e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
