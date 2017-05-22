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
//boolean spec
public class BoardSpace extends Board {

    private boolean special;

    public BoardSpace() {
        //special=spec;
    }

    public String toString() {
        if (special) {
            return "This space is special.";
        } else {
            return "Not special.";
        }
    }

    boolean isowned() {
        return true;
    }
    public int getPrice(){
        return 0;
    }
    public void setTrue(){ 
    }
    public int getRent(){
        return 0;
    }
}
