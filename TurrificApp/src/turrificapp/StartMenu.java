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
    private JButton easyButton;
    private JButton mediumButton;
    private JButton hardButton;
    private JButton startButton;
    private JTextField nameInput;
    private JLabel highScore;
    private JLabel instructions;
    private Board theBoard;

    public StartMenu(Board gameBoard){
        super();
        theBoard = gameBoard;
        this.setSize(800, 600);
        
        easyButton = new JButton("Easy");
        easyButton.setBounds(100, 500, 100, 50);
        easyButton.setBackground(Color.white);
        easyButton.setForeground(Color.black);
        
        easyButton.addActionListener(this);
        
        mediumButton = new JButton("Medium");
        mediumButton.setBounds(100, 400, 100, 50);
        mediumButton.setBackground(Color.white);
        mediumButton.setForeground(Color.black);
        mediumButton.addActionListener(this);
        
        hardButton = new JButton("Hard");
        hardButton.setBounds(100, 300, 100, 50);
        hardButton.setBackground(Color.white);
        hardButton.setForeground(Color.black);
        hardButton.addActionListener(this);
        
        startButton = new JButton("Start");
        startButton.setBounds(100, 200, 100, 50);
        startButton.setBackground(Color.white);
        startButton.setForeground(Color.black);
        startButton.addActionListener(this);
        
        nameInput = new JTextField("type in your name");
        nameInput.setBounds(200, 500, 100, 50);
        
        highScore = new JLabel("high score");
        highScore.setBounds(200, 400, 100, 50);
        
        instructions = new JLabel("Purchase and place turrets on the board using availabe funds and don't let enemies cross the endzone! Each wave will end when all the enemies have been destroyed or cross the endzone (accompanied with health loss). The game will terminate when your health reaches zero!");
        instructions.setBounds(300, 500, 100, 300);
        
        this.add(easyButton);
        this.add(mediumButton);
        this.add(hardButton);
        this.add(startButton);
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
        
        if(obj == startButton){
            // get difficulty
            theBoard.dispose();
            Board boardy = new Board();// Board has difficulty passed in? 
        }
        if(obj == easyButton){
            //Update Difficulty
            System.out.println("easy");
        }
        if(obj == mediumButton){
            //Update Difficulty
            System.out.println("medium");
        }
        if(obj == hardButton){
            //Update Difficulty
            System.out.println("hard");
        }
        
    }
    
    
    
}
