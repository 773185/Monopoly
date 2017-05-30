/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

/**
 *
 * @author 761843
 */
public class Fines extends BoardSpace {
    private int cost;
    public Fines(int amount) {
        //super(true);
        super("Pay Money");
        cost = amount;
    }
    
    public int getTax(){
        return cost;
    }
    
}

