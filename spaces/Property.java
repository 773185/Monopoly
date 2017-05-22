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

public class Property extends BoardSpace{
    
    private String placename;
    private String color;
    private int square;
    
    private int numhouses;
    private int numhotels;
    private int rentbasic;
    private int price;
    private boolean owned;
    
    public Property(String placename1,String color1, int square1,int numhouses1,int numhotels1,int rentbasic1, int cost1){
        //super(false);
        placename=placename1;
        color=color1;
        square=square1;
        
        numhouses=numhouses1;
        numhotels=numhotels1;
        rentbasic=rentbasic1;
        price= cost1;
        owned=false;
    }
    public boolean isowned (){
        return owned;
}
public String toString(){
    if(!owned){
    return "You have landed on "+placename+" which is available for purchase for "+price+" Swanny Dollars. "+super.toString();
}else{
        return "You have landed on "+placename+" which is currently owned, you pay rent of "+rentbasic+" Swanny Dollars. "+super.toString();
    }
    
}
public int getPrice(){
    return price;
}
public void setTrue(){
    owned=true;
}
public int getRent(){
    return rentbasic+rentbasic*numhouses+rentbasic*40*numhotels; 
}
public void addhouse(){
    if(numhotels!=1){
    numhouses++;
    if(numhouses==5){
        numhotels=1;
        numhouses=0;
    }
  }
}


}
