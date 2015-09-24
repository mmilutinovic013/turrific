/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turrificapp;

/**
     *
 * @author bkaul_000
 */
public interface Collidables {
    
    void checkBounds(Desk d, Enemy e);
    void checkBounds(Projectile p, Enemy e);
}
    