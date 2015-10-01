/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package turrificapp;

import java.awt.event.ActionEvent;
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
        quit = new JButton("Quit");
        mainMenu = new JButton("Main Menu");
        this.add(quit);
        this.add(mainMenu);
        this.add(resume);
    }
    
    public void goToMenu(){
        //creates startMenu
    }
}
