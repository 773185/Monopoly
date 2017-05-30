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
    
    public int getRailRent(int a){
        if(a==1){
            return 25;
        } else{
            if(a==2){
                return 50;
            }else{
                if(a==3){
                    return 100;
                }else{
                    return 200;
                }
            }
        }
    }
    
    public String toString(){
        return super.toString()+" Rent is $"+total+". At the railroad. ";
    }
    public void buy(){
        owned=true;
    }
    public boolean getOwned(){
        return owned;
    }
   
}
