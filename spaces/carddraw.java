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
public class carddraw extends BoardSpace{

    public carddraw(String n) {
        super(n);
    }
 
    
    public int cardnum(){
        return (int)(Math.random()*3+1);
    }
}
