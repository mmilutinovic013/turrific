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
    private JLabel background;
    private Desk desks[][];
    private Enemy enemies[];
    private User user;
    private JButton startWaveButton;
    private JButton weaponSelectButton[]; // need to create 3 default weapons in the class...
    private JLabel userInformation;
    private StartMenu mainMenu;
    private StopMenu pauseMenu;
    private JButton pauseMenuButton;
    
    
    public Board() {
        
        super("Board JFrame");
        this.setSize(800, 600);
        this.setLayout(new BorderLayout());
        
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
        
        desks = new Desk [10][10];
        enemies = new Enemy[10]; // verify that this is correct...
        user = new User();
       
        userInformation = new JLabel("User Information");
        
        JPanel gameboardPanel = new JPanel();
        JPanel sidebarPanel = new JPanel();
        //JLabel background = new JLabel(new ImageIcon("images/board.png"));
        
        gameboardPanel.setSize(600, 600);
        gameboardPanel.setLayout(new BorderLayout());
        //gameboardPanel.setBackground(Color.red); // This will be changed to the image...
        gameboardPanel.add(pauseMenu, BorderLayout.CENTER);
        gameboardPanel.add(mainMenu, BorderLayout.CENTER);
        
        //complicated to set JPanel backgorund to image without making own class so...
        sidebarPanel.setSize(200, 800);
        sidebarPanel.setBackground(Color.gray);
        //sidebarPanel.setLayout(new BoxLayout(sidebarPanel, BoxLayout.PAGE_AXIS));
        sidebarPanel.add(startWaveButton);
        sidebarPanel.add(pauseMenuButton);
        
        background = new JLabel(new ImageIcon("images/board.png"));
        background.setLayout(new BorderLayout());
        gameboardPanel.add(background);

        JLabel label = new JLabel("I'm on fire");
        label.setFont(label.getFont().deriveFont(Font.BOLD, 48));
        label.setForeground(Color.WHITE);
        label.setHorizontalAlignment(JLabel.CENTER);
        background.add(label);

        
        
        this.add(gameboardPanel, BorderLayout.CENTER);
        this.add(sidebarPanel, BorderLayout.LINE_END);

        this.setVisible(true);

        display();
    }
    
    public Board(Desk newDesks[][], Enemy newEnemies[], JLabel newUserInformation){
        //
        // Populates the passed in values to the fields
        //
        desks = newDesks;
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
