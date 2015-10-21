/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turrificapp;

import javax.swing.ImageIcon;
import javax.swing.*;

/**
 *
 * @author bkaul_000
 */
public class Weapon {
    
    private String weaponName;
    private int weaponCost;
    private int weaponDamage;
    private int weaponRateOfFire;
    private JLabel icon;
    private boolean weaponSelected;
    private int xCoordinate;
    private int yCoordinate;
    private Board board;
    
    public Weapon(int choice, Board newBoard/*String name, int cost, int range, int damage, ImageIcon icon, boolean selected*/){
        
        board = newBoard;
        
        if(choice == 1){
            weaponName = "Pencil";
            weaponCost = 15;
            weaponRateOfFire = 3;
            weaponDamage = 3;
            weaponSelected = true;
            icon = new JLabel("images/pencil.png");
        }
        else if(choice == 2){
            weaponName = "Stapler";
            weaponCost = 20;
            weaponRateOfFire = 1;
            weaponDamage = 5;
            weaponSelected = true;
            icon = new JLabel("images/stapler.png");
        }
        else if(choice == 3){
            weaponName = "RubberBand";
            weaponCost = 10;
            weaponRateOfFire = 5;
            weaponDamage = 1;
            weaponSelected = true;
            icon = new JLabel("images/rubberband.png");
        }
        
    }
    public String getWeaponName(){
        return weaponName;
    }
    public int getWeaponCost(){
        return weaponCost;
    }
    public int getWeaponRateIfFire(){
        return weaponRateOfFire;
    }
    public int getWeaponDamage(){
        return weaponDamage;
    }
    public boolean getWeaponSelected(){
        return weaponSelected;
    }
    public JLabel getIcon(){
        return icon;
    }
    public int getXCoordinate(){
        return xCoordinate;
    }
    public int getYCoordinate(){
        return yCoordinate;
    }
    
    public void fire(){
        //creates projectile
        int damage = getWeaponDamage(); 
        int cost = getWeaponCost(); 
        int rateOfFire = getWeaponRateIfFire(); 
        boolean selected = getWeaponSelected(); 
        Projectile projectile = new Projectile(damage, rateOfFire, xCoordinate, yCoordinate, board);

    }
    
}
