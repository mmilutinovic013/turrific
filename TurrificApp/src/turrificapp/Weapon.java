/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turrificapp;

import java.awt.Image;

/**
 *
 * @author bkaul_000
 */
public class Weapon {
    
    private String weaponName;
    private int weaponCost;
    private int weaponRange;
    private Image icon;
    private boolean weaponSelected;
    
    public Weapon(String name, int cost, int range, /*icon:image*/ boolean selected){
        
        weaponName = name;
        weaponCost = cost;
        weaponRange = range;
        weaponSelected = selected;
    }
    
    public void fire(){
        //creates projectile
    }
    
}
