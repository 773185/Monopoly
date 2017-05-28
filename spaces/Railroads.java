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
public class Railroads extends BoardSpace {
    private int purchasePrice,baseRent, total;
    private boolean owned=false;
    public Railroads(String name) {
        super(name);
        purchasePrice=200;
        baseRent=25;
        total=baseRent;
    }
    
    public void changeRent(int a){
        total=baseRent*a;
    }
    
    public String toString(){
        return super.toString()+"rent is $"+total;
    }
    public void buy(){
        owned=true;
    }
    public boolean getOwned(){
        return owned;
    }
}
