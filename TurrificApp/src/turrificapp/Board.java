/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package turrificapp;

import java.awt.Rectangle;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author markymark1346
 */
public class Board extends JFrame {
    
    //TODO: We need Desk and Enemy before we can do Board
    // Push
    private Desk desks[][];
    private StartMenu mainMenu;
    private StopMenu pauseMenu;
    private Enemy enemies[];
    private User user;
    private JButton startWave;
    private JButton weaponSelect[];
    private JLabel userInformation;
    private Rectangle endzone;
    
    public Board(){
        desks = new Desk [10][10];
        mainMenu = new StartMenu();
        pauseMenu = new StopMenu();
        enemies = new Enemy[10]; // verify that this is correct...
        user = new User();
        startWave = new JButton("Start Wave");
        weaponSelect = new JButton[0]; // Weapon 0 is the default? 
        userInformation = new JLabel("User Information");
        endzone = new Rectangle(60,60);
        
        levelSetup(desks, mainMenu, pauseMenu, enemies, user, startWave, weaponSelect, userInformation, endzone);
        
    }
    
    public Board(Desk newDesks[][], Enemy newEnemies[], JLabel newUserInformation){
        //
        // Populates the passed in values to the fields
        //
        desks = newDesks;
        enemies = newEnemies;
        userInformation = newUserInformation;
        //
        // Sets up the board and level by calling level setup.
        //
        levelSetup(desks, mainMenu, pauseMenu, enemies, user, startWave, weaponSelect, userInformation, endzone);
        
    }
    
    public void actionPerformed(ActionEvent evt){
        
    }
    
    private void levelSetup(Desk newdesks[][], StartMenu newStartMenu, StopMenu newStopMenu, Enemy newEnemies[], User newUser, JButton newStartWave, JButton newWeaponSelect[], JLabel newUserInformation, Rectangle newEndzone){
        
    }
    
    public void display(){
        
    }
    
    public void update(){
        
    }
    
}
