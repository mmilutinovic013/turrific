/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turrificapp;

import javax.swing.ImageIcon;

/**
 *
 * @author bkaul_000
 */
public class Weapon {
    
    private String weaponName;
    private int weaponCost;
    private int weaponRange;
    private ImageIcon icon;
    private boolean weaponSelected;
    
    public Weapon(String name, int cost, int range, /*icon:image*/ boolean selected){
        
        weaponName = name;
        weaponCost = cost;
        weaponRange = range;
        weaponSelected = selected;
        
        //Weapon stats
        //Pencil: Range 3, Damage 3, Cost 15
        //Stapler: Range 1, Damge 5, Cost 20
        //RubberBand: Range 5, Damage 1, Cost 10
    }
    
    public void fire(){
        //creates projectile
    }
    
}
