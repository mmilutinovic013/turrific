/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turrificapp;

import java.awt.Image;
import java.awt.Rectangle;

/**
 *
 * @author bkaul_000
 */
public class Projectile {
    
    private int attack;
    private Image icon;
    private int speed;
    private Rectangle bound;
    private int xCoordinate;
    private int yCoordinate;
    
    public Projectile(int startAttack, /*icon,*/ int startSpeed, /*bound,*/ int startXCoordinate, int startYCoordinate){
        
        attack = startAttack;
        //icon
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
