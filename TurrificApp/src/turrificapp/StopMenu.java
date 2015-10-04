/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package turrificapp;

import java.awt.Color;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author markymark1346
 */
public class StopMenu extends JPanel implements ActionListener  {
    private JButton quit;
    private JButton mainMenu;
    private JButton resume;
    
    StopMenu(){
        super();
        this.setSize(600, 600);
        this.setBackground(Color.blue);
        this.setLayout(new FlowLayout());
        
        quit = new JButton("Quit");
        mainMenu = new JButton("Main Menu");
        resume = new JButton("resume");
        
        this.add(quit);
        this.add(mainMenu);
        this.add(resume);
        this.setVisible(true);
    }
    
    public void goToMenu(){ // This is literally actionPerformed
        //creates startMenu
        
    }

    public void actionPerformed(ActionEvent evt) {
        Object obj = evt.getSource();
        
        if(obj == quit){
            System.exit(0);
        }
        if(obj == mainMenu){
            // go back to the panel that does that main menu stuff
            StartMenu theMenu = new StartMenu();
            this.remove(this);
        }
        if(obj == resume){
            // remove the frame 
            this.remove(this);
        }
    }
    
    
}
