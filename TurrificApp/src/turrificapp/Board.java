package turrificapp;

import java.awt.*;
import java.awt.event.*;
/*
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
*/
import java.util.ArrayList;
import javax.swing.*;
import java.awt.Rectangle;

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
    private JTextArea userinfo;
    private Timer t1;
    private ArrayList <Weapon> weaponsArray;
    private ArrayList <JButton> deskButtonArray;

    int x =190;
    int y =500;
    
    JLabel enemyImage;

    int boardSize = 10;
    
    // FIXED: Someone fix this spacing -- I'm moving onto other things. This should be simple in just  layout change.
    public Board() {
        
        //setting up board layout
        super("Board JFrame");
        this.setSize(800, 600);
        this.setLayout(new BorderLayout());
        gameboardPanel = new JPanel();
        sidebarPanel = new JPanel();
        
        //start menu with options
        mainMenu = new StartMenu(this);
        mainMenu.setVisible(false);
        
        //pause menu with quite resume options buttons
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
       
        //SCRAPPED: user information accessible through user.txt file, not sure if this is how you want to
        //run it for the constantly updated userInfo on sidebarPanel. If not it can easily be changed
        //to make it work just for saving and loading user profiles
        
        //User information display on sidebar
        userinfo = new JTextArea("name: default\r\n" + "health: 100\r\n" + "score: 0\r\n" + "money: 30");
        userinfo.setSize(200,100);
        userinfo.setVisible(true);
        userinfo.setBackground(Color.gray);
        userinfo.setEditable(false);
        userinfo.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        //map on board, weapon images
        map = new JLabel(new ImageIcon("images/board.png"));
        map.setLayout(new GridLayout(10,10));
        pencilWeaponImage = new JLabel(new ImageIcon("images/pencil.png"));
        pencilWeaponImage.setAlignmentX(Component.CENTER_ALIGNMENT);
        staplerWeaponImage = new JLabel(new ImageIcon("images/stapler.png"));
        staplerWeaponImage.setAlignmentX(Component.CENTER_ALIGNMENT);
        rubberbandWeaponImage = new JLabel(new ImageIcon("images/rubberband.png"));
        rubberbandWeaponImage.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        //game board with map overlay
        gameboardPanel.setLayout(new BorderLayout());
        gameboardPanel.setSize(600, 600);
        gameboardPanel.add(pauseMenu, BorderLayout.CENTER);
        gameboardPanel.add(mainMenu, BorderLayout.CENTER);
        gameboardPanel.add(map, BorderLayout.CENTER);

        //setting up sidebar
        sidebarPanel.setLayout(new BoxLayout(sidebarPanel, BoxLayout.PAGE_AXIS));
        sidebarPanel.setSize(200, 800);
        sidebarPanel.setBackground(Color.gray);
        sidebarPanel.add(startWaveButton);
        sidebarPanel.add(Box.createRigidArea(new Dimension(0,10)));
        sidebarPanel.add(pauseMenuButton);
        sidebarPanel.add(Box.createRigidArea(new Dimension(0,50)));
        sidebarPanel.add(userinfo);
        sidebarPanel.add(Box.createRigidArea(new Dimension(0,10)));
        sidebarPanel.add(pencilWeaponImage);
        sidebarPanel.add(Box.createRigidArea(new Dimension(0,50)));
        sidebarPanel.add(staplerWeaponImage);
        sidebarPanel.add(Box.createRigidArea(new Dimension(0,50)));
        sidebarPanel.add(rubberbandWeaponImage);

        //populating board with desks
        for(int i = 0; i < boardSize; i++){
            for(int j = 0; j < boardSize; j++){
                if((i == 3 && j == 3) || (i == 3 && j == 4)|| (i == 3 && j == 5)|| (i == 3 && j == 6)|| (i == 3 && j == 7)|| (i == 3 && j == 8)|| (i == 3 && j == 9)|| (i == 3 && j == 10)|| (i == 4 && j == 3)|| (i == 5 && j == 3)|| (i == 5 && j == 4)|| (i == 5 && j == 5)|| (i == 5 && j == 6)|| (i == 6 && j == 6)|| (i == 7 && j == 3)|| (i == 7 && j == 4)|| (i == 7 && j == 5)|| (i == 7 && j == 6)|| (i == 8 && j == 3)|| (i == 9 && j == 3)/*|| (i == 10 && j == 3)*/){
                    // Do nothing and sob because this if block is ugly
                    map.add(new JLabel()); // We add a fake JLabel so it skips a space...lol GridLayout
                }
                else if(i == 10 && j == 3){
                    //endzone where enemies cross
                    endzone = new JLabel();
                    endzone.setVisible(true);
                    endzone.setSize(60,60);
                    endzone.setBackground(Color.red);
                    endzone.setLocation(150,550);
                    map.add(endzone);
                }
                else{
                    //populate with actual desk
                    desk = new Desk(i,j); ;
                    JButton test = new JButton();
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
        userinfo = newUserInformation;
        
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
        
        //action events
        Object obj = evt.getSource();
        if(obj == pauseMenuButton){
            pauseMenu.setVisible(true);
        }
        else if(obj == startWaveButton){
            t1.start();
            userinfo.setText("name: " + user.getName() + "\r\n" + "health: " + user.getHealth() + "\r\n" + "score: 0\r\n" + "money: " + user.getMoney());
        }
        else if(obj == t1){ //TIMER THAT RUNS EVERYTHING
            
            if(weaponsArray.size() > 0){
                for(int i = 0; i < weaponsArray.size(); i++){
                    weaponsArray.get(i).fire();
                }
            }
            
            //movement of enemies on path
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
            if(enemyImage.getY() == 150 && enemyImage.getX() == 660){
                if(user.getHealth() <= 0){
                    System.exit(0);
                }
                user.decreaseHealth(5); //decrement health and adjust user information
                x = x + 10; //moves off screen so health is decremented once
                userinfo.setText("name: " + user.getName() + "\r\n" + "health: " + user.getHealth() + "\r\n" + "score: 0\r\n" + "money: " + user.getMoney());
                System.out.println(user.getHealth());
                
            }
            
            System.out.println("here");
            enemyImage.setBounds(new Rectangle(x,y,100,100));
            this.repaint();
        }
        else if (deskButtonArray.contains(obj)){ //placing weapons on the board
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
                        if((user.getMoney() - 15) < 0){ //makes sure user can afford purchase
                           break; 
                        }
                        Weapon pencil = new Weapon(1, this);
                        ImageIcon image1 = new ImageIcon("images/pencil.png");
                        System.out.println("one");
                        ((JButton)evt.getSource()).setIcon(image1);
                        user.decreaseMoney(15); //decrements money and adjusts user information
                        userinfo.setText("name: " + user.getName() + "\r\n" + "health: " + user.getHealth() + "\r\n" + "score: 0\r\n" + "money: " + user.getMoney());
                        System.out.println(user.getMoney());
                        map.repaint();
                        weaponsArray.add(pencil);
                        break;
                    case 1: //next weapon
                        if((user.getMoney() - 20) < 0){
                           break; 
                        }
                        Weapon stapler = new Weapon(2, this);
                        ImageIcon image2 = new ImageIcon("images/stapler.png");
                        System.out.println("two");
                        ((JButton)evt.getSource()).setIcon(image2);
                        user.decreaseMoney(20);
                        userinfo.setText("name: " + user.getName() + "\r\n" + "health: " + user.getHealth() + "\r\n" + "score: 0\r\n" + "money: " + user.getMoney());
                        System.out.println(user.getMoney());
                        map.repaint();
                        weaponsArray.add(stapler);
                        break;
                    case 2: //final weapon
                        if((user.getMoney() - 10) < 0){
                           break; 
                        }
                        Weapon rubberband = new Weapon(3, this);
                        ImageIcon image3 = new ImageIcon("images/rubberband.png");
                        System.out.println("three");
                        ((JButton)evt.getSource()).setIcon(image3);
                        user.decreaseMoney(10);
                        userinfo.setText("name: " + user.getName() + "\r\n" + "health: " + user.getHealth() + "\r\n" + "score: 0\r\n" + "money: " + user.getMoney());
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
