/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turrificapp;

import java.awt.Rectangle;
import javax.swing.ImageIcon;
import javax.swing.*;

public class Enemy extends JPanel {
    
    private int health;
    private int xCoordinate;
    private int yCoordinate;
    private int speed;
    private int damage;
    private boolean visible;
    private ImageIcon icon;
    private Rectangle bounds;
    
    public Enemy(){
        
        health = 10;
        xCoordinate = 0;
        yCoordinate = 0;
        speed = 20;
        damage = 10;
        icon = new ImageIcon("images/enemy.png");
        visible = true;  
    }
    public Enemy(int startHealth, int startXCoordinate, int startYCoordinate, int startSpeed, int startDamage, boolean startVisible /*bounds:rectangle*/){
        
        health = startHealth;
        xCoordinate = startXCoordinate;
        yCoordinate = startYCoordinate;
        speed = startSpeed;
        damage = startDamage;
        icon = new ImageIcon("images/enemy.png");
        visible = startVisible;  
    }
    
    public JLabel getEnemyImage(){
        return new JLabel(icon);
    }
    
    public void takeDamage(/*Projectile P*/){
        
    }
        
    public void move(){
        
    }
    
    public void raiseDifficulty(){
        
    }
}
