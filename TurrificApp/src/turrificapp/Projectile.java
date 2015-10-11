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
    
    private int attack; // is this the damage?
    private ImageIcon icon;
    private int speed;
    private int xCoordinate;
    private int yCoordinate;
    
    public Projectile(int startAttack, /*icon,*/ int startSpeed, /*bound,*/ int startXCoordinate, int startYCoordinate){
        
        attack = startAttack;
        ImageIcon icon = new ImageIcon("images/projectile.png");
        speed = startSpeed;
        //bound
        xCoordinate = startXCoordinate;
        yCoordinate = startYCoordinate;
    }
    
    public void setup(){
        
    }
    
    public void move(){
        
    }
    
}
