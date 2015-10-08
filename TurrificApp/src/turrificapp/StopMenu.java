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
    private JButton quitButton;
    private JButton mainMenuButton;
    private JButton resumeButton;
    private Board theBoard;
    
    StopMenu(Board gameBoard){
        super();
        theBoard = gameBoard; 
        this.setSize(600, 600);
        this.setBackground(Color.white);
        this.setLayout(new FlowLayout());
        
        quitButton = new JButton("Quit");
        quitButton.addActionListener(this);
        mainMenuButton = new JButton("Main Menu");
        mainMenuButton.addActionListener(this);
        resumeButton = new JButton("resume");
        resumeButton.addActionListener(this);
        
        this.add(quitButton);
        this.add(mainMenuButton);
        this.add(resumeButton);
        this.setVisible(true);
    }
    
    public void goToMenu(){ // This is literally actionPerformed
        //creates startMenu
        
    }

    public void actionPerformed(ActionEvent evt) {
        Object obj = evt.getSource();
        
        if(obj == quitButton){
            System.exit(0);
        }
        if(obj == mainMenuButton){
            // go back to the panel that does that main menu stuff
            this.setVisible(false);
            theBoard.getStartMenu().setVisible(true); // We have to figure this out...
        }
        if(obj == resumeButton){
            // remove the frame 
            this.setVisible(false);
        }
    }
    
    
}
