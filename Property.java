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

public class Property {
    
    private String placename;
    private String color;
    private int square;
    private int row;
    private int numhouses;
    private int numhotels;
    private int rentbasic;
    private int price;
    
    public Property(String placename1,String color1, int square1,int row1,int numhouses1,int numhotels1,int rentbasic1, int cost1){
        super(false);
        placename=placename1;
        color=color1;
        square=square1;
        row=row1;
        numhouses=numhouses1;
        numhotels=numhotels1;
        rentbasic=rentbasic1;
        price= cost1;
    }
}
