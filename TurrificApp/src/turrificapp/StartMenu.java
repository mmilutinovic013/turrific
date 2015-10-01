/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package turrificapp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author markymark1346
 */
public class StartMenu extends JPanel implements ActionListener {
    private JButton easy;
    private JButton medium;
    private JButton hard;
    private JButton start;
    private JTextField nameInput;
    private JLabel highScore;
    private JLabel instructions;

    public StartMenu(){
        this.setLayout(null);
        this.setSize(800, 600);
        
        easy = new JButton("Easy");
        easy.setBounds(100, 500, 100, 50);
        easy.setBackground(Color.white);
        easy.setForeground(Color.black);
        
        easy.addActionListener(this);
        
        medium = new JButton("Medium");
        medium.setBounds(100, 400, 100, 50);
        medium.setBackground(Color.white);
        medium.setForeground(Color.black);
        medium.addActionListener(this);
        
        hard = new JButton("Hard");
        hard.setBounds(100, 300, 100, 50);
        hard.setBackground(Color.white);
        hard.setForeground(Color.black);
        hard.addActionListener(this);
        
        start = new JButton("Start");
        start.setBounds(100, 200, 100, 50);
        start.setBackground(Color.white);
        start.setForeground(Color.black);
        start.addActionListener(this);
        
        nameInput = new JTextField("type in your name");
        nameInput.setBounds(200, 500, 100, 50);
        
        highScore = new JLabel("high score");
        highScore.setBounds(200, 400, 100, 50);
        
        instructions = new JLabel("Purchase and place turrets on the board using availabe funds and don't let enemies cross the endzone! Each wave will end when all the enemies have been destroyed or cross the endzone (accompanied with health loss). The game will terminate when your health reaches zero!");
        instructions.setBounds(300, 500, 100, 300);
        
        this.add(easy);
        this.add(medium);
        this.add(hard);
        this.add(start);
        this.add(nameInput);
        this.add(highScore);
        this.add(instructions);
        
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
