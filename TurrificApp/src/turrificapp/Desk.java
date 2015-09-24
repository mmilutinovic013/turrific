/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package turrificapp;

import java.awt.Image;
import java.awt.Rectangle;

/**
 *
 * @author markymark1346
 */
public class Desk {
    private int xCoordinate;
    private int yCoordinate;
    private Image icon;
    private Rectangle bound;
    private boolean objectPlaced;
    
    public Desk(){
        
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
}
