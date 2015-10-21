/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turrificapp;

import javax.swing.ImageIcon;
import java.awt.Rectangle;

/**
 *
 * @author bkaul_000
 */
public class Projectile {
    
    private int damage; // is this the damage?
    private ImageIcon icon;
    private int rateOfFire;
    private int xCoordinate;
    private int yCoordinate;
    
    public Projectile(int newDamage, /*icon,*/ int newRateOfFire, /*bound,*/ int startXCoordinate, int startYCoordinate){
        
        damage = newDamage;
        ImageIcon icon = new ImageIcon("images/projectile.png");
        rateOfFire = newRateOfFire;
        xCoordinate = startXCoordinate;
        yCoordinate = startYCoordinate;
    }
    
    public void setup(){
        
    }
    
    public void move(){
        
    }
    
}
