/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package turrificapp;

/**
 *
 * @author markymark1346
 */
public class User {
    private String name;
    private int score;
    private int money;
    private int health;
  
    public User(){
        name = "default";
    }
    
    public void increaseScore(int newScoreIncrease){
        score = score + newScoreIncrease;

    }
    public void decreaseScore(int newScoreDecrease){
        score = score - newScoreDecrease;
    }
    
    public int getScore(){
        return score; 
    }
    
    public void increaseMoney(int newMoneyIncrease){
        money = money + newMoneyIncrease;

    }
    public void decreaseMoney(int newMoneyDecrease){
        money = money - newMoneyDecrease;
    }
    
    public int getMoney(){
        return money; 
    }
    
    public void increaseHealth(int newHealthIncrease){
        health = health + newHealthIncrease;

    }
    public void decreaseHealth(int newHealthDecrease){
        health = health - newHealthDecrease;
    }
    
    public int getHealth(){
        return health; 
    }
    // TODO: We probably need something to get the name from the set string in the name entry form...
}
