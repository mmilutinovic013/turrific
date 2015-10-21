/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package turrificapp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.io.*;

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
    private JTextArea scoreList;
    private JTextArea instructions;
    private Board theBoard;

    public StartMenu(Board gameBoard){
        super();
        theBoard = gameBoard;
        this.setSize(800, 600);
        this.setLayout(null);
        
        easyButton = new JButton("Easy");
        easyButton.setBounds(150, 50, 100, 50);
        easyButton.setBackground(Color.white);
        easyButton.setForeground(Color.black);
        easyButton.addActionListener(this);
        
        mediumButton = new JButton("Medium");
        mediumButton.setBounds(150, 100, 100, 50);
        mediumButton.setBackground(Color.white);
        mediumButton.setForeground(Color.black);
        mediumButton.addActionListener(this);
        
        hardButton = new JButton("Hard");
        hardButton.setBounds(150, 150, 100, 50);
        hardButton.setBackground(Color.white);
        hardButton.setForeground(Color.black);
        hardButton.addActionListener(this);
        
        startButton = new JButton("Start");
        startButton.setBounds(450, 100, 100, 50);
        startButton.setBackground(Color.white);
        startButton.setForeground(Color.black);
        startButton.addActionListener(this);
        
        nameInput = new JTextField("type in your name");
        nameInput.setBounds(425, 250, 150, 50);
        
        highScore = new JLabel("high score");
        highScore.setBounds(475, 300, 100, 50);
        
        scoreList = new JTextArea();
        scoreList.setBounds(425, 350, 150, 150);
        scoreList.setVisible(true);
        scoreList.setEditable(false);
        try{
            FileReader fr = new FileReader("images/scores.txt");
            BufferedReader br = new BufferedReader(fr);
            scoreList.read(br, "scoreList");
        }
        catch(IOException ioe){
            //error handling
        }
            
        instructions = new JTextArea("Purchase and place turrets on the board using availabe funds and don't let enemies cross the endzone! Each wave will end when all the enemies have been destroyed or cross the endzone (accompanied with health loss). The game will terminate when your health reaches zero!");
        instructions.setBounds(75, 350, 250, 150);
        instructions.setLineWrap(true);
        instructions.setWrapStyleWord(true);
        instructions.setEditable(false);
        
        this.add(easyButton);
        this.add(mediumButton);
        this.add(hardButton);
        this.add(startButton);
        this.add(nameInput);
        this.add(highScore);
        this.add(instructions);
        this.add(scoreList);
        
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
