/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turrificapp;

import javax.swing.ImageIcon;
import java.awt.Rectangle;
import javax.swing.JLabel;
import javax.swing.Timer;

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
    private Timer timer;
    private JLabel projectileImage;

    
    public Projectile(int newDamage, /*icon,*/ int newRateOfFire, /*bound,*/ int startXCoordinate, int startYCoordinate, Board newBoard){
        
        damage = newDamage;
        ImageIcon icon = new ImageIcon("images/projectile.png");
        rateOfFire = newRateOfFire;
        xCoordinate = startXCoordinate;
        yCoordinate = startYCoordinate;
        timer = new Timer(100, newBoard);
        projectileImage = new JLabel(new ImageIcon("images/enemy.png"));
        projectileImage.setBounds(new Rectangle(xCoordinate,yCoordinate,50,50));
        newBoard.add(projectileImage);
    }
    
    public void setup(){
        
    }
    
    public void move(){
        
    }
    
}
