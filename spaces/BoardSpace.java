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
    private String name;

    public BoardSpace(String n) {
        //special=spec;
        name=n;
    }

    public String toString() {
        if (special) {
            return "This space is special.";
        } else {
            return "Not special.";
        }
    }
    boolean isowned(){
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
     public int getRent(int s, int g){
        return 0;
    }
    public void switchOwner(String n){
    }

    public String getOwner(){
        return "";
    }

    public boolean getOwned() {//FOR RAILROADS
        return true;
    }
    public int getTax(){
        return 0;
    }
    
    public boolean getOwned() {//FOR RAILROADS
        return true;
    }
     public int getRailRent(int a){
         return 0;
     }

    void buy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
}
