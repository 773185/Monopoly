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
public class CommunityChest extends carddraw{
   private static String[] card;
    public CommunityChest(){
        super("Community Chest");
    String[] cards= new String[4];    
    cards[0]="Advance to Go";
    cards[1]="Doctor's fees – Pay $50";
    cards[2]="Bank error in your favor – Collect $200";
    cards[3]="Pay school fees of $150";
    card=cards;
    }
    public static String drawcommunitycard(){
        int c= (int)(Math.random()*4);
        return card[c];
    }
}

//Advance to Go
//Bank error in your favor – Collect $200
//Doctor's fees – Pay $50
//Pay school fees of $150
