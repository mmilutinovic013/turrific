/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package turrificapp;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author markymark1346
 */
public class Board extends JFrame implements ActionListener {
    
    //TODO: We need Desk and Enemy baefore we can do Board
    // GridLayout? 
    // Push
    private JLabel map;
    private Desk desk;
    private Enemy enemies[];
    private User user;
    private JButton startWaveButton;
    private JButton weaponSelectButton[]; // need to create 3 default weapons in the class...
    private JLabel userInformation;
    private StartMenu mainMenu;
    private StopMenu pauseMenu;
    private JButton pauseMenuButton;
    int boardSize = 10;
    
    
    public Board() {
        
        super("Board JFrame");
        this.setSize(800, 600);
        this.setLayout(new BorderLayout());
        JPanel gameboardPanel = new JPanel();
        JPanel sidebarPanel = new JPanel();
        
        mainMenu = new StartMenu(this);
        mainMenu.setVisible(false);
        
        pauseMenu = new StopMenu(this);
        pauseMenu.setVisible(false);
        
        pauseMenuButton = new JButton("Pause");
        pauseMenuButton.addActionListener(this);
        
        startWaveButton = new JButton("Start Wave");
        startWaveButton.addActionListener(this);
        
        
        weaponSelectButton = new JButton[0]; // Weapon 0 is the default? 
        //weaponSelectButton.addActionListener(this); Figure this shit out...
        enemies = new Enemy[10]; // verify that this is correct...
        user = new User();
       
        userInformation = new JLabel("User Information");

        map = new JLabel(new ImageIcon("images/board.png"));
        map.setLayout(new GridLayout(10,10));
        
        gameboardPanel.setSize(600, 600);
        gameboardPanel.setLayout(new BorderLayout());
        gameboardPanel.add(pauseMenu, BorderLayout.CENTER);
        gameboardPanel.add(mainMenu, BorderLayout.CENTER);
        gameboardPanel.add(map, BorderLayout.CENTER);

        sidebarPanel.setSize(200, 800);
        sidebarPanel.setBackground(Color.gray);
        sidebarPanel.add(startWaveButton);
        sidebarPanel.add(pauseMenuButton);

        for(int i = 0; i < boardSize; i++){
            for(int j = 0; j < boardSize; j++){
                if((i == 3 && j == 3) || (i == 3 && j == 4)|| (i == 3 && j == 5)|| (i == 3 && j == 6)|| (i == 3 && j == 7)|| (i == 3 && j == 8)|| (i == 3 && j == 9)|| (i == 3 && j == 10)|| (i == 4 && j == 3)|| (i == 5 && j == 3)|| (i == 5 && j == 4)|| (i == 5 && j == 5)|| (i == 5 && j == 6)|| (i == 6 && j == 6)|| (i == 7 && j == 3)|| (i == 7 && j == 4)|| (i == 7 && j == 5)|| (i == 7 && j == 6)|| (i == 8 && j == 3)|| (i == 9 && j == 3)|| (i == 10 && j == 3)){
                    // Do nothing and sob because this if block is ugly
                    map.add(new JLabel());
                    
                }
                else{
                    desk = new Desk(i,j); 
                    JLabel deskImage = desk.deskImageSetup();
                    map.add(deskImage); 
                }
                
            }
        }
        
        this.add(gameboardPanel, BorderLayout.CENTER);
        this.add(sidebarPanel, BorderLayout.LINE_END);
        
        this.setResizable(false);
        this.setVisible(true);
    }
    
    public Board(Desk newDesk, Enemy newEnemies[], JLabel newUserInformation){
        //
        // Populates the passed in values to the fields
        //
        desk = newDesk;
        enemies = newEnemies;
        userInformation = newUserInformation;
        
        display();
    }
    
    public StartMenu getStartMenu(){ // add sets?
        return mainMenu;
    }
    
    public StopMenu getStopMenu(){ // add sets?
        return pauseMenu;
    }
    
    public void actionPerformed(ActionEvent evt){
        Object obj = evt.getSource();
        if(obj == pauseMenuButton){
            pauseMenu.setVisible(true);
            
        }
        //
        // Updates the current map when an action is performed...
        //
        update();
    }
    
    public void display(){
        //
        // This initialized the display...this occurs on start and whenever the game updates.
        // This will depend on get and set methods from things...
        // If not path then desk...?
        //
        
        
    }
    
    public void update(){
        
    }
    
}
