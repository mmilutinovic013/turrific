/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turrificapp;

/**
 *
 * @author bkaul_000
 */
public class Enemy {
    
    private int health;
    private int xCoordinate;
    private int yCoordinate;
    private int speed;
    private int damage;
    private boolean visible;
    //bounds:rectangle
    
    public Enemy(int startHealth, int startXCoordinate, int startYCoordinate, int startSpeed, int startDamage, boolean startVisible){
        
        health = startHealth;
        xCoordinate = startXCoordinate;
        yCoordinate = startYCoordinate;
        speed = startSpeed;
        damage = startDamage;
        visible = startVisible;   
    }
    /*
    public void setHealth(){
        
    }
    
    public void getHealth(){
        
    }
    
    public void setXCoordinate(){
        
    }
    
    public void getXCoordinate(){
        
    }
    
    public void setYCoordinate(){
        
    }
    
    public void getYCoordinate(){
        
    }
    */ //Don't know if these methods are necessary
    
    public void takeDamage(/*Projectile P*/){
        
    }
    
    public void move(){
        
    }
    
    public void raiseDifficulty(){
        
    }
}
