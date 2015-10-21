/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package turrificapp;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.Rectangle;

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
    private Enemy enemy;
    private User user;
    private JButton startWaveButton;
    private JButton weaponSelectButton[]; // need to create 3 default weapons in the class...
    private JTextArea userInformation;
    private StartMenu mainMenu;
    private StopMenu pauseMenu;
    private JButton pauseMenuButton;
    private JLabel pencilWeaponImage; // better name? 
    private JLabel staplerWeaponImage; // better name? 
    private JLabel rubberbandWeaponImage; // better name? 
    private JPanel gameboardPanel;
    private JPanel sidebarPanel;
    private JButton[] deskLayoutArray = new JButton[81]; 
    private JButton currentLayoutButton;
    private JLabel endzone;
    private Timer t1;
    private ArrayList <Weapon> weaponsArray;
    private ArrayList <JButton> deskButtonArray;
    int x =190;
    int y =500;
    JLabel enemyImage;

    int boardSize = 10;
    
    // Someone fix this spacing -- I'm moving onto other things. This should be simple in just  layout change.
    public Board() {
        
        super("Board JFrame");
        this.setSize(800, 600);
        this.setLayout(new BorderLayout());
        gameboardPanel = new JPanel();
        sidebarPanel = new JPanel();
        
        mainMenu = new StartMenu(this);
        mainMenu.setVisible(false);
        
        pauseMenu = new StopMenu(this);
        pauseMenu.setVisible(false);
        
        pauseMenuButton = new JButton("Pause");
        pauseMenuButton.addActionListener(this);
        pauseMenuButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        startWaveButton = new JButton("Start Wave");
        startWaveButton.addActionListener(this);
        startWaveButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        t1 = new Timer(100, this);
        enemy = new Enemy();
        enemyImage = enemy.getEnemyImage();
        enemyImage.setBounds(new Rectangle(x,y,100,100));
        gameboardPanel.add(enemyImage);
        weaponsArray = new ArrayList();
        deskButtonArray = new ArrayList();
        
        weaponSelectButton = new JButton[0]; // Weapon 0 is the default? 
        //weaponSelectButton.addActionListener(this); Figure this shit out...
        //enemy = new Enemy[10]; // verify that this is correct... base this number off of difficulty
        user = new User();
       
        //user information accessible through user.txt file, not sure if this is how you want to
        //run it for the constantly updated userInfo on sidebarPanel. If not it can easily be changed
        //to make it work just for saving and loading user profiles
        userInformation = new JTextArea();//new JLabel("User Information");
        userInformation.setSize(200, 100);
        userInformation.setVisible(true);
        userInformation.setBackground(Color.gray);
        userInformation.setEditable(false);
        userInformation.setAlignmentX(Component.CENTER_ALIGNMENT);
        try{
            FileReader fr = new FileReader("images/user.txt");
            BufferedReader br = new BufferedReader(fr);
            userInformation.read(br, "userInformation");
        }
        catch(IOException ioe){
            //error handling
        }

        map = new JLabel(new ImageIcon("images/board.png"));
        map.setLayout(new GridLayout(10,10));
        pencilWeaponImage = new JLabel(new ImageIcon("images/pencil.png"));
        pencilWeaponImage.setAlignmentX(Component.CENTER_ALIGNMENT);
        staplerWeaponImage = new JLabel(new ImageIcon("images/stapler.png"));
        staplerWeaponImage.setAlignmentX(Component.CENTER_ALIGNMENT);
        rubberbandWeaponImage = new JLabel(new ImageIcon("images/rubberband.png"));
        rubberbandWeaponImage.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        gameboardPanel.setLayout(new BorderLayout());
        gameboardPanel.setSize(600, 600);
        gameboardPanel.add(pauseMenu, BorderLayout.CENTER);
        gameboardPanel.add(mainMenu, BorderLayout.CENTER);
        gameboardPanel.add(map, BorderLayout.CENTER);

        sidebarPanel.setLayout(new BoxLayout(sidebarPanel, BoxLayout.PAGE_AXIS));
        sidebarPanel.setSize(200, 800);
        sidebarPanel.setBackground(Color.gray);
        sidebarPanel.add(startWaveButton);
        sidebarPanel.add(Box.createRigidArea(new Dimension(0,10)));
        sidebarPanel.add(pauseMenuButton);
        sidebarPanel.add(Box.createRigidArea(new Dimension(0,50)));
        sidebarPanel.add(userInformation);
        sidebarPanel.add(Box.createRigidArea(new Dimension(0,10)));
        sidebarPanel.add(pencilWeaponImage);
        sidebarPanel.add(Box.createRigidArea(new Dimension(0,50)));
        sidebarPanel.add(staplerWeaponImage);
        sidebarPanel.add(Box.createRigidArea(new Dimension(0,50)));
        sidebarPanel.add(rubberbandWeaponImage);

        for(int i = 0; i < boardSize; i++){
            for(int j = 0; j < boardSize; j++){
                if((i == 3 && j == 3) || (i == 3 && j == 4)|| (i == 3 && j == 5)|| (i == 3 && j == 6)|| (i == 3 && j == 7)|| (i == 3 && j == 8)|| (i == 3 && j == 9)|| (i == 3 && j == 10)|| (i == 4 && j == 3)|| (i == 5 && j == 3)|| (i == 5 && j == 4)|| (i == 5 && j == 5)|| (i == 5 && j == 6)|| (i == 6 && j == 6)|| (i == 7 && j == 3)|| (i == 7 && j == 4)|| (i == 7 && j == 5)|| (i == 7 && j == 6)|| (i == 8 && j == 3)|| (i == 9 && j == 3)/*|| (i == 10 && j == 3)*/){
                    // Do nothing and sob because this if block is ugly
                    map.add(new JLabel()); // We add a fake JLabel so it skips a space...lol GridLayout
                }
                else if(i == 10 && j == 3){
                    endzone = new JLabel();
                    endzone.setVisible(true);
                    endzone.setSize(60,60);
                    endzone.setBackground(Color.red);
                    endzone.setLocation(150,550);
                    map.add(endzone);
                }
                else{
                    desk = new Desk(i,j); 
                    //JLabel deskImage = desk.deskImageSetup();
                    JButton test = new JButton(/*""+ this.getX() +"," + this.getY()*/);
                    test.setIcon(new ImageIcon("images/desk.png")); //testing
                    map.add(test);
                    test.addActionListener(this);
                    deskButtonArray.add(test);
                    //test.add(deskImage); // set test coords
                    // Get the JButton that was selected
                    // 
                }
            }
        }
        this.add(gameboardPanel, BorderLayout.CENTER);
        this.add(sidebarPanel, BorderLayout.LINE_END);
        
        this.setResizable(false);
        this.setVisible(true);
    }
    
    public Board(Desk newDesk, Enemy newEnemies, JTextArea newUserInformation){
        //
        // Populates the passed in values to the fields
        //
        desk = newDesk;
        enemy = newEnemies;
        userInformation = newUserInformation;
        
        display();
    }
    
    public StartMenu getStartMenu(){ // add sets?
        return mainMenu;
    }
    
    public JPanel getGameboardPanel(){
        return gameboardPanel;
    }
    
    public StopMenu getStopMenu(){ // add sets?
        return pauseMenu;
    }
    
     public JLabel getMap(){ // add sets?
        return map;
    }
    
    public void actionPerformed(ActionEvent evt){
        Object obj = evt.getSource();
        if(obj == pauseMenuButton){
            pauseMenu.setVisible(true);
        }
        else if(obj == startWaveButton){
            t1.start();
        }
        else if(obj == t1){
            
            if(weaponsArray.size() > 0){
                for(int i = 0; i < weaponsArray.size(); i++){
                    weaponsArray.get(i).fire();
                }
            }
            
            if(enemyImage.getY() <= 500 && enemyImage.getY() > 385 && enemyImage.getX() == 190){
            y = y - 10;

            }
            if(enemyImage.getY() == 380 && enemyImage.getX() <= 390){
                y = y;
                x = x + 10;
            }
            if(enemyImage.getY() <= 385 && enemyImage.getY() > 260 && enemyImage.getX() == 400){
                y = y - 10;
                x = x;
            }
            if(enemyImage.getY() == 260 && enemyImage.getX() <= 400 && enemyImage.getX() > 190){
                y = y;
                x = x - 10;
            }
            if(enemyImage.getY() <= 260 && enemyImage.getY() > 150 && enemyImage.getX() == 190){
                y = y - 10;
                x = x;
            }
            if(enemyImage.getY() == 150 && enemyImage.getX() < 660){
                y = y;
                x = x + 10;
            }
            
            //enemy disappear and damage to health
            if(enemyImage.getY() == 150 && enemyImage.getX() >= 660){
                if(user.getHealth() <= 0){
                    System.exit(0);
                }
                user.decreaseHealth(5);
                System.out.println(user.getHealth());
            }
            
            System.out.println("here");
            enemyImage.setBounds(new Rectangle(x,y,100,100));
            this.repaint();
        }
        else if (deskButtonArray.contains(obj)){
            JOptionPane optionPane = new JOptionPane();
            optionPane.setVisible(true);
            Object[] options = {"select pencil",
                    "select stapler",
                    "select rubberband"};
            int selection = JOptionPane.showOptionDialog(this,
                "Please Select your Turret",
                "Turret Selection",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options, null);
                
                switch(selection){
                    case 0:
                        //System.out.println(((JButton)evt.getSource()).toString());
                        //JLabel image = pencilWeaponImage;
                        //((JButton)evt.getSource()).add(new JLabel(new ImageIcon("images/pencil.png")));
                        ///map.add(pencilWeaponImage);
                        if((user.getMoney() - 15) < 0){
                           break; 
                        }
                        Weapon pencil = new Weapon(1, this);
                        ImageIcon image1 = new ImageIcon("images/pencil.png");
                        System.out.println("one");
                        ((JButton)evt.getSource()).setIcon(image1);
                        user.decreaseMoney(15);
                        System.out.println(user.getMoney());
                        map.repaint();
                        weaponsArray.add(pencil);
                        break;
                    case 1:
                        if((user.getMoney() - 20) < 0){
                           break; 
                        }
                        Weapon stapler = new Weapon(2, this);
                        ImageIcon image2 = new ImageIcon("images/stapler.png");
                        System.out.println("two");
                        ((JButton)evt.getSource()).setIcon(image2);
                        user.decreaseMoney(20);
                        System.out.println(user.getMoney());
                        map.repaint();
                        weaponsArray.add(stapler);
                        break;
                    case 2:
                        if((user.getMoney() - 10) < 0){
                           break; 
                        }
                        Weapon rubberband = new Weapon(3, this);
                        ImageIcon image3 = new ImageIcon("images/rubberband.png");
                        System.out.println("three");
                        ((JButton)evt.getSource()).setIcon(image3);
                        user.decreaseMoney(10);
                        System.out.println(user.getMoney());
                        map.repaint();
                        weaponsArray.add(rubberband);
                        break;
                }
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
    
    public void setLayoutButton(JButton clickedJButton){
        currentLayoutButton = clickedJButton;
    }
    
    public JButton getLayoutButton(){
        return currentLayoutButton;
    }
    
    public void update(){
        
    }
    
}
