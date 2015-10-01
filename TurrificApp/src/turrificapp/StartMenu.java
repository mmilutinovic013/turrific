/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package turrificapp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author markymark1346
 */
public class StartMenu extends JFrame implements ActionListener {
    private JButton easy;
    private JButton medium;
    private JButton hard;
    private JButton start;
    private JTextField nameInput;
    private JLabel highScore;
    private JLabel instructions;

    public StartMenu(){
        this.setSize(800, 600);
        
        easy = new JButton("Easy");
        easy.addActionListener(this);
        medium = new JButton("Medium");
        medium.addActionListener(this);
        hard = new JButton("Hard");
        hard.addActionListener(this);
        start = new JButton("Start");
        start.addActionListener(this);
        
        this.add(easy);
        this.add(medium);
        this.add(hard);
        this.add(start);
        
        this.setVisible(true);
    }
    
    public void loadScores(){
        
    }
    
    public void playerSetup(){
        
    }
   
    public void actionPerformed(ActionEvent evt){
        Object obj = evt.getSource(); 
        
        if(obj == start){
            Board boardy = new Board();
        }
    }
    
    
    
}
