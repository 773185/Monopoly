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
    private boolean owned;
    private String owner;
    
    public Utilities(String n) {
        super(n);
        owner = "";
        purchasePrice=150;
        owned=false;
    }
    
    public boolean isowned (){
        return owned;
    }

    public void setTrue(){
    owned=true;
    }

    public void switchOwner(String n){
    owner=n;
    }
    
    public int getPrice(){
        return purchasePrice;
    }
    
    public String getOwner() {
        return owner;
    }
    
    //returns the total rent paid depending on dice roll & utilities owned
    public int getRent(int diceRoll, int utilOwned){
        total=0;
        if(utilOwned==1)
            return total=4*diceRoll;
        
        else
           return total=10*diceRoll;
    }
    
   // public int getRent(){
   //     return total;
    //}
    
    public String toString(){
        return super.toString()+"rent is $"+total;
    }
}
