/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turrificapp;

import javax.swing.ImageIcon;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author bkaul_000
 */
public class Projectile extends JLabel implements ActionListener {
    
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
        timer = new Timer(50, newBoard);
        timer.addActionListener(this);
        projectileImage = new JLabel(new ImageIcon("images/enemy.png"));
        projectileImage.setBounds(new Rectangle(xCoordinate,yCoordinate,50,50));
        newBoard.add(projectileImage);
        projectileImage.setVisible(true);
        System.out.println("hi");
        this.move();
    }
    
    public void setup(){
        
    }
    
    public void move(){
       timer.start();
       System.out.println("here");
       yCoordinate = yCoordinate - 10;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj == timer){
            xCoordinate = xCoordinate - 10;
            projectileImage.setBounds(new Rectangle(xCoordinate, yCoordinate,50,50));

        }
    }
    
}
