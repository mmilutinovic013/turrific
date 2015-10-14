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
    private int weaponRange;
    private int weaponDamage;
    private JLabel icon;
    private boolean weaponSelected;
    private int xCoordinate;
    private int yCoordinate;
    
    public Weapon(int choice/*String name, int cost, int range, int damage, ImageIcon icon, boolean selected*/){
        
        //Weapon stats
        //Pencil(1): Range 3, Damage 3, Cost 15
        //Stapler(2): Range 1, Damge 5, Cost 20
        //RubberBand(3): Range 5, Damage 1, Cost 10
        /*int[] weaponArray;
        weaponArray = new int[12];
        weaponArray[0] = 1;
        weaponArray[1] = 3;
        weaponArray[2] = 3;
        weaponArray[3] = 15;
        weaponArray[4] = 2;
        weaponArray[5] = 1;
        weaponArray[6] = 5;
        weaponArray[7] = 20;
        weaponArray[8] = 3;
        weaponArray[9] = 5;
        weaponArray[10] = 1;
        weaponArray[11] = 10;*/
        
        if(choice == 1){
            weaponName = "Pencil";
            weaponCost = 15;
            weaponRange = 3;
            weaponDamage = 3;
            weaponSelected = true;
            icon = new JLabel("images/pencil.png");
        }
        else if(choice == 2){
            weaponName = "Stapler";
            weaponCost = 20;
            weaponRange = 1;
            weaponDamage = 5;
            weaponSelected = true;
            icon = new JLabel("images/stapler.png");
        }
        else if(choice == 3){
            weaponName = "RubberBand";
            weaponCost = 10;
            weaponRange = 5;
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
    public int getWeaponRange(){
        return weaponRange;
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
    
    
    public void fire(){
        //creates projectile
        int damage = getWeaponDamage(); 
        int cost = getWeaponCost(); 
        int range = getWeaponRange(); 
        boolean selected = getWeaponSelected(); 
        //Projectile projectile = new Projectile(damage, );
    }
    
}
