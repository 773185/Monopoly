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
public class Utilities extends BoardSpace{
    private int purchasePrice,baseRent, total;
    public Utilities(String n) {
        super(n);
        purchasePrice=150;
    }
    //returns the total rent paid depending on dice roll & utilities owned
    public void generateRent(int diceRoll, int utilOwned){
        total=0;
        if(utilOwned==1)
            total=4*diceRoll;
        
        else
            total=10*diceRoll;
    }
    
    public String toString(){
        return super.toString()+"rent is $"+total;
    }
}
